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
                arrayListOf(0, -1 + di, 0, 115 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 45 + dd),
                arrayListOf(0, -1 + di, 0, 10 + dd)
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
            imageUri = "https://cdn.pixabay.com/photo/2016/06/01/09/15/art-1428646_1280.jpg"
            postText = arrayListOf(
                " האויב של הטוב ",
                " הוא הטוב יותר, ",
                " האויב של הרגע ",
                " הוא הרגע הבא. "
            )
            postBackground = "a3842c"
            postTransparency = 10
            val di = 0
            val dd =260
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
            postTransparency = 4
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
                arrayListOf(0,10 + di, 0, -1
                        + dd),
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
            /*"message \"quote string 1\" and \"quote string 2\" end message" */
            imageUri = "https://cdn.pixabay.com/photo/2020/11/24/17/36/magic-5773359_1280.png"
            val s1="\""
            val s2="\""
            val s12=" פוליטיקלי קורקט "
            postText = arrayListOf(
                "$s1$s12$s2",
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
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 20)
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
     fun loadPost417() {
        val post = Post()
        with(post) {
            postNum = 417
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/01/03/05/37/the-sun-3057625_1280.jpg"
            postText = arrayListOf(
                "בחיים האלה",
                "אתה יכול לחיות בכאילו,",
                "אבל בכל מקרה",
                "בסוף תמות באמת."
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 135 + dd),
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
    fun loadPost418() {
        val post = Post()
        with(post) {
            postNum = 418
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/09/32/concept-1868728_1280.jpg"
            postText = arrayListOf(
                "החיים גדולים עליך בכמה מספרים,",
                "ובגלל זה ",
                "אתה מסתפק בסיפורים על החיים ",
                "שיש אצלך בראש."
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0,40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency =8
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(5, 0, 5,0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost419() {
        val post = Post()
        with(post) {
            postNum = 419
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/08/01/06/51/people-1560569_1280.jpg"
            postText = arrayListOf(
                "החיים האלה זה סוג של משחק,",
                "נכון מתים בסוף המשחק הזה ",
                "אבל כדי להנות ממנו ",
                "אתה צריך להיות קצת ילד."
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 65 + di, 0, -1 + dd),
                arrayListOf(0, 95 + di, 0, -1 + dd)
            )

            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency =5
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10,0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost420() {
        val post = Post()
        with(post) {
            postNum = 420
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2010/12/13/09/50/jute-1655_1280.jpg"
            postText = arrayListOf(
                "ישנם בעיות אמיתיות",
                "וישנם בעיות דמי, ",
                "העוול הגדול שהאדם עושה לעצמו",
                "הוא לשים את כל הבעיות באותו שק."
            )
            val di =80
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 65 + di, 0, -1 + dd),
                arrayListOf(0, 95 + di, 0, -1 + dd)
            )

            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency =4
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10,0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
      fun loadPost421() {
        val post = Post()
        with(post) {
            postNum = 421
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/25/11/49/sea-859517_1280.jpg"
            postText = arrayListOf(
                "חבל להתעצבן היום על דברים,",
                "שאתה בלי בעיות ",
                "יכול להתעצבן עליהם",
                "גם מחר."
            )
            val di =0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0,35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 17)
            postBackground = "000000"
            postTransparency =4
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10,0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost422() {
        val post = Post()
        with(post) {
            postNum = 422
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/26/02/47/man-2442565_1280.jpg"
            postText = arrayListOf(
                "האושר",
                "הוא תוצר לוואי",
                "  למעשים הנכונים לך  ",
                "שאתה עושה."
            )
            val di =0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0,35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 17)
            postBackground = "000000"
            postTransparency =4
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10,0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost423() {
        val post = Post()
        with(post) {
            postNum = 423
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/08/07/08/46/city-2601562_1280.jpg"
            postText = arrayListOf(
                "חוסר שפיות",
                "זה לחיות את הטירוף שלך,",
                "שפיות",
                "זה לחיות את הטירוף של הכלל."
            )
            val di =0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0,30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency =10
            val textColor = "ffffff"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10,0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

      fun loadPost424() {
        val post = Post()
        with(post) {
            postNum = 424
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/05/11/01/airport-2373727_1280.jpg"
            postText = arrayListOf(
                "אנשים נוסעים לפה",
                "אנשים נוסעים לשם",
                "אבל בסוף",
                "תמיד הם פוגשים בעיקר את עצמם."
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0,60 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency =3
            val textColor = "ffffff"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10,0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost425() {
        val post = Post()
        with(post) {
            postNum = 425
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/01/26/05/33/character-1161955_1280.jpg"
            postText = arrayListOf(
                "אומנם",
                "אתה רואה את החיים כמו שהם",
                "אבל",
                "תופס אותם כמו שאתה."
            )
            val di =0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0,30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency =1
            val textColor = "ffffff"
            postFontFamily = 100

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10,0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

     fun loadPost426() {
        val post = Post()
        with(post) {
            postNum = 426
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/04/20/15/55/flame-5068748_1280.jpg"
            postText = arrayListOf(
                "להביא חושך בחשכה",
                "כל אחד יכול,",
                "להביא אור בחשכה",
                "זה קצת יותר ייחודי."
            )
            val di =20
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 65 + di, 0, -1 + dd),
                arrayListOf(0, 95 + di, 0, -1 + dd)
            )

            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency =1
            val textColor = "ffffff"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10,0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost427() {
        val post = Post()
        with(post) {
            postNum = 427
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/09/22/45/tree-838667_1280.jpg"
            postText = arrayListOf(
                "נחמה",
                "זה שמישהו אומר לך שאתה בסדר,",
                "שלווה",
                "זה שאתה מבין שאתה בסדר."
            )
            val di =10
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 100 + di, 0, -1 + dd),
                arrayListOf(0, 130 + di, 0, -1 + dd)
            )

            postTransparency =0
            postTextSize = arrayListOf(0, 20)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily =300

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost428() {
        val post = Post()
        with(post) {
            postNum = 428
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/02/21/08/05/woman-3169680_1280.jpg"
            postText = arrayListOf(
                "כשאתה סימן שאלה",
                "תשובה אמיתית יכולה לעזור לך להתיישר,",
                "אבל לרוב אתה סימן קריאה",
                "והתשובה האמיתית מחליקה עליך ונעלמת."
            )
           val di =80
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 100 + di, 0, -1 + dd),
                arrayListOf(0, 130 + di, 0, -1 + dd)
            )

            postTransparency =0
            postTextSize = arrayListOf(0, 18)
            postBackground = "1E4174"
            val textColor = "D6ED17"
            postFontFamily =300

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
       drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
      fun loadPost429() {
        val post = Post()
        with(post) {
            postNum = 429
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/09/16/17/41/boy-2756201_1280.jpg"
            postText = arrayListOf(
                "החיים הם כמו משחק שח,",
                "אתה יכול לדעת את כל הכללים",
                "אבל זה ממש לא עוזר לך",
                "לדעת לשחק את המשחק הזה."
            )
            val di =0
            val dd =20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0,30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 18)
           val  backgroundColor = "#F2EDD7"
            val textColor = "#755139"
            postFontFamily =300

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost430() {
        val post = Post()
        with(post) {
            postNum = 430
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/10/31/11/42/cup-4591710_1280.jpg"
            postText = arrayListOf(
                "גם",
                "שמדברים כל הזמן על החצי כוס הריקה,",
                "זה",
                "לא עושה אותה יותר מחצי כוס."
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd),
                arrayListOf(0, 120 + di, 0, -1 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#F2EDD7"
            val textColor = "#755139"
            postFontFamily =300

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost431() {
        val post = Post()
        with(post) {
            postNum = 431
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/02/04/23/02/candle-2038736_1280.jpg"
            postText = arrayListOf(
                "בכאן ועכשיו",
                "או שאתה אור,",
                "או שאתה חושך,",
                "ככה פשוט."
            )
            val di =0
            val dd =30
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 95 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0,30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#F2EDD7"
            val textColor = "#ffffff"
            postFontFamily =300
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost432() {
        val post = Post()
        with(post) {
            postNum = 432
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/03/27/17/42/man-1283235_1280.jpg"
            postText = arrayListOf(
                "זה שאני חי כל כך הרבה שנים",
                "זה לא אומר שיש לי כישורים מיוחדים לעשות את זה,",
                "זה אומר רק שלא נהרגתי אפילו פעם אחת",
                "ושאני יודע לקום בבוקר."
            )
            val di =0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0,30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =9
            postTextSize = arrayListOf(0, 12)
            val  backgroundColor = "#FCF6F5"
            val textColor = "#990011"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }


    fun loadPost433() {
        val post = Post()
        with(post) {
            postNum = 433
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/14/04/12/school-1822566_1280.jpg"
            postText = arrayListOf(
                "תהיה",
                "יותר עצמך",
                "כי אין לך משהו אחר",
                " להיות "
            )
            val di =20
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0,45 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0,-1 + dd),
                arrayListOf(0, 135+ di, 0, -1 + dd)
            )
            postTransparency =9
            postTextSize = arrayListOf(0, 20)
            val  backgroundColor = "#FCF6F5"
            val textColor = "#990011"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost434() {
        val post = Post()
        with(post) {
            postNum = 434
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/09/06/19/43/african-2722733_1280.jpg"
            postText = arrayListOf(
                "אתה יצור מוזר,",
                "גם אם היו נותנים לך כרגע את גן העדן",
                "היית פותח חדשות ",
                " כדי לשמוע מה קורה בגיהנום. "
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90+ dd),
                arrayListOf(0,-1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0,30+ dd),
                arrayListOf(0, -1+ di, 0, 0 + dd)
            )
            postTransparency =9
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "000000"
            val textColor = "ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost435() {
        val post = Post()
        with(post) {
            postNum = 435
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/06/22/08/37/children-817365_1280.jpg"
            postText = arrayListOf(
                " להצליח בחיים ",
                " זה לא למות ",
                " לא מבחוץ  ",
                " ולא מבפנים. "
            )
            val di =0
            val dd =20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105+ dd),
                arrayListOf(0,-1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0,35+ dd),
                arrayListOf(0, -1+ di, 0, 0 + dd)
            )
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#2BAE66"
            val textColor = "ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost436() {
        val post = Post()
        with(post) {
            postNum = 436
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/27/00/50/male-3775700_1280.jpg"
            postText = arrayListOf(
                " בשבח השתיקה ",
                " בשבח חוסר התגובה ",
                " שיעבור עלי ",
                " שיעבור "
            )
            val di =20
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0,30 + di, 0, -1 + dd),
                arrayListOf(0, 60 + di, 0,-1 + dd),
                arrayListOf(0, 90+ di, 0, -1 + dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#2BAE66"
            val textColor = "ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost437() {
        val post = Post()
        with(post) {
            postNum = 437
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/03/19/07/56/tavern-6106835_1280.jpg"
            postText = arrayListOf(
                " הבלים הם חלק מהחיים ",
                " ואין בהם כל בעיה, ",
                " כל זמן ",
                " שאתה תופס אותם כהבלים."
            )
            val di =0
            val dd =20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105+ dd),
                arrayListOf(0,-1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0,35+ dd),
                arrayListOf(0, -1+ di, 0, 0 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#CED46A"
            val textColor = "#07553B"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost438() {
        val post = Post()
        with(post) {
            postNum = 438
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/09/17/12/54/landscape-4483412_1280.jpg"
            postText = arrayListOf(
                " שאתה קטן ",
                " כל גרגר מוחץ אותך, ",
                " שאתה גדול ",
                " זה סתם אבק ברוח."
            )
            val di =20
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0,45 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0,-1 + dd),
                arrayListOf(0, 135+ di, 0, -1 + dd)
            )
            postTransparency =4
            postTextSize = arrayListOf(0, 22)
            val  backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost439() {
        val post = Post()
        with(post) {
            postNum = 439
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/12/03/15/42/boy-555577_1280.jpg"
            postText = arrayListOf(
                " ביקורת רעה על העולם ",
                " זה הרבה יותר מביקורת, ",
                " זה הופך את החיים שלך ",
                " להצגה כושלת."
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0,40 + di, 0, -1 + dd),
                arrayListOf(0, 80 + di, 0,-1 + dd),
                arrayListOf(0, 120+ di, 0, -1 + dd)
            )
            postTransparency =4
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost440() {
        val post = Post()
        with(post) {
            postNum = 440
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/07/23/21/07/mountains-2532825_1280.jpg"
            postText = arrayListOf(
                " בשורות טובות, ",
                " המשיח כבר כאן  ",
                " אבל האדם נמצא במקום אחר ",
                " ולכן קשה לו לפגוש אותו אישית. "
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0,35 + di, 0, -1 + dd),
                arrayListOf(0, 70 + di, 0,-1 + dd),
                arrayListOf(0, 105+ di, 0, -1 + dd)
            )
            postTransparency =6
            postTextSize = arrayListOf(0, 17)
            val  backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost441() {
        val post = Post()
        with(post) {
            postNum = 441
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/11/13/23/06/tree-6792528_1280.jpg"
            postText = arrayListOf(
                " התסכול שבך ",
                " נגמר בקצה המודעות שלך,  ",
                " העולם ממשיך להיות ",
                " הרבה מעבר לזה. "
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105+ dd),
                arrayListOf(0,-1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0,35+ dd),
                arrayListOf(0, -1+ di, 0, 0 + dd)
            )
            postTransparency =3
            postTextSize = arrayListOf(0, 17)
            val  backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }


   }




