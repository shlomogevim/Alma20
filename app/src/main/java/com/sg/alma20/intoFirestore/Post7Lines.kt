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
    val drawPost= DrawPostCenter(context)
    private val util= Utility()

    fun loadPost700() {
        val post = Post()
        with(post) {
            postNum =700
            lineNum =7
            imageUri ="https://cdn.pixabay.com/photo/2017/09/03/09/17/question-2709670_1280.jpg"
            postText  = arrayListOf(
                "האדם שמחפש משמעות בחיים",
                "דומה לאחד שקיבל במתנה כלי מופלא",
                "והוא ממש נבוך מהמתנה הזו,",
                " מצד אחד ",
                "הוא שמע מכולם שהכלי הזה מדהים ברמות,",
                " אבל מהצד השני ",
                "הוא לא יודע  מה לעזאזל עושים עם זה."
            )
            postBackground ="a9dce3"
            postTransparency =9
            val di=0
            val dd=-80
            postMargin = arrayListOf(
                arrayListOf(0,-1+di,0,450+dd),
                arrayListOf(0,-1+di, 0, 380+dd),
                arrayListOf(0,-1+di, 0, 310+dd),
                arrayListOf(0,-1+di, 0,265+dd),
                arrayListOf(0,-1+di, 0,195+dd),
                arrayListOf(0,-1+di, 0,150+dd),
                arrayListOf(0,-1+di, 0,80+dd)
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

    /*

        fun post71() {
            image.load(R.drawable.between_them)
            val backGround = "9e9e9e"
            val transparency = 0
            val lineA = arrayOf(
                "להגיד את הדבר הנכון",
                "במקום הלא נכון זה חוסר טקט,",
                "להגיד את הדבר הלא נכון",
                "במקום הנכון זה סתם טיפשות,",
                "החכמה",
                "להגיד את הדבר הנכון",
                "במקום הנכון."
            )
            val marginA = arrayOf(
                arrayOf(0, -1, 0, 180),
                arrayOf(0, -1, 0, 150),
                arrayOf(0, -1, 0, 120),
                arrayOf(0, -1, 0, 90),
                arrayOf(-1, -1, 5, 60),
                arrayOf(-1, -1, 60, 30),
                arrayOf(-1, -1, 200, 0)
            )

            val paddingA = arrayOf(0, 0, 0, 0)
            val textSizeA = arrayOf(0, 24, 16, 25, 25, 25, 16, 25)
            val col = "#f6ff03"
            val textColorA = arrayOf(CONSTANT, col, col, col, col, col, col, col)

            nineLinesPost.createPost(
                lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
                radius = 17,fontFamily = 31
            )
        }
    }*/
    }


