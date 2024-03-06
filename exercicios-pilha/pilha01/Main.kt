import PilhaEstatica
fun Main(){
       var pilha = PilhaEstatica(10)
       pilha.empilhar1("Instituto")
       pilha.empilhar1("Federal")
       pilha.empilhar2("Topo: $pilha.topo1()")
       pilha.empilhar1("De")
       pilha.empilhar2("Educação")
       pilha.empilhar2("Ciencia")
       val dadoQualquer1 = pilha.desempilhar1()
       pilha.empilhar1("e")
       pilha.empilhar2("Tecnologia")
      //  pilha.empilhar2(dadoQualquer2)
       pilha.empilhar2("De")
       println("Dados: ${pilha.imprimir1()}")
       println("Dados: ${pilha.imprimir2()}")
     
 }