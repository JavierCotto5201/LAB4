package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.lab3.databinding.ActivityAtitlanBinding
import kotlinx.android.synthetic.main.activity_antigua.*
import kotlinx.android.synthetic.main.activity_antigua.button
import kotlinx.android.synthetic.main.activity_atitlan.*

class Atitlan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atitlan)


        val binding:ActivityAtitlanBinding= DataBindingUtil.setContentView(this, R.layout.activity_atitlan)
        var model = Model()

        model.phrase = "Un lugar para relajarse"
        model.title = "Lago Atitlan"
        model.description="El lago de Atitlán es un cuerpo de agua ubicado en un enorme cráter volcánico en la zona montañosa del suroeste de Guatemala. Está rodeado de colinas verdes empinadas y es conocido por las aldeas mayas y los volcanes con impresionantes conos agudos. La ajetreada localidad de Panajachel, donde se venden tejidos tradicionales, es una vía de acceso popular al lago. En una antigua plantación de café, se encuentra la Reserva Natural Atitlán, que tiene senderos y un jardín de mariposas."
        binding.model = model


        button.setOnClickListener {
            var texto = findViewById<EditText>(R.id.editText)
            val ret = Intent(this, MainActivity::class.java)
            Toast.makeText(applicationContext, texto.getText() , Toast.LENGTH_SHORT).show()
            startActivity(ret)
        }
    }
}
