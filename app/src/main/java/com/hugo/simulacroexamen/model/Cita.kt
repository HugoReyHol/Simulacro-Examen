package com.hugo.simulacroexamen.model

import java.time.LocalDateTime

class Cita(nombre: String,
           val fechaHora: LocalDateTime,
           val lugar: String,
           var personas: ArrayList<Persona>?)
    : Actividad(nombre), Recordatorio {

    fun agregarPersonaCita(persona: Persona) {
        personas?.add(persona)
    }

    override fun mostrarDetalle(): String {
        return "${super.mostrarDetalle()}, " +
                "${::fechaHora.name}: $fechaHora, " +
                "${::lugar.name}: $lugar, " +
                "${::personas.name}: $personas"
    }

    override fun programarRecordatorio() {
        TODO("Not yet implemented")
    }

    override fun cancelarRecordatorio() {
        TODO("Not yet implemented")
    }


}