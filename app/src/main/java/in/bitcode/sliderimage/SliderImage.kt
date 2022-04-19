package `in`.bitcode.sliderimage

import android.content.Context
import android.os.AsyncTask
import androidx.recyclerview.widget.RecyclerView

class SliderImage ( var recyclerView: RecyclerView ,var size: Int) :
    AsyncTask<String?, Integer?, String?>() {

    private var position : Int = 0

    override fun doInBackground(vararg p0: String?): String? {
        while (true)

            try {
                Thread.sleep(1000)
                if (position == size){
                    position = 0
                }

                recyclerView.smoothScrollToPosition(++position)
            }
            catch (e: InterruptedException){
                e.printStackTrace()
            }

    }
}

