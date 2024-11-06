fun main(){
    println("start")
    var num = readln().toInt()
    println(fib(num));
}

fun fib(num: Int):Int{
    if (num<=2){
        return 1
    }
    return fib(num-1)+fib(num-2);
}