val oneTwo = List(1,2) //usamos o companion object que a sua vez ten un metodo apply que funciona como unha factory
val threeFour = List(3,4)

val oneTwoThreeFour = oneTwo ::: threeFour //usamos o operador de concatenar listas que se invoca de forma infixa pero poderia ser threeFour.:::(oneTwo)

println(oneTwo + " and "+ threeFour +" non foron mutadas")

println(oneTwoThreeFour)
