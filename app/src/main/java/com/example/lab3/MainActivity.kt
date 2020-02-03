package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    var cont = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            this.buttonDes.setOnClickListener {
                if (cont==0){
                this.TV_nombre.visibility = View.GONE
                this.eTnombre.visibility = View.GONE
                this.TV_nickname.visibility = View.VISIBLE
                this.TV_nickname.text = this.eTnombre.text
                cont=1
            }else{
                this.TV_nombre.visibility = View.VISIBLE
                this.eTnombre.visibility = View.VISIBLE
                this.TV_nickname.visibility = View.GONE
                cont=0
            }
            }

        bTikal.setOnClickListener {
            startActivity(Intent(this, Tikal::class.java))
        }

        bAtitlan.setOnClickListener {
            startActivity(Intent(this, Atitlan::class.java))
        }
        bAntigua.setOnClickListener {
            startActivity(Intent(this, Antigua::class.java))
        }

    }
}

