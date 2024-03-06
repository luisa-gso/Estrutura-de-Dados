public class PilhaDupla(tamanho: Int = 10) : EmpilhavelDupla {

    // variáveis globais (de instância)
    private var ponteiroTopo1: Int = 0
    private var ponteiroTopo2: Int = tamanho
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    // métodos auxiliares
    // no kotlin é obrigado o uso da palavra override  para mostrar que a funçao esta vindo de uma
    // implementação

    override fun empilhar1(dado: Any?) {
        if (estaCheia1()) {
            println("A pilha 1 está cheia")
        } else {
            dados[ponteiroTopo1++] = dado
        }
    }

    override fun desempilhar1(): Any? { // o any? apos os parenteses é o retorno
        var retorno: Any? = null
        if (!estaVazia1()) {
            retorno = dados[--ponteiroTopo1]
        } else {
            println("A pilha 1 está vazia")
        }
        return retorno
    }

    override fun imprimir1(): String {

        var resultado = "["
        for (i in ponteiroTopo1 downTo 0) {
            if (dados.size > ponteiroTopo1 && dados[i] != null) 
                    resultado += if (i == 0) "${dados[i]}" else "${dados[i]}, "
        }
        return "$resultado]"
    }

    // métodos principais
    // A ? na frente do any ou outro qualquer objeto diz que esse objeto aceita o retorno do valor
    // null

    override fun estaCheia1(): Boolean {
        return ponteiroTopo1 == ponteiroTopo2
    }

    override fun estaVazia1(): Boolean {
        return ponteiroTopo1 == 0
    }

    override fun topo1(): Any? {
        return if (!estaVazia1()) {
            dados[ponteiroTopo1 - 1]
        } else {
            println("A pilha 1 está vazia")
            null
        }
    }

    // pilha 2

    override fun imprimir2(): String {
        var resultado = "["
        for (i in ponteiroTopo2 until dados.size) {
            resultado += if (i == dados.size - 1) "${dados[i]}" else "${dados[i]}, "
        }
        return "$resultado]"
    }
    override fun empilhar2(dado: Any?) {
        if (!estaCheia2()) {
            ponteiroTopo2--
            dados[ponteiroTopo2] = dado
        } else {
            println("A pilha está cheia")
        }
    }
    override fun desempilhar2(): Any? { // o any? apos os parenteses é o retorno
        var retorno: Any? = null
        if (!estaVazia2()) {
            retorno = dados[ponteiroTopo2]
            ponteiroTopo2++
        } else {
            println("A pilha está vazia")
        }
        return retorno
    }

    // métodos principais
    // A ? na frente do any ou outro qualquer objeto diz que esse objeto aceita o retorno do valor
    // null

    override fun estaCheia2(): Boolean {
        return ponteiroTopo2 == ponteiroTopo1
    }

    override fun estaVazia2(): Boolean {
        return ponteiroTopo2 == dados.size
    }

    override fun topo2(): Any? {
        return if (!estaVazia2()) {
            dados[ponteiroTopo2]
        } else {
            println("A pilha 2 está vazia")
            null
        }
    }
}
