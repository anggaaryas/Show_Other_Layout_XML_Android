package indonesia.angasalabs.testshowlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testView = TestView(this)
        val x: Button = findViewById(R.id.btn_click)
        x.setOnClickListener {
            testView.show()
        }
    }

}
