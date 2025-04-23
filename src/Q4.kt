fun main(){

    var empregado = Empregado("Abner",1500.0)
    var gerente = Gerente("Adalberto",4000.0)
    var vendedor = Vendedor("Valus Saladino",2548.00,5.0,30)
    println(empregado.getNome()+": "+empregado.getSalario())
    println(gerente.getNome()+": "+gerente.getSalario())
    println(vendedor.getNome()+": "+vendedor.getSalario())
}

open class Empregado(private var nome:String,private var salario: Double){

    open fun getSalario(): Double {
        return(salario)
    }

    fun getNome(): String {
        return(nome)
    }
}

class Gerente(private var nome:String,private var salario: Double):Empregado(nome,salario){

}

class Vendedor(private var nome:String,private var salario: Double,private var comicao: Double,private var vendas:Int):Empregado(nome,salario){

    init {
        calcularSalario()
    }

    private fun calcularSalario():Double{
        var porcentagem = comicao/100
        var novoSalario = salario + (salario*porcentagem*vendas)
        return(novoSalario)
    }
    override fun getSalario():Double {
        return(calcularSalario())
    }

}