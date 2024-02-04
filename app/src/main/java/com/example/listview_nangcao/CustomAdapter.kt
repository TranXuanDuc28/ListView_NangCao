package com.example.listview_nangcao

import android.app.Activity
import android.icu.text.CaseMap.Title
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val activity: Activity, val list: List<OutData>): ArrayAdapter<OutData>(activity, R.layout.list_item) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var contexs = activity.layoutInflater //Chuyen doi layout xml thanh view
        var rowView = contexs.inflate(R.layout.list_item, parent, false)

        var images = rowView.findViewById<ImageView>(R.id.images)
        var Title = rowView.findViewById<TextView>(R.id.Title)
        var Desc = rowView.findViewById<TextView>(R.id.Desc)

        Title.text = list[position].Title
        Desc.text = list[position].Desc
        images.setImageResource(list[position].images)


        return rowView
    }
}