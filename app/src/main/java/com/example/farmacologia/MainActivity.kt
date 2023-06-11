package com.example.farmacologia
import android.widget.TextView
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var autoComplete: AutoCompleteTextView
    private lateinit var dosisButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = listOf(
            "Sulfacloropiridazina", "Cefapirina sódica", "Cefalexina", "Estreptomicina",
            "Oxitetraciclina", "Florfenicol", "Fenbendazol", "Levamisol", "Praziquantel", "Imidocard"
        )

        autoComplete = findViewById(R.id.auto_complete)
        dosisButton = findViewById(R.id.dosisButton)

        val adapter = ArrayAdapter(this, R.layout.list_item, items)
        autoComplete.setAdapter(adapter)

        autoComplete.setOnItemClickListener { _, _, _, _ ->
            val selectedItem = autoComplete.text.toString()
            // Ocultar el botón de dosis por defecto
            dosisButton.visibility = Button.GONE

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

            // Realizar comparación para mostrar el botón de dosis si se selecciona un fármaco específico
            when (selectedItem) {
                "Sulfacloropiridazina" -> {
                    farmaco1.text = getString(R.string.farma1)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Cefapirina sódica" -> {
                    farmaco2.text = getString(R.string.farma2)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Cefalexina" -> {
                    farmaco3.text = getString(R.string.farma3)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Estreptomicina" -> {
                    farmaco4.text = getString(R.string.farma4)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Oxitetraciclina" -> {
                    farmaco5.text = getString(R.string.farma5)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Florfenicol" -> {
                    farmaco6.text = getString(R.string.farma6)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Fenbendazol" -> {
                    farmaco7.text = getString(R.string.farma7)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Levamisol" -> {
                    farmaco8.text = getString(R.string.farma8)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Praziquantel" -> {
                    farmaco9.text = getString(R.string.farma9)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Imidocard" -> {
                    farmaco10.text = getString(R.string.farma10)
                    dosisButton.visibility = Button.VISIBLE
                }

            }

//            when (selectedItem) {
//                "Sulfacloropiridazina" -> farmaco1.text = getString(R.string.farma1)
//                "Cefapirina sódica" -> farmaco2.text = getString(R.string.farma2)
//                "Cefalexina" -> farmaco3.text = getString(R.string.farma3)
//                "Estreptomicina" -> farmaco4.text = getString(R.string.farma4)
//                "Oxitetraciclina" -> farmaco5.text = getString(R.string.farma5)
//                "Florfenicol" -> farmaco6.text = getString(R.string.farma6)
//                "Fenbendazol" -> farmaco7.text = getString(R.string.farma7)
//                "Levamisol" -> farmaco8.text = getString(R.string.farma8)
//                "Praziquantel" -> farmaco9.text = getString(R.string.farma9)
//                "Imidocard" -> farmaco10.text = getString(R.string.farma10)
//
//                "Sulfacloropiridazina", "Cefapirina sódica", "Cefalexina", "Estreptomicina", "Oxitetraciclina", "Florfenicol", "Fenbendazol", "Levamisol", "Praziquantel", "Imidocard" -> {
//                    dosisButton.visibility = Button.VISIBLE }


                // Agrega más casos aquí si deseas que el botón se muestre para otros fármacos
        }
    }
}



//package com.example.farmacologia
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.ArrayAdapter
//import android.widget.AutoCompleteTextView
//
//
//class MainActivity : AppCompatActivity() {
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val items = listOf("Sulfacloropiridazina", "Cefapirina sódica", "Cefalexina", "Estreptomicina", "Oxitetraciclina", "Florfenicol", "Fenbendazol", "Levamisol", "Praziquantel", "Imidocard")
//
//        val autoComplete : AutoCompleteTextView = findViewById(R.id.auto_complete)
//
//        val adapter = ArrayAdapter(this,R.layout.list_item,items)
//
//        autoComplete.setAdapter(adapter)
//
//
//
//        val farmaco1: TextView = findViewById(R.id.farmaco)
//        val farmaco2: TextView = findViewById(R.id.farmaco)
//        val farmaco3: TextView = findViewById(R.id.farmaco)
//        val farmaco4: TextView = findViewById(R.id.farmaco)
//        val farmaco5: TextView = findViewById(R.id.farmaco)
//        val farmaco6: TextView = findViewById(R.id.farmaco)
//        val farmaco7: TextView = findViewById(R.id.farmaco)
//        val farmaco8: TextView = findViewById(R.id.farmaco)
//        val farmaco9: TextView = findViewById(R.id.farmaco)
//        val farmaco10: TextView = findViewById(R.id.farmaco)
//
//        autoComplete.setOnItemClickListener { adapterView, view, i, l ->
//            val itemSelect = adapterView.getItemAtPosition(i).toString()
//
//            // Aquí puedes realizar una comparación para determinar qué TextView actualizar según el fármaco seleccionado
//            when (itemSelect) {
//                "Sulfacloropiridazina" -> farmaco1.text = getString(R.string.farma1)
//                "Cefapirina sódica" -> farmaco2.text = getString(R.string.farma2)
//                "Cefalexina" -> farmaco3.text = getString(R.string.farma3)
//                "Estreptomicina" -> farmaco4.text = getString(R.string.farma4)
//                "Oxitetraciclina" -> farmaco5.text = getString(R.string.farma5)
//                "Florfenicol" -> farmaco6.text = getString(R.string.farma6)
//                "Fenbendazol" -> farmaco7.text = getString(R.string.farma7)
//                "Levamisol" -> farmaco8.text = getString(R.string.farma8)
//                "Praziquantel" -> farmaco9.text = getString(R.string.farma9)
//                "Imidocard" -> farmaco10.text = getString(R.string.farma10)
//            }
//        }
//
//    }
//
//}

