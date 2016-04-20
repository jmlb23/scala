//temos a posibilidade de engadir metodos a clases xa existentes
//sen modificar a clase xa que pode ser sealed ou final 
//como en c# os extension methods permiten que un obxeto engada funcionalidade
//nun namespace ou package dado que teriamos que importar
//teñen que estar nun trait, class ou object

object Improvements{
	//definimos unha clase que recibe o tipo a modificar
	implicit class ImproveInt(x: Int){
		/**
		*operador de potencia
		*@param valor Int 
		*/
		def **(valor: Int): Int = {
			x + valor
		}
	}

	def main(args: Array[String]): Unit = {
		println(2**2)
	}
}
