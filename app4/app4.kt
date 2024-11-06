

fun main(){
    var func = contFuncCall()
    func() // never gonna give u up \n 1
    func() // never gonna give u up \n 2
    func() // never gonna give u up \n 3

    
    // println("got urself rickrolled: $num times")
}

fun contFuncCall(): () -> Unit{
    var num = 0;
    fun fun1(){
        num++;
        println("never gonna give u up: $num")
    }
    return ::fun1;
}

