package indonesia.angasalabs.testshowlayout

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout

/**
 * Angarsa Labs...!
 * Created by Angga on 05/01/2019.
 */
class TestView(val activity: Activity) {
    var testView: View = View.inflate(activity.applicationContext, R.layout.test_view1, null)
    var viewGroupInTestView: RelativeLayout

    init {
        viewGroupInTestView = testView.findViewById(R.id.rl_testview)
        activity.addContentView(
            testView,
            ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        )
        viewGroupInTestView.visibility = View.GONE
    }

    fun show() {
        viewGroupInTestView.visibility = View.VISIBLE
        val y: ImageView = testView.findViewById(R.id.iv_ico)
        y.setOnClickListener {
            hide()
        }
    }

    fun hide(){
        viewGroupInTestView.visibility = View.GONE
    }
}