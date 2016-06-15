import scala.io.Source

object Lee{
  def main(args: Array[String]): Unit = {
    if(args.length > 0){
      Source.fromFile(args(0)).getLines().foreach(liña => println(liña.length+ " "+ liña))
    }else{
      Console.err.println("Usage:\nscala Lee archiveName")
    }
  }
}
