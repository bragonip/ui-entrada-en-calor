package ejercicio3

import java.time.LocalDate

class Usuario (var nombreYApellido:String, var nombreDeUsuario:String, var eMail:String, private var fechaDeNacimiento:LocalDate){

    private var seguidores:List<Usuario> = listOf()
    private var seguidos:List<Usuario> = listOf()

//    constructor(nyap:String, usuario:String,email:String,fecNac:LocalDate){
//       this.nombreDeUsuario=nyap
//        this.nombreDeUsuario=usuario
//        this.eMail=email
//        this.fechaDeNacimiento=fecNac
//        this.seguidores= listOf()
//        this.seguidos= listOf()
//    }


    fun edad():Int{
        return LocalDate.now().compareTo(this.fechaDeNacimiento)
    }

}