package com.hugo.simulacroexamen.model

import kotlinx.coroutines.withContext
import java.time.LocalDate

class Pago(nombre: String,
           val cantidad: Int,
           var fechaPago: LocalDate,
           var metodoPago: String)
    : Actividad(nombre) {

    fun procesarPago() {
        marcarComoCompletada()
        TODO("Toast sin context?")

    }

    override fun mostrarDetalle(): String {
        return "${super.mostrarDetalle()}, " +
                "${::cantidad.name}: $cantidad, " +
                "${::fechaPago.name}: $fechaPago, " +
                "${::metodoPago.name}: $metodoPago"
    }
}