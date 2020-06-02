package com.example.kotlinapplication.components

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class UsersAdapter(val users: List<User>) : RecyclerView.Adapter<UsersAdapter.UsersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        UsersViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_sample, parent, false)
        )

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) =
        holder.bind(users[position])

    override fun getItemCount() = users.size

    override fun getItemId(position: Int) = position.toLong()

    inner class UsersViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val icon: ImageView by lazy {
            view.findViewById<ImageView>(R.id.iv_list_icon)
        }
        private val name: TextView by lazy {
            view.findViewById<TextView>(R.id.tv_list_title)
        }

        fun bind(user: User) {
            icon.setImageResource(user.icon)
            name.text = user.name
        }
    }
}