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


class Post4Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    private val util = Utility()


    fun loadPost400() {
        val post = Post()
        with(post) {
            postNum = 400
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/01/21/11/39/running-4782722_1280.jpg"
            postText = arrayListOf(
                "על תהיה הכי טוב",
                "זה לא יצליח לך לאורך זמן,",
                " לך על משהו יותר ממשי",
                "תהיה הכי אתה."
            )
            postBackground = "a9dce3"
            postTransparency = 0
            val di = 0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            val size1 = 20
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost401() {
        val post = Post()
        with(post) {
            postNum = 401
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2017/01/09/22/24/guy-playing-billiard-1967834_1280.jpg"
            postText = arrayListOf(
                " הבלים הם דברים אמיתיים, ",
                " מה שהופך אותם להבלים לגביך ",
                " זו היכולת שלהם ",
                " למנוע ממך להתפתח. "
            )
            postBackground = "210070"
            postTransparency = 9
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 10 + di, 0, -1 + dd),
                arrayListOf(0, 45 + di, 0, -1 + dd),
                arrayListOf(0, 80 + di, 0, -1 + dd),
                arrayListOf(0, 115 + di, 0, -1 + dd)
            )
            val size1 = 17
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost402() {
        val post = Post()
        with(post) {
            postNum = 402
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/01/25/09/28/woman-4792042_1280.jpg"
            postText = arrayListOf(
                " פסימיות ",
                " זה לחשוב שיש מישהו מאושר ממך, ",
                " אופטימיות ",
                " זה להבין שאין אחד כזה. "
            )
            postBackground = "a3842c"
            postTransparency = 9
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 10 + di, 0, -1 + dd),
                arrayListOf(0, 45 + di, 0, -1 + dd),
                arrayListOf(0, 80 + di, 0, -1 + dd),
                arrayListOf(0, 115 + di, 0, -1 + dd)
            )
            val size1 = 16
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost403() {
        val post = Post()
        with(post) {
            postNum = 403
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/09/14/12/17/education-6623844_1280.jpg"
            postText = arrayListOf(
                " האויב של הטוב ",
                " הוא הטוב יותר, ",
                " האויב של הרגע ",
                " הוא הרגע הבא. "
            )
            postBackground = "a3842c"
            postTransparency = 6
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            val size1 = 24
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 130
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost404() {
        val post = Post()
        with(post) {
            postNum = 404
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/01/10/09/28/castle-3925038_1280.jpg"
            postText = arrayListOf(
                "האנשים",
                "חיים כדרכם",
                "מתוך תא הכלא",
                "של מה שהם חושבים שהם."
            )
            postBackground = "a3842c"
            postTransparency = 6
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            val size1 = 24
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 130
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost405() {
        val post = Post()
        with(post) {
            postNum = 405
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/12/16/21/58/tv-5837826_1280.jpg"
            postText = arrayListOf(
                "וגם באם תגיע לאור,",
                "הרי אחרי חצי שעה תקום לראות טלוויזיה,",
                "כי מתחיל האח הגדול",
                "ויש הדחה כפולה."
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 145 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 20)
            postBackground = "a3842c"
            postTransparency = 9
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost406() {
        val post = Post()
        with(post) {
            postNum = 406
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/29/20/48/cemetery-2456173_1280.jpg"
            postText = arrayListOf(
                "ישנם אנשים קרובים",
                "שבהלוויה שלהם,",
                "אתה פחות סופד להם",
                "ויותר לעצמך."
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 20)
            postBackground = "FCE77D"
            postTransparency = 9
            val textColor = "1820FF"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost407() {
        val post = Post()
        with(post) {
            postNum = 407
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/11/24/17/36/magic-5773359_1280.png"
            postText = arrayListOf(
                "פוליטיקלי קורקט",
                "זה היכולת של האדם",
                "לקרוא ליום לילה וללילה יום",
                "בשם האמונות שלו."
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 20)
            postBackground = "FCE77D"
            postTransparency = 9
            val textColor = "1820FF"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost408() {
        val post = Post()
        with(post) {
            postNum = 408
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/10/10/07/48/beach-2836300_1280.jpg"
            postText = arrayListOf(
                "שיחות עם הים",
                "כמו רוב השיחות עם בני האדם,",
                "לא יצאת חכם יותר",
                "אבל לפחות אמרת את מה שאתה חושב."
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 75 + dd),
                arrayListOf(0, -1 + di, 0, 50 + dd),
                arrayListOf(0, -1 + di, 0, 25 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 16)
            postBackground = "FCE77D"
            postTransparency = 7
            val textColor = "1820FF"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost409() {
        val post = Post()
        with(post) {
            postNum = 409
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/11/20/05/15/car-6810885_1280.jpg"
            postText = arrayListOf(
                "השאלה היא פחות:",
                "מה קורה כאן,",
                "ויותר, איפה אני בכל",
                " מה שקורה כאן."
            )
            val di = 10
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 30 + di, 0, -1 + dd),
                arrayListOf(0, 60 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd)
            )

            postTextSize = arrayListOf(0, 22)
            postBackground = "F0A07C"
            postTransparency = 8
            val textColor = "4A274F"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost410() {
        val post = Post()
        with(post) {
            postNum = 410
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/12/11/12/42/river-1899328_1280.jpg"
            postText = arrayListOf(
                "את האיזורים הרדודים בעולם",
                "אתה לא יכול להאשים ברדידות,",
                "אתה יכול להאשים רק את עצמך",
                " שאתה נמצא יותר מידי זמן באיזורים האלה."
            )
            val di = 10
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 100 + di, 0, -1 + dd),
                arrayListOf(0, 165 + di, 0, -1 + dd)
            )

            postTextSize = arrayListOf(0, 22)
            postBackground = "00e1d9"
            postTransparency = 6
            val textColor = "5e001f"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost411() {
        val post = Post()
        with(post) {
            postNum = 411
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/02/06/10/54/sad-2042536_1280.jpg"
            postText = arrayListOf(
                " החיים שלך זה כמו השיער ",
                " יש ימים שהם מסתדרים לך, ",
                "ואז אתה מרגיש טוב עם עצמך",
                " ויש ימים שלא. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 24)
            postBackground = "efc8b1"
            postTransparency = 10
            val textColor = "514644"
            postFontFamily = 210

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost412() {
        val post = Post()
        with(post) {
            postNum = 412
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2012/02/24/16/56/beach-16698_1280.jpg"
            postText = arrayListOf(
                " תן לי את הכישרון ",
                " לראות הבלים כהבלים, ",
                "עם האמת הפשוטה",
                " אני כבר אסתדר. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 24)
            postBackground = "efc8b1"
            postTransparency = 8
            val textColor = "514644"
            postFontFamily = 220

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost413() {
        val post = Post()
        with(post) {
            postNum = 413
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/10/18/05/19/old-man-1749360_1280.jpg"
            postText = arrayListOf(
                "  לא השתנת , ",
                "תמיד היית בנוי מאותם חומרים,",
                " רק שעם הגיל ",
                "אתה משתמש בהם קצת אחרת."
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 135 + dd),
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 45 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 24)
            postBackground = "558b2f"
            postTransparency = 0
            val textColor = "ffff00"
            postFontFamily = 4

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost414() {
        val post = Post()
        with(post) {
            postNum = 414
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/06/08/27/religion-3727463__480.jpg"
            postText = arrayListOf(
                "גבולות העולם שלך די קבועים,",
                "ככה ",
                "שכמה שהאלוהות שבך יותר גדולה,",
                "הבעיות האישיות שלך יותר קטנות."
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 20)
            postBackground = "337def"
            postTransparency = 4
            val textColor = "fcc729"
            postFontFamily = 4

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost415() {
        val post = Post()
        with(post) {
            postNum = 415
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/12/13/36/soder-3742220_1280.jpg"
            postText = arrayListOf(
                "להתעצבן בגלל פוליטיקה",
                "זה מותרות ",
                "שרק למי שיש חיי נצח",
                "יכול להרשות לעצמו."
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 30)
            postBackground = "ffb8b1"
            postTransparency = 10
            val textColor = "993441"
            postFontFamily = 260

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost416() {
        val post = Post()
        with(post) {
            postNum = 416
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/04/26/23/46/morning-2264051_1280.jpg"
            postText = arrayListOf(
                "לא היית יכול",
                "לחיות את חייך אחרת,",
                "פשוט",
                "כי אתה כזה."
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 20)
            postBackground = "ffb8b1"
            postTransparency = 0
            val textColor = "ffffff"
            postFontFamily = 1

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
}




