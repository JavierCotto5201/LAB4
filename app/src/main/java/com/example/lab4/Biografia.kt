package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.lab3.Model
import com.example.lab3.R
import com.example.lab3.databinding.ActivityAntiguaBinding

class Biografia : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biografia)

        //val binding: ActivityAntiguaBinding = DataBindingUtil.setContentView(this, R.layout.activity_biografia)
        //var model = Model()

        //model.phrase=""
        //model.title = "Javier Alejandro Cotto Argueta"
        //model.description="Nacido el 5 de Febrero del 2001 en la Ciudad de Guatemala, actualmente estudiando en la UVG cursando 2do año.Utilizando esta aplicación para dar a conocer mi talento para las aplicaciones moviles, espero les guste el resultado."
        //binding.model = model
    }
}
