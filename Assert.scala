object Assert{
	def main(args: Array[String]) ={
		//é unha variable non mutavel
		val valor: Int = 5 //podemos elixir entre declarar explicitamente o tipo
		//como vemos var podemos reasignarla
		var valor2 = 5; //ou que scala o infira segundo o valor asginado
		//ollo porque scala é unha linguaxe con tipado estatico e forte ten inferencia de tipo pero o tipo queda ligado a variavel
		//assert como o seu nome di
		//asegurase de que a condicion se cumpla
		//do contrario da un erro de compilacion
		assert(valor==valor2)
		//erro de compilacion
		//valor=50
		valor2=50
	}
}
