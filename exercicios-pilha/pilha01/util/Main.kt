fun main() {
  println("=======================================================")
  println("PILHA ESTATICA")
  var PilhaEstatica = PilhaEstatica(10)
  PilhaEstatica.empilhar1("0")
  PilhaEstatica.empilhar1("1")
  PilhaEstatica.empilhar1("2")
  PilhaEstatica.empilhar1("3")
  PilhaEstatica.empilhar1("4")
  PilhaEstatica.empilhar1("5")
  PilhaEstatica.empilhar1("6")
  PilhaEstatica.empilhar1("7")
  PilhaEstatica.empilhar1("8")
  PilhaEstatica.empilhar1("9")
  println("Pilha=${PilhaEstatica.imprimir1()}") // Imprime a pilha
  println("Seu topo é: ${PilhaEstatica.topo1()}") // Imprime o topo
  PilhaEstatica.desempilhar1()
  println("Pilha=${PilhaEstatica.imprimir1()}") // Imprime a pilha
  println("Seu topo é: ${PilhaEstatica.topo1()}") // Imprime o topo
  PilhaEstatica.desempilhar1()
  println("Pilha=${PilhaEstatica.imprimir1()}") // Imprime a pilha
 
 



  println("=======================================================")
  println("PILHA DUPLA")
  var pilha = PilhaDupla(11)
  pilha.empilhar1("0")
  pilha.empilhar1("1")
  pilha.empilhar1("2")
  pilha.empilhar1("3")
  pilha.empilhar1("4")
  println("Pilha 1 =${pilha.imprimir1()}") // Imprime a pilha 1
  pilha.empilhar2("9")
  pilha.empilhar2("8")
  pilha.empilhar2("7")
  pilha.empilhar2("6") 
  println("Pilha 2 =${pilha.imprimir2()}") // Imprime a pilha 2,
  println("Topo 1: ${pilha.topo1()}")
  println("Topo 2: ${pilha.topo2()}")


  
 println("=======================================================")
  println("PILHA INVERTIDA")

 var PilhaInvertida = PilhaInvertida(10)
 PilhaInvertida.empilhar1("1")
 PilhaInvertida.empilhar1("2")
PilhaInvertida.empilhar1("de")
PilhaInvertida.empilhar1("Educação")
PilhaInvertida.empilhar1("Ciência")
println(PilhaInvertida.imprimir1())
println(PilhaInvertida.topo1())
PilhaInvertida.empilhar2("1")
 PilhaInvertida.empilhar2("2")
PilhaInvertida.empilhar2("de")
PilhaInvertida.empilhar2("Educação")
PilhaInvertida.empilhar2("Ciência")
println(PilhaInvertida.imprimir2())
println(PilhaInvertida.topo2())

      

}
