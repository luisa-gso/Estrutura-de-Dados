class PilhaInvertida :Empilhavel {
   	   
    //variaveis globais(de instancia)
       private var ponteiroTopo2: Int
    private var dados:Array<Any?>
    
    //construtores
    constructor (): this(10)
    constructor (tamanho: Int){
        ponteiroTopo2 = tamanho
        dados = arrayOfNulls(tamanho)
    }
   
    //métodos auxiliares
    // no kotlin é obrigado o uso da palavra override  para mostrar que a funçao esta vindo de uma implementação
  
    override fun estaCheia2(): Boolean {
    return (ponteiroTopo2 == 0 )
    } 
    
    override   fun estaVazia2(): Boolean{
      return (ponteiroTopo2 == tamanho) 
   }
    
    override fun imprimir2(): String{
     var resultado = "[" 
        //iterar a pilha
        for(i in ponteiroTopo2 .. dados.size-1 ){
            if (i == dados.size-1)
            resultado += "${dados[i]}"
            else  
            resultado += "${dados[i]},"
        }
        return "$resultado]"
   }
  
    //métodos principais
   // A ? na frente do any ou outro qualquer objeto diz que esse objeto aceita o retorno do valor null

 override fun empilhar2(dado: Any?){
     if (!estaCheia2()){
         ponteiroTopo2--
         dados[ponteiroTopo2] = dado
     }else{
         println("A pilha está cheia")
     }
     
 }
 override fun desempilhar2(): Any?{      // o any? apos os parenteses é o retorno
      var retorno : Any? = null
     if(!estaVazia2()){
         retorno = dados[ponteiroTopo2]
         ponteiroTopo2++
     } else{
         println("A pilha está vazia")
     }
     return retorno
 }  
 override fun topo2(): Any?{
     var retorno : Any? = null
     if(!estaVazia2()){
         retorno = dados[ponteiroTopo2]
      } else{
         println("A pilha está vazia")
     }
     return retorno
     
 }

}