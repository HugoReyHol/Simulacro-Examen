package com.hugo.simulacroexamen.util

import android.app.Activity
import android.widget.Toast


fun Activity.mostrarMensaje(mensaje: String, tiempo: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, mensaje, tiempo).show()
}