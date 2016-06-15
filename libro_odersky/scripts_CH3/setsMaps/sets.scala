import scala.collection.mutable.{Set => mutable}
import scala.collection.immutable.{Set => immutable} //podemos usar alias para os imports

//object probas{
  //def main(args: Array[String]):Unit = {

    println("-----------------------------")
    //ollo co var 
    var j = mutable("Boeing", "Airbus")
    j += "proba"
    println(j)

    println("-----------------------------")
    //ollo que se usamos unha colecion inmutable e é un var
    //e usamos += non usamos o metodo de += de Set se non que reasignamos a variable
    //xa que non ten o scala.collection.immutable.Set o +=
    //usa o mais e convinao co igual
    var j2 = scala.collection.immutable.Set("Boeing", "Airbus")
    j2 += "proba"
    println(j2)
    
//  }
//}
