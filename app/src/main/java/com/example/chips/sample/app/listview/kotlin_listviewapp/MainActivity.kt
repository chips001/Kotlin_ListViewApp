package com.example.chips.sample.app.listview.kotlin_listviewapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeZones = TimeZone.getAvailableIDs()
        val timeZonelistView = findViewById<ListView>(R.id.time_zone_list_view)
        val adapter = ArrayAdapter<String>(this, R.layout.time_zone_list_row, R.id.time_zone_text_view, timeZones)
        timeZonelistView.adapter = adapter

        timeZonelistView.setOnItemClickListener { parent, view, position, id ->
            val timeZone = adapter.getItem(position)
            Toast.makeText(this, timeZone, Toast.LENGTH_SHORT).show()
        }
    }
}
