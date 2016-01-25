object Uncurry{
			//na lambda o nome do primeiro parametro
			//co seu tipo é o nome da funcion
			//ou mais ben é o nome da funcion
			//co tipo de valor que recolle
	def uncurry[A,B,C](f: A=> B=>C): (A,B) =>C = {
		//unha funcion que recolle dous parametros e
		//devolve o resultado dunha funcion dunha funcion
		(a, b) => f(a)(b)
	}
}
