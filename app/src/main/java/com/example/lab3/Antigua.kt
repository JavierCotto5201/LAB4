package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.lab3.databinding.ActivityAntiguaBinding
import kotlinx.android.synthetic.main.activity_antigua.*
import kotlinx.android.synthetic.main.activity_main.*

class Antigua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_antigua)

        val binding:ActivityAntiguaBinding = DataBindingUtil.setContentView(this, R.layout.activity_antigua)
        var model = Model()

        model.phrase = "La casa de los antiguos conquistadores"
        model.title = "Antigua Guatemala"
        model.description="La ciudad de Santiago de los Caballeros de Guatemala, cuyo nombre oficial e histórico es Muy Noble y Muy Leal Ciudad de Santiago de los Caballeros de Guatemala y popularmente nombrada en la actualidad como Antigua Guatemala, es cabecera del municipio homónimo y del departamento de Sacatepéquez, Guatemala; se ubica a aproximadamente 25 kilómetros al oeste de la capital de la República de Guatemala, y a una altitud de 1470 msnm. Actualmente la ciudad se ubica dentro de las 20 ciudades más importantes de Guatemala.\n" +
                "\n" +
                "Durante la época colonial era conocida como «Santiago de los Caballeros de Guatemala», y fue la capital de la Capitanía General de Guatemala, entre 1541 y 1776, año en que la capital fue trasladada a la ciudad de Nueva Guatemala de la Asunción después de que los terremotos de Santa Marta arruinaran la ciudad por tercera ocasión en el mismo siglo3\u200B y las autoridades civiles utilizaran eso como excusa para debilitar a las autoridades eclesiásticas —siguiendo las recomendaciones de las Reformas Borbónicas emprendidas por la corona española en la segunda mitad del siglo xviii—4\u200B obligando a las órdenes regulares a trasladarse de sus majestuosos conventos a frágiles estructuras temporales en la nueva ciudad.5\u200B\n" +
                "\n" +
                "A partir del traslado la ciudad pasó a llamarse «arruinada Guatemala», «Santiago de Guatemala antiguo» y la «antigua ciudad». Fue abandonada por todas las autoridades reales y municipales, y en 1784 por las dos últimas parroquias: «Candelaria» y «Nuestra Señora de los Remedios», quedándose también sin autoridades eclesiásticas.6\u200B Pocos años después el arzobispo Cayetano Francos y Monroy autorizó el funcionamiento de tres parroquias interinas que llevaron el nombre de sus antecesoras: «San Sebastián», «Candelaria» y «Los Remedios», en donde se guardó la mayor cantidad de obras de arte religioso que permaneció en la antigua Guatemala.7\u200B\n" +
                "\n" +
                "Tras la Independencia de Centroamérica en 1821 recuperó la categoría de ciudad y fue nombrada como cabecera del departamento de Sacatepéquez.8\u200B Así mismo, el Estado de Guatemala estableció circuitos y distritos para la impartición de justicia por medio de juicios de jurados en 1825, y Antigua Guatemala fue asignada como sede del circuito homónimo en el Distrito N.º8 (Sacatepéquez).9\u200B\n" +
                "\n" +
                "La ciudad fue designada como Patrimonio de la Humanidad por la UNESCO en 1979.10\u200B11\u200B\n" +
                "\n" +
                "En el siglo xxi es un importante destino turístico guatemalteco por su bien preservada arquitectura barroca española con fachadas barrocas del Nuevo Mundo, así como un gran número de ruinas de iglesias católicas, incluso aún después de que sus estructuras fueran severamente dañadas por el abandono en que estuvieron entre 1776 y 19403\u200B12\u200B y por los terremotos de 1874,13\u200B de 191712\u200B y de 1976.14\u200B También es reconocida por las solemnes procesiones de Semana Santa que se han realizado anualmente desde antes del traslado de la capital a la Nueva Guatemala.15\u200B De acuerdo al censo oficial de 2003, tiene una población de 44 097 habitantes.16\u200B"
        binding.model = model

        button.setOnClickListener {
            var texto = findViewById<EditText>(R.id.editText)
            val ret = Intent(this, MainActivity::class.java)
            Toast.makeText(applicationContext, texto.getText() , Toast.LENGTH_SHORT).show()
            startActivity(ret)
        }
    }
}
