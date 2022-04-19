package `in`.bitcode.sliderimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        


        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        var data = ArrayList<ItemModel>()

        for (i in 1..8) {
            if (i%2 == 0) {
                //data.add(ItemModel(R.drawable.ic_launcher_background))
                data.add(ItemModel(R.drawable.image_one))
                data.add(ItemModel(R.drawable.image_two))
                data.add(ItemModel(R.drawable.image_four))
                data.add(ItemModel(R.drawable.image_five))

            }else{
              //  data.add(ItemModel(R.mipmap.ic_launcher))
                data.add(ItemModel(R.drawable.image_three))
                data.add(ItemModel(R.drawable.image_six))
                data.add(ItemModel(R.drawable.image_seven))
                data.add(ItemModel(R.drawable.image_eight))


            }
        }

        val adapter = ImageAdapter(data)


        recyclerView.adapter = adapter

        SliderImage(recyclerView,data.size).execute(null)

    }


}