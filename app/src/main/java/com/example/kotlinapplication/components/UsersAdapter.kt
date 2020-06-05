package com.example.kotlinapplication.components

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class UsersAdapter(private val users: List<User>) : RecyclerView.Adapter<UsersAdapter.UsersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        UsersViewHolder(parent.inflate(R.layout.item_list_sample))

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) =
        holder.bind(users[position])

    override fun getItemCount() = users.size

    override fun getItemId(position: Int) = position.toLong()

    inner class UsersViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val icon: ImageView by lazy {
            view.find<ImageView>(R.id.iv_list_icon)
        }
        private val name: TextView by lazy {
            view.find<TextView>(R.id.tv_list_title)
        }
        private val cardView by lazy {
            view.find<CardView>(R.id.cv_item)
        }

        fun bind(user: User) {
//            icon.setImageResource(user.icon)
            icon.loadImageWithPicasso(user.url, user.icon)
            name.text = user.name
            cardView.setOnClickListener { showToast(user.name) }
        }
    }
}