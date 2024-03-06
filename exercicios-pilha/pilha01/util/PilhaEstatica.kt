class PilhaEstatica : Empilhavel { 
    private var ponteiroTopo1: Int 
    private var dados: Array<Any?>
  


    // construtores
    constructor() : this(10)
    constructor(tamanho: Int) {
        ponteiroTopo1 = -1
        dados = arrayOfNulls(tamanho)
    }

    override fun empilhar1(dado: Any?) {
        if (estaCheia1()) {
            println("A pilha 1 está cheia")
        } else {
            ponteiroTopo1++
            dados[ponteiroTopo1] = dado
        }
    }

    override fun desempilhar1(): Any? {
        var retorno: Any? = null
        if (!estaVazia1()) {
            retorno = dados[ponteiroTopo1]
            ponteiroTopo1--
        } else {
            println("A pilha 1 está vazia")
        }
        return retorno
    }

    override fun topo1(): Any? {
        return if (!estaVazia1()) {
            dados[ponteiroTopo1]
        } else {
            println("A pilha 1 está vazia")
            null
        }
    }

    override fun estaCheia1(): Boolean {
        return ponteiroTopo1 == dados.size - 1
    }

    override fun estaVazia1(): Boolean {
        return ponteiroTopo1 == -1
    }

    override fun imprimir1(): String {
        var resultado = "["
        for (i in ponteiroTopo1 downTo 0) {
            resultado += if (i == 0) "${dados[i]}" else "${dados[i]}, "
        }
        return "$resultado]"
    }

  
   

   

    
    

    
    
}
