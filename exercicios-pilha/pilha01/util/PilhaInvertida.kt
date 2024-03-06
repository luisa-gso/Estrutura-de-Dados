class PilhaInvertida(tamanho: Int = 10) : EmpilhavelDupla {
   
    // variáveis globais (de instância)
    private var ponteiroTopo1: Int = 0
    private var ponteiroTopo2: Int = tamanho
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    override fun empilhar1(dado: Any?) {
        if (!estaCheia1()) {
            dados[ponteiroTopo1++] = dado
        } else { 
            println("A pilha 1 está cheia")
        }
    }

    override fun desempilhar1(): Any? {
        var retorno: Any? = null 
        if (!estaVazia1()) {
            retorno = dados[--ponteiroTopo1]
        } else {
            println("A pilha 1 está vazia")
        }
        return retorno
    }

    override fun topo1(): Any? {
        return if (!estaVazia1()) {
            dados[ponteiroTopo1 - 1]
        } else {
            println("A pilha 1 está vazia")
            null
        }
    }

    override fun estaCheia1(): Boolean {
        return ponteiroTopo1 == ponteiroTopo2
    }

    override fun estaVazia1(): Boolean {
        return ponteiroTopo1 == 0
    }

    override fun imprimir1(): String {
        var resultado = "["
        for (i in 0 until ponteiroTopo1) {
            resultado += if (i == ponteiroTopo1 - 1) "${dados[i]}" else "${dados[i]}, "
        }
        return "$resultado]"
    }

    override fun empilhar2(dado: Any?) {
        if (!estaCheia2()) {
            dados[--ponteiroTopo2] = dado
        } else {
            println("A pilha 2 está cheia")
        }
    }

    override fun desempilhar2(): Any? {
        var retorno: Any? = null
        if (!estaVazia2()) {
            retorno = dados[ponteiroTopo2++]
        } else {
            println("A pilha 2 está vazia")
        }
        return retorno
    }

    override fun topo2(): Any? {
        return if (!estaVazia2()) {
            dados[ponteiroTopo2]
        } else {
            println("A pilha 2 está vazia")
            null
        }
    }

    override fun estaCheia2(): Boolean {
        return ponteiroTopo2 == ponteiroTopo1
    }

    override fun estaVazia2(): Boolean {
        return ponteiroTopo2 == dados.size
    }

    override fun imprimir2(): String {
        var resultado = "["
        for (i in ponteiroTopo2 until dados.size) {
            resultado += if (i == dados.size - 1) "${dados[i]}" else "${dados[i]}, "
        }
        return "$resultado]"
    }
}
