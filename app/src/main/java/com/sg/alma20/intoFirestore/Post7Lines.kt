package com.sg.alma12.Posts.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma20.R
import com.sg.alma20.model.Post
import com.sg.alma20.postUtility.CONSTANT
import com.sg.alma20.postUtility.DrawPostCenter
import com.sg.alma20.postUtility.Utility

class Post7Lines(val context: Context) {
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    private val util = Utility()

    fun loadPost700() {
        val post = Post()
        with(post) {
            postNum = 700
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2017/09/03/09/17/question-2709670_1280.jpg"
            postText = arrayListOf(
                "האדם שמחפש משמעות בחיים",
                "דומה לאחד שקיבל במתנה כלי מופלא",
                "והוא ממש נבוך מהמתנה הזו,",
                " מצד אחד ",
                "הוא שמע מכולם שהכלי הזה מדהים ברמות,",
                " אבל מהצד השני ",
                "הוא לא יודע  מה לעזאזל עושים עם זה."
            )
            postBackground = "a9dce3"
            postTransparency = 9
            val di = 0
            val dd = -80
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 450 + dd),
                arrayListOf(0, -1 + di, 0, 380 + dd),
                arrayListOf(0, -1 + di, 0, 310 + dd),
                arrayListOf(0, -1 + di, 0, 265 + dd),
                arrayListOf(0, -1 + di, 0, 195 + dd),
                arrayListOf(0, -1 + di, 0, 150 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd)
            )
            val size1 = 20
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost701() {
        var post = Post()
        with(post) {
            postNum = 701
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2016/04/05/03/18/prayer-1308663_1280.jpg"
            postText = arrayListOf(
                " בראש השנה כולם מתפללים לאל עליון ",
                " שיתן להם שנה טובה, ",
                " אבל, היחיד שיכול ליצור בשבילך ",
                " שנה טובה ",
                " הוא אתה, ",
                " כי אתה הוא היוצר היחידי ",
                " של הטוב והרע בעולמך. "
            )
            val di = 0
            val dd = 15
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 150 + dd),
                arrayListOf(0, -1 + di, 0, 125 + dd),
                arrayListOf(0, -1 + di, 0, 100 + dd),
                arrayListOf(0, -1 + di, 0, 75 + dd),
                arrayListOf(0, -1 + di, 0, 50 + dd),
                arrayListOf(0, -1 + di, 0, 25 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 17)
            postTransparency = 7
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 320

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost702() {
        var post = Post()
        with(post) {
            postNum = 702
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2018/04/03/16/34/clock-3287232_1280.jpg"
            postText = arrayListOf(
                "להגיד את הדבר הנכון",
                "במקום הלא נכון זה חוסר טקט,",
                "להגיד את הדבר הלא נכון",
                "במקום הנכון זו טיפשות,",
                "להגיד את הדבר הנכון",
                "במקום הנכון",
                "זו אומנות."
            )
            val di = 0
            val dd = 5
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 180 + dd),
                arrayListOf(0, -1 + di, 0, 150 + dd),
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 20)
            postTransparency = 9
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 320
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
}

