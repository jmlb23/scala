//as case clases é unha alternativa que xa fai por nos o companion object
//e incluso engade alguns metodos tanto o companion object como a clase
case class Probas(name: String)

//probando a case class
object Main{
	def main(args: Array[String]){
		//probas co companion object
		println("dende o companion "+Probas("hola"))
		//probas coa instancia da case class
		println("dende unha instancia da case class "+new Probas("hola"))
	}
}
