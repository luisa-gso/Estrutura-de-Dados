class Lista<Integer>(var tamanho: Int = 99){
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var quantidade = 0
    private var dados: Array<Int?> = arrayOfNulls(tamanho)

    fun isEmpty(): Boolean {
        return (quantidade == 0)
    }

    fun isFull(): Boolean {
        return (quantidade == dados.size)
    }

    fun anexar(dado: Int) {
        if (!isFull()) {
            ponteiroFim++
            if (ponteiroFim == dados.size) {
                ponteiroFim = 0
            }
            dados[ponteiroFim] = dado
            quantidade++
        } else {
            println("The list is full")
        }
    }

    fun selecionarTodos(): Array<Int?> {
        val dadosAux: Array<Int?> = arrayOfNulls(quantidade)
        if (!isEmpty()) {
            for (i in 0 until quantidade) {
                dadosAux[i] = dados[(ponteiroInicio+i) % dados.size]
            }
        }
        return dadosAux
    }

    fun selecionar(posicao: Int): Any? {
        var retorno: Int? = null
        if (!isEmpty()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                retorno = dados[posicaoFisica]
            } else {
                println("Invalid index")
            }
        } else {
            println("The list is empty")
        }
        return retorno
    }

    fun print(): String {
        var resultado = "["
        for (i in 0 until quantidade) {
            if (i == quantidade - 1) {
                resultado += "${dados[(ponteiroInicio+i) % dados.size]}"
            } else {
                resultado += "${dados[(ponteiroInicio+i) % dados.size]}, "
            }
        }
        return "${resultado}]"
    }

    fun atualizar(posicao: Int, dado: Int?) {
        if (!isEmpty()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                dados[posicaoFisica] = dado
            } else {
                println("Invalid index")
            }
        } else {
            println("The list is empty")
        }
    }

    fun inserir(posicao: Int, dado: Int?) {
        if (!isFull()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                var ponteiroAux = ponteiroFim + 1
                for (i in 0 .. quantidade - posicao) {
                    var anterior = ponteiroAux - 1
                    if (ponteiroAux == dados.size) {
                        ponteiroAux = 0
                    }
                    var atual = ponteiroAux
                    dados[atual] = dados[anterior]
                    ponteiroAux--
                    if (ponteiroAux == -1) {
                        ponteiroAux = dados.size - 1
                    }
                }
                dados[posicaoFisica] = dado
                ponteiroFim++
                if (ponteiroFim == dados.size) {
                    ponteiroFim = 0
                }
                quantidade++
            } else {
                println("Invalid index")
            }
        } else {
            println("The list is full")
        }
    }

    fun apagar(posicao: Int): Int? {
        var retorno: Int? = null
        if (!isEmpty()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                retorno = dados[posicaoFisica]
                var ponteiroAux = posicaoFisica
                for (i in 0 until quantidade - posicao) {
                    var atual = ponteiroAux % dados.size
                    var proximo = (ponteiroAux + 1) % dados.size
                    dados[atual] = dados[proximo]
                    ponteiroAux++
                }
                ponteiroFim--
                if (ponteiroFim == -1) {
                    ponteiroFim = dados.size - 1
                }
                quantidade--
            } else {
                println("Invalid index")
            }
        } else {
            println("The list is empty")
        }
        return retorno
    }

    fun toArray(): Array<Int?> {
        return dados.copyOf()
    }

}