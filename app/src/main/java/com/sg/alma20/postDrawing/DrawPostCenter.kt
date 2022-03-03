package com.sg.alma20.postUtility

import android.content.Context
import android.content.res.Resources
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma20.model.Post
import com.sg.alma20.postDrawing.DrawGeneralPost
import com.sg.alma20.postUtility.Utility

class DrawPostCenter(val contex: Context) {

    val util = Utility()

    val draw1Line = DrawGeneralPost()
    val draw2Line = DrawGeneralPost()
    val draw3Line = DrawGeneralPost()
    val draw4Line = DrawGeneralPost()
    val draw5Line = DrawGeneralPost()
    val draw6Line = DrawGeneralPost()
    val draw7Line = DrawGeneralPost()
    val draw8Line =DrawGeneralPost()
    val draw9Line = DrawGeneralPost()
    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()


    fun drawPost(post: Post, layout: ConstraintLayout) {

        when (post.lineNum) {

            1 -> draw1Line.drawPost(contex, post, layout)
            2 -> draw2Line.drawPost(contex, post, layout)
            3 -> draw3Line.drawPost(contex, post, layout)
            4 -> draw4Line.drawPost(contex, post, layout)
            5 -> draw5Line.drawPost(contex, post, layout)
            6 -> draw6Line.drawPost(contex, post, layout)
            7 -> draw7Line.drawPost(contex, post, layout)
            8 -> draw8Line.drawPost(contex, post, layout)
            9 -> draw9Line.drawPost(contex, post, layout)

        }

    }
}
