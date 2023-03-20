package org.example.ejercicio4

import kotlin.streams.toList

class UIList {
    fun isSorted(listaDeNumeros:List<Int>):Boolean{
        return listaDeNumeros == listaDeNumeros.sortedDescending().reversed()
    }

    fun ordenar(listaDeNumeros: List<Int>, asc: Boolean): List<Int>{

        var copiaLista = listaDeNumeros.sortedDescending()
        if (asc) {
            copiaLista = copiaLista.reversed()
        }
        return copiaLista
    }

    fun filterPrimes(listaDeNumeros: List<Int>):List<Int>{
        return listaDeNumeros.filter { n -> this.esPrimo(n) }
    }

    fun esPrimo(numero: Int) :Boolean{
        val rango: List<Int> = 1.rangeTo(numero).toList()
        return rango.count{n -> (numero % n) == 0} <=2
    }

    fun powMap(listaDeNumeros: List<Int>):List<Int>{
        return listaDeNumeros.stream().map{n -> n*n}.toList()
    }

    fun sumProdPos(listaDeNumeros: List<Int>):Int{

        var total = 0
        var x = 1

        for (n in listaDeNumeros){
            total += n * x
            x++
        }
        return total
    }

}