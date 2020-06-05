package com.example.kotlinapplication.components

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

data class User(val icon: Int, val name: String, val url: String)

//Exercise-7
fun ImageView.loadImageWithPicasso(url: String, default: Int) {
    Picasso.get()
        .load(url)
        .placeholder(default)
        .centerCrop()
        .resize(320, 320)
        .into(this)
}

// Exercise-5
fun RecyclerView.ViewHolder.showToast(msg: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(itemView.context, msg, duration).show()
}

//Exercise-6
fun ViewGroup.inflate(layout: Int): View =
    LayoutInflater.from(context).inflate(layout, this, false)
