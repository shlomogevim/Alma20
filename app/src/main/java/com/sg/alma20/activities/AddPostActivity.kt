package com.sg.alma20.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sg.alma12.Posts.general.*
import com.sg.alma20.R
import com.sg.alma20.databinding.ActivityAddPostBinding
import com.sg.alma20.intoFirestore.Post1Lines
import com.sg.alma20.postUtility.Utility

class AddPostActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddPostBinding

    lateinit var post1Lines: Post1Lines
    lateinit var post2Lines: Post2Lines
    lateinit var post3Lines: Post3Lines
      lateinit var post4Lines: Post4Lines
     lateinit var post5Lines: Post5Lines
     lateinit var post6Lines: Post6Lines
     lateinit var post7Lines: Post7Lines
     lateinit var post8Lines: Post8Lines
     lateinit var post9Lines: Post9Lines

    val util = Utility()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAddPostBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        post1Lines = Post1Lines(this)
        post2Lines = Post2Lines(this)
        post3Lines = Post3Lines(this)
        post4Lines = Post4Lines(this)
        post5Lines = Post5Lines(this)
        post6Lines = Post6Lines(this)
        post7Lines = Post7Lines(this)
        post8Lines = Post8Lines(this)
        post9Lines = Post9Lines(this)

        //   post1Lines.postSelector2(100)
        // post1Lines.postSelector2(101)
        // post1Lines.postSelector2(102)

        //   post2Lines.loadPost200()
        //  post2Lines.loadPost201()
        // post2Lines.loadPost202()
        //post2Lines.loadPost203()
        // post2Lines.loadPost204()
        //  post2Lines.loadPost205()
      //   post2Lines.loadPost206()
      //   post2Lines.loadPost207()
       //  post2Lines.loadPost208()
       //  post2Lines.loadPost209()
       //post2Lines.loadPost210()
       //  post2Lines.loadPost211()
      //   post2Lines.loadPost212()
       //  post2Lines.loadPost213()
       //  post2Lines.loadPost214()

    //post3Lines.loadPost300()
   //post3Lines.loadPost301()
            //post3Lines.loadPost302()
          // post3Lines.loadPost303()
          // post3Lines.loadPost304()
            // post3Lines.loadPost305()
        //  post3Lines.loadPost306()

      // post4Lines.loadPost400()
      // post4Lines.loadPost401()
      // post4Lines.loadPost402()
    //  post4Lines.loadPost403()
    // post4Lines.loadPost404()
     post4Lines.loadPost405()



      // post5Lines.loadPost500()
      //  post5Lines.loadPost501()
          //post5Lines.loadPost502()
       //  post5Lines.loadPost503()
       //  post5Lines.loadPost504()
      //   post5Lines.loadPost505()
      //  post5Lines.loadPost506()
       //  post5Lines.loadPost507()
         //post5Lines.loadPost508()
            //post5Lines.loadPost509()
         //  post5Lines.loadPost510()

      // post6Lines.loadPost600()
      //post6Lines.loadPost601()
      //post6Lines.loadPost602()
     // post6Lines.loadPost603()

      // post7Lines.loadPost700()
     //post7Lines.loadPost701()
     //post7Lines.loadPost702()

     //post8Lines.loadPost800()

      //post9Lines.loadPost900()

    }
}