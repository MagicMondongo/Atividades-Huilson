//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Digite sua operação")
    val op = readln().replace(" ", "")
    if(op.contains("+,-,*,/")){
        val soma = op.split("+")
        println(soma[0].toInt() + soma[1].toInt())
    }else if(op.contains("-")){
        val subtracao = op.split("-")
        println(subtracao[0].toInt() - subtracao[1].toInt())
    }else if(op.contains("*")){
        val multiplicacao = op.split("*")
        println(multiplicacao[0].toInt() * multiplicacao[1].toInt())
    }else if(op.contains("/")) {
        val divisao = op.split("/")
        println(divisao[0].toInt() / divisao[1].toInt())
    }
}