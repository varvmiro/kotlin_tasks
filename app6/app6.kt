fun main(){
    
    var (func, getCount) = contFuncCall/*(fun()*/{
        println("never gonna give u up")
    }
    func()
    func()
    func()
    print("got urself rickrolled: ")
    print(getCount())
    print(" times")


    // println("got urself rickrolled: $num times")
}



fun contFuncCall(callback: () -> Unit): Pair<() -> Unit, () -> Int>{
    var num = 0;
    return Pair(/*fun()*/{
        num++;
        callback();
    }, /*fun():Int{return*/{ num}); 
}