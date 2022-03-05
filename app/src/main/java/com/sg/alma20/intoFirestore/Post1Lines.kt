package com.sg.alma20.intoFirestore

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma20.R
import com.sg.alma20.model.Post
import com.sg.alma20.postUtility.CONSTANT
import com.sg.alma20.postUtility.DrawPostCenter
import com.sg.alma20.postUtility.Utility


class Post1Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost= DrawPostCenter(context)
    private val util= Utility()

    fun postSelector2(index:Int){

        when (index){
            100->loadPost100()
            101->loadPost101()
            102->loadPost102()
        }
    }

     private fun loadPost100() {
        val post= Post()
        with(post){
            postNum=100
             lineNum = 1
             imageUri = "https://cdn.pixabay.com/photo/2015/08/26/11/06/people-talking-908342_1280.jpg"

            // helper2.uploadImage(imageUri)

           //val storageImage:String=uploadToSorage(fileRef,imageUri)
            postText = arrayListOf(
                "כל אחד מדבר את מה שהוא."
            )
            val dd=0
            val du=0
            postMargin = arrayListOf(
                arrayListOf(0, 0+du, 0, -1+dd)

            )
            postBackground = "263238"
            postTransparency = 4
            postTextSize = arrayListOf(0,30)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTextColor = arrayListOf(CONSTANT, "#f6ff03")
            postFontFamily=200
            postRadiuas=15
        }
        drawPost.drawPost(post,layout)
        util.sendPostToStringFirestore(post)
    }


    private fun loadPost101() {
        val post= Post()
        with(post){
            postNum=101
            lineNum = 1
            imageUri ="https://cdn.pixabay.com/photo/2018/02/13/23/41/nature-3151869_1280.jpg"
            postText  = arrayListOf(
                "אתה הוא האור שבו אתה חי."
            )
            val dd=0
            val du=0
            postMargin = arrayListOf(
                arrayListOf(0, 0+du, 0, 0+dd)
            )
            postBackground= "263238"
            postTransparency = 0
            postTextSize = arrayListOf(0,30)
            postPadding = arrayListOf(40, 0, 40, 0)
            postTextColor = arrayListOf(CONSTANT,  "#f6ff03")
            postFontFamily=200
            postRadiuas=15
        }
        drawPost.drawPost(post,layout)
         util.sendPostToStringFirestore(post)
    }

    private fun loadPost102() {
          val post= Post()
         with(post){
             postNum=102
             lineNum = 1
             imageUri ="https://cdn.pixabay.com/photo/2013/07/18/15/09/death-164761_1280.jpg"
             postText  = arrayListOf(
                 "גם מחיים שלווים לגמרי מתים בסוף."
             )
             val dd=0
             val du=0
             postMargin  = arrayListOf(
                 arrayListOf(0, -1+du, 0, 0+dd)
             )
             postBackground = "263238"
             postTransparency = 1
             postTextSize  = arrayListOf(0,30)
             postPadding = arrayListOf(40, 0, 40, 0)
             postTextColor  = arrayListOf(CONSTANT, "#f6ff03")
             postFontFamily=200
             postRadiuas=15
         }
        drawPost.drawPost(post,layout)
        util.sendPostToStringFirestore(post)
     }
}