fun main() {
    var arr: IntArray = intArrayOf(2,1,7,8)
    print("ur num: ")
    var num = readln().toInt()
    println(fun1(arr, num))
}

fun fun1(arr: IntArray, num: Int): Boolean{
    var number = num;
    var arr2 = arr.toSet();
    var var1 = arr2.find(fun(num: Int): Boolean {
        return arr2.contains(number-num)
        /*for (i in arr2) {
            println("$num, $i")
            if ((num+i==number) and (num!=i)) {return true}            
            }
            return false*/
        })   
    if (var1==1){return true}
    else {return false}
}