package com.ferdian.novelterlaris.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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
import com.ferdian.novelterlaris.detail_book

class ListView(var listBook: ArrayList<Book>) : RecyclerView.Adapter<ListView.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvPengarang: TextView = itemView.findViewById(R.id.tv_pengarang)
        var tvJudul: TextView = itemView.findViewById(R.id.tv_judul)
        var tvTahunRilis: TextView = itemView.findViewById(R.id.tv_tahun_rilis)
        var tvImage: ImageView = itemView.findViewById(R.id.tv_image)

        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_books, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBook.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (pengarang, judul, tahunRilis, detail, image) = listBook[position]

        Glide.with(holder.itemView.context)
            .load(image)
            .apply(RequestOptions().override(55, 55))
            .into(holder.tvImage)

        holder.tvPengarang.text = pengarang
        holder.tvJudul.text = judul
        holder.tvTahunRilis.text = tahunRilis

        holder.btnDetail.setOnClickListener {
            val moveToDetail = Intent(holder.itemView.context, detail_book::class.java)
            moveToDetail.putExtra(detail_book.EXTRA_JUDUL, judul)
            moveToDetail.putExtra(detail_book.EXTRA_PENGARANG, pengarang)
            moveToDetail.putExtra(detail_book.EXTRA_DESKRIPSI, detail)
            moveToDetail.putExtra(detail_book.EXTRA_TAHUN_RILIS, tahunRilis)
            moveToDetail.putExtra(detail_book.EXTRA_IMAGE, image)
            holder.itemView.context.startActivity(moveToDetail)
        }
    }

}