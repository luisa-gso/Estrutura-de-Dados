class FilaDupla(var tamanho : Int = 10):DuplamenteEnfileiravel{
   
   
   
    private var inicio = 0
    private var fim = -1
    private var quantidade = 0
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
   
   
   
    override fun enfileirarInicio (dado: Any?){
        if (!estaCheia()){
            if(inicio == -1){
                inicio = dados.size -1
            }
            quantidade ++
            dados[inicio] = dado
            inicio--
        }else{
            println("Fila cheia")
        }
      
    }
    override fun enfileirarFim(dado:Any?){
        if(!estaCheia()){
            fim ++
            if(fim == dados.size)
                fim = 0 
            dados[fim]= dado
            quantidade++
        }else{
            println("Esta cheia!")
        }
    }

    override fun desenfileirarInicio(): Any?{
        var dadoInicio: Any? = null
          if(!estaVazia()){
            dadoInicio = dados[inicio]
         inicio++
        }
        else{
            println("Está vazia")
        }
        return dadoInicio
    }

    override fun desenfileirarFim():Any?{
       var dadoFim: Any? =  null
       if (!estaVazia()){
        dadoFim = dados[fim]
        fim --
        if(fim == -1 ){
            fim = dados.size -1
        }
        quantidade --
       }else {
        println ("Fila vazia")
       }
       return dadoFim
    }
   
    override fun espiarInicio():Any?{
        var dadoInicio: Any? = null
            if(!estaVazia()){
                dadoInicio = dados[inicio]
            }
            else{
                println("Está vazia")
            }
            return dadoInicio
        }

    override fun espiarFim():Any?{
     var dadoFim: Any? = null
        if(!estaVazia()){
            dadoFim = dados[fim]
        }
        else{
            println("Está vazia")
        }
        return dadoFim
    }

    override fun atualizarInicio(novoDado: Any?){
        if(!estaVazia()){
            dados[inicio]= novoDado
        }else{
            println("Esta cheia")
        }
    }

    override fun atualizarFim(novoDado: Any?){
        if(!estaVazia()){
            dados[fim]= novoDado
        }else{
            println("Esta cheia")
        }
    }


   override fun estaCheia():Boolean{
    return (quantidade== dados.size)
}
    override fun estaVazia():Boolean{
        return (quantidade == 0)
}

override fun imprimir(): Any? {
    if (estaVazia()) {
        return "Fila vazia"
    }

    var resultado = "["
    var aux = inicio
    for (i in 0 until quantidade) {
        resultado += "${dados[aux]}"
        aux++
        if (aux == dados.size) {
            aux = 0
        }
        if (i != quantidade - 1) {
            resultado += ","
        }
    }
    return "$resultado]"
}

}