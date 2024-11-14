package com.hugo.simulacroexamen.model

abstract class Actividad(val nombre: String){
    var completada: Boolean = false

    fun marcarComoCompletada(){
        completada = true
    }

    open fun mostrarDetalle(): String{
        return "${::nombre.name}: $nombre, ${::completada.name}: $completada"
    }
}