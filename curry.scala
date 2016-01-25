object cury{
	def curry[A,B,C](f:(A,B)=>C): A=>(B=>C) = {
		(a: A) => b:B=>f(a,b)
	}

	def main(args: Array[String]) = {
		println(curry(1,"asda"=>2.5))
	}

}
