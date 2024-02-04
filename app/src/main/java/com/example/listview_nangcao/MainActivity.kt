package com.example.listview_nangcao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list = mutableListOf<OutData>()

        list.add(OutData(R.drawable.image_cgh1624954649,"Anh 1", "Dia diem thu nhat"))
        list.add(OutData(R.drawable.image_cic1626945329,"Anh 2", "Dia diem thu hai"))
        list.add(OutData(R.drawable.image_hdv1624955036,"Anh 3", "Dia diem thu ba"))
        list.add(OutData(R.drawable.image_flr1626945314,"Anh 4", "Dia diem thu tu"))
        list.add(OutData(R.drawable.image_kid1626945335,"Anh 5", "Dia diem thu nam"))
//        list.add(OutData(R.drawable.image_rhn1657688407,"Anh 6", "Dia diem thu sau"))
//        list.add(OutData(R.drawable.image_rhn1657688407,"Anh 7", "Dia diem thu bay"))
//        list.add(OutData(R.drawable.image_cgh1624954649,"Anh 8", "Dia diem thu tam"))
//        list.add(OutData(R.drawable.image_upf1657688406,"Anh 9", "Dia diem thu chin"))
        list.add(OutData(R.drawable.image_rhn1657688407,"Anh 6", "Dia diem thu sau"))
        list.add(OutData(R.drawable.image_rhn1657688407,"Anh 7", "Dia diem thu bay"))
        list.add(OutData(R.drawable.image_cgh1624954649,"Anh 8", "Dia diem thu tam"))
        list.add(OutData(R.drawable.image_upf1657688406,"Anh 9", "Dia diem thu chin"))

        customAdapter = CustomAdapter(this, list)

        val lvDulich = findViewById<ListView>(R.id.lvDulich)
        lvDulich.adapter = customAdapter
    }
}