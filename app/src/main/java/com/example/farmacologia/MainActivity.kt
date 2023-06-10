package com.example.farmacologia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = listOf("Sulfacloropiridazina", "Cefapirina sódica", "Cefalexina", "Estreptomicina", "Oxitetraciclina", "Florfenicol", "Fenbendazol", "Levamisol", "Praziquantel", "Imidocard")

        val autoComplete : AutoCompleteTextView = findViewById(R.id.auto_complete)

        val adapter = ArrayAdapter(this,R.layout.list_item,items)

        autoComplete.setAdapter(adapter)

        autoComplete.onItemClickListener = AdapterView.OnItemClickListener {
                adapterView, view, i, l ->
            val itemSelect = adapterView.getItemAtPosition(i)
            Toast.makeText(this,"Fármaco: $itemSelect", Toast.LENGTH_SHORT).show()
        }
    }
}