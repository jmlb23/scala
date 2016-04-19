/**
*temos en scala varios tipos de estructuras de datos
* class objects traits
*/

class Proba(){}
//os object son complementos das clases dos que so existe unha instancia
//aqui usaremos e definiremos a loxica que non pertenza a instancia
object Proba{}
//os traits tamen existen en php neste caso en scala fan as funcions das interface

trait Probando{}


//** nin os traits nin os objects soportan parametros
//scala non ten enums serian objects que herdan de Enumeration
//o final as enums na programacion son clases non instanciveis, nas que existen
//unhas instancias dadas con
//:ie java
/*
final class Cores{
	public Cores BRANCO;
	public Cores NEGRO;

	private Cores(int cor){}
}
*/
//non ten porque extender o mesmo que a clase
object Cores extends Enumeration{
	val BRANCO = ""
	//nos objects podemos poñer calquer statement fora de funcions
	//como se automaticamente se transformase nun bloque static que
	//como en java so se chama cando se carga o tipo en memoria
	//que so é chamado na primeira chamada
	//ie:
	
	println("probas");
	println("probas");
	def hola = println("metodo")
}

object Main{
	def main(args: Array[String]):Unit = {
		Cores.hola
		println("segunda chamada "+"*"*30)
		Cores.hola
	}
}
