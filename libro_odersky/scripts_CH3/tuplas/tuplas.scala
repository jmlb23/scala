//en scala temos tuplas como na maioria de linguaxes funcionais
//temos por agora o limite de 22 elementos
//podemos acceder a elas pola notacion _nth
//o literal dunha tupla é (e1, e2 .. e22)
//podemos construila co literal ou co seu correspondete companion object
//Tuple2 to Tuple22

val tupla = (99, "Luftballons")
val tupla_non_literal = Tuple2(99,"Luftballons") //como vemos os generics infirense
val tupla_non_literal2 = Tuple2[Int,String](99,"Luftballons")

println("-------------------------------")
println(tupla._1)
println(tupla._2)
println("-------------------------------")
println(tupla_non_literal._1)
println(tupla_non_literal._2)
println("-------------------------------")

