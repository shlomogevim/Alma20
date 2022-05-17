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
        super.onCreate(savedInstanceState)
        binding = ActivityAddPostBinding.inflate(layoutInflater)
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

     // post1Lines.loadPost100()
     //  post1Lines.loadPost101()
    //  post1Lines.loadPost102()

       // post2Lines.loadPost200()
      //   post2Lines.loadPost201()
    //post2Lines.loadPost202()
       //post2Lines.loadPost203()
        //post2Lines.loadPost204()
        //  post2Lines.loadPost205()
    //post2Lines.loadPost206()

     //  post2Lines.loadPost207()
      // post2Lines.loadPost208()
      // post2Lines.loadPost209()
      // post2Lines.loadPost210()
      // post2Lines.loadPost211()
       //post2Lines.loadPost212()
      // post2Lines.loadPost213()
        // post2Lines.loadPost214()
     //   post2Lines.loadPost215()
     //post2Lines.loadPost216()
 //   post2Lines.loadPost217()
  //  post2Lines.loadPost218()
   // post2Lines.loadPost219()
   // post2Lines.loadPost220()
 // post2Lines.loadPost221()
 //post2Lines.loadPost222()
  //post2Lines.loadPost223()
  //post2Lines.loadPost224()
// post2Lines.loadPost225()
//post2Lines.loadPost226()
//post2Lines.loadPost227()
//post2Lines.loadPost228()
//post2Lines.loadPost229()
//post2Lines.loadPost230()
//post2Lines.loadPost231()
//post2Lines.loadPost232()
//post2Lines.loadPost233()
//post2Lines.loadPost234()
//post2Lines.loadPost235()
//post2Lines.loadPost236()
//post2Lines.loadPost237()
post2Lines.loadPost238()

      //post3Lines.loadPost300()
  // post3Lines.loadPost301()
        //   post3Lines.loadPost302()
          //post3Lines.loadPost303()
        //  post3Lines.loadPost304()
         //    post3Lines.loadPost305()
      //post3Lines.loadPost306()
       //  post3Lines.loadPost307()
      // post3Lines.loadPost308()
     // post3Lines.loadPost309()
           //post3Lines.loadPost310()
          // post3Lines.loadPost311()
     //  post3Lines.loadPost312()
     //post3Lines.loadPost313()
   // post3Lines.loadPost314()
   // post3Lines.loadPost315()
   //post3Lines.loadPost316()
  //ost3Lines.loadPost317()
 //post3Lines.loadPost318()
// post3Lines.loadPost319()
//post3Lines.loadPost320()
//post3Lines.loadPost321()
//post3Lines.loadPost322()
//post3Lines.loadPost323()
//post3Lines.loadPost324()
//post3Lines.loadPost325()
//post3Lines.loadPost326()
//post3Lines.loadPost327()
//post3Lines.loadPost328()
//post3Lines.loadPost329()
//post3Lines.loadPost330()
//post3Lines.loadPost331()
post3Lines.loadPost332()


// post4Lines.loadPost400()
//    post4Lines.loadPost401()
//    post4Lines.loadPost403()
//   post4Lines.loadPost404()
//   post4Lines.loadPost405()
//     post4Lines.loadPost406()
//    post4Lines.loadPost407()
//     post4Lines.loadPost408()
     //     post4Lines.loadPost409()
//     post4Lines.loadPost411()
//     post4Lines.loadPost412()
//     post4Lines.loadPost413()
//     post4Lines.loadPost414()
//     post4Lines.loadPost415()
//     post4Lines.loadPost416()
//     post4Lines.loadPost417()
//   post4Lines.loadPost418()
//  post4Lines.loadPost419()
//  post4Lines.loadPost420()
//      post4Lines.loadPost421()
// post4Lines.loadPost422()
// post4Lines.loadPost423()
// post4Lines.loadPost424()
// post4Lines.loadPost425()
// post4Lines.loadPost426()
//post4Lines.loadPost427()
//post4Lines.loadPost428()
//post4Lines.loadPost429()
//post4Lines.loadPost430()
//post4Lines.loadPost431()
//       post4Lines.loadPost432()
  //    post4Lines.loadPost433()
//       post4Lines.loadPost434()
//       post4Lines.loadPost435()
  //    post4Lines.loadPost436()
//    post4Lines.loadPost437()
//  post4Lines.loadPost438()
//  post4Lines.loadPost439()
//  post4Lines.loadPost440()
//  post4Lines.loadPost441()
//  post4Lines.loadPost442()
//  post4Lines.loadPost443()
//  post4Lines.loadPost444()
//  post4Lines.loadPost445()
//  post4Lines.loadPost446()

//         post5Lines.loadPost500()
//        post5Lines.loadPost501()
//          post5Lines.loadPost502()
//         post5Lines.loadPost503()
//         post5Lines.loadPost504()
//         post5Lines.loadPost505()
//        post5Lines.loadPost506()
//         post5Lines.loadPost507()
//         post5Lines.loadPost508()
//            post5Lines.loadPost509()
//           post5Lines.loadPost510()
//       post5Lines.loadPost511()
//       post5Lines.loadPost512()
//    post5Lines.loadPost513()

//       post6Lines.loadPost600()
//      post6Lines.loadPost601()
//      post6Lines.loadPost602()
//      post6Lines.loadPost603()
//    post6Lines.loadPost604()
// post6Lines.loadPost605()
// post6Lines.loadPost606()
// post6Lines.loadPost607()
// post6Lines.loadPost608()

    //      post7Lines.loadPost700()
//     post7Lines.loadPost701()
//     post7Lines.loadPost702()


//     post8Lines.loadPost801()

   //   post9Lines.loadPost900()

    }
}
