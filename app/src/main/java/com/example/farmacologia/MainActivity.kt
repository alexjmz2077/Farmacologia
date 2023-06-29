package com.example.farmacologia
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var autoComplete: AutoCompleteTextView
    private lateinit var dosisButton: Button
    private lateinit var spinner: Spinner
    private lateinit var spinner2: Spinner
    private lateinit var spinner3: Spinner
    private lateinit var spinnerAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun calcularDosis(view: View) {
            val pesoAnimalEditText = findViewById<EditText>(R.id.pesoanimal)
            val dosisMedicaEditText = findViewById<EditText>(R.id.dosismedica)
            val concentracionMedEditText = findViewById<EditText>(R.id.concentracionmed)
            val resultadoTextView = findViewById<TextView>(R.id.textView4)

            // Obtener los valores ingresados
            val pesoAnimal = pesoAnimalEditText.text.toString().toDouble()
            val dosisMedica = dosisMedicaEditText.text.toString().toDouble()
            val concentracionMed = concentracionMedEditText.text.toString().toDouble()

            // Realizar el cálculo
            val resultado = (pesoAnimal * dosisMedica) / concentracionMed

            // Mostrar el resultado
            resultadoTextView.text = resultado.toString()
        }
        spinner = findViewById(R.id.spinner)
        spinner2 = findViewById(R.id.spinner2)
        spinner3 = findViewById(R.id.spinner3)

        val options = resources.getStringArray(R.array.options_array)
        spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerAdapter


        val options2 = resources.getStringArray(R.array.options_array2)
        spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options2)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner2.adapter = spinnerAdapter

        val options3 = resources.getStringArray(R.array.options_array3)
        spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options3)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner3.adapter = spinnerAdapter






        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                // Realiza acciones basadas en la selección del Spinner
                Toast.makeText(
                    applicationContext,
                    "Seleccionaste: $selectedItem",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        val items = listOf(
            "Amoxicilina",
            "Ampicilina",
            "Azitromicina",
            "Bacitracina",
            "Cefalexina",
            "Cefoperazona",
            "Cefradina",
            "Claritromicina",
            "Enrofloxacina",
            "Espiramicina",
            "Florfenicol",
            "Furaltadona",
            "Tiafenicol"
        )

        autoComplete = findViewById(R.id.auto_complete)
        dosisButton = findViewById(R.id.dosisButton)
        findViewById<Button>(R.id.dosisButton)
        dosisButton.setOnClickListener {
            calcularDosis(it)
        }

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
                    spinner2.visibility = Button.VISIBLE
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