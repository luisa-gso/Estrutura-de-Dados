interface Empilhavel{

    fun push(valor: Any?) // Esta função adiciona um dado à pilha. O parâmetro dado é do tipo Any?, o que significa que pode ser qualquer tipo, inclusive nulo.
    fun pop () :Any?    //Esta função remove e retorna o elemento do topo da pilha. O tipo de retorno é Any?, o que significa que pode retornar qualquer tipo, incluindo nulo.
    fun isEmpty(): Boolean //verificaçao se esta vazia
    fun isFull (): Boolean //verificaçao se esta cheia
    fun top ():Any?    // Esta função retorna o elemento do topo da pilha sem removê-lo. O tipo de retorno é Any?, o que significa que pode retornar qualquer tipo, incluindo nulo.


}
