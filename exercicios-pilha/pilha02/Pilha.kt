class Pilha :Empilhavel{

    private var topo:Int
    private var elementos: Array<Any?>


    constructor() : this(10)

    constructor (valores: Int){
        elementos = arrayOfNulls(valores)
        topo = -1

    }
override fun push(valor: Any?){  //empilhar
    if (isFull()) {
        println("A pilha está cheia. Não é possível empilhar mais elementos.")
        return
    }else{
        topo ++
    elementos[topo] = valor
    }
    
}

override fun pop(): Any? { //desempilhar
   var retorno:Any? =null
    if (isEmpty()) {

        println("A pilha está vazia")  
    
    }else{
        retorno = elementos[topo]
        topo--
    }
    return retorno
}

override fun isEmpty(): Boolean { //esta vazia
    return topo == -1

}

override fun isFull(): Boolean{  //esta cheia
    return topo == elementos.size -1

}
override fun top():Any?{  // topo
return elementos[topo]
}
fun imprimir() {
    if (isEmpty()) {
        println("A pilha está vazia.")
        return
    }else{
         for (i in topo downTo 0) {
        println("${elementos[i]}")
    }

    }
   

}


}