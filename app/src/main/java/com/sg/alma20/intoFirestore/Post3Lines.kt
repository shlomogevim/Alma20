package com.sg.alma12.Posts.general

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma20.R
import com.sg.alma20.model.Post
import com.sg.alma20.postUtility.CONSTANT
import com.sg.alma20.postUtility.DrawPostCenter
import com.sg.alma20.postUtility.Utility


class Post3Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    private val util = Utility()


    fun loadPost300() {
        val post = Post()
        with(post) {
            postNum = 300
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/10/30/12/23/sport-1014035_1280.jpg"
            postText = arrayListOf(
                " יש כמה המצאות אנושיות ",
                " שלא עובדות כל כך במציאות, ",
                " אחת מהם היא ההגינות. ",
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 10 + di, 0, -1 + dd),
                arrayListOf(0, 55 + di, 0, -1 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd)
            )
            postBackground = "a3842c"
            postTransparency = 7
            val size1 = 25
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 4
            postRadiuas = 15
        }
        //  util.logi("Post3Lines  106    post=$post")
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost301() {
        val post = Post()
        with(post) {
            postNum = 301
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/03/04/08/35/despair-1235583_1280.jpg"
            postText = arrayListOf(
                " החיים לא כל כך מבאסים," ,
                        " אבל אתה ",
                " יצור שנוטה להתבאס מהחיים. ",
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 10 + di, 0, -1 + dd),
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 10 + dd)
            )
            postBackground = "a3842c"
            postTransparency = 7
            val size1 = 25
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 4
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost302() {
        val post = Post()
        with(post) {
            postNum = 302
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/08/21/23/29/forest-3622519_1280.jpg"
            val str="\""
            postText = arrayListOf(
             str+"הרחק מההמון הסואן"+str ,
                " זה לא מקום ",
                " זה מצב נפשי. ",
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 10 + di, 0, -1 + dd),
                arrayListOf(0, 55 + di, 0, -1 + dd),
                arrayListOf(0, 100 + di, 0, -1 + dd)
            )
            postBackground = "f4b41a"
            postTransparency = 7
            val size1 = 22
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost303() {
        var post=Post()
        with(post) {
            postNum = 303
            lineNum =3
            imageUri ="https://cdn.pixabay.com/photo/2016/07/29/08/51/target-1551492_1280.jpg"
            postText =  arrayListOf(
                " ההצלחה שלך נמדדת ",
                " רק לפי האמונה שבך ",
                " שאתה מצליח. "

            )
            val di =15
            val dd=0
            postMargin =  arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 40 + di, 0, -1 + dd),
                arrayListOf(0, 80 + di, 0, -1 + dd)
            )
            postTextSize =  arrayListOf(0, 22)
            postTransparency =0
            postBackground = "bdfff6"
            val textColor = "ffffff"
            postFontFamily =300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost304() {
        var post=Post()
        with(post) {
            postNum = 304
            lineNum =3
            imageUri ="https://cdn.pixabay.com/photo/2021/11/12/04/50/donkey-6787990_1280.jpg"
            postText =  arrayListOf(
                "החיים האלה דורשים ממך להתנהל בהגיון,",
                " למרות שהם עצמם ",
                " ממש לא הגיוניים. "
            )
            val di =0
            val dd=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 45 + dd),
                arrayListOf(0, -1 + di, 0, 10 + dd)
            )
            postTextSize =  arrayListOf(0, 22)
            postTransparency =0
            postBackground = "bdfff6"
            val textColor = "ffffff"
            postFontFamily =320

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost305() {
        var post=Post()
        with(post) {
            postNum = 305
            lineNum =3
            imageUri ="https://cdn.pixabay.com/photo/2017/03/29/15/18/tianjin-2185510_1280.jpg"
            postText =  arrayListOf(
                " יש לך את הכל, ",
                " גם את המחשבה  הזו ",
                " שחסר לך משהו. "
            )
            val di =0
            val dd=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 45 + dd),
                arrayListOf(0, -1 + di, 0, 10 + dd)
            )
            postTextSize =  arrayListOf(0, 22)
            postTransparency =10
            postBackground = "efc8b1"
            val textColor = "8a6626"
            postFontFamily =320

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }


   fun loadPost306() {
        val post = Post()
        with(post) {
            postNum = 306
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2021/01/08/17/02/old-man-5900410_1280.jpg"
            postText = arrayListOf(
                "המתכון הבטוח שלא  להזדקן",
                "הוא פשוט",
                "להישאר צעיר.",
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd),
                arrayListOf(0, 135 + di, 0, -1 + dd)
            )
            postBackground = "a3842c"
            postTransparency = 7
            val size1 = 25
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 4
            postRadiuas = 15
        }
        //  util.logi("Post3Lines  106    post=$post")
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

}




