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
            postBackground = "a3842c"
            postTransparency = 9
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 145 + dd),
                arrayListOf(0, -1 + di, 0, 80 + dd),
                arrayListOf(0, -1 + di, 0, 40 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            val size = 20
            postTextSize = arrayListOf(0, size)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    /*
      fun post47() {
          image.load(R.drawable.funeral)
          val backGround = "f4b41a"
          val transparency = 8
          val lineA = arrayOf(
              "ישנם אנשים קרובים",
              "שבהלוויה שלהם",
              "אתה פחות סופד להם",
              "ויותר סופד לעצמך."
          )
          val marginA = arrayOf(
              arrayOf(0, 0, 0, -1),
              arrayOf(0, 40, 0, -1),
              arrayOf(0, 80, 0, -1),
              arrayOf(0, 120, 0, -1)
          )
          val paddingA = arrayOf(5, 0, 5, 0)
          // val textSizeA = arrayOf(0, 25)
          val textSizeA = arrayOf(0, 24)
          val col = "#143d59"
          val textColorA = arrayOf(CONSTANT, col)

          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 3
          )
      }
      fun post48() {
          image.load(R.drawable.mask)
          val backGround = "f4b41a"
          val transparency = 0
          val lineA = arrayOf(
              "פוליטיקלי קורקט",
              "זה היכולת של האדם",
              "לקרוא ליום לילה וללילה יום",
              "בשם האמונות שלו."
          )
          val marginA = arrayOf(
              arrayOf(0, -1, 0, 90),
              arrayOf(0, -1, 0, 60),
              arrayOf(0, -1, 0, 30),
              arrayOf(0, -1, 0, 0)
          )
          val paddingA = arrayOf(5, 0, 5, 0)
          // val textSizeA = arrayOf(0, 25)
          val textSizeA = arrayOf(0, 24)
          val col = "#ffffff"
          val textColorA = arrayOf(CONSTANT, col)

          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 3
          )
      }
      fun post49() {
          image.load(R.drawable.talking_with_the_sea)
          val backGround = "f4b41a"
          val transparency = 0
          val lineA = arrayOf(
              "שיחות עם הים",
              "כמו רוב השיחות עם בני האדם,",
              "לא יצאת חכם יותר",
              "אבל לפחות אמרת את מה שאתה חושב."
          )

          val marginA = arrayOf(
              arrayOf(0, 0, 0, -1),
              arrayOf(0, 25, 0, -1),
              arrayOf(0, 80, 0, -1),
              arrayOf(0, 110, 0, -1)
          )
          val paddingA = arrayOf(0, 0, 0, 0)
          val textSizeA = arrayOf(0, 20)
          val col = "#ffffff"
          val textColorA = arrayOf(CONSTANT, col)

          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 1
          )
      }
      fun post450() {
          image.load(R.drawable.sunrise)
          val backGround = "9fe2b3"
          val transparency = 1
          val lineA = arrayOf(
              "השאלה היא פחות:",
              "מה קורה כאן,",
              "ויותר, איפה אני בכל",
              " מה שקורה כאן."
          )

          val marginA = arrayOf(
              arrayOf(0, 0, 0, -1),
              arrayOf(0, 30, 0, -1),
              arrayOf(0, 60, 0, -1),
              arrayOf(0, 90, 0, -1)
          )
          val paddingA = arrayOf(0, 0, 0, 0)
          val textSizeA = arrayOf(0, 22)
          val col = "#954100"
          val textColorA = arrayOf(CONSTANT, col)

          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 1
          )
      }
      fun post451() {
          image.load(R.drawable.mud)
          val backGround = "736419"
          val transparency = 7
          val lineA = arrayOf(
              "את האיזורים הרדודים בעולם",
              "אתה לא יכול להאשים ברדידות,",
              "אתה יכול להאשים רק את עצמך",
              " שאתה נמצא יותר מידי זמן באיזורים האלה."
          )

          val marginA = arrayOf(
              arrayOf(0, 0, 0, -1),
              arrayOf(0, 60, 0, -1),
              arrayOf(0, 120, 0, -1),
              arrayOf(0, 180, 0, -1)
          )
          val paddingA = arrayOf(0, 0, 0, 0)
          val textSizeA = arrayOf(0, 22)
         // val col = "#e3e46d"
         // val col = "#ffff00"
          val col = "#2bf02c"
          val textColorA = arrayOf(CONSTANT, col)

          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 1
          )
      }
      fun post452() {
          image.load(R.drawable.hair)
          val backGround = "558b2f"
          val transparency = 1
          val lineA = arrayOf(
              " החיים שלך זה כמו השיער ",
              " יש ימים שהם מסתדרים לך, ",
              "ואז אתה מרגיש טוב עם עצמך",
              " ויש ימים שלא. "
          )

          val marginA = arrayOf(
              arrayOf(0, 0, 0, -1),
              arrayOf(0, 45, 0, -1),
              arrayOf(0, 90, 0, -1),
              arrayOf(0, 135, 0, -1)
          )
          val paddingA = arrayOf(0, 0, 0, 0)
          val textSizeA = arrayOf(0, 26)
          val col = "#ffff00"
          val textColorA = arrayOf(CONSTANT, col)

          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 4
          )
      }
      fun post453() {
          image.load("https://cdn.pixabay.com/photo/2012/02/24/16/56/beach-16698_1280.jpg")
          val backGround = "558b2f"
          val transparency = 0
          val lineA = arrayOf(
              " תן לי את הכישרון ",
              " לראות הבלים כהבלים, ",
              "עם האמת הפשוטה",
              " אני כבר אסתדר. "
          )
          val di=35

          val marginA = arrayOf(
              arrayOf(0, 0+di, 0, -1),
              arrayOf(0, 45+di, 0, -1),
              arrayOf(0, 90+di, 0, -1),
              arrayOf(0, 135+di, 0, -1)
          )
          val paddingA = arrayOf(0, 0, 0, 0)
          val textSizeA = arrayOf(0, 26)
          val col = "#ffff00"
          val textColorA = arrayOf(CONSTANT, col)

          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 4
          )
      }
      fun post454() {
          image.load("https://cdn.pixabay.com/photo/2018/09/27/21/51/viewpoint-3707997__340.jpg")
          val backGround = "558b2f"
          val transparency = 0
          val lineA = arrayOf(
              "  לא השתנת , ",
              "תמיד היית בנוי מאותם חומרים",
              " רק שעם הגיל ",
              "אתה משתמש בהם קצת אחרת."
          )
          val di=0

         /* val marginA = arrayOf(
              arrayOf(0, 0+di, 0, -1),
              arrayOf(0, 30+di, 0, -1),
              arrayOf(0, 60+di, 0, -1),
              arrayOf(0, 90+di, 0, -1)
          )
          val paddingA = arrayOf(0, 0, 0, 0)
          val textSizeA = arrayOf(0, 24)
          val col = "#ffff00"
          val textColorA = arrayOf(CONSTANT, col)

          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 110
                    //  fontFamily = 4
          )*/
          val marginA = arrayOf(
              arrayOf(0, 0+di, 0, -1),
              arrayOf(0, 100+di, 0, -1),
              arrayOf(0, 200+di, 0, -1),
              arrayOf(0, 300+di, 0, -1)
          )
          val paddingA = arrayOf(0, 0, 0, 0)
          val textSizeA = arrayOf(0, 30)
          val col = "#ffff00"
          val textColorA = arrayOf(CONSTANT, col)

          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 551

          )
      }
      fun post455() {
          image.load("https://cdn.pixabay.com/photo/2018/10/06/08/27/religion-3727463__480.jpg")
          val backGround = "558b2f"
          val transparency = 0
          val lineA = arrayOf(
              "גבולות העולם שלך די קבועים,",
              "ככה ",
              "שכמה שהאלוהות שבך יותר גדולה,",
              "הבעיות האישיות שלך יותר קטנות."
          )
          val di=50

          /* val marginA = arrayOf(
               arrayOf(0, 0+di, 0, -1),
               arrayOf(0, 30+di, 0, -1),
               arrayOf(0, 60+di, 0, -1),
               arrayOf(0, 90+di, 0, -1)
           )
           val paddingA = arrayOf(0, 0, 0, 0)
           val textSizeA = arrayOf(0, 24)
           val col = "#ffff00"
           val textColorA = arrayOf(CONSTANT, col)

           nineLinesPost.createPost(
               lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
               radius = 10,fontFamily = 110
                     //  fontFamily = 4
           )*/
          val marginA = arrayOf(
              arrayOf(0, 0+di, 0, -1),
              arrayOf(0, 40+di, 0, -1),
              arrayOf(0, 80+di, 0, -1),
              arrayOf(0, 160+di, 0, -1)
          )
          val paddingA = arrayOf(0, 0, 0, 0)
          val textSizeA = arrayOf(0, 25)
          val col = "#00819d"
          val textColorA = arrayOf(CONSTANT, col)
          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 570
          )
      }
      fun post456() {
          image.load("https://cdn.pixabay.com/photo/2017/06/07/18/05/spirituality-2381114__480.jpg")
          val backGround = "558b2f"
          val transparency = 0
          val lineA = arrayOf(
              "להתעצבן בגלל פוליטיקה",
              "זה מותרות ",
              "שרק למי שיש חיי נצח",
              "יכול להרשות לעצמו."
          )
          val di=5

          val marginA = arrayOf(
              arrayOf(0, 0+di, 0, -1),
              arrayOf(0, 40+di, 0, -1),
              arrayOf(0, 80+di, 0, -1),
              arrayOf(0, 120+di, 0, -1)
          )
          val paddingA = arrayOf(0, 0, 0, 0)
          val textSizeA = arrayOf(0, 30)
         // val col = "#ffffff"
          val col = "#44ee22"
          val textColorA = arrayOf(CONSTANT, col)
          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 260
          )
      }

      fun post457() {
          image.load("https://cdn.pixabay.com/photo/2017/04/26/23/46/morning-2264051_1280.jpg")
          val backGround = "558b2f"
          val transparency = 0
          val lineA = arrayOf(
              " לא היית  יכול ",
              " לחיות  את  חייך  אחרת , ",
              "פשוט",
              "כי אתה כזה."
          )
          val di=0

          val marginA = arrayOf(
              arrayOf(0, 0+di, 0, -1),
              arrayOf(0, 40+di, 0, -1),
              arrayOf(0, 80+di, 0, -1),
              arrayOf(0, 120+di, 0, -1)
          )
          val paddingA = arrayOf(0, 0, 0, 0)
          val textSizeA = arrayOf(0, 30)
          val col = "#ffffff"
          val textColorA = arrayOf(CONSTANT, col)
          nineLinesPost.createPost(
              lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
              radius = 10,fontFamily = 100
          )
      }

  }

      *
      *
      * */

}
/*

         fun post209() {
      val imageUri1 ="https://cdn.pixabay.com/photo/2019/09/26/17/39/pensioner-4506621_1280.jpg"
      image.load(imageUri1)
      val post = Post()
      with(post) {
          postNum = 209
          lineNum = 2
          imageUri ="https://cdn.pixabay.com/photo/2019/09/26/17/39/pensioner-4506621_1280.jpg"
          postText =  arrayOf(
              "אם אין לך דרך אחרת זמינה טובה יותר,",
              "אין טעם לקטר על הדרך בה אתה הולך."
          )
          val di=0
          val dd=0
          postMargin = arrayOf(
              arrayOf(0,0+di, 0, -1+dd),
              arrayOf(0, 105+di, 0, -1+dd)
          )
          postBackground =  "008970"
          postTransparency = 10
          postTextSize =  arrayOf(0, 28)
          postPadding =  arrayOf(5, 0, 5, 0)
          val col = "#64ffda"
         val col1 = "#4dd0e1"
           postTextColor = arrayOf(CONSTANT, col, col1, col1)
          postFontFamily =4
          postRadiuas = 15
      }
      createPost.createPost(post)
  }
  }*/

