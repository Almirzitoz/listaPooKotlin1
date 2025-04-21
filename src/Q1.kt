fun main(){

}

class Fatura(var nItem:Int,var desc:String,var qtd:Int,var valor:Double){
    var valorTotal: Double=0.0
    var desconto: Double=0.0
    init {
        if (this.qtd < 0){
            this.qtd = 0
        }
        if (this.valor < 0.0){
            this.valor = 0.0
        }
    }


    fun setNItem(n: Int){
        this.nItem = n
    }
    fun setDesc(descricao:String){
        this.desc=descricao
    }
    fun setQtd(quantidade:Int){
        this.qtd =quantidade
    }
    fun setvalor(valorr:Double){
        if (desconto == 0.0){
            this.valor = valorr
        }else{
            var valorDescontado = valorr*desconto
            this.valor = valorr-valorDescontado
        }
    }
    fun setDesconto(valorDesconto:Double){
        desconto = valorDesconto/100
    }

    fun getNItem(){
        println(nItem)
    }
    fun getDesc(){
        println(desc)
    }
    fun getQtd(){
        println(qtd)
    }
    fun getValor(){
        println(valor)
    }
    fun getValorFatura(){
        valorTotal = valor*qtd
        println(valorTotal)
    }
}