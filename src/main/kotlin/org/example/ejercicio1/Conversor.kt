package org.example.ejercicio1

class Conversor {
    fun convertir(unidades: Double,medidaOrigen:UnidadDeMedida,medidaDestino:UnidadDeMedida): Double {
        return (unidades * medidaOrigen.metros) / medidaDestino.metros
    }
}