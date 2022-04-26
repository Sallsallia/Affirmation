package com.salsa.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.salsa.affirmations.adapter.ItemAdapter
import com.salsa.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO 6 : Digunakan untuk proses menampilkan data ke recyclerview
        //  Digunakan untuk inisialisasi Data
        //  Menampilkan daftar afirmasi yang ditampilkan dalam val yang bernama myDataset
        val myDataset = Datasource().loadAffirmations()
        // Digunakan untuk memanggil layout recyclerview
        // Dan digunakan untuk menemukan referensi ke RecyclerView dalam tata letak.
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        // Digunakan untuk menetapkan objek ItemAdapter ke properti adapter dari recyclerView.
        recyclerView.adapter = ItemAdapter(this, myDataset)
        // Digunakan pengaturan ini untuk meningkatkan kinerja jika tahu itu berubah (meningkatkan performa)
        // dalam konten tidak mengubah ukuran tata letak RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}