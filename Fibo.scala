object Obxeto[T]{

	def fac(numero : Int) : Int ={
		if(numero==1) return 1
		numero * fac(numero-1)
	}

	//como definir unha lambda como tipo de parametro
	//poñemos o nome e o tipo dos argumentos que recive seguido do corpo de que o precede a arrow
	//os generics expresanse con []
	def [T] lam(numero: T,x:T => T) :T ={
		x(numero)
	}
	
	def main(args : Array[String]) : Unit = {
		println(fac(5)) //indicamos co [] o tipo e pasamos o valor da lonxitude
		
		println(lam(5,fac))
	}

	
}
//0,1,1,2,3,5,8,13,21,34
