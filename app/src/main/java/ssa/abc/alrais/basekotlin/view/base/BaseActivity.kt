package ssa.abc.alrais.basekotlin.view.base


import android.os.Build
import android.view.WindowManager
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.Window
import java.lang.reflect.Field


/**
 * Created by saoud on 10/6/17.
 */

open class BaseActivity : AppCompatActivity(), View.OnClickListener {


    open val activity: AppCompatActivity
        get() = this

    override fun onClick(v: View) {

    }

    protected fun setAsFullScreen() {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    protected fun setAsFullScreenWithstatusBar(positionView: View) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val statusBarHeight = statusBarHeight
            val lp = positionView.getLayoutParams()
            lp.height = statusBarHeight
            positionView.setLayoutParams(lp)
        }
    }

    private val statusBarHeight: Int
        get() {
            var c: Class<*>? = null
            var obj: Any? = null
            var field: Field? = null
            var x = 0
            var statusBarHeight = 0
            try {
                c = Class.forName("com.android.internal.R\$dimen")
                obj = c!!.newInstance()
                field = c.getField("status_bar_height")
                x = Integer.parseInt(field!!.get(obj).toString())
                statusBarHeight = resources.getDimensionPixelSize(x)
            } catch (e1: Exception) {
                e1.printStackTrace()
            }

            return statusBarHeight
        }
}