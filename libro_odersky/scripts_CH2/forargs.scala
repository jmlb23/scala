//o for en scala ten esta sintaxe
//chamada for comprehension
//na que usamos unha variable para recorrer unha colecion
//un foreach clasico na que o elemento ten que ser un iterable
//a variable que se usa é sempre unha val xa que natureza funcional
//de scala implica que non se poida modificar
for(arg <- args){
  println(arg)
  arg = "hola" //se tentamos reasignar vai dar erro
              
}

//en realidade o for comprehension traducese a args.foreach(funcion)
