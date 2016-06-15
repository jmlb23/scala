
//Nil é unha lista valeira
//recordemos que o operador cons é de List non de Int
//se non rematamos con Nil non vai  saber onde esta o operador
//evaluase da seguinte forma de dereita a esquerda
//                <-     <-     <-
val oneTwoThree = 1 :: 2 :: 3 :: Nil
//usamos o operador cons sobre a lista valeira e agregamoslle un 3 temos List(3)
//idem e temos unha nova Lista List(2,3)
//idem e temos unha nova Lista List(1,2,3)
//sempre con operador cons crease no orde no que se escribe por iso a infix notation co operador cons
//facilita a lectura e saber como vai ser a lista
//ollo que nunca se modifica a lista so se devolve unha nova cada vez que chamamos a cons
//non é a forma mais optima xa que estamos xerando novos obxetos cada vez

println(oneTwoThree)
