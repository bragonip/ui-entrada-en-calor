package org.example.ejercicio4

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class UIListTest{
    @Test
    fun TestIsSortedTrue(){
        val uiList:UIList = UIList()
        val listaDeNumeros = listOf<Int>(1,2,3)

        assertTrue(uiList.isSorted(listaDeNumeros))

    }
    @Test
    fun TestIsSortedFalse(){
        val uiList:UIList = UIList()
        val listaDeNumeros = listOf<Int>(1,3,2)

        assertFalse(uiList.isSorted(listaDeNumeros))
    }
    @Test
    fun TestOrdenarAsc(){
        val uiList:UIList = UIList()
        val listaDeNumeros = listOf<Int>(1,2,3)

        assertEquals(listaDeNumeros,uiList.ordenar(listaDeNumeros,true))
    }
    @Test
    fun TestOrdenarDesc(){
        val uiList:UIList = UIList()
        val listaDeNumeros = listOf<Int>(1,2,3)

        assertEquals(listaDeNumeros.sortedDescending(),uiList.ordenar(listaDeNumeros,false))
    }
    @Test
    fun TestEsPrimoTrue(){
        val uiList:UIList = UIList()

        assertTrue(uiList.esPrimo(1))
        assertTrue(uiList.esPrimo(2))
        assertTrue(uiList.esPrimo(11))
    }
    @Test
    fun TestEsPrimoFalse(){
        val uiList:UIList = UIList()

        assertFalse(uiList.esPrimo(4))
        assertFalse(uiList.esPrimo(9))
        assertFalse(uiList.esPrimo(20))
    }
    @Test
    fun TestFilterPrimes(){
        val uiList:UIList = UIList()
        val listaDeNumeros = listOf<Int>(1,2,3,4,5,6,7,8,9,10,11)
        val listaEsperada = listOf<Int>(1,2,3,5,7,11)

        assertEquals(listaEsperada,uiList.filterPrimes(listaDeNumeros))
    }

    @Test
    fun testPowMap(){
        val uiList:UIList = UIList()
        val listaDeNumeros: List<Int> = listOf<Int>(1,2,3,4,5)
        val listaEsperada: List<Int>  = listOf<Int>(1,4,9,16,25)

        assertEquals(listaEsperada,uiList.powMap(listaDeNumeros))
    }

    @Test
    fun TestMultiplicarYSumarTodos(){
        val uiList:UIList = UIList()
        val listaDeNumeros: List<Int> = listOf<Int>(1, 1, 2, 3, 5, 8)
        val valorEsperado:Int = 94
        assertEquals(valorEsperado,uiList.sumProdPos(listaDeNumeros))
    }
}