package com.hugo.simulacroexamen.util

import android.app.Activity
import android.widget.Toast
import com.hugo.simulacroexamen.model.Actividad
import com.hugo.simulacroexamen.model.Pago


fun Activity.mostrarMensaje(mensaje: String, tiempo: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, mensaje, tiempo).show()
}


fun ArrayList<Actividad>.filtrar(f: (Actividad) -> Boolean) : ArrayList<Actividad>{
    val final: ArrayList<Actividad> = arrayListOf()

    this.forEach {
        if (f(it)) final.add(it)
    }

    return final
}


fun ArrayList<Pago>.filtrar(f: (Pago) -> Boolean) : Double {
    var total: Double = 0.0

    this.forEach {
        if (f(it)) total += it.cantidad
    }

    return total
}