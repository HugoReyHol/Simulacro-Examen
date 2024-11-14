package com.hugo.simulacroexamen.model

import com.hugo.simulacroexamen.R
import java.time.LocalDate
import java.time.LocalDateTime

class Tarea(nombre: String,
            val fechaLimite: LocalDate?,
            val urgencia: Urgencia,
            val notificacion: Notificacion?)
    : Actividad(nombre), Recordatorio {

    enum class Urgencia {ALTO, MEDIO, BAJO;
        fun colorUrgencia(): Int {
            var color: Int = -1

            when(this.name){
                ALTO.name -> color = R.color.red
                MEDIO.name -> color = R.color.orange
                BAJO.name -> color = R.color.green

            }

            return color
        }
    }

    inner class Notificacion(val fechaHoraNotificacion: LocalDateTime,
                             val activo: Boolean){

        fun mostrarNotificacion() {
            print("")

        }
    }

    override fun programarRecordatorio() {
        TODO("Not yet implemented")
    }

    override fun cancelarRecordatorio() {
        TODO("Not yet implemented")
    }

    override fun mostrarDetalle(): String {
        return "${super.mostrarDetalle()}, " +
                "${::fechaLimite.name}: $fechaLimite, " +
                "${::urgencia.name}: $urgencia, " +
                "${::notificacion}: $notificacion"
    }
}