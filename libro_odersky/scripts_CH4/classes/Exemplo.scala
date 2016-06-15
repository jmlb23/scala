/**
 *En scala temos dous tipos de estructuras para encapsular
 *as clases que precisamos instaciar para usar
 *os objects que son unha instancia singleton da clase que fan a funcion de ter toda a loxica de comun a clase que non necesita ser instanciada
 *
 *
 *
 */


object Main{
  //o main ten que estar nun object porque como en java pertence o metodos de clase
  def main(args: Array[String]): Unit = {
    //se temos un constructor por defecto ou sen parametros podemos omitir as parenteses
    val p1 = new Persoa
    p1.nome = "Antonio"
    val p2 = new Persoa
    p2.nome= "Xoan"

    println(p1)
    println(p2)
    //eq dinos se é a mesma referencia
    println(p1 eq p2)

    println("_______________________________________________________")
    println("POC de que os object son un singleton")
    //para aceder a un obxeto non usamos new xa que é unha instancia
    //se temos un val non podemos reasignar a variable xa que non é mutavel
    val p21 = Persoa2
    p21.nome = "Antonio"
    val p22 = Persoa2
    p22.nome= "Xoan"

    println(p21)
    println(p22)
    //eq dinos se é a mesma referencia
    println(p21 eq p22)

    println(metodo(5))
  }
  
  def metodo(arg: Any) = {
    //arg = "adasd" // da erro porque os parametros dos metodos nun linguxe funcional non ten sentido modificalos
                  //si mutar o estado pero non reasignalos
    //se non poñemos nada no tipo de retorno e devolvemos distintos tipos o valor retornado sera Any que é parecido a object en java
    

    if(arg.isInstanceOf[String]) "É un String"
    else if(arg.isInstanceOf[Int]) arg
  }
}

class Persoa(){
  //se non poñemos nada en scala por defecto é public
  //temos os mesmos accesores que en java public private e protected non temos o por defecto ou package xa que podemos facelo co private[escope]
  var nome = "Un nome Xenerico"
  
  override def toString(): String = {
    //a ultima expresion é o retorno do metodo non fai falla poñer return
    //ainda que se pode, onde esta prohibido é nas lambdas
    nome
  }
}

object Persoa2{
  var nome = "Un nome comun"
  //os tipos nos metodos infirense no retorno excepto nos recursivos
  //pero o parametro é obrigado especificalo
  override def toString(): String = {
    nome
  }
}
