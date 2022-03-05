package com.sg.alma20.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.viewpager2.widget.ViewPager2
import com.google.firebase.firestore.FirebaseFirestore
import com.sg.alma20.adapters.PostAdapter
import com.sg.alma20.animation.BookFlipPageTransformer2
import com.sg.alma20.animation.CardFlipPageTransformer2
import com.sg.alma20.databinding.ActivityMainBinding
import com.sg.alma20.model.Post
import com.sg.alma20.postUtility.POST_REF
import com.sg.alma20.postUtility.Utility
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
    startActivity(Intent(this,AddPostActivity::class.java))



        //   ---------------------------------    Pager
      /*  val posts = downloadAllPost()
        val pager=binding.viewPager2
        postAdapter = PostAdapter(pager,this, posts)
        pager.adapter=postAdapter
        addAnimation(pager)*/

     // pagerActivateAuto()


     //   ---------------------------------    RecyclerView
        /*binding.rvPosts.adapter=postAdapter
        val layoutManager=LinearLayoutManager(this)
        binding.rvPosts.layoutManager=layoutManager*/

    }



      private fun addAnimation(pager: ViewPager2) {
            val book= BookFlipPageTransformer2()
        book.setEnableScale(true)
        book.setScaleAmountPercent(90f)
        pager.setPageTransformer(book)

        val card=CardFlipPageTransformer2()
        card.setScalable(false)
        pager.setPageTransformer(card)
    }

    private fun pagerActivateAuto() {
        // uncheck onPause and onResume

        //------------------------------------------------
        /*   pager.clipToPadding=false                                                                        //   add it inside onCreate
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
           }*/

//----------------------------------------------------------------------------------------------------
        /* pager.registerOnPageChangeCallback(                                        //    For Automated scrolling
             object : ViewPager2.OnPageChangeCallback() {
                 override fun onPageSelected(position: Int) {
                     super.onPageSelected(position)
                     sliderHandler.removeCallbacks(sliderRun)
                     sliderHandler.postDelayed(sliderRun,5000)

                 }
             } )*/




    }

    /*  override fun onPause() {                        //   for extension 1
          super.onPause()
          sliderHandler.removeCallbacks(sliderRun)

      }

      override fun onResume() {
          super.onResume()
          sliderHandler.postDelayed(sliderRun,5000)
      }*/

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

}