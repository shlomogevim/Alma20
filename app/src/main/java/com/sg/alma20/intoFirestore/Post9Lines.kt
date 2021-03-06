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

class Post9Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost= DrawPostCenter(context)
    private val util= Utility()

    fun loadPost900() {
        val post = Post()
        with(post) {
            postNum = 900
            lineNum = 9
            imageUri = "https://cdn.pixabay.com/photo/2017/02/06/11/58/desert-2042738_1280.jpg"
            postText = arrayListOf(
                "זה שהסתדרת עם השנים זה לא אומר שאתה מסודר,",
                "זה שאתה עסוק כל הזמן זה לא אומר שאתה עושה משהו,",
                "זה שאתה אוכל כל הזמן זה לא אומר שאתה שבע,",
                "זה שיש לך הכל זה לא אומר שאתה לא רוצה עוד,",
                "זה שאתה נח כל היום זה לא אומר שאתה לא עייף,",
                "זה שיש לך חברים זה לא אומר שאתה לא בודד,",
                "זה שהחכמת עם השנים זה לא אומר שאתה חכם,",
                "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
                "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
            )
            postBackground = "a9dce3"
            postTransparency = 9
            val di = 0
            val dd = 80
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 480 + dd),
                arrayListOf(0, -1 + di, 0, 420 + dd),
                arrayListOf(0, -1 + di, 0, 360 + dd),
                arrayListOf(0, -1 + di, 0, 300 + dd),
                arrayListOf(0, -1 + di, 0, 240 + dd),
                arrayListOf(0, -1 + di, 0, 180 + dd),
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            val size1 = 16
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost901() {
        val post = Post()
        with(post) {
            postNum = 901
            lineNum = 9
            imageUri = "https://cdn.pixabay.com/photo/2013/04/07/21/29/hotel-hall-101634_1280.jpg"
            postText = arrayListOf(
                " בסוף המסדרון הזה יש חדר גדול ",
                " אם לא תהיה בתנועה ",
                " תהיה תקוע במסדרון כל היום, ",
                " ולמציאות פנים רבות ",
                " הכוזבים מכחישים את המסדרון ",
                " הדיכאוניים מכחישים את ההליכה ",
                " הפסימיים לא מאמינים שיש סוף למסדרון הזה ",
                "  רודפי הנחמה גוררים רגלים  ",
                "  ואני פעם זה ופעם זה.  "
            )
            postBackground = "1E4174"
            postTransparency =10
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 305 + dd),
                arrayListOf(0, -1 + di, 0, 270 + dd),
                arrayListOf(0, -1 + di, 0, 235 + dd),
                arrayListOf(0, -1 + di, 0, 200 + dd),
                arrayListOf(0, -1 + di, 0, 165 + dd),
                arrayListOf(0, -1 + di, 0, 130 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35+ dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            val size1 = 16
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#DDA94B"
             postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
            lineSpacing=1.2f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
}

 /*
        זה שאתה יודע הרבה על דיכאונות ואיך לצאת מהם זה לא אומר שאתה לא מדוכא
זה שאתה יועץ נישואים זה לא אומר שהזוגיות שלך מוצלחת
זה שאתה פסיכולוג זה לא אומר שאתה נמצא באופן שיגרתי לפני התמוטטות עצבים
זה שאתה יודע הרבה על החיים זה לא אומר שאתה חי בטוב
*/