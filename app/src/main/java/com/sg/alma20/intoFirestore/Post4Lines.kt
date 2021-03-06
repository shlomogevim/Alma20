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
            val dd = 260
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
                arrayListOf(
                    0, 10 + di, 0, -1
                            + dd
                ),
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
            val s1 = "\""
            val s2 = "\""
            val s12 = " פוליטיקלי קורקט "
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
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency = 8
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(5, 0, 5, 0)
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
            postTransparency = 5
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
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
            val di = 80
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 65 + di, 0, -1 + dd),
                arrayListOf(0, 95 + di, 0, -1 + dd)
            )

            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency = 4
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
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
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 17)
            postBackground = "000000"
            postTransparency = 4
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
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
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 17)
            postBackground = "000000"
            postTransparency = 4
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
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
            val di = 0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency = 10
            val textColor = "ffffff"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
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
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency = 3
            val textColor = "ffffff"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
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
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )

            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency = 1
            val textColor = "ffffff"
            postFontFamily = 100

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
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
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 65 + di, 0, -1 + dd),
                arrayListOf(0, 95 + di, 0, -1 + dd)
            )

            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency = 1
            val textColor = "ffffff"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
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
            val di = 10
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 100 + di, 0, -1 + dd),
                arrayListOf(0, 130 + di, 0, -1 + dd)
            )

            postTransparency = 0
            postTextSize = arrayListOf(0, 20)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily = 300

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
            val di = 80
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 100 + di, 0, -1 + dd),
                arrayListOf(0, 130 + di, 0, -1 + dd)
            )

            postTransparency = 0
            postTextSize = arrayListOf(0, 18)
            postBackground = "1E4174"
            val textColor = "D6ED17"
            postFontFamily = 300

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
            val di = 0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 8
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#F2EDD7"
            val textColor = "#755139"
            postFontFamily = 300

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
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
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 5 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd),
                arrayListOf(0, 120 + di, 0, -1 + dd)
            )
            postTransparency = 8
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#F2EDD7"
            val textColor = "#755139"
            postFontFamily = 300

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
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
            val di = 0
            val dd = 30
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 95 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 0
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#F2EDD7"
            val textColor = "#ffffff"
            postFontFamily = 300
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
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
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 9
            postTextSize = arrayListOf(0, 12)
            val backgroundColor = "#FCF6F5"
            val textColor = "#990011"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
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
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 45 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd),
                arrayListOf(0, 135 + di, 0, -1 + dd)
            )
            postTransparency = 9
            postTextSize = arrayListOf(0, 20)
            val backgroundColor = "#FCF6F5"
            val textColor = "#990011"
            postFontFamily = 103
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
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "000000"
            val textColor = "ffffff"
            postFontFamily = 103
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
            val di = 0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2BAE66"
            val textColor = "ffffff"
            postFontFamily = 103
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
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 30 + di, 0, -1 + dd),
                arrayListOf(0, 60 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd)
            )
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2BAE66"
            val textColor = "ffffff"
            postFontFamily = 103
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
            val di = 0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#CED46A"
            val textColor = "#07553B"
            postFontFamily = 103
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
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 45 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd),
                arrayListOf(0, 135 + di, 0, -1 + dd)
            )
            postTransparency = 4
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
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
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 40 + di, 0, -1 + dd),
                arrayListOf(0, 80 + di, 0, -1 + dd),
                arrayListOf(0, 120 + di, 0, -1 + dd)
            )
            postTransparency = 4
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
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
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 70 + di, 0, -1 + dd),
                arrayListOf(0, 105 + di, 0, -1 + dd)
            )
            postTransparency = 6
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
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
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 3
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
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


    fun loadPost442() {
        val post = Post()
        with(post) {
            postNum = 442
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/12/04/09/34/crawl-1076324_1280.jpg"
            postText = arrayListOf(
                " האמנות הזו ",
                "  להשתתף רק בוויכוחים  ",
                " שנכונים לך, ",
                "  שמורה למתי מעט.  "
            )
            val di = 0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 3
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
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

    fun loadPost443() {
        val post = Post()
        with(post) {
            postNum = 443
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/11/02/09/15/man-513529_1280.jpg"
            postText = arrayListOf(
                " כל אדם ",
                "  מייצר את הסבל האנושי שלו,  ",
                " העולם סביב ",
                "  רק בורא את החומרים לזה.  "
            )
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 70 + di, 0, -1 + dd),
                arrayListOf(0, 105 + di, 0, -1 + dd)
            )
            postTransparency = 7
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
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

    fun loadPost444() {
        val post = Post()
        with(post) {
            postNum = 444
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/01/01/23/55/telephone-586266_1280.jpg"
            postText = arrayListOf(
                " האדם הוא יצור די טמבל, ",
                "  המזל שלו  ",
                " שלא צריך להיות חכם גדול ",
                "  כדי לחיות בעולם הזה.  "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 2
            postTextSize = arrayListOf(0, 20)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
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

    fun loadPost445() {
        val post = Post()
        with(post) {
            postNum = 445
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/04/06/16/18/passover-4107705_1280.jpg"
            postText = arrayListOf(
                " רוב האנשים יודעים לאמץ מסגרות ",
                " חלקם יודעים אפילו ליצור אותם ",
                " אבל רק מעטים  ",
                " יודעים לתת בהם תוכן. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 2, 0, 2)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost446() {
        val post = Post()
        with(post) {
            postNum = 446
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/11/27/07/01/trouble-4656179_1280.jpg"
            postText = arrayListOf(
                " כל החכמה בחיים האלה ",
                " זה להשתדל ",
                " שלא ליצור בעיות  ",
                " איפה שהן לא קיימות. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 6
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
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

    fun loadPost447() {
        val post = Post()
        with(post) {
            postNum = 447
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/09/08/20/29/chess-2730034_1280.jpg"
            postText = arrayListOf(
                " אותה אמת ",
                "שאתה די בטוח בה שהיא אמת",
                " בדרך כלל  ",
                " מונעת ממך לדעת את האמת. "
            )
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 75 + di, 0, -1 + dd),
                arrayListOf(0, 110 + di, 0, -1 + dd)
            )
            postTransparency = 6
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
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

    fun loadPost448() {
        val post = Post()
        with(post) {
            postNum = 448
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/01/18/20/11/old-man-1147288_1280.jpg"
            postText = arrayListOf(
                " המוות לא קיים ",
                "החיים נמשכים לעד,",
                " רק שאתה מרגע מסוים  ",
                " לא תשתתף בהם יותר. "
            )
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 75 + di, 0, -1 + dd),
                arrayListOf(0, 110 + di, 0, -1 + dd)
            )
            postTransparency = 6
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
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

    fun loadPost449() {
        val post = Post()
        with(post) {
            postNum = 449
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/08/51/city-1868530_1280.jpg"
            postText = arrayListOf(
                "  אין חדש תחת השמש ",
                " זה מובן לי וידוע, ",
                " הבעיה שלפעמים גם עם הישן  ",
                " קשה לי להסתדר. "
            )
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 35 + di, 0, -1 + dd),
                arrayListOf(0, 70 + di, 0, -1 + dd),
                arrayListOf(0, 105 + di, 0, -1 + dd)
            )
            postTransparency = 6
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
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

    fun loadPost450() {
        val post = Post()
        with(post) {
            postNum = 450
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/11/01/16/48/cube-2908605_1280.jpg"
            postText = arrayListOf(
                "  אל תתייאש, ",
                " לפעמים הפתרון ",
                " עובר דרך איזורים   ",
                " שנראים לך כחסרי פתרון. "
            )
            val di = 0
            val dd = 5
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 2
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
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

    fun loadPost451() {
        val post = Post()
        with(post) {
            postNum = 451
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/04/27/20/38/girl-1357485_1280.jpg"
            postText = arrayListOf(
                "  אתה יכול לעשות הרבה דברים ",
                " עם החיים שלך, ",
                " והכי טוב  ",
                " זה לחיות אותם.  "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
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

    fun loadPost452() {
        val post = Post()
        with(post) {
            postNum = 452
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/07/28/15/17/pokemon-1548194_1280.jpg"
            postText = arrayListOf(
                "  בעידן המודרני ",
                " קומץ קטן של ממציאים גאונים ",
                " מאפשרים לשאר האנושות  ",
                " לשקוע בטמטום גמור.  "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 9
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost453() {
        val post = Post()
        with(post) {
            postNum = 453
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/07/09/12/16/apples-1506119_1280.jpg"
            postText = arrayListOf(
                "  אם לא הייתי ",
                " מפריע כל כך לעצמי ",
                " וודאי שהייתי  ",
                "יכול להנות הרבה יותר מהחיים האלה."
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 25 + di, 0, -1 + dd),
                arrayListOf(0, 50 + di, 0, -1 + dd),
                arrayListOf(0, 75 + di, 0, -1 + dd)
            )
            postTransparency = 0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost454() {
        val post = Post()
        with(post) {
            postNum = 454
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/11/28/10/03/river-219972_1280.jpg"
            postText = arrayListOf(
                "  חוסר המנוחה הבסיסי שיש לאדם ",
                " נובע מהחיים עצמם ",
                " שאינם אגם קפוא  ",
                " אלא נהר זורם. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 0
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost455() {
        val post = Post()
        with(post) {
            postNum = 455
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/08/01/20/15/girl-1562025_1280.jpg"
            postText = arrayListOf(
                "  למודעות שלך יש קיבולת מוגבלת ",
                " על כל קורטוב הבלים שאתה מאמץ ",
                " קורטוב קדושה חומק ממך  ",
                "  בעיקר בגלל חוסר מקום. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
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

    fun loadPost456() {
        val post = Post()
        with(post) {
            postNum = 456
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/07/03/09/17/fog-1494431_1280.jpg"
            postText = arrayListOf(
                " אמת ",
                " לא הולכת אף פעם לאיבוד, ",
                " היא רק מתגלית לך  ",
                "  כל פעם מחדש. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 2
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
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

    fun loadPost457() {
        val post = Post()
        with(post) {
            postNum = 457
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/08/01/14/42/knight-2565957_1280.jpg"
            postText = arrayListOf(
                " על דבר אחד בטוח שלא תסלח לעצמך, ",
                " על שבזבת את עצמך ",
                " במלחמות סרק  ",
                "  שהיו קיימות רק בראש שלך. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 2
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
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

    fun loadPost458() {
        val post = Post()
        with(post) {
            postNum = 458
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/06/06/04/52/child-5265236_1280.jpg"
            postText = arrayListOf(
                " החיים לא מתכוונים לפגוע בך אישית ",
                " הם מתנהלים בדרכם, ",
                " רק שאתה לפעמים עומד להם  ",
                "  באמצע אותה דרך. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#CED46A"
            val textColor = "#07553B"
            postFontFamily = 103
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

    fun loadPost459() {
        val post = Post()
        with(post) {
            postNum = 459
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/01/06/10/12/adult-3064693_1280.jpg"
            postText = arrayListOf(
                " גובה  ההר נמדד ",
                " מהמפלס שבו הוא מתחיל להתרומם, ",
                " השמחה שלך נמדדת  ",
                " ממפלס הצער בו היית. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 100 + dd),
                arrayListOf(0, -1 + di, 0, 50 + dd),
                arrayListOf(0, -1 + di, 0, 25 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 101
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 15
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost460() {
    val post = Post()
    with(post) {
        postNum = 460
        lineNum = 4
        imageUri = "https://cdn.pixabay.com/photo/2020/05/05/12/12/coffee-5132832_1280.jpg"
        postText = arrayListOf(
            " בבוקרו של יום חדש ",
            " מעט אנשים מוצאים באמת את עצמם, ",
            " היתר משחקים את הדמות שלהם  ",
            " כמו שהם מכירים אותה. "
        )
        val di = 0
        val dd = 10
        postMargin = arrayListOf(
            arrayListOf(0, -1 + di, 0, 75 + dd),
            arrayListOf(0, -1 + di, 0, 50 + dd),
            arrayListOf(0, -1 + di, 0, 25 + dd),
            arrayListOf(0, -1 + di, 0, 0 + dd)
        )
        postTransparency = 10
        postTextSize = arrayListOf(0, 13)
        val backgroundColor = "#F2AA4C"
        val textColor = "#101820"
        postFontFamily = 101
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0, 0, 0, 5)
        postRadiuas = 15
        lineSpacing = 1f
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost461() {
        val post = Post()
        with(post) {
            postNum = 461
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/08/01/01/33/beanie-2562646_1280.jpg"
            postText = arrayListOf(
                " העולם גדול ורחב, ",
                " אבל אתה קולט בו רק את אותו חלק ",
                " שאפשרי לך  ",
                " בתור מה שאתה ברגע זה. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 75 + dd),
                arrayListOf(0, -1 + di, 0, 50 + dd),
                arrayListOf(0, -1 + di, 0, 25 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 10
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#F2AA4C"
            val textColor = "#101820"
            postFontFamily = 101
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost462() {
        val post = Post()
        with(post) {
            postNum = 462
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/01/18/20/15/rain-3940580_1280.jpg"
            postText = arrayListOf(
                " הוצאתי פטור ",
                " שלא להתעסק בעגמות נפש ",
                " עד יום שלישי הבא,  ",
                " איזה כיף. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 150 + dd),
                arrayListOf(0, -1 + di, 0, 100 + dd),
                arrayListOf(0, -1 + di, 0, 50 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency = 10
            postTextSize = arrayListOf(0, 25)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily = 100
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost463() {
        val post = Post()
        with(post) {
            postNum = 463
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/02/20/19/20/buddha-1212620_1280.jpg"
            postText = arrayListOf(
                "  אם האדם היה ממש מבין ",
                " עד כמה הוא מטבעו טמבל, ",
                " הוא לא היה מתבייש בזה בכלל  ",
                " אלא צוחק על זה בפה מלא. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#F2AA4C"
            val textColor = "#101820"
            postFontFamily = 100
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 5
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost464() {
        val post = Post()
        with(post) {
            postNum = 464
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/10/21/10/05/saint-198958_1280.jpg"
            postText = arrayListOf(
                "  האלוהים לא שם באופן קבוע ",
                " אתה צריך ליצור אותו כל בוקר, ",
                " ובאם לא תיצור אותו ",
                " הוא לא יברא אותך מחדש. "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#101820"
            val textColor = "#1a7a4c"
            postFontFamily = 100
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 5
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost465() {
        val post = Post()
        with(post) {
            postNum = 465
            lineNum = 4
            imageUri = "https://images.unsplash.com/photo-1530071698688-1e4c30e1ea52?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=433&q=80"
            postText = arrayListOf(
                "  הכל יחסי בעולם הזה ",
                " חוץ מהמחשבה הזו שיש לך בראש, ",
                " בגלל שהיא היחידה ",
                " הקיימת בעולם שלך ברגע זה. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 5
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost466() {
        val post = Post()
        with(post) {
            postNum = 466
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/08/13/03/21/family-3602245_1280.jpg"
            postText = arrayListOf(
                "  יש הרבה אנשים שחיים חיים טובים ",
                " והם בכלל לא יודעים את זה ",
                " אולי בגלל  שלא הודיעו להם רשמית ",
                " שיש להם חיים טובים. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 25 + di, 0, -1 + dd),
                arrayListOf(0, 50 + di, 0, -1 + dd),
                arrayListOf(0, 75 + di, 0, -1 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 12)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 5
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost467() {
        val post = Post()
        with(post) {
            postNum = 467
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/08/02/23/52/bag-1565402_1280.jpg"
            postText = arrayListOf(
                "  אתה יודע מה קורה בחיים שלך ",
                " אבל לא ממש מכיר אותם, ",
                " באיזשהו מקום קצת חבל ",
                " כי הם יכולים להיות די נחמדים. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 30+ di, 0, -1 + dd),
                arrayListOf(0, 60 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd)
            )
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#815854"
            val textColor = "#F0EDCC"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 5
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost468() {
        val post = Post()
        with(post) {
            postNum = 468
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/08/19/05/53/asleep-5500058_1280.jpg"
            postText = arrayListOf(
                "  בסוף היום ",
                " גם מי שעשה המון ",
                " וגם מי שלא עשה דבר ",
                " הולכים לישון עייפים. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =5
            postTextSize = arrayListOf(0, 20)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost469() {
        val post = Post()
        with(post) {
            postNum = 469
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/04/27/20/17/dandelion-2266558_1280.jpg"
            postText = arrayListOf(
                " הרוחות הרעות מנשבות מקצה עולם עד קצהו ",
                " ואין לך סיכוי שהם לא יכו בך מדי פעם על הפנים, ",
                " הרוחות הטובות מנשבות רק במקומות ספורים ",
                " וצריך התכוונות לטוב כדי להרגיש אותם. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 210 + dd),
                arrayListOf(0, -1 + di, 0, 140 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost470() {
        val post = Post()
        with(post) {
            postNum = 470
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/12/29/17/50/teddy-1113160_1280.jpg"
            postText = arrayListOf(
                "  להבין ולקבל את החיפוש לנחמה ",
                " זו חצי נחמה, ",
                " החצי השני ",
                " זה לדעת שהיא כבר פה. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 30+ di, 0, -1 + dd),
                arrayListOf(0, 60 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost471() {
        val post = Post()
        with(post) {
            postNum = 471
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/07/13/02/25/man-4333898_1280.jpg"
            postText = arrayListOf(
                "  להיות אופטימי  ",
                " זה להרגיש טוב יותר ברגע זה ",
                " על חשבון עתיד לא ידוע, ",
                " אז למה לא ... "
            )
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost472() {
        val post = Post()
        with(post) {
            postNum = 472
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/08/29/19/15/sunflower-4439775_1280.jpg"
            postText = arrayListOf(
                "  אל תבלף  ",
                " איפה שממש לא הכרחי, ",
                " ותשתדל כמה שפחות לבלף ",
                " איפה שהכרחי. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost473() {
        val post = Post()
        with(post) {
            postNum = 473
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/01/29/18/05/burger-3962997_1280.jpg"
            postText = arrayListOf(
                "  טעויות  ",
                " שאתה מוכן לשלם עליהן, ",
                " אינם טעויות ",
                " אלא דרך חיים. "
            )
            val di = 0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost474() {
        val post = Post()
        with(post) {
            postNum = 474
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/12/02/03/08/people-talking-1876726_1280.jpg"
            postText = arrayListOf(
                "אם אתה לא יודע להתלוצץ על עצמך",
                " אז אין לך חוש הומור כלל וכלל, ",
                " כי רק אנשים כאלה ",
                " אינם מבינים בדיחה טובה. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 95 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost475() {
        val post = Post()
        with(post) {
            postNum = 475
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/02/16/02/03/pocket-watch-3156771_1280.jpg"
            postText = arrayListOf(
                " שעון מקולקל ",
                " צודק לפחות פעמיים ביום, ",
                " שעון תקין ",
                " יכול לטעות תמיד. "
            )
            val di = 0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost476() {
        val post = Post()
        with(post) {
            postNum = 476
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/12/17/14/40/jewish-cemetery-1097409_1280.jpg"
            postText = arrayListOf(
                " שאתה מת ",
                " בטוח שאתה מת, ",
                " שאתה חי ",
                " לא בטוח שאתה חי. "
            )
            val di = 0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost477() {
        val post = Post()
        with(post) {
            postNum = 477
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/03/29/11/29/nepal-2184940_1280.jpg"
            postText = arrayListOf(
                " מה הם החיים ? ",
                " זו שאלה פתוחה ",
                " שהתשובה לה ",
                " מקטינה את החיים. "
            )
            val di = 0
            val dd = 5
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost478() {
        val post = Post()
        with(post) {
            postNum = 478
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/12/29/11/04/girl-3047297_1280.jpg"
            postText = arrayListOf(
                " הכושר הזה להכניס את עצמך לבאסה ",
                " מכל צל צילה של מחשבה עוברת ",
                " הוא צורך הכרחי ",
                " אם אתה רוצה לחיות טוב  בגיהינום. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 30+ di, 0, -1 + dd),
                arrayListOf(0, 60 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost479() {
        val post = Post()
        with(post) {
            postNum = 479
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/05/16/12/53/sad-4207079_1280.jpg"
            postText = arrayListOf(
                " לפעמים  ",
                " הבעיה של האדם ",
                " היא רק אותה המחשבה ",
                " שיש לו בעיה. "
            )
            val di = 0
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost480() {
    val post = Post()
    with(post) {
        postNum = 480
        lineNum = 4
        imageUri = "https://cdn.pixabay.com/photo/2014/04/05/11/40/punch-316605_1280.jpg"
        postText = arrayListOf(
            "  אומנם הרבה השתנה  ",
            "  מאז אבותיי הפרה היסטוריים  ",
            "  אבל הכעס שלו והכעס שלי  ",
            " דומים להפליא. "
        )
        val di = 0
        val dd = 0
        postMargin = arrayListOf(
            arrayListOf(0, 0 + di, 0, -1 + dd),
            arrayListOf(0, 30+ di, 0, -1 + dd),
            arrayListOf(0, 60 + di, 0, -1 + dd),
            arrayListOf(0, 90 + di, 0, -1 + dd)
        )
        postTransparency =6
        postTextSize = arrayListOf(0, 14)
        val backgroundColor = "#101820"
        val textColor = "#FEE715"

        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0,0, 0, 0)
        postRadiuas = 16
        lineSpacing = 1.3f
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost481() {
        val post = Post()
        with(post) {
            postNum = 481
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/04/12/10/37/sunset-5033708_1280.jpg"
            postText = arrayListOf(
                "  כולם חושבים את אותם הדברים  ",
                "  אבל מעטים יודעים את זה,  ",
                "  אם יותר אנשים היו מודעים לזה  ",
                " הייתה פחות בדידות בעולם. "
            )
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 30+ di, 0, -1 + dd),
                arrayListOf(0, 60 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost482() {
        val post = Post()
        with(post) {
            postNum = 482
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/12/11/18/11/storm-4688918_1280.jpg"
            postText = arrayListOf(
                "  למצא פתרון לבעיה שלא קיימת  ",
                "  זה אפשרי אבל ממש לא מעשי,  ",
                "  אחת מהבעיות האלה היא  ",
                " משמעות החיים. "
            )
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 30+ di, 0, -1 + dd),
                arrayListOf(0, 60 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FFDFDE"
            val textColor = "#6A7BA2"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
       fun loadPost483() {
        val post = Post()
        with(post) {
            postNum = 483
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/07/29/21/27/filming-4371566_1280.jpg"
            postText = arrayListOf(
                "  החיים שלך  ",
                "  זו הפקה די בינונית של חי אדם  ",
                "  המבוססת על מקרה אמיתי  ",
                " של מה שקרה לך. "
            )
            val di = 20
            val dd = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 35+ di, 0, -1 + dd),
                arrayListOf(0, 70 + di, 0, -1 + dd),
                arrayListOf(0, 105 + di, 0, -1 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FFDFDE"
            val textColor = "#6A7BA2"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost484() {
        val post = Post()
        with(post) {
            postNum = 484
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/12/15/20/17/cleaning-1909978_1280.jpg"
            postText = arrayListOf(
                "  מוטב לעשות  ",
                "  את מה שאתה יכול לעשות  ",
                " מלבכות ",
                " על מה שאתה לא יכול לעשות. "
            )
            val di = 0
            val dd = 20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 107 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#755139"
            val textColor = "#F2EDD7"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost485() {
        val post = Post()
        with(post) {
            postNum = 485
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/04/27/22/09/space-4161418_1280.jpg"
            postText = arrayListOf(
                " חצי הכוס הריקה ",
                "  הוא המקום היחידי  ",
                " בו אפשרי לך ",
                " ליצור יש מהאין. "
            )
            val di = 0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 25+ di, 0, -1 + dd),
                arrayListOf(0, 50 + di, 0, -1 + dd),
                arrayListOf(0, 75 + di, 0, -1 + dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#755139"
            val textColor = "#F2EDD7"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost486() {
        val post = Post()
        with(post) {
            postNum = 486
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/22/19/32/hands-1850223_1280.jpg"
            postText = arrayListOf(
                " טעות היא לחשוב ",
                "  שהאדם רוצה יחס,  ",
                " היחס הוא חלק מהאדם עצמו ",
                " וללא יחס הוא מרגיש חסר. "
            )
            val di = 0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 30+ di, 0, -1 + dd),
                arrayListOf(0, 60 + di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#755139"
            val textColor = "#07553B"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost487() {
        val post = Post()
        with(post) {
            postNum = 487
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/01/24/05/38/tunisia-4789342_1280.jpg"
            postText = arrayListOf(
                " הקסם בחיים  ",
                "  הוא דבק  ",
                " שמחבר בין הדברים שקורים ",
                "  לידי חוויה אישית. "
            )
            val di = 0
            val dd =20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#CED46A"
            val textColor = "#07553B"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost488() {
        val post = Post()
        with(post) {
            postNum = 488
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/01/12/17/30/warm-and-cozy-1975215_1280.jpg"
            postText = arrayListOf(
                " אתה חי עם החיים שלך כבר המון שנים  ",
                " ולא ממש מכיר אותם,  ",
                " זה מרגיש יותר כמו נישואי נוחות ",
                "  מסיפור אהבה. "
            )
            val di = 0
            val dd =20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#A4193D"
            val textColor = "#FFDFB9"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost489() {
        val post = Post()
        with(post) {
            postNum = 489
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/02/05/21/05/running-78192_1280.jpg"
            postText = arrayListOf(
                " המפסידים בחיים ",
                " אלה אינם אלה שהגיעו במקומות האחרונים,  ",
                " אלה אותם ",
                "  שלא משתתפים בפועל בהפעלה הזו. "
            )
            val di = 0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 130 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost490() {
        val post = Post()
        with(post) {
            postNum = 490
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/23/18/07/dog-1854123_1280.jpg"
            postText = arrayListOf(
                " הים הגדול ממשיך עד מעבר לאופק  ",
                " אבל הצעקות של השכנה שמדברת בפלאפון  ",
                " ממלאות לי את כל חלל המודעות ",
                "  כי אני יצור שבנוי ברובו לעיסוק בהבלים.  "
            )
            val di = 0
            val dd =20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 135 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4901() {
        val post = Post()
        with(post) {
            postNum = 4901
            postId= 63
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/04/29/01/23/skin-3358873_1280.jpg"
            postText = arrayListOf(
                " החיים שלך  ",
                " זה לא מה שקורה לך, ",
                " אלא ",
                "  מה שאתה מבין מכל מזה.  "
            )
            val di = 0
            val dd =20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =5
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#101820"
            val textColor = "#F2AA4C"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4902() {
        val post = Post()
        with(post) {
            postNum = 4902
            postId= 65
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/04/17/bonfire-1867275_1280.jpg"
            postText = arrayListOf(
                " הפייסבוק   ",
                " זאת מדורת השבט המודרנית, ",
                " רחוק מידי תתקרר ",
                "  קרוב מידי תישרף.  "
            )
            val di = 0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#101820"
            val textColor = "#F2AA4C"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4903() {
        val post = Post()
        with(post) {
            postNum = 4903
            postId= 72
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/03/07/20/45/cog-wheels-2125169_1280.jpg"
            postText = arrayListOf(
                " האדם מכיר את עצמו  ",
                " ומכיר את העולם ",
                " אבל הוא לא מסוגל להבין ",
                "  איך זה עובד ביחד.  "
            )
            val di = 0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =4
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#101820"
            val textColor = "#F2AA4C"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4904() {
        val post = Post()
        with(post) {
            postNum = 4904
            postId= 76
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/10/27/15/52/jaguar-2894706_1280.jpg"
            postText = arrayListOf(
                " ככול שההישרדות היומיומית של האדם  ",
                " נכחדת אט אט עם הקדמה הטכנולוגית,  ",
                " היכולת שלו לבזבז את החיים שלו ",
                "  מתפתחת לרמה מרשימה.  "
            )
            val di = 0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#F9EBDE"
            val textColor = "#815854"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
      util.sendPostToStringFirestore(post)
    }

    fun loadPost4905() {
        val post = Post()
        with(post) {
            postNum = 4905
            postId= 78
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/10/03/07/23/elephant-calf-2811487_1280.jpg"
            postText = arrayListOf(
                " האדם נמצא בדרך כלל   ",
                " נבמקום שבטוח לו להיות שם,  ",
                " לא תמיד  ",
                "  זה המקום שהכי טוב בשבילו.  "
            )
            val di = 0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#CED46A"
            val textColor = "#07553B"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
   fun loadPost4906() {
        val post = Post()
        with(post) {
            postNum = 4906
            postId= 79
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/02/21/18/15/wall-644468_1280.jpg"
            postText = arrayListOf(
                " אתה יכול להבין    ",
                " את המגבלה שלך בתור בן אנוש  ",
                " אבל ההבנה הזאת בדרך כלל  ",
                "  לא תחלץ אותך מתוך המגבלה הזו.  "
            )
            val di = 0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#CED46A"
            val textColor = "#07553B"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost4907() {
    val post = Post()
    with(post) {
        postNum = 4907
        postId= 75
        lineNum = 4
        imageUri = "https://cdn.pixabay.com/photo/2016/08/23/15/52/fresh-orange-juice-1614822_1280.jpg"
        postText = arrayListOf(
            " האדם יוצר את הבעיות שלו   ",
            " מתוך העולם שסביבו,  ",
            " הוא לא ממציא עובדות חדשות למציאות  ",
            "  אלא פשוט מרכיב אותם שלא בסדר הנכון.  "
        )
        val di = 0
        val dd =0
        postMargin = arrayListOf(
            arrayListOf(0, 0 + di, 0, -1 + dd),
            arrayListOf(0, 30+ di, 0, -1 + dd),
            arrayListOf(0, 60 + di, 0, -1 + dd),
            arrayListOf(0, 90 + di, 0, -1 + dd)
        )
        postTransparency =9
        postTextSize = arrayListOf(0, 14)
        val backgroundColor = "#CED46A"
        val textColor = "#07553B"

        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0,0, 0, 0)
        postRadiuas = 16
        lineSpacing = 1.2f
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

fun loadPost4908() {
        val post = Post()
        with(post) {
            postNum = 4908
            postId= 81
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/08/02/11/03/hallelujah-6516410_1280.jpg"
            postText = arrayListOf(
                " החיים חסרי משמעות  ",
                " וטוב שכך,  ",
                " ככה נשאר לאדם מרחב נקי  ",
                "  ליצור את המשמעות שלו בחיים.  "
            )
            val di = 20
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 40+ di, 0, -1 + dd),
                arrayListOf(0, 80 + di, 0, -1 + dd),
                arrayListOf(0, 120 + di, 0, -1 + dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4909() {
        val post = Post()
        with(post) {
            postNum = 4909
            postId= 83
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/11/08/16/57/road-5724397_1280.jpg"
            postText = arrayListOf(
                " הדרך הנכונה בשבילך  ",
                " בנויה מאבנים רגילות,  ",
                " מה שמייחד אותה ",
                "  שהיא הדרך הנכונה בשבילך.  "
            )
            val di = 10
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 35+ di, 0, -1 + dd),
                arrayListOf(0, 70 + di, 0, -1 + dd),
                arrayListOf(0, 105+ di, 0, -1 + dd)
            )
            postTransparency =7
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost4910() {
        val post = Post()
        with(post) {
            postNum = 4910
            postId= 90
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/05/08/50/train-2373323_1280.jpg"
            postText = arrayListOf(
                " אל תיקח את החיים האלה  ",
                " בצורה כל כך אישית  ",
                " אחרי הכל ",
                "  כולם משתמשים בהם.  "
            )
            val di = 0
            val dd =40
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =7
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4911() {
        val post = Post()
        with(post) {
            postNum = 4911
            postId= 86
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/08/24/02/05/time-425818_1280.jpg"
            postText = arrayListOf(
                " ההבדל בין  ",
                " רגע בחיים לחיים כולם  ",
                " שהרגע עובר לפעמים ",
                "  הרבה יותר לאט.  "
            )
            val di = 0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4912() {
        val post = Post()
        with(post) {
            postNum = 4912
            postId= 87
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/27/00/41/homeless-861899_1280.jpg"
            postText = arrayListOf(
                " תפיסות ישנות ",
                " טובות בשביל להסתדר בעולם  ",
                " אבל הן פחות טובות ",
                "  בשביל לחוות אותו מחדש.  "
            )
            val di = 0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =4
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4913() {
        val post = Post()
        with(post) {
            postNum = 4913
            postId= 87
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/11/06/11/32/girl-1026246_1280.jpg"
            postText = arrayListOf(
                " האדם יכול להיות בטוב ",
                " והוא לא יידע מזה  ",
                " בגלל שכל תשומת הלב שלו ",
                "  מכוונת להתמודדות עם הרע.  "
            )
            val di = 20
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 35+ di, 0, -1 + dd),
                arrayListOf(0, 70 + di, 0, -1 + dd),
                arrayListOf(0, 105+ di, 0, -1 + dd)
            )
            postTransparency =6
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4914() {
        val post = Post()
        with(post) {
            postNum = 4914
            postId= 75
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/11/29/19/25/morning-1069218_1280.jpg"
            postText = arrayListOf(
                " לא מתבאס שהעולם הזה קצת עקום  ",
                " שיתבאס מי שיצר אותו כזה,  ",
                " לא אחראי על כל זה ",
                "  אני באתי הנה רק לביקור קצר.  "
            )
            val di = 20
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + di, 0, -1 + dd),
                arrayListOf(0, 60+ di, 0, -1 + dd),
                arrayListOf(0, 90 + di, 0, -1 + dd),
                arrayListOf(0, 120+ di, 0, -1 + dd)
            )
            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4915() {
        val post = Post()
        with(post) {
            postNum = 4915
            postId= 75
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/01/25/11/18/girl-3954232_1280.jpg"
            postText = arrayListOf(
                " אנשים נוסעים למקומות אחרים  ",
                " שלא כל כך כדי להיות שם  ",
                " כמו שלא להישאר כאן ",
                "  לבד עם עצמם.  "
            )
            val di = 0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#80634C"
            val textColor = "#1AAFBC"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4916() {
        val post = Post()
        with(post) {
            postNum = 4916
            postId= 78
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/10/20/11/18/woman-495124_1280.jpg"
            postText = arrayListOf(
                " ואם כבר לכעוס ",
                "  עדיף על דברים מוצדקים,  ",
                " צדק ",
                "  הוא לא אחד מהם.  "
            )
            val di = 0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#F2AA4C"
            val textColor = "#101820"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4917() {
        val post = Post()
        with(post) {
            postNum = 4917
            postId= 86
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/25/08/07/sunbeds-2439951_1280.jpg"
            postText = arrayListOf(
                " הנוחות ",
                "  היא תנאי הכרחי  ",
                " לעודף משקל ",
                "  לא לשביעות רצון.  "
            )
            val di = 0
            val dd =20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#F2AA4C"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4918() {
        val post = Post()
        with(post) {
            postNum = 4918
            postId= 79
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/09/00/21/netflix-3733812_1280.jpg"
            postText = arrayListOf(
                " טמטום חושים ",
                "  זו תחנה טובה לרדת בה  ",
                " אם אוטובוס המחשבות שלך ",
                "  לוקח אותך למחוזות אבודים.  "
            )
            val di = 0
            val dd =20
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#2BAE66"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
}





