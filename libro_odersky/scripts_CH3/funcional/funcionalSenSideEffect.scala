object funcionalSenSideEffect{
  def main(args: Array[String]): Unit = {
    senSide(args).foreach(println)
  }
  //no estilo funcional unha funcion que é Unit ou void
  //xeralmente e a que ten side effects que se consideran
  //que son dificiles de testear etc
  //pro exemplo un side effect é un valor que non podemos substituir pola chamada a funcion que o devolve
  //unha saida por pantalla é un side effect
  //unha escritura a bbdd ou ficheiro
  //porque non podemos substituir o que devolve a funcion pola operacion en si
  def senSide(args: Array[String]): String = args.mkString("\n")
}
