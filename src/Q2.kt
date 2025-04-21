fun main(){
    val exemplo = Produtos("Pão",5.0,10)
    val exemploDois = Produtos("Bateria",150.0,5)
    val exemploTres = Produtos("Teclado",250.0,5)
    val exemploQuatro = Produtos("Celular",1200.0,5)

    exemplo.mostrarInfos()
    exemploDois.mostrarInfos()
    exemploTres.mostrarInfos()
    exemploQuatro.mostrarInfos()

    exemplo.comprarProduto()
    exemplo.mostrarInfos()
}

class Produtos(var nome:String,var valor:Double,var qtd:Int){
    private var vendido:Boolean = false
    private var desconto:Double = 0.0

    init {
        descontar()
    }

    fun comprarProduto(){
        vendido = true
    }

    fun descontar(){
        if (valor <= 100.0){
            desconto = 0.0
        }else if (valor in 100.0 .. 200.0){
            desconto = valor*0.1
        }else if(valor in 200.0 .. 500.0){
            desconto = valor*0.2
        }else if(valor > 500.0){
            desconto = valor*0.25
        }
    }

    fun mostrarInfos(){
        println("Nome: $nome")
        println("Valor: $valor")
        println("Quantidade: $qtd")
        if (vendido == false){
            println("Situação: Vendido")
        }else{
            println("Situação: A venda")
        }
        println("Valor a ser pago pelo produto: ${valor-desconto}")
    }
}