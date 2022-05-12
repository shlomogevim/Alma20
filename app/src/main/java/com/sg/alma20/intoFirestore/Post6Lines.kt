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
class Post6Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost= DrawPostCenter(context)
    private val util= Utility()

    fun loadPost600() {
        val post = Post()
        with(post) {
            postNum = 600
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2021/03/27/05/10/pills-6127501_1280.jpg"
            postText = arrayListOf(
                "המיינד",
                "הוא כדור הרגעה",
                "מהאין סופיות של החיים,",
                "טוב להשתמש בו מידי פעם,",
                "אבל כדי לשמור קשר טוב למציאות",
                "רצוי שלא להתמכר אליו יותר מידי."
            )
            val di = 0
            val du = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 370 + di),
                arrayListOf(0, -1 + du, 0, 310+ di),
                arrayListOf(0, -1 + du, 0, 255 + di),
                arrayListOf(0, -1 + du, 0, 195 + di),
                arrayListOf(0, -1 + du, 0,90 + di),
                arrayListOf(0, -1 + du, 0, 0 + di)
            )
            postBackground = "030e4f"
            postTransparency = 10
            postTextSize = arrayListOf(0,24)
            postPadding = arrayListOf(10, 10, 10, 10)
            val col="#f49f1c"
            postTextColor = arrayListOf(CONSTANT,col)
            postFontFamily = 100
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost601() {
        var post = Post()
        with(post) {
            postNum = 601
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2020/01/14/23/16/unicorn-4766547_1280.jpg"
            postText = arrayListOf(
                "אתה חי בתוך אגדה עתיקה,",
                "גן העדן והגיהנום נמצאים כאן ועכשיו,",
                "ומי שמחליט לאיזה מחוזות תנוע בעולם הזה הוא:",
                "אתה.",
                "ומה שנותר פתוח",
                "זו אותה אמונה באגדות עתיקות."
            )
            val di = 0
            val du = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35 + du, 0, -1 + di),
                arrayListOf(0, 95+ du, 0, -1 + di),
                arrayListOf(0,155 + du, 0, -1 + di),
                arrayListOf(0, 190 + du, 0,-1 + di),
                arrayListOf(0,225 + du, 0, -1 + di)
            )
            postTextSize = arrayListOf(0, 20)
            postTransparency = 7
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 5
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost602() {
        var post = Post()
        with(post) {
            postNum = 602
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2018/11/02/09/50/human-3789910_1280.jpg"
            postText = arrayListOf(
                "הגאומטריה של הסבל,",
                "במשולש הקיום שלך שלשה קודקודים: ",
                "מה שאתה צריך,",
                "מה שאתה רוצה",
                "ומה שיש לך,",
                "וככול ששטח המשולש קטן יותר," +
                        " אתה פחות סובל."
            )
            val di = 0
            val du = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35 + du, 0, -1 + di),
                arrayListOf(0, 95+ du, 0, -1 + di),
                arrayListOf(0,130 + du, 0, -1 + di),
                arrayListOf(0, 165 + du, 0,-1 + di),
                arrayListOf(0,200 + du, 0, -1 + di)
            )
            postTextSize = arrayListOf(0, 20)
            postTransparency = 7
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 5
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost603() {
        var post = Post()
        with(post) {
            postNum = 603
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg"
            postText = arrayListOf(
                " גן העדן והגיהנום ",
                "הם לא מקומות",
                "בעולם הבא,",
                "הם יותר צורת",
                "המחשבות שלך",
                "בעולם הזה."
            )
            val di = 0
            val du = 50
           /* postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 200 + di),
                arrayListOf(0, -1 + du, 0, 160 + di),
                arrayListOf(0, -1 + du, 0,120 + di),
                arrayListOf(0, -1 + du, 0, 80 + di),
                arrayListOf(0, -1 + du, 0, 40 + di),
                arrayListOf(0, -1 + du, 0, 0 + di)
            )*/
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,40+ du, 0, -1 + di),
                arrayListOf(0, 80+ du, 0, -1 + di),
                arrayListOf(0,120 + du, 0, -1 + di),
                arrayListOf(0, 160+ du, 0,-1 + di),
                arrayListOf(0,200 + du, 0, -1 + di)
            )
            postTextSize = arrayListOf(0, 24)
            postTransparency = 0
            postBackground = "428289"
            val textColor = "007591"
            postFontFamily = 240
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost604() {
        val post = Post()
        with(post) {
            postNum = 604
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2015/07/09/22/45/tree-838667_1280.jpg"
            postText = arrayListOf(
                "נחמה",
                "זה שמישהו אומר לך ",
                "שאתה בסדר,",
                "שלווה",
                "זה שאתה מבין",
                "שאתה בסדר."
            )
            val di =0
            val du =20
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,30+ du, 0, -1 + di),
                arrayListOf(0, 60+ du, 0, -1 + di),
                arrayListOf(0,100 + du, 0, -1 + di),
                arrayListOf(0, 130+ du, 0,-1 + di),
                arrayListOf(0,160 + du, 0, -1 + di)
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
     fun loadPost605() {
        val post = Post()
        with(post) {
            postNum = 605
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2020/02/06/09/39/girl-4823612_1280.jpg"
            postText = arrayListOf(
                "החופש הזה שלא לדעת",
                "החופש הזה שלא להיות צודק ",
                "החופש הזה שלא להיות מקובל",
                "החופש הזה שלא להיות חכם",
                "החופש הזה שלא להיות מישהו",
                "החופש הזה של רק להיות."
            )
            val di =0
            val du =10
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,30+ du, 0, -1 + di),
                arrayListOf(0, 60+ du, 0, -1 + di),
                arrayListOf(0,90 + du, 0, -1 + di),
                arrayListOf(0, 120+ du, 0,-1 + di),
                arrayListOf(0,150 + du, 0, -1 + di)
            )

            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily =300

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost606() {
        val post = Post()
        with(post) {
            postNum = 606
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2010/12/16/14/49/justice-3612_1280.jpg"
            val st1=" בסעיף של "
            val st2="עשה אל תעשה"
            val st12="\""
            val st=st1+st12+st2+st12
            postText = arrayListOf(
                st,
                " אל תחשוב במושגים של: ",
                " טוב ורע, ",
                "אלא במושגים של: ",
                "מתאים למה שאני ",
                "לא מתאים  למה שאני."
            )
            val di =0
            val du =10
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35+ du, 0, -1 + di),
                arrayListOf(0,70+ du, 0, -1 + di),
                arrayListOf(0,105 + du, 0, -1 + di),
                arrayListOf(0, 140+ du, 0,-1 + di),
                arrayListOf(0,175 + du, 0, -1 + di)
            )

            postTransparency =5
            postTextSize = arrayListOf(0, 18)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily =103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10,0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost607() {
    val post = Post()
    with(post) {
        postNum = 607
        lineNum =6
        imageUri = "https://cdn.pixabay.com/photo/2017/02/10/15/10/love-2055372_1280.jpg"
           postText = arrayListOf(
               " בדרך כלל ",
            "בשר ודם הוא רק בשר ודם, ",
            "ולפעמים ",
            "בשר ודם הופך לעפר",
            "ולפעמים ",
            "הוא הופך לקסם."
        )
        val di =0
        val du =0
        postMargin = arrayListOf(
            arrayListOf(0, 0 + du, 0, -1 + di),
            arrayListOf(0,35+ du, 0, -1 + di),
            arrayListOf(0,-1+ du, 0, 115+ di),
            arrayListOf(0,-1+ du, 0, 80 + di),
            arrayListOf(0, -1+ du, 0,45 + di),
            arrayListOf(0,-1 + du, 0,10 + di)
        )

        postTransparency =6
        postTextSize = arrayListOf(0, 18)
        postBackground = "#101820"
        val textColor = "DDA94B"
        postFontFamily =103

        val col = "#$textColor"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(10, 0, 10,0)
        postRadiuas = 15

    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}
}

