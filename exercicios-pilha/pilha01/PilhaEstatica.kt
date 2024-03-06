class PilhaEstatica :Empilhavel {
   	   
       //variaveis globais(de instancia)
   	   private var ponteiroTopo: Int
       private var dados:Array<Any?>
       
       //construtores
       constructor (): this(10)
       constructor (tamanho: Int){
           ponteiroTopo = -1
           dados = arrayOfNulls(tamanho)
       }
      
       //métodos auxiliares
       // no kotlin é obrigado o uso da palavra override  para mostrar que a funçao esta vindo de uma implementação
     
       override fun estaCheia(): Boolean {
       return (ponteiroTopo == dados.size -1 )
       } 
       
       override   fun estaVazia(): Boolean{
         return (ponteiroTopo == -1) 
      }
       
       override fun imprimir(): String{
        var resultado = "[" 
           //iterar a pilha
           for(i in ponteiroTopo downTo 0){
               if (i == 0)
               resultado += "${dados[i]}"
               else  
               resultado += "${dados[i]},"
           }
           return "$resultado]"
      }
     
       //métodos principais
      // A ? na frente do any ou outro qualquer objeto diz que esse objeto aceita o retorno do valor null
   
    override fun empilhar(dado: Any?){
        if (!estaCheia()){
            ponteiroTopo ++ 
            dados[ponteiroTopo] = dado
        }else{
            println("A pilha está cheia")
        }
        
    }
    override fun desempilhar(): Any?{      // o any? apos os parenteses é o retorno
         var retorno : Any? = null
        if(!estaVazia()){
            retorno = dados[ponteiroTopo]
            ponteiroTopo--
        } else{
            println("A pilha está vazia")
        }
        return retorno
    }  
    override fun topo(): Any?{
        var retorno : Any? = null
        if(!estaVazia()){
            retorno = dados[ponteiroTopo]
         } else{
            println("A pilha está vazia")
        }
        return retorno
        
    }
   
   }