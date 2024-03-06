class FilaEstatica(val tamanho: Int = 10): Enfileravel{
    // variaveis de instancia
    private var inicio = 0
    private var fim = -1
    private var dados: Array<Any> = arrayOfNulls(tamanho)

    
    //metodos auxiliares
   override fun estaCheia():Boolean{
        return (fim = dados.size -1)
    }
    fun estaVazia()Boolean{
        return (fim + 1 == inicio)
    }

   override fun imprimir() {
var resultado = "["
for(i in inicio .. fim){
    if( i == fim)
    resultado += "${dados[i]}"
    else
    resultado += "${dados[i]},"
}
return "$resultado]"
    }

    override fun espiar()Any?{
    var dado: Any? = null
        if(!estaVazia()){
            dado = dados[inicio]
        }
        else{
            println("Está vazia")
        }
    }
    override fun desenfileirar(): Any?{
        var dado: Any? = null
        if(!estaVazia()){
            dado = dados[inicio]
            inicio++
        }
        else{
            println("Está vazia")
        }

    }
    override fun enfileirar(dado:Any?){
        if(!estaCheia()){
            fim ++
            dados[fim]= dado
        }else{
            println("Esta cheia")
        }
    }
    override fun atualizar(novoDado: Any?){
        if(!estaVazia()){
            dados[inicio]= novoDado
        }else{
            println("Esta cheia")
        }
    }

    // metodos principais
}
