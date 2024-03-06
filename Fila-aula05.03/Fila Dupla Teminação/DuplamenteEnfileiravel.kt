interface DuplamenteEnfileiravel{
    fun enfileirarInicio(dado: Any?)
    fun enfileirarFim (dado: Any?) //ja*
    fun desenfileirarInicio():Any? //ja*
    fun desenfileirarFim():Any? //verificar se esta vazia e  ponteiro de fim decrementa, 
    fun espiarInicio():Any? //ja *
    fun espiarFim():Any?
    fun atualizarInicio(novoDado:Any?) //ja *
    fun atualizarFim(novoDado: Any?)
    fun estaCheia(): Boolean //ja*
    fun estaVazia(): Boolean //ja*
    fun imprimir():Any? //ja *


}