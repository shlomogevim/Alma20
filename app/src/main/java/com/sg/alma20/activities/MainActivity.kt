package com.sg.alma20.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import com.sg.alma20.adapters.PostAdapter
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
    lateinit var pagerAdapterPost:PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         //  -------------------------------enter new post
       startActivity(Intent(this,AddPostActivity::class.java))



        //   ---------------------------------    Adapter
        /*val posts = downloadAllPost()
        postAdapter = PostAdapter(this, posts)
        binding.viewPager2.adapter=postAdapter*/




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

}