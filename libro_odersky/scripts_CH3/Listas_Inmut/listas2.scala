//por defecto en scala usanse as collecions do package scala.collections.inmutable
val twoThree = List(2,3)

val oneTwoThree = 1 :: twoThree // non se invoca o metodo sobre o 1 se non que os metodos que se chamen xxx:  poden chamarse pola esquerda do obxeto
                                //para que de lugar a unha linguaxe mais lexible e natural
                                //o int non ten o metodo :: cons se non que en scala os metodos xxx: danos a liberdade de chamalos pola esquerda
                                //poderiamos usar obj.::(param) e funcionaria perfectamente pero é mais verboso
                                //como regla xeral toda funcion que como nome teña un caracter especial, como + - etc chamase de forma infixa 
                                //e dicir sen o punto e sen parentese sempre que so acepte un parametro
                                //se ten : pode ser chamado pola esquerda
println(oneTwoThree)
