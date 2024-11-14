package com.hugo.simulacroexamen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hugo.simulacroexamen.model.Tarea

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarComponentes()
    }

    private fun inicializarComponentes() {
        val boton: Button = findViewById(R.id.bAnadir)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)

        boton.setOnClickListener{
            when(radioGroup.checkedRadioButtonId) {
                R.id.rbTarea -> {
                    var intent: Intent = Intent(this, TareaActivity::class.java)
                    startActivity(intent)
                }

                R.id.rbCita -> {

                }

                R.id.rbPago -> {

                }
            }
        }

    }
}