fun main(){
    var evento =Evento()
    evento.mostrarIngressos()
    for(i in 0 .. 5){
        evento.venderIngresso(i)
        evento.venderVip(i)
    }
    evento.venderIngresso(25)
    evento.venderVip(8)

    evento.mostrarIngressos()
    evento.verArrecadacao()
}

open class Ingresso(val valor:Double,val quantidade:Int){
    fun valorIngresso(){
        println(valor)
    }
}

class Vip(val valorVip:Double,val quantidadeVip:Int,val valorExtra:Double):Ingresso(valorVip+valorExtra,quantidadeVip){

}

class Evento(){
    var listaIngressos = mutableListOf<Int>()
    var listaVipIngressos = mutableListOf<Int>()
    var listaVendidos = mutableListOf<Int>()
    var listaVendidosVip = mutableListOf<Int>()
    var vendidos = 0
    var vendidosVip = 0
    var valorArrecadado = 0.0

    val ingressos = Ingresso(35.0,30)
    val ingressosVip = Vip(ingressos.valor,10,45.0)

    init {
        for (i in 0 .. ingressos.quantidade){
            listaIngressos.add(i)
        }
        for(i in 0 .. ingressosVip.quantidadeVip){
            listaVipIngressos.add(i)
        }

    }

    fun mostrarIngressos(){
        println("Ingressos: $listaIngressos")
        println("Vendidos: $listaVendidos")
        println("Ingressos vip: $listaVipIngressos")
        println("Vendidos: $listaVendidosVip")
    }

    fun venderIngresso(index: Int){
        var codigoVendido = 404
        this.vendidos +=1
        listaVendidos.add(listaIngressos[index])
        listaIngressos[index] = codigoVendido
    }
    fun venderVip(index: Int){
        var codigoVendido = 404
        this.vendidosVip+=1
        listaVendidosVip.add(listaVipIngressos[index])
        listaVipIngressos[index]=codigoVendido
    }

    fun verArrecadacao(){
        var arrecado = ingressos.valor*vendidos
        var arrecadadoVip = ingressosVip.valor*vendidosVip
        this.valorArrecadado = arrecado+arrecadadoVip
        println("Valor arredado: $valorArrecadado")
    }
}