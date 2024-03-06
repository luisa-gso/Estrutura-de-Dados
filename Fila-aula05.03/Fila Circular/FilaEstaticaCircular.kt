class FilaEstaticaCircular(val tamanho : Int = 10): Enfileravel{
    
      // variaveis de instancia 
      private var inicio = 0
      private var fim = -1
      private var dados: Array<Any> = arrayOfNulls(tamanho)
      private var quantidade = 0


override fun estaCheia():Boolean{
     return (quantidade== dados.size)
}

override fun estavazia():Boolean{
      return (quantidade == 0)
}
override fun imprimir(): String{
      var resultado = "["
      var aux = inicio
      for(i in 0 .. quantidade){
           if (i == quantidade)
             resultado+= "${dados[aux]}"
           else 
             resultado+= "${dados[aux]},"
            aux ++
            if(aux == dados.size)
            aux = 0
      }
      return "$resultado]"
}


override fun desenfileirar():Any?{
      var dado: Any? = null
      if(!estaVazia()){
            dado = dados[inicio]
            inicio++
              if(inicio == dados.size)
                 inicio = 0
            quantidade--
      }else{
            println("Fila Vazia")
      }
      return dado
}
override fun enfileirar(dado:Any?){
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
  override fun atualizar(novoDado: Any?){
      if(!estaVazia()){
          dados[inicio]= novoDado
      }else{
          println("Esta cheia")
      }
  }
  
}