object funcionalSideEffect{
  def main(args: Array[String]): Unit ={
    sideEffect(args)
  }
  //funcional xa que non usa var pero ten o side effect do print
  def sideEffect(args: Array[String]): Unit = args.foreach(println)
}
