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


class Post5Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost= DrawPostCenter(context)
    private val util= Utility()

    fun loadPost500() {
        val post = Post()
        with(post) {
            postNum = 500
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2018/12/02/20/26/till-eulenspiegel-3852068_1280.jpg"
            postText  = arrayListOf(
                " ההבדל בין: ",
                "טמבל רגיל",
                " לטמבל עם תואר של דוקטור, ",
                " הוא רק הכבוד ",
                " שאתה חולק לכל אחד מהם. "
            )
            postBackground ="a9dce3"
            postTransparency =8
            val di=0
            val dd=20
            postMargin = arrayListOf(
                arrayListOf(0,-1+di,0,200+dd),
                arrayListOf(0,-1+di, 0, 150+dd),
                arrayListOf(0,-1+di, 0,100+dd),
                arrayListOf(0,-1+di, 0,50+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )
           val size1=20
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(0, 2,0, 2)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1)
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

  fun loadPost501() {
      val post = Post()
      with(post) {
          postNum = 501
          lineNum =5
          imageUri ="https://cdn.pixabay.com/photo/2020/03/01/07/25/remote-control-4891936_1280.jpg"
          postText  = arrayListOf(
              " האומנות בחיים  היא: ",
              "שלא לחיות אותם ",
              " בשידורים חוזרים שוב ושוב, ",
              " אלא להיות מספיק פתוח ",
              " לשידורים בזמן אמת. "
          )
          postBackground ="a9dce3"
          postTransparency =0
          val di=0
          val dd=0
          postMargin = arrayListOf(
              arrayListOf(0,10+di,0,-1+dd),
              arrayListOf(0,50+di, 0, -1+dd),
              arrayListOf(0,90+di, 0,-1+dd),
              /*arrayListOf(0,120+di, 0,-1+dd),
              arrayListOf(0,160+di, 0,-1+dd)*/
              arrayListOf(0,-1+di, 0,50+dd),
              arrayListOf(0,-1+di, 0,10+dd)
          )
          val size1=20
          val size2=0
          postTextSize =  arrayListOf(0, size1,size2)
          postPadding =  arrayListOf(0, 0,0, 0)
          val col = "#ffffff"
          val col1 = "#4dd0e1"
          postTextColor = arrayListOf(CONSTANT, col, col1)
          postFontFamily =103
          postRadiuas = 15
      }
      drawPost.drawPostFire(post,layout)
      util.sendPostToStringFirestore(post)
  }
    fun loadPost502() {
        val post = Post()
        with(post) {
            postNum = 502
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2017/08/24/03/41/milky-way-2675323_1280.jpg"
            postText  = arrayListOf(
                "אמת לא הולכת אף פעם לאיבוד",
                "אף פעם לא משתנה,",
                " היא רק מתגלית לך ",
                " כל פעם מחדש  ",
                " בצורה קצת אחרת. "
            )
            postBackground ="a9dce3"
            postTransparency =0
            val di=20
            val dd=0
            postMargin = arrayListOf(
                arrayListOf(0,0+di,0,-1+dd),
                arrayListOf(0,60+di, 0,-1+dd),
                arrayListOf(0,100+di, 0,-1+dd),
                arrayListOf(0,140+di, 0,-1+dd),
                arrayListOf(0,180+di, 0,-1+dd)
            )
            val size1=20
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(0, 0,0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost503() {
        val post = Post()
        with(post) {
            postNum = 503
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2018/09/23/23/13/children-3698745_1280.jpg"
            postText = arrayListOf(
                " העולם הזה, ",
                " לקטנים ",
                " הוא מגרש משחקים, ",
                " לגדולים ",
                " מגרש בלי משחקים. "
            )
            postBackground ="000000"
            postTransparency =10
            val di=0
            val dd=-5
            postMargin = arrayListOf(
                arrayListOf(0,-1+di,0,170+dd),

                arrayListOf(0,-1+di,0,130+dd),
                arrayListOf(0,-1+di, 0,90+dd),
                arrayListOf(0,-1+di, 0,50+dd),
                arrayListOf(0,-1+di, 0,10+dd)
            )
            val size1=24
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(0, 0,0, 0)
           val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col )
            postFontFamily =1
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost504() {
        val post = Post()
        with(post) {
            postNum = 504
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2016/01/19/17/22/children-1149671_1280.jpg"
            val st1 = " בסוף מה נשאר לך? "
            val st2 = " רק אהבה "
            postText = arrayListOf(
                " בזמנים שהכול נשבר מסביב ",
                " וכל גל נראה מאיים ואינסופי, ",
                " ניזכר במשפט של אריק איינשטיין: ",
                "\"" + st1,
                st2 + "\""
            )
            postBackground ="000000"
          //  postBackground ="4d3227"
            postTransparency =4
            val di=0
            val dd=0
            postMargin = arrayListOf(
                arrayListOf(0,10,0,-1),
                arrayListOf(0,45+di,0,-1),
                arrayListOf(0,80+di,0,-1),
                arrayListOf(0,115+di,0,-1),
                arrayListOf(0,145+di,0,-1),
            )
            val size1=16
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(0, 0,0, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col )
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost505() {
        val post = Post()
        with(post) {
            postNum = 505
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2013/04/04/12/34/mountains-100367_1280.jpg"
            postText = arrayListOf(
                "שיהיו ימינו ארוכים עד מעבר לקצה השדות,",
                "שהשמש החמימה תטה לנו חסד מידי פעם,",
                "שצל העצים הגדולים יהיה רחב ומזמין,",
                "שנהיה פחות בסיפור שלנו על החיים",
                "ויותר בחיים."
            )
            postBackground ="263238"
            postTransparency =4
            val di=0
            val dd=0
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,105+dd),
                arrayListOf(0,-1+di, 0,80+dd),
                arrayListOf(0,-1+di, 0,55+dd),
                arrayListOf(0,-1+di, 0,30+dd),
                arrayListOf(0,-1+di, 0,5+dd)
            )
            val size1=13
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(0, 0,0, 0)
            val col = "#f6ff03"
            postTextColor = arrayListOf(CONSTANT, col )
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost506() {
        val post = Post()
        with(post) {
            postNum = 506
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2017/02/27/00/19/male-2101801_1280.jpg"
            postText = arrayListOf(
                "  כל הטרדות שלך  ",
                "  גדולות כקטנות,  ",
                "  הן עוגנים השומרים אותך  ",
                "  לבל תתנפץ  ",
                "  בחוסר המשמעות של הקיום.  "
            )
            postBackground ="263238"
            postTransparency =4
            val di=0
            val dd=0
            postMargin = arrayListOf(
                arrayListOf(0,0+di, 0,-1+dd),
                arrayListOf(0,30+di, 0,-1+dd),
                arrayListOf(0,60+di, 0,-1+dd),
                arrayListOf(0,90+di, 0,-1+dd),
                arrayListOf(0,120+di, 0,-1+dd)
            )
            val size1=16
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(0, 0,0, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col )
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost507() {
        val post = Post()
        with(post) {
            postNum = 507
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2019/08/09/23/11/forest-4395986_1280.jpg"
            postText = arrayListOf(
                "מלחמות גדולות",
                "מלחמות קטנות,",
                "בחלק מהם ניצחתי",
                "ובחלק פחות,",
                "והמוצלחות ביותר היו אילו שלא היו."
            )
            postBackground ="263238"
            postTransparency =4
            val di=0
            val dd=10
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,120+dd),
                arrayListOf(0,-1+di, 0,90+dd),
                arrayListOf(0,-1+di, 0,60+dd),
                arrayListOf(0,-1+di, 0,30+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )
            val size1=16
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(0, 0,0, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col )
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost508() {
        val post = Post()
        with(post) {
            postNum = 508
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2020/08/19/00/13/sea-5499649_1280.jpg"
            postText = arrayListOf(
                " יש אנשים האומרים ",
                " שהיופי עובר עם הגיל, ",
                " לא יודע מי האנשים האלה ",
                " אבל בטוח ",
                "שהם לא מכירים את הים הגדול."
            )
            postBackground ="263238"
            postTransparency =4
            val di=0
            val dd=10
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,160+dd),
                arrayListOf(0,-1+di, 0,120+dd),
                arrayListOf(0,-1+di, 0,80+dd),
                arrayListOf(0,-1+di, 0,40+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )
            val size1=22
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(0, 0,0, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col )
            postFontFamily =4
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost509() {
        var post=Post()
        with(post) {
            postNum =509
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2017/08/01/14/42/knight-2565957_1280.jpg"
            postText =  arrayListOf(
                " היכולת שלך לחיות בשלום עם עצמך ",
                " תלויה בכישרון שבך, ",
                " לבחור בקפידה ",
                " להילחם ",
                " רק את המלחמות שמתאימות לך. "
            )
            val di =0
            val dd=10
            postMargin =  arrayListOf(
                arrayListOf(0,-1+di, 0,120+dd),
                arrayListOf(0,-1+di, 0,90+dd),
                arrayListOf(0,-1+di, 0,60+dd),
                arrayListOf(0,-1+di, 0,30+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )
            postTextSize =  arrayListOf(0, 17)
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
    fun loadPost510() {
        var post=Post()
        with(post) {
            postNum =510
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2017/06/25/08/07/sunbeds-2439952_1280.jpg"
            postText =  arrayListOf(
                "אתה רוצה דברים מסוימים",
                "שלא בגלל שאין לך אותם,",
                "כמו",
                "שאין בך מודעות ",
                "שבעצם יש לך כבר אותם."
            )
            val di =0
            val dd=10
            postMargin =  arrayListOf(
                arrayListOf(0,-1+di, 0,120+dd),
                arrayListOf(0,-1+di, 0,90+dd),
                arrayListOf(0,-1+di, 0,60+dd),
                arrayListOf(0,-1+di, 0,30+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )
            postTextSize =  arrayListOf(0, 20)
            postTransparency =7
            postBackground =  "143d59"
            val textColor = "f6ff03"
            postFontFamily =320

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost511() {
    var post=Post()
    with(post) {
        postNum =511
        lineNum =5
        imageUri ="https://cdn.pixabay.com/photo/2013/05/11/08/28/sunset-110305__340.jpg"
        postText =  arrayListOf(
            "הטוב,",
            "הרבה יותר קרוב",
            "ממה שאתה חושב,",
            "והרבה יותר רחוק",
            "ממה שאתה מצפה לו."
        )
        val di =10
        val dd=0
        postMargin =  arrayListOf(
            arrayListOf(0,0+di, 0,-1+dd),
            arrayListOf(0,30+di, 0,-1+dd),
            arrayListOf(0,60+di, 0,-1+dd),
            arrayListOf(0,90+di, 0,-1+dd),
            arrayListOf(0,120+di, 0,-1+dd)
        )
        postTextSize =  arrayListOf(0, 20)
        postTransparency =7
        postBackground =  "143d59"
        val textColor = "f6ff03"
        postFontFamily =320

        postTextColor = arrayListOf(CONSTANT, "#$textColor")
        postPadding = arrayListOf(10, 0, 10, 0)
        postRadiuas = 15
    }
    drawPost.drawPostFire(post,layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost512() {
        var post=Post()
        with(post) {
            postNum =512
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2012/03/04/01/01/father-22194_1280.jpg"
            postText =  arrayListOf(
                "גם אם תשתדל",
                "לא תהיה הכי חכם בעולם,",
                "לעומת זאת",
                "אם תשתדל",
                "תוכל להיות הכי אתה בעולם."
            )
            val di =10
            val dd=0
            postMargin =  arrayListOf(
                arrayListOf(0,0+di, 0,-1+dd),
                arrayListOf(0,30+di, 0,-1+dd),
                arrayListOf(0,60+di, 0,-1+dd),
                arrayListOf(0,90+di, 0,-1+dd),
                arrayListOf(0,120+di, 0,-1+dd)
            )
            postTextSize =  arrayListOf(0, 20)
            postTransparency =7
            postBackground =  "143d59"
            val textColor = "f6ff03"
            postFontFamily =320

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost513() {
        val post = Post()
        with(post) {
            postNum = 513
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2019/05/04/09/33/male-4177635_1280.jpg"
            postText = arrayListOf(
                "הנוחות של החיים שלך",
                "אינה נמדדת לפי",
                "כמה אחרים מציקים לך,",
                "אלא לפי",
                "כמה שאתה מציק לעצמך."
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,130+dd),
                arrayListOf(0,-1+di, 0,100+dd),
                arrayListOf(0,-1+di, 0,70+dd),
                arrayListOf(0,-1+di, 0,40+dd),
                arrayListOf(0,-1+di, 0,10+dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 24)
            val  backgroundColor = "#F2EDD7"
            val textColor = "#b3b7b4"
            postFontFamily =110

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 0

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost514() {
        val post = Post()
        with(post) {
            postNum = 514
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2014/07/05/08/37/graveyard-384604_1280.jpg"
            postText = arrayListOf(
                "החיים בסך הכל",
                "זה דיל לא רע ,",
                "הבעיה",
                "שאתה מצליח להבין את זה",
                "רק בצ'ק אאוט."
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,130+dd),
                arrayListOf(0,-1+di, 0,100+dd),
                arrayListOf(0,-1+di, 0,70+dd),
                arrayListOf(0,-1+di, 0,40+dd),
                arrayListOf(0,-1+di, 0,10+dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 24)
            val  backgroundColor = "#F2EDD7"
            val textColor = "#b3b7b4"
            postFontFamily =110

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 0

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost515() {
    val post = Post()
    with(post) {
    postNum = 515
    lineNum = 5
    imageUri = "https://cdn.pixabay.com/photo/2016/10/27/14/23/old-man-1775239_1280.jpg"
    postText = arrayListOf(
    " גם אם תחייה עוד מאתיים שנה ",
    " לא תהיה חכם יותר, ",
    " או רעב פחות, ",
    " תהיה הרבה יותר זמן אתה, ",
    "  וזהו.  "
    )
    val di =20
    val dd =0
    postMargin = arrayListOf(
        arrayListOf(0,0+di, 0,-1+dd),
        arrayListOf(0,35+di, 0,-1+dd),
        arrayListOf(0,70+di, 0,-1+dd),
        arrayListOf(0,105+di, 0,-1+dd),
        arrayListOf(0,140+di, 0,-1+dd)
    )
    postTransparency =5
    postTextSize = arrayListOf(0, 20)
    val  backgroundColor = "#101820"
    val textColor = "#FEE715"
    postFontFamily =100

    postBackground =util. improveColorString(backgroundColor)
    val textcolo=util.improveColorString(textColor)
    val col = "#$textcolo"
    postTextColor = arrayListOf(CONSTANT, col)
    postPadding = arrayListOf(0, 0, 0, 0)
    postRadiuas = 0

    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
    }

fun loadPost516() {
    val post = Post()
    with(post) {
        postNum = 516
        lineNum = 5
        imageUri = "https://cdn.pixabay.com/photo/2018/06/04/06/56/religion-3452571_1280.jpg"
        postText = arrayListOf(
            " זה שלא הספקת לחיות ",
            " כי היית עסוק מידי, ",
            " זה לא סיבה מספיק טובה ",
            " לפתור אותך מדרך הנשמות ",
            " שיבוא יומך.  "
        )
        val di =20
        val dd =0
        postMargin = arrayListOf(
            arrayListOf(0,0+di, 0,-1+dd),
            arrayListOf(0,35+di, 0,-1+dd),
            arrayListOf(0,70+di, 0,-1+dd),
            arrayListOf(0,105+di, 0,-1+dd),
            arrayListOf(0,140+di, 0,-1+dd)
        )
        postTransparency =5
        postTextSize = arrayListOf(0, 24)
        val  backgroundColor = "#101820"
        val textColor = "#FEE715"
        postFontFamily =200

        postBackground =util. improveColorString(backgroundColor)
        val textcolo=util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0, 0, 0, 0)
        postRadiuas = 20

    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost517() {
        val post = Post()
        with(post) {
            postNum = 517
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/05/22/22/36/girl-3422711_1280.jpg"
            postText = arrayListOf(
                " יש הרבה סיבות  ",
                " להיות אומלל בעולם הזה ",
                " וכול הסיבות יחד ",
                " זה לא סיבה מספיקה ",
                " להיות אומלל.  "
            )
            val di =0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,130+dd),
                arrayListOf(0,-1+di, 0,100+dd),
                arrayListOf(0,-1+di, 0,70+dd),
                arrayListOf(0,-1+di, 0,40+dd),
                arrayListOf(0,-1+di, 0,10+dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 24)
            val  backgroundColor = "#101820"
            val textColor = "#ACC7B4"
            postFontFamily =200

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 20

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost518() {
        val post = Post()
        with(post) {
            postNum = 518
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2017/01/10/17/12/guinea-pig-1969698_1280.jpg"
            postText = arrayListOf(
                "  לאלמה בת השנתיים  ",
                " שתצליחי שלא לדפוק את הבטן אחרי כל כך הרבה עוגות, ",
                " שתפלי נפילות שאפשר לקום מהם, ",
                " שתצליחי להבדיל בין עיקר לטפל, ",
                " ושיהיה לך יום הולדת שמח.  "
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,160+dd),
                arrayListOf(0,-1+di, 0,100+dd),
                arrayListOf(0,-1+di, 0,70+dd),
                arrayListOf(0,-1+di, 0,40+dd),
                arrayListOf(0,-1+di, 0,10+dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 15)
            val  backgroundColor = "#990011"
            val textColor = "#FCF6F5"
            postFontFamily =103

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 20

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

 fun loadPost519() {
        val post = Post()
        with(post) {
            postNum = 519
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/11/11/10/46/opposites-3808487_1280.jpg"
            postText = arrayListOf(
                "  מעבר למפלס הטוב ורע  ",
                " יש מרחב של קיום בסיסי, ",
                " אתה לא מגיע אליו בדרך כלל ",
                " בגלל האופי ההישרדותי שבך ",
                " וחבל.  "
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0,0+di, 0,-1+dd),
                arrayListOf(0,30+di, 0,-1+dd),
                arrayListOf(0,60+di, 0,-1+dd),
                arrayListOf(0,90+di, 0,-1+dd),
                arrayListOf(0,120+di, 0,-1+dd)
            )
            postTransparency =4
            postTextSize = arrayListOf(0, 15)
            val  backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily =103

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 20

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost520() {
        val post = Post()
        with(post) {
            postNum = 520
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2015/03/17/16/59/clown-678042_1280.jpg"
            postText = arrayListOf(
                " האדם משמש סטטיסט  ",
                " בהפקה של תפיסת העולם שלו, ",
                " ההמולה מסביב אמיתית ",
                " אבל היא רק תפאורה לסיפור ",
                " שהאדם חי בו.  "
            )
            val di =0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,150+dd),
                arrayListOf(0,-1+di, 0,115+dd),
                arrayListOf(0,-1+di, 0,80+dd),
                arrayListOf(0,-1+di, 0,45+dd),
                arrayListOf(0,-1+di, 0,10+dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 20

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost521() {
        val post = Post()
        with(post) {
            postNum = 521
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2016/07/30/00/03/winding-road-1556177_1280.jpg"
            postText = arrayListOf(
                " זה שאיבדת את הדרך לרגעים  ",
                " זה לא אומר שאין דרך, ",
                " או שהדרך משובשת ",
                " זה רק אומר ",
                " שאיבדת את הדרך לרגע.  "
            )
            val di =0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,150+dd),
                arrayListOf(0,-1+di, 0,115+dd),
                arrayListOf(0,-1+di, 0,80+dd),
                arrayListOf(0,-1+di, 0,45+dd),
                arrayListOf(0,-1+di, 0,10+dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 20

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost522() {
        val post = Post()
        with(post) {
            postNum = 522
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2019/08/09/20/52/old-man-4395870_1280.jpg"
            postText = arrayListOf(
                " האדם הקדמון  ",
                " השתמש פחות בפייסבוק ",
                " עשה פחות לייקים ",
                " אבל נראה לי ",
                " שהיה לו יותר חברים.  "
            )
            val di =0
            val dd =10
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,150+dd),
                arrayListOf(0,-1+di, 0,115+dd),
                arrayListOf(0,-1+di, 0,80+dd),
                arrayListOf(0,-1+di, 0,45+dd),
                arrayListOf(0,-1+di, 0,10+dd)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 20

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost523() {
        val post = Post()
        with(post) {
            postNum = 523
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/04/29/04/37/flower-3359072_1280.jpg"
            postText = arrayListOf(
                " האדם הטיפוסי  ",
                " בדרך כלל לא סגור על עצמו ",
                " אם הוא חיית השדה ",
                " דמות בסרט מצויר ",
                " או סתם עציץ.  "
            )
            val di =0
            val dd =30
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,150+dd),
                arrayListOf(0,-1+di, 0,115+dd),
                arrayListOf(0,-1+di, 0,80+dd),
                arrayListOf(0,-1+di, 0,45+dd),
                arrayListOf(0,-1+di, 0,10+dd)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 10

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost524() {
        val post = Post()
        with(post) {
            postNum = 524
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2021/01/24/20/47/mountains-5946500_1280.jpg"
            postText = arrayListOf(
                " אין נחמה באזורי הכעס ",
                " אין תכלית באיזורי ההמון ",
                " אין אמת באזורי הצדק ",
                " אין שקט באזורי האומללות ",
                " הכל צומח בערבות האין סופים.  "
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0,-1+di, 0,150+dd),
                arrayListOf(0,-1+di, 0,115+dd),
                arrayListOf(0,-1+di, 0,80+dd),
                arrayListOf(0,-1+di, 0,45+dd),
                arrayListOf(0,-1+di, 0,10+dd)
            )
            postTransparency =4
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,5, 10, 0)
            postRadiuas = 10

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost525() {
        val post = Post()
        with(post) {
            postNum = 525
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2017/05/16/21/24/gorilla-2318998_1280.jpg"
            postText = arrayListOf(
                " האדם המודרני הוא יצור די אבוד בעולמנו, ",
                " הוא חכם מדי ",
                " בשביל לחשוב כמו אבותיו הקדמונים ",
                " וטיפש מידי ",
                " בשביל להבין שהוא נשאר יצור די פרימיטיבי. "
            )
            val di =0
            val dd =0
            postMargin = arrayListOf(
                arrayListOf(0,0+di, 0,-1+dd),
                arrayListOf(0,-1+di, 0,145+dd),
                arrayListOf(0,-1+di, 0,110+dd),
                arrayListOf(0,-1+di, 0,75+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 20)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 10
 lineSpacing=1f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    }


