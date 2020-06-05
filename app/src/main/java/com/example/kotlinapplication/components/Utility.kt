package com.example.kotlinapplication.components

import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R
import com.squareup.picasso.Picasso

data class User(val icon: Int, val name: String, val url: String)

fun ImageView.loadImageWithPicasso(url: String) {
    Picasso.get()
        .load(url)
        .centerCrop()
        .resize(320, 320)
        .into(this)
}
// Exercise-5
fun RecyclerView.ViewHolder.showToast(msg: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this.itemView.context, msg, duration).show()
}