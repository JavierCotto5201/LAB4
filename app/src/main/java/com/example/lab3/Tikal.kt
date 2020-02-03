package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.lab3.databinding.ActivityTikalBinding
import kotlinx.android.synthetic.main.activity_antigua.*
import kotlinx.android.synthetic.main.activity_antigua.button
import kotlinx.android.synthetic.main.activity_tikal.*

class Tikal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tikal)




        val binding:ActivityTikalBinding = DataBindingUtil.setContentView(this, R.layout.activity_tikal)
        var model = Model()

        model.phrase = "La Antigua Cultura Guatemalteca"
        model.title = "TIKAL"
        model.description="Tikal (o Tik'al, de acuerdo con la ortografía maya moderna) es uno de los mayores yacimientos arqueológicos y centros urbanos de la civilización maya precolombina. Está situado en el municipio de Flores, en el departamento de Petén, en el territorio actual de la República de Guatemala y forma parte del Parque nacional Tikal, que fue declarado Patrimonio de la Humanidad, por Unesco, en 1979.1\u200B Según los glifos encontrados en el yacimiento, su nombre maya habría sido Yax Mutul.2\u200B\n" +
                "\n" +
                "Tikal fue la capital de un estado beligerante, que se convirtió en uno de los reinos más poderosos de los antiguos mayas.3\u200B4\u200BAunque la arquitectura monumental del sitio se remonta hasta el siglo iv a. C., Tikal alcanzó su apogeo durante el Período Clásico, entre el 200 y el 900 d. C. Durante este tiempo, la ciudad dominó gran parte de la región maya, en el ámbito político, económico y militar; mantenía vínculos con otras regiones, a lo largo de Mesoamérica, incluso con la gran metrópoli de Teotihuacan, en el lejano Valle de México.5\u200B\n" +
                "\n" +
                "Después del Clásico Tardío, no se construyeron monumentos mayores.\n" +
                "\n" +
                "Con una larga lista de gobernantes dinásticos, el descubrimiento de muchas de sus respectivas tumbas y el estudio de sus monumentos, templos y palacios, Tikal es probablemente la mejor comprendida de las grandes ciudades mayas de las tierras bajas de Mesoamérica.6\u200B"
    binding.model = model

        button.setOnClickListener {
            var texto = findViewById<EditText>(R.id.editText)
            val ret = Intent(this, MainActivity::class.java)
            Toast.makeText(applicationContext, texto.getText() , Toast.LENGTH_SHORT).show()
            startActivity(ret)
        }
        }
}
