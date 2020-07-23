package com.ferdian.novelterlaris.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ferdian.novelterlaris.DataBook

class ListViewAdapter(val listBooks: ArrayList<DataBook>) : RecyclerView.Adapter<ListViewAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

    }
}