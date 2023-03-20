package ejercicio1

class ConversorAKM {

    fun convertir(millas: Double):Double{
        return millas * 1.6093
    }

}

class ConversorAMillas {

    fun convertir(km: Double):Double{
        return km * 0.621371
    }

}

class ConversorBidreccional {

    fun convertir(unidades: Double,medida:String):Double{
        var n: Double = 0.0
        val convAMillas = ConversorAMillas()
        val convAKM = ConversorAKM()
        if (medida=="km"){
            n = convAMillas.convertir(unidades)
        } else {
            n = convAKM.convertir(unidades)
        }
        return n
    }

}

class ConversorGenerico{

    fun convertir(unidades: Double,medidaOrigen: UnidadDeMedida,medidaDestino: UnidadDeMedida):Double{
        return (unidades * medidaOrigen.kms) / medidaDestino.kms
    }

}

class UnidadDeMedida(val kms: Double){}



fun main(args: Array<String>) {
    //println("Hello, World")

    val convAKM = ConversorAKM()
    println(convAKM.convertir(1.0))

    val convAMillas = ConversorAMillas()
    println(convAMillas.convertir(1.0))

    val convBi = ConversorBidreccional()
    println(convBi.convertir(1.0,"millas"))

    val conversor = ConversorGenerico()
    val metro = UnidadDeMedida(0.001)
    val kilometro = UnidadDeMedida(1.0)
    val milla = UnidadDeMedida(1.6093)

    println(conversor.convertir(1.0,kilometro, metro))
    println(conversor.convertir(1.0,metro, kilometro))
    println(conversor.convertir(1.0,kilometro, milla))
    println(conversor.convertir(1.0,milla, kilometro))

}