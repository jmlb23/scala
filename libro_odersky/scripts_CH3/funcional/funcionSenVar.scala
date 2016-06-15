object funcionSenVar{
  def main(args: Array[String]): Unit = {
    procesa(args)
  }

  def procesa(args: Array[String]): Unit = for(arg <- args) println(arg)
}
