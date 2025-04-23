fun main() {
    var pato = Pato()
    pato.voar()
    pato.nadar()
}

interface Voar{
    fun voar(){

    }
}

interface Nadar{
    fun nadar(){

    }
}

class Pato():Voar,Nadar{
    override fun voar() {
        println("Pato Voando")
    }

    override fun nadar() {
        println("Pato Nadando")
    }
}