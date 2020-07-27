package com.ferdian.novelterlaris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class detail_book : AppCompatActivity() {
    var title = "Detail Book"

    companion object {
        const val EXTRA_JUDUL = "extra_judul"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_PENGARANG = "extra_pengarang"
        const val EXTRA_TAHUN_RILIS = "extra_tahun_rilis"
        const val EXTRA_DESKRIPSI = "extra_deskripsi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_book)
        val titleBar = supportActionBar
        titleBar!!.title = title
        titleBar.setDisplayHomeAsUpEnabled(true)

        val tvJudulDetail: TextView = findViewById(R.id.tv_judul_buku)
        val imgImageDetail: ImageView = findViewById(R.id.img_image_detail)
        val tvPengarangDetail: TextView = findViewById(R.id.tv_pengarang_detail)
        val tvTahunnRilisDetail: TextView = findViewById(R.id.tv_tahun_rilis_detail)
        val tvDeskripsi: TextView = findViewById(R.id.tv_deskripsi_detail)

        val extJudul = intent.getStringExtra(EXTRA_JUDUL)
        val extImage = intent.getIntExtra(EXTRA_IMAGE, 0)
        val extPengarang = intent.getStringExtra(EXTRA_PENGARANG)
        val extTahunRilis = intent.getStringExtra(EXTRA_TAHUN_RILIS)
        val extDeskripsi = intent.getStringExtra(EXTRA_DESKRIPSI)

        tvJudulDetail.text = extJudul
        tvPengarangDetail.text = extPengarang
        tvTahunnRilisDetail.text = extTahunRilis
        tvDeskripsi.text = extDeskripsi

        Glide
            .with(this)
            .load(extImage)
            .apply(RequestOptions())
            .into(imgImageDetail)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}