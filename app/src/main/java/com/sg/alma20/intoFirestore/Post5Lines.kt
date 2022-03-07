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
            postTransparency =6
            val di=0
            val dd=0
            postMargin = arrayListOf(
                arrayListOf(0,-1+di,0,160+dd),
                arrayListOf(0,-1+di, 0, 120+dd),
                arrayListOf(0,-1+di, 0,80+dd),
                arrayListOf(0,-1+di, 0,40+dd),
                arrayListOf(0,-1+di, 0,0+dd)
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
            postBackground ="390879"
            postTransparency =6
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
           val col = "#6bdf10"
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
                " ניזכר במשפט של אריק איינשטיין בערוב ימיו: ",
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

                arrayListOf(0,-1+di, 0,60+dd),
                arrayListOf(0,-1+di, 0,30+dd),
                arrayListOf(0,-1+di, 0,5+dd)
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
                arrayListOf(0,-1+di, 0,160+dd),
                arrayListOf(0,-1+di, 0,110+dd),
                arrayListOf(0,-1+di, 0,60+dd),
                arrayListOf(0,-1+di, 0,30+dd),
                arrayListOf(0,-1+di, 0,5+dd)
            )
            val size1=16
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
                "  בחוסר המשמעות של הקיום היומיומי.  "
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
                arrayListOf(0,-1+di, 0,100+dd),
                arrayListOf(0,-1+di, 0,75+dd),
                arrayListOf(0,-1+di, 0,50+dd),
                arrayListOf(0,-1+di, 0,25+dd),
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
            postNum =509
            lineNum =5
            imageUri ="https://cdn.pixabay.com/photo/2017/06/25/08/07/sunbeds-2439952_1280.jpg"
            postText =  arrayListOf(
                "אתה רוצה דברים מסוימים",
                "שלא בגלל שאין לך אותם,",
                "כמו",
                "שאתה לא יודע",
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

    }


