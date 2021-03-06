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
    val drawPost = DrawPostCenter(context)
    private val util = Utility()


    fun loadPost100() {
        val post = Post()
        with(post) {
            postNum = 100
            lineNum = 1
            imageUri =
                "https://cdn.pixabay.com/photo/2015/08/26/11/06/people-talking-908342_1280.jpg"

            postText = arrayListOf(
                "כל אחד מדבר את מה שהוא."
            )
            val dd = 0
            val du = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 0 + dd)
            )
            postTransparency =6
            postTextSize = arrayListOf(0, 30)
            val backgroundColor = "263238"
            val textColor = "#f6ff03"
            postFontFamily = 200

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost101() {
        val post = Post()
        with(post) {
            with(post) {
                postNum = 101
                lineNum = 1
                imageUri = "https://cdn.pixabay.com/photo/2018/02/13/23/41/nature-3151869_1280.jpg"
                postText = arrayListOf(
                    "אתה הוא האור שבו אתה חי."
                )
                val dd = 0
                val du = 0
                postMargin = arrayListOf(
                    arrayListOf(0, -1 + du, 0, 0 + dd)
                )
                postTransparency = 0
                postTextSize = arrayListOf(0, 30)
                val backgroundColor = "263238"
                val textColor = "#f6ff03"
                postFontFamily = 200

                postBackground = util.improveColorString(backgroundColor)
                val textcolo = util.improveColorString(textColor)
                val col = "#$textcolo"
                postTextColor = arrayListOf(CONSTANT, col)
                postPadding = arrayListOf(10, 0, 10, 0)
                postRadiuas = 15
            }
            drawPost.drawPostFire(post, layout)
            util.sendPostToStringFirestore(post)
        }
    }
        fun loadPost102() {
            val post = Post()
            with(post) {
                with(post) {
                    postNum = 102
                    lineNum = 1
                    imageUri =
                        "https://cdn.pixabay.com/photo/2013/07/18/15/09/death-164761_1280.jpg"
                    postText = arrayListOf(
                        "גם מחיים שלווים לגמרי מתים בסוף."
                    )
                    val dd =30
                    val du = 0
                    postMargin = arrayListOf(
                        arrayListOf(0, -1 + du, 0, 0 + dd)
                    )

                    postTransparency = 1
                    postTextSize = arrayListOf(0, 28)
                    val backgroundColor = "263238"
                    val textColor = "#f6ff03"
                    postFontFamily = 200

                    postBackground = util.improveColorString(backgroundColor)
                    val textcolo = util.improveColorString(textColor)
                    val col = "#$textcolo"
                    postTextColor = arrayListOf(CONSTANT, col)
                    postPadding = arrayListOf(0, 0, 0, 0)
                    postRadiuas = 15
                }
                drawPost.drawPostFire(post, layout)
                util.sendPostToStringFirestore(post)
            }

        }
    }





