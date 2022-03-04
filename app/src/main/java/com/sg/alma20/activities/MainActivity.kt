package com.sg.alma20.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.google.firebase.firestore.FirebaseFirestore
import com.sg.alma20.adapters.PostAdapter
import com.sg.alma20.databinding.ActivityMainBinding
import com.sg.alma20.model.Post
import com.sg.alma20.postUtility.POST_REF
import com.sg.alma20.postUtility.Utility
import kotlinx.coroutines.delay
import java.lang.Math.abs
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val util1 = Utility()
    val posts = arrayListOf<Post>()
    lateinit var postAdapter: PostAdapter
    lateinit var sliderHandler: Handler
    lateinit var sliderRun:Runnable



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         //  -------------------------------enter new post
       //startActivity(Intent(this,AddPostActivity::class.java))



        //   ---------------------------------    Adapter
        val posts = downloadAllPost()
        val pager=binding.viewPager2
        postAdapter = PostAdapter(pager,this, posts)
        pager.adapter=postAdapter

        //------------------------------------------------
        pager.clipToPadding=false
        pager.clipChildren=false
        pager.offscreenPageLimit=3
        pager.getChildAt(0).overScrollMode= RecyclerView.OVER_SCROLL_NEVER
        val comPostPageTarnn= CompositePageTransformer()
        comPostPageTarnn.addTransformer(MarginPageTransformer(40))
        comPostPageTarnn.addTransformer { page, position ->
            val r:Float=1 - abs(position)
          page.scaleY = 0.01f + r * 0.99f
        //  page.scaleY = 0.85f + r * 0.15f
        }
        pager.setPageTransformer(comPostPageTarnn)
        sliderHandler = Handler()
        sliderRun = Runnable {
            pager.currentItem = pager.currentItem +1

        }


        pager.registerOnPageChangeCallback(                                        //    For Automated scrolling
            object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    sliderHandler.removeCallbacks(sliderRun)
                    sliderHandler.postDelayed(sliderRun,5000)

                }
            } )


     //   ---------------------------------    RecyclerView
        /*binding.rvPosts.adapter=postAdapter
        val layoutManager=LinearLayoutManager(this)
        binding.rvPosts.layoutManager=layoutManager*/


    }


    fun downloadAllPost(): ArrayList<Post> {
        posts.clear()
        FirebaseFirestore.getInstance().collection(POST_REF).addSnapshotListener { value, error ->
            if (value != null) {
                for (doc in value.documents) {
                    var post = util1.retrivePostFromFirestore(doc)
                    posts.add(post)
                }
                postAdapter.notifyDataSetChanged()
            }
        }
        return posts
    }

    override fun onPause() {
        super.onPause()
        sliderHandler.removeCallbacks(sliderRun)

    }

    override fun onResume() {
        super.onResume()
        sliderHandler.postDelayed(sliderRun,5000)
    }

}