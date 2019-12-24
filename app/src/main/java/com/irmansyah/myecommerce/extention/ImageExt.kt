package com.irmansyah.myecommerce.extention

import android.widget.ImageView
import com.bumptech.glide.Glide

internal fun ImageView.loadImage(id: Int) {
    Glide.with(this.context).load(id).into(this)
}

internal fun ImageView.loadImage(imageUrl: String) {
    Glide.with(this.context).load(imageUrl).into(this)
}