package com.example.tugas_14

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDataMahasiswa : Button = findViewById(R.id.btnDataMahasiswa)
        btnDataMahasiswa.setOnClickListener(this)

        val btnDataUniversitas : Button = findViewById(R.id.btnDataUniversitas)
        btnDataUniversitas.setOnClickListener(this)

        val btnPhone : Button = findViewById(R.id.btnPhone)
        btnPhone.setOnClickListener(this)

        val btnBrowser : Button = findViewById(R.id.btnBrowser)
        btnBrowser.setOnClickListener(this)

        val btnBrowser2 : Button = findViewById(R.id.btnBrowser2)
        btnBrowser2.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.btnDataMahasiswa -> {
                val moveActivity = Intent( this,ActivityBaru::class.java)
                startActivity(moveActivity)
            }
            R.id.btnDataUniversitas -> {
                val moveData = Intent(this,ActivityData::class.java)
                moveData.putExtra(ActivityData.EXTRA_NAME,"Universitas Internasional Batam")
                moveData.putExtra(ActivityData.EXTRA_TAHUN, 2000)
                moveData.putExtra(ActivityData.EXTRA_JURUSAN, 10)
                moveData.putExtra(ActivityData.EXTRA_AKREDITASI, "A")
                startActivity(moveData)
            }
            R.id.btnPhone -> {
                val phoneNumber = "07787437111"
                val dialPhone = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhone)
            }
            R.id.btnBrowser -> {
                val url = "https://www.uib.ac.id/"
                val web = Intent(Intent.ACTION_VIEW)
                web.setData(Uri.parse(url))
                startActivity(web)
            }
            R.id.btnBrowser2 -> {
                val url = "https://si.uib.ac.id/"
                val web_jurusan = Intent(Intent.ACTION_VIEW)
                web_jurusan.setData(Uri.parse(url))
                startActivity(web_jurusan)
            }
        }
    }
}