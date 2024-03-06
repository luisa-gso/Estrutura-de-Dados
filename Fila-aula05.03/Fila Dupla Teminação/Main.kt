fun main(){
    var FilaDupla = FilaDupla(5)
    FilaDupla.enfileirarInicio(1)
    FilaDupla.enfileirarFim(2)
    FilaDupla.enfileirarInicio(3)
    FilaDupla.enfileirarInicio("A")
    FilaDupla.enfileirarFim("B")
    FilaDupla.enfileirarFim("C")
    println(FilaDupla.imprimir())
    println(FilaDupla.espiarInicio())
    println(FilaDupla.espiarFim())
}

