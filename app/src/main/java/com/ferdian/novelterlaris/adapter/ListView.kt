package com.ferdian.novelterlaris.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.ferdian.novelterlaris.DataBook
import com.ferdian.novelterlaris.R
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.request.RequestOptions
import com.ferdian.novelterlaris.Book

class ListView(var listBook: ArrayList<Book>) : RecyclerView.Adapter<ListView.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvPengarang: TextView = itemView.findViewById(R.id.tv_pengarang)
        var tvJudul: TextView = itemView.findViewById(R.id.tv_judul)
        var tvTahunRilis: TextView = itemView.findViewById(R.id.tv_tahun_rilis)
        var tvImage: ImageView = itemView.findViewById(R.id.tv_image)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_books, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBook.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBook[position]

        Glide.with(holder.itemView.context)
            .load(book.image)
            .apply(RequestOptions().override(55, 55))
            .into(holder.tvImage)

        holder.tvPengarang.text = book.pengarang
        holder.tvJudul.text = book.judul
        holder.tvTahunRilis.text = book.tahunRilis

    }

}