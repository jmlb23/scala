object Compose{
	def compose[A,B,C](f: B => C, g: A => B) : A => C = {
		//unha funcion que colle un parametro de tipo a
		//e retorna unha funcion f que colle un parametro de tipo B
		//que é a sua vez unha funcion que que colle un tipo A
		(a) => f(g(a))
	}

	//lambda en linea
	val x = (v:String) => println(v)

	def main(args: Array[String]) ={
		x("hola mundo")
	}
}
