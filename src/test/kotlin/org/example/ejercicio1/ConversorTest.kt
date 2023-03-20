package org.example.ejercicio1

import kotlin.test.Test
import kotlin.test.assertEquals

class ConversorTest{

    val conversor: Conversor = Conversor()
    val metro:UnidadDeMedida= UnidadDeMedida(1.0)
    val kilometro:UnidadDeMedida= UnidadDeMedida(1000.0)
    val milla:UnidadDeMedida= UnidadDeMedida(1609.34)

    @Test
    fun testConvertir(){
        val metrosEsperados: Double = 1000.0
        assertEquals(metrosEsperados,conversor.convertir(1.0,kilometro,metro))
        val kilometrosEsperados: Double = 1.60934
        assertEquals(kilometrosEsperados,conversor.convertir(1.0,milla,kilometro))
    }

}