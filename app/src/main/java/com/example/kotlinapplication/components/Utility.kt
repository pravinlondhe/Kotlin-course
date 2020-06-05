package com.example.kotlinapplication.components

import android.widget.ImageView
import com.example.kotlinapplication.R
import com.squareup.picasso.Picasso

data class User(val icon: Int, val name: String, val url: String)

fun ImageView.loadImageWithPicasso(url: String) {
    Picasso.get()
        .load(url)
        .centerCrop()
        .resize(R.dimen.three_twenty_dp, R.dimen.three_twenty_dp)
        .into(this)

}