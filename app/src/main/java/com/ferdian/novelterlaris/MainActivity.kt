package com.ferdian.novelterlaris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<DataBook> = arrayListOf()
    lateinit var rvBooks: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val barAtas = supportActionBar
        barAtas!!.title = "Home"

        rvBooks = findViewById(R.id.rv_books)
        rvBooks.setHasFixedSize(true)
        showRecycleView()
        list.addAll(Book.listData)
    }

    private fun showRecycleView() {
        rvBooks.layoutManager = LinearLayoutManager(this)
    }


}