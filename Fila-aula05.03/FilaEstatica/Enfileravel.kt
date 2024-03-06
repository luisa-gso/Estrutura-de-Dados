interface Enfileravel{

    fun enfileirar(dado: Any?) //inserir um dado 
    fun desenfileirar (): Any?  // retirar um dado 
    fun espiar(): Any?
    fun atualizar(dado: Any?)
    fun estaCheia(): Boolean // se esta vazia
    fun estaVazia():Boolean // se esta cheia
    fun imprimir():String
  

}
    