fun main() {
    var contaNormal = ContaCorrente("Joaozinho",3500.0)
    var contaEspecial = ContaEspecial("Enzo",3500.0,3500.0)

    contaNormal.verInfos()
    contaNormal.sacar(3600.0)
    contaNormal.sacar(500.0)
    contaNormal.verInfos()

    contaEspecial.verInfos()
    contaEspecial.sacar(8000.0)
    contaEspecial.sacar(6000.0)
    contaEspecial.verInfos()
}

open class ContaCorrente(var nome: String,protected var saldo:Double){
    fun verInfos(){
        println("Nome do propietário: $nome")
        println("Saldo: $saldo")
    }

    open fun sacar(saque:Double){
        if (saque > saldo){
            println("Saque negado \nMotivo: Saldo insuficiente")
        }else{
            saldo = saldo-saque
            println("O saque foi efetuado")
        }
    }
}

class ContaEspecial(nome: String,saldo:Double, var creditoExtra:Double):ContaCorrente(nome, saldo){
    override fun sacar(saque: Double){
        if (saque > saldo+creditoExtra){
            println("Saque negado \nMotivo: Saldo insuficiente")
        }else{
            saldo = saldo-saque
            println("O saque foi efetuado")
        }
    }
}