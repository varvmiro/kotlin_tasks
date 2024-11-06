fun main(){
    var (func, getCount) = contFuncCall()
    func() // never gonna give u up \n 1
    func() // never gonna give u up \n 2
    func() // never gonna give u up \n 3
    print("got urself rickrolled: ")
    print(getCount())
    print(" times")


    // println("got urself rickrolled: $num times")
}

fun contFuncCall(): Pair<() -> Unit, () -> Int>{
    var num = 0;
    fun fun1(){
        num++;
        println("never gonna give u up")
    }
    fun getNum():Int{
        return num;
    }
    val pair = Pair(::fun1, ::getNum)
    return pair; 
}