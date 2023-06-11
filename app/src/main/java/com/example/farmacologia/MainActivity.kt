package com.example.farmacologia
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = listOf("Sulfacloropiridazina", "Cefapirina sódica", "Cefalexina", "Estreptomicina", "Oxitetraciclina", "Florfenicol", "Fenbendazol", "Levamisol", "Praziquantel", "Imidocard")

        val autoComplete : AutoCompleteTextView = findViewById(R.id.auto_complete)

        val adapter = ArrayAdapter(this,R.layout.list_item,items)

        autoComplete.setAdapter(adapter)



        val farmaco1: TextView = findViewById(R.id.farmaco)
        val farmaco2: TextView = findViewById(R.id.farmaco)
        val farmaco3: TextView = findViewById(R.id.farmaco)
        val farmaco4: TextView = findViewById(R.id.farmaco)
        val farmaco5: TextView = findViewById(R.id.farmaco)
        val farmaco6: TextView = findViewById(R.id.farmaco)
        val farmaco7: TextView = findViewById(R.id.farmaco)
        val farmaco8: TextView = findViewById(R.id.farmaco)
        val farmaco9: TextView = findViewById(R.id.farmaco)
        val farmaco10: TextView = findViewById(R.id.farmaco)

        autoComplete.setOnItemClickListener { adapterView, view, i, l ->
            val itemSelect = adapterView.getItemAtPosition(i).toString()

            // Aquí puedes realizar una comparación para determinar qué TextView actualizar según el fármaco seleccionado
            when (itemSelect) {
                "Sulfacloropiridazina" -> farmaco1.text = getString(R.string.farma1)
                "Cefapirina sódica" -> farmaco2.text = "Farmaco seleccionado: $itemSelect"
                "Cefalexina" -> farmaco3.text = "Farmaco seleccionado: $itemSelect"
                "Estreptomicina" -> farmaco4.text = "Farmaco seleccionado: $itemSelect"
                "Oxitetraciclina" -> farmaco5.text = "Farmaco seleccionado: $itemSelect"
                "Florfenicol" -> farmaco6.text = "Farmaco seleccionado: $itemSelect"
                "Fenbendazol" -> farmaco7.text = "Farmaco seleccionado: $itemSelect"
                "Levamisol" -> farmaco8.text = "Farmaco seleccionado: $itemSelect"
                "Praziquantel" -> farmaco9.text = "Farmaco seleccionado: $itemSelect"
                "Imidocard" -> farmaco10.text = "Farmaco seleccionado: $itemSelect"
            }
        }
    }
}