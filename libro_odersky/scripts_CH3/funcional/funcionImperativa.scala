object FuncionImperativa{
  def main(args: Array[String]): Unit = {
    procesaArgs(args)
  }
  //imperativo porque mutamos unha variable
  //e servimonos dela e indicamos instrucion a intruccion como facelo
  def procesaArgs(args: Array[String]): Unit = {
    var indice = 0
    while(indice < args.length){
      println(args(indice))
      indice += 1
    }
  }
}
