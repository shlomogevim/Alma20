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

class Post8Lines(val context: Context) {
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost= DrawPostCenter(context)
    private val util= Utility()

    fun loadPost800() {
        val post = Post()
        with(post) {
            postNum = 800
            lineNum =8
            imageUri ="https://cdn.pixabay.com/photo/2016/05/05/02/37/sunset-1373171_1280.jpg"
            postText  = arrayListOf(
                " על החיים: ",
                "האדם שמחפש משמעות בחיים",
                "דומה לאחד שקיבל כלי מופלא",
                "והוא ממש נבוך מהמתנה הזו,",
                " מצד אחד ",
                "הוא שמע מכולם שהכלי הזה מדהים ברמות,",
                " אבל מהצד השני ",
                "הוא לא יודע  מה לעזאזל עושים עם זה."
            )
            postBackground ="a9dce3"
            postTransparency =9
            val di=0
            val dd=0
            postMargin = arrayListOf(
                arrayListOf(0,0+di,0,-1),
                arrayListOf(0,-1+di,0,250+dd),
                arrayListOf(0,-1+di, 0, 215+dd),
                arrayListOf(0,-1+di, 0, 180+dd),
                arrayListOf(0,-1+di, 0,145+dd),
                arrayListOf(0,-1+di, 0,90+dd),
                arrayListOf(0,-1+di, 0,55+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )
           val size1=16
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
    fun loadPost801() {
        val post = Post()
        with(post) {
            postNum = 801
            lineNum =8
            imageUri ="https://cdn.pixabay.com/photo/2019/11/07/20/44/dog-4609870_1280.jpg"
            postText  = arrayListOf(
                "הכלבים על הבוקר רצים בתזזיתיות",
                "משיח לשיח, מריחים  פה מריחים שם:",
                "מי עשה מה, איפה ומתי, ",
                "האדם נע על הבוקר ברחבי הרשת",
                "מאתר לאתר, קורא פה קורא שם: ",
                "מי עשה מה, איפה ומתי,",
                "ונראה שאם היית פחות הכלב שבך ",
                "הבוקר שלך היה רגוע יותר."
            )
            postBackground ="000000"
            postTransparency =9
            val di=0
            val dd=0
            postMargin = arrayListOf(
                arrayListOf(0,15+di,0,-1),
                arrayListOf(0,40+di,0,-1+dd),
                arrayListOf(0,65+di, 0, -1+dd),
                arrayListOf(0,-1+di, 0,100+dd),
                arrayListOf(0,-1+di, 0,75+dd),
                arrayListOf(0,-1+di, 0,50+dd),
                arrayListOf(0,-1+di, 0,25+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )
            val size1=12
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(10, 0,10, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    }


