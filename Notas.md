# o tipo dunha variable pode ser unha funcion, cousa que se indica `(tipo_valores_dos_parametros) => tipo_valor_de_retorno`
# ollo coa notacion de proc xa que se por erro a usamos non deixa usar o retorno dun valor
# podemos omitir o tipo da funcion se a asignamos a unha variavel e que scala infira o tipo con `_` se non como en scala podemos omitir os parenteses se non hai parametros e na chamada a funcion e pode dar lugar a ambiguedade digamos que é coma o operador de referencia a metodo de java `::`
# como en python ruby e perl podemos usar o * para multiplicar unha cadea xa que é un metodo engadido de string
# indicar o tipo dun parametro que é unha funcion podemolo facer de varias formas
	definicion do tipo
	func: valorParam => returnType  se so temos un parametro non é requerido o parentese
	func: (valorParam1 ... valorParamN) => returnType
	nome da funcion e parametros 
o parecer nas lambdas en scala os parenteses para indicar os parametros non son opcionais (na asignacion destas ollo)
o valor de retorno nas lambdas ou function literals indicamolo

podemos substituir os parametros da lambda ie: x => x.toString por _.toString podense usar tantas veces como parametros haxa ie: x,y => x*y _ * _
os placeholder hai que ter coidado con eles e a precendenza de operadores
en vez de pasar unha expresion lambda completa podemos omitir os parametros e usar os placeholders

	`def funMa(x:Int, y:Int,fun:(Int,Int)=> Int) = fun(x,y)`
	`funMa(2,3,_*_)`

ollo que na programacion funcional temos que ter en conta que pasamos so valores non variables

temos parametros opcionais coma en c# e temos parametros nomeados coma en c# tamen

temos as partial applied functions que é como asignar unha funcion a unha variable pasandolle parcialmente algun dos seus parametros pero non todos ie:

	def x(x:Int y:Int): Int = x*y
	var funcAlias = x(4,_:Int) //ollo que temos que indicarlle o tipo do valor que pasamos
danos a forza de asignar un literal dunha funcion a unha variable pero aplicandolle algun parametro
aqui vemos a vantaxe que ten poder dividir os parametros en grupos ie:
	def fun(x:Int)(y:Int):Int  = x*y
	var funcAlias = fun(4)(_:Int)

tamen podemos definir as lambdas con parametros agrupados

temos a opcion de que un parametro sexa by name é dicir que pode ser elecion do que chama pasar unha funcion ou un valor
temos que ter en conta que se non especificamos o generic devolve un any tanto nas clases coma nos metodos
as colecions basicas que temos son Set Map e List que herdan de Iterable
set colecion sen orde, map key => value, List Lista clasica
cada unha destas colecions que estan en scala.collection.Inmutable._ podemos usar sobre elas o map reduce foreach etc
e dicir funcions de high order ollo que as colecions inmutables non permiten modifiacar o contido, as operacions devolven unha nova colecion sen os elementos,
ie:
	List(2,3,5).drop(1) devolve unha nova colecion sen o elemento indicado
os Maps Key value indicanse asi, Key -> Value que o final non son mais que syntactic sugar de unha colecion de tuplas é un iterable que conten tuplas
os pares ou tuplas 2 aceptan a notacion de map ollo que coas tuple2 podemos facer dictionaries como en python é xenerica e pdoemos crear tuplas de tuplas,
esto é -> sirve para crear tuplas (ele1, ele2) equivalente a (ele1 -> ele2) equivalente a Tuple2(ele1, ele2)
en scala todo operador é un metodo pero dependendo do nome pode pasar que

	se ten como nome un caluqer caracter incluso un operador tipo `+` `obj operador param`
	se ten un nome acabado en `:` enton aplicase   `param operador: obj equivalente a obj.operador:(param)`
	ie:
	
		2 :: Nil
	ie2:
	
		class Probas(val v: String){
     			def ::(cadea: String): String = v + cadea
     		}
		new Probas("hola")
		res0: Probas = Probas@244038d0

		scala> "probas"  :: res0
		res1: String = holaprobas

	non é o tradicional non é que o Integer 2 teña un metodo cons se non que o dos é o parametro do metodo :: que é pasado a Nil
	que os operadores sexan metodos non quere dicir que non teña precedencia ou orde, etc
	un exemplo dos operadores right hand seria os unarios nos linguaxes tradicionais
ollo cos parametros das clases se non son val ou var so poden ser usados para
inicilizar fields
a hora de definir unha clase en scala o unico obirgatorio é class Nome
o corpo da clase e totalmente opcional
ollo que é moi interesante como se chama o constructor do pai na definicion
scala como java a primeira sentenza dun constructor ten que ser o this pero, a 
diferencia de java non é opcional a chamada o this para outro constructor
ademais que non podemos chamar a super porque xa se chama na declaracion da clase
temos que ter en conta que os parametros na declaracion da clase, influe se os
facemos var ou val seran mutaveis ou non, podemos facer setters e getters
ollo que podemos facer as clases non extensibles mediante sealed ou final
diferencia final non deixa extender unha clase ou trait
sealed deixa no mesmo arquivo de codigo
non temos en scala static, todo o que sexa static ten que ser declarado nun
companion object que non precisa de ser instanciado
