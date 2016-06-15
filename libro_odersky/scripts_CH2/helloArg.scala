//nos scripts os statements ou declaracions executanse de maneira secuencial
//e como se estivesemos dentro dun main

//aceso os argumentos de liña de comandos mediante o array args
args.foreach(println)

//proba de concepto de que estamos dentro dun main
println(new Exception().getStackTrace().apply(1).getMethodName())
