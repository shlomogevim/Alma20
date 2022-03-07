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


class Post2Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost= DrawPostCenter(context)
    private val util= Utility()


    fun postSelector(index:Int){
        when (index){
            200->loadPost200()
            201->loadPost201()
            202->loadPost202()

        }
    }


    fun loadPost200() {
       val post = Post()
        with(post) {
            postNum = 200
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg"
            postText = arrayListOf(
                "אין בעיות בעולם",
                "חוץ מאלה שאצלך בראש."
            )
            val di = 20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 32+di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postBackground = "000000"
            postTransparency = 6
            val size1=24
            val size2=0
            postTextSize = arrayListOf(0, size1,size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col =  "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =430
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
       util.sendPostToStringFirestore(post)
    }

   fun loadPost201() {
        val post = Post()
     // util.logi("Post2Line   ========> /n 201A ")
        with(post) {
            postNum =201
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/11/04/14/25/pinocchio-2917652_1280.jpg"
            postText = arrayListOf(
                "  לאמת פנים רבות  ",
                "  אחד מהם הוא השקר."
            )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0, -1+di),
                arrayListOf(0, 50+du, 0, -1+di)
            )
            postBackground = "263238"
            postTransparency = 2
            val size1=26
            postTextSize = arrayListOf(0, size1)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#a7aba8"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =100
            postRadiuas = 5
        }
      //util.logi("Post2Line   ========> /n 201B  post=$post ")
        drawPost.drawPostFire(post,layout)
      util.sendPostToStringFirestore(post)
    }
      fun loadPost202() {
           val post = Post()
          with(post) {
              postNum = 202
              lineNum = 2
              imageUri = "https://cdn.pixabay.com/photo/2019/03/31/07/37/black-hole-4092609_1280.jpg"
              postText = arrayListOf(
                  "העתיד הוא ההיסטוריה",
                  "רק עם תאריך אחר."
              )
              val di = 0
              val du=0
              postMargin =  arrayListOf(
                  arrayListOf(0, -1+du, 0, 55+di),
                  arrayListOf(0, -1+du, 0, 10+di)
              )
              postBackground = "263238"
              postTransparency =0
              val size1=29
              postTextSize = arrayListOf(0, size1)
              postPadding = arrayListOf(0, 0, 0, 0)
              val col ="#b3b7b4"
              postTextColor = arrayListOf(CONSTANT, col)
              postFontFamily =509
              postRadiuas = 5
          }
     //  util.logi("Post2Line   ========> /n 201B  post=$post ")
        drawPost.drawPostFire(post,layout)
       util.sendPostToStringFirestore(post)
      }
fun loadPost203() {
        val post = Post()
        with(post) {
            postNum = 203
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2018/02/13/22/02/light-3151723_1280.jpg"
            postText = arrayListOf(
                "ונתתי את האור וחושך לפניך",
                "ובחרת באור."
            )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 45+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postBackground = "263238"
            postTransparency =4
            val size1=25
            postTextSize = arrayListOf(0, size1)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col ="#f6ff03"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =501
            postRadiuas = 15
        }
    drawPost.drawPostFire(post,layout)
    util.sendPostToStringFirestore(post)
    }

  fun loadPost204() {
     val post = Post()
     with(post) {
         postNum = 204
         lineNum = 2
         imageUri = "https://cdn.pixabay.com/photo/2021/01/09/21/09/antelope-5903514_1280.jpg"
         postText = arrayListOf(
             "אם אתה לא יכול להטיב את המצב",
             "אז על תתערב."
         )
         val di = 20
         postMargin = arrayListOf(
             arrayListOf(0, 0 + di, 0, -1),
             arrayListOf(0, 75 + di, 0, -1)
         )
         postBackground = "004d40"
         postTransparency = 0
         postTextSize = arrayListOf(0, 29)
         postPadding = arrayListOf(10, 0, 10, 0)
         val col = "#99eedf"
         val col1 = "#ffffff"
         postTextColor = arrayListOf(CONSTANT, col, col1, col1)
         postFontFamily = 600
         postRadiuas = 15
     }
      drawPost.drawPostFire(post,layout)
      util.sendPostToStringFirestore(post)
 }
    fun loadPost205() {
     val post = Post()
     with(post) {
         postNum = 205
         lineNum = 2
         imageUri = "https://cdn.pixabay.com/photo/2020/01/06/10/16/theravada-buddhism-4745053_1280.jpg"
         postText =  arrayListOf(
             "אי עשייה גוררת  אי עשייה ,",
             "עשייה גוררת  עשייה."
         )
         val di = 20
         postMargin = arrayListOf(
             arrayListOf(0, 0+di, 0, -1),
             arrayListOf(0, 45+di, 0, -1)
         )
         postBackground = "004d40"
         postTransparency = 0
         postTextSize =  arrayListOf(0, 26)
         postPadding = arrayListOf(10, 0, 10, 0)
         val col = "#ffffff"
         val col1 = "#ffffff"
         postTextColor = arrayListOf(CONSTANT, col, col1, col1)
         postFontFamily = 4
         postRadiuas = 15
     }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
 }
    fun loadPost206() {
        val post = Post()
        with(post) {
            postNum = 206
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/06/26/08/28/soil-5342049_1280.jpg"
            postText =  arrayListOf(
                "ככל  שהחיים נעשים שבירים יותר,",
                " כך הם  מובנים יותר. "
            )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 45+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postBackground = "337def"
            postTransparency = 4
            postTextSize =  arrayListOf(0, 26)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#fcc729"
            val col1 = "#143d59"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily =200
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost207() {
        val post = Post()
        with(post) {
            postNum = 207
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/01/14/19/09/crayon-4766037_1280.jpg"
            postText =  arrayListOf(
                " האלוהים ברא את היצירה ",
                " האדם  את  הביקורת. "
            )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 45+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postBackground = "337def"
            postTransparency = 4
            postTextSize =  arrayListOf(0, 26)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#fcc729"
            val col1 = "#143d59"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily =200
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost208() {
        val post = Post()
        with(post) {
            postNum = 208
            lineNum = 2
            imageUri  ="https://cdn.pixabay.com/photo/2020/05/25/17/03/travel-5219496_1280.jpg"
            postText =  arrayListOf(
                "אתה בוחר מן הסתם להגיע למקומות מסוימים,",
                "אבל החיים בוחרים לך את סוג החוויה שם."
            )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 85+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 26)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 8
            postBackground = "bdfff6"
            val textColor = "e23c52"
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postFontFamily =200
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost209() {
        val post = Post()
        with(post) {
            postNum = 209
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/06/23/21/04/fool-1476189_1280.jpg"
            postText =  arrayListOf(
                "זה שאתה מאמין בהבלים",
                "זה לא עושה אותם פחות הבלים."     )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 95+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 30)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 8
            postBackground = "030e4f"
            val textColor = "f49f1c"
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postFontFamily =200
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost210() {
        val post = Post()
        with(post) {
            postNum = 210
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2015/08/09/19/29/people-882078_1280.jpg"
            postText =  arrayListOf(
                " חכם לא עושה דברים ",
                " שטיפש סובל מהם על בסיס קבוע. "    )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 80+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 22)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 8
            postBackground = "efc9af"
            val textColor = "1f8ac0"
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost211() {
        val post = Post()
        with(post) {
            postNum = 211
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/08/16/03/04/chimp-2646308_1280.jpg"
            postText =  arrayListOf(
                " הטיפש בטוח בחכמתו ",
                " החכם בטוח בטיפשוטו. "  )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 55+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 22)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 8
            postBackground = "efc9af"
            val textColor = "1f8ac0"
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost212() {
        val post = Post()
        with(post) {
            postNum = 212
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2018/02/21/16/59/human-3170876_1280.jpg"
            postText =  arrayListOf(
                "   להיתפס כטמבל בעיני עצמך   ",
                " זה הרבה יותר גרוע מלהיות טמבל. "  )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 50+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 22)
            postTransparency = 10
            postBackground = "bdfff6"
            val textColor = "e23c52"
            postFontFamily =290

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost213() {
        val post = Post()
        with(post) {
            postNum = 213
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/09/21/04/46/barley-field-1684052_1280.jpg"
            postText =  arrayListOf(
                "אתה לא יכול להרוויח משהו אמיתי בחיים האלה,",
                "פרט לזכות הזאת לחיות את הרגע הזה." )
            val di =10
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 0+di, 0, -1),
                arrayListOf(0, 80+di, 0, -1)
            )
            postTextSize =  arrayListOf(0, 22)
            postTransparency = 8
            postBackground = "bdfff6"
            val textColor = "e23c52"
            postFontFamily =290

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost214() {
        val post = Post()
        with(post) {
            postNum = 213
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/02/19/09/34/health-4861815_1280.jpg"
            postText =  arrayListOf(
                " אתה לא מספיק טוב ",
                " כדי להבין כמה טוב. "
            )
            val di =5
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 45+di),
                arrayListOf(0, -1+du, 0, 10+di)
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


}
