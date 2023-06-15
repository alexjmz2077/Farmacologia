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
            "Amoxicilina", "Ampicilina", "Azitromicina", "Bacitracina", "Cefalexina", "Cefoperazona", "Cefradina", "Claritromicina", "Enrofloxacina", "Espiramicina", "Florfenicol", "Furaltadona", "Tiafenicol"
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
            val farmaco11: TextView = findViewById(R.id.farmaco)
            val farmaco12: TextView = findViewById(R.id.farmaco)
            val farmaco13: TextView = findViewById(R.id.farmaco)

            // Realizar comparación para mostrar el botón de dosis si se selecciona un fármaco específico
            when (selectedItem) {
                "Amoxicilina" -> {
                    farmaco1.text = getString(R.string.farma1)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Ampicilina" -> {
                    farmaco2.text = getString(R.string.farma2)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Azitromicina" -> {
                    farmaco3.text = getString(R.string.farma3)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Bacitracina" -> {
                    farmaco4.text = getString(R.string.farma4)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Cefalexina" -> {
                    farmaco5.text = getString(R.string.farma5)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Cefoperazona" -> {
                    farmaco6.text = getString(R.string.farma6)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Cefradina" -> {
                    farmaco7.text = getString(R.string.farma7)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Claritromicina" -> {
                    farmaco8.text = getString(R.string.farma8)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Enrofloxacina" -> {
                    farmaco9.text = getString(R.string.farma9)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Espiramicina" -> {
                    farmaco10.text = getString(R.string.farma10)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Florfenicol" -> {
                    farmaco11.text = getString(R.string.farma11)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Furaltadona" -> {
                    farmaco12.text = getString(R.string.farma12)
                    dosisButton.visibility = Button.VISIBLE
                }
                "Tiafenicol" -> {
                    farmaco13.text = getString(R.string.farma13)
                    dosisButton.visibility = Button.VISIBLE
                }

            }


        }
    }
}


