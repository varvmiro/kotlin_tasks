fun main() {
    var arr: IntArray = intArrayOf(1, 2, 3, 4)
    var fiveCheck = fun(num: Int): Boolean{
        if (num == 5){
            return true;
        }
        else {return false}
    }
    var anyFives = arr.any(fiveCheck)
    println(anyFives)
    var vv = arr.map(fun(num: Int):Int {return num*2})
    println(vv)
    println(arr[0])

    // var myAnyFives = myAny(arr, fiveCheck)
}

fun myAny(arr: IntArray, callback: (Int) -> Boolean): Boolean{
    for (e in arr) {
        if (callback(e)==true)
            return true;        
    }
    return false;
}