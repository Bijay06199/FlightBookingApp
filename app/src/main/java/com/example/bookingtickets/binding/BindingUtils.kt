package com.example.bookingtickets.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object BindingUtils {

    @BindingAdapter("imageSrc")
    @JvmStatic
    fun setImageSrc(imageView: ImageView,resource:Int){
        imageView.setImageResource(resource)

    }
}