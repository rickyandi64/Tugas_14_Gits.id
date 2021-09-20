package com.example.tugas_14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityData : AppCompatActivity() {

    companion object{
        const val EXTRA_TAHUN = "extra_tahun"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_AKREDITASI = "extra_akreditasi"
        const val EXTRA_JURUSAN = "extra_jurusan"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val tvData: TextView = findViewById(R.id.tvDataUniversitas)

        val name = intent.getStringExtra(EXTRA_NAME)
        val tahun = intent.getIntExtra(EXTRA_TAHUN, 0)
        val jurusan = intent.getIntExtra(EXTRA_JURUSAN, 0)
        val akreditasi = intent.getStringExtra(EXTRA_AKREDITASI)

        val text = "Nama : $name \nTahun Berdiri: $tahun \nTotal Jurusan: $jurusan Jurusan \nAkreditasi : $akreditasi"
        tvData.text = text
    }
}