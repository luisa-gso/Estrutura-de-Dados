class Fila: Enfileirar{

    private var elementos: Array<Any?>
    private var ultimo: Int
    private var primeiro:Int
    private var total: Int


    constructor(): this (10)
    constructor(valor: Int){
        primeira = 0 
        ultima = 0
        total = 0
    }

override fun inserir(dado: Any?){
   if(isFull()) {
    println("A fila esta cheia")
   }else{
    elementos[ultima]= dado
    ultima =[ultima + 1] % elementos.size
    total++
   }
}

override fun retirar(): Any?{
    
    
}

override fun isEmpty():Boolean{
    if (total ==0){
        println("A fila está vazia")
    }else{
        println ("A fila não está vazia")
    }
}

override fun isFull(): Boolean{
   if(total ==valores.size){
    println("A fila esta cheia")
   } else{
    println("A fila ainda não está cheia")
   }
}



}