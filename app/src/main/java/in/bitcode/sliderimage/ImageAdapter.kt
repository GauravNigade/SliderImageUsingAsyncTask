package `in`.bitcode.sliderimage

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (private val List: ArrayList<ItemModel>): RecyclerView.Adapter<ImageAdapter.ViewHolder>(){


    @SuppressLint("ResourceType")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.slider_image, parent,false)

        return  ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemViewModel = List[position]

        holder.imageView.setImageResource(itemViewModel.image)
    }

    override fun getItemCount(): Int {
        return List.size
    }

class ViewHolder(ItemView : View) : RecyclerView.ViewHolder(ItemView){
    var imageView: ImageView
    init {

        imageView = itemView.findViewById(R.id.sliderImageView)
    }
}

}


