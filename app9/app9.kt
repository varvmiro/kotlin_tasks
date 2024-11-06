fun main() {
    var arr: Array<Int> = arrayOf(1,2,5,5,8,8,7,7,7,99,525,3,6,2,1,555,888)
    var arr2: Array<Int> = unique(arr);
    for (i in arr2) {
        print("$i ")
    }
}

fun unique(arr: Array<Int>): Array<Int>{
    var arr2 = arr.toSet();
    var arr3 = arr2.toTypedArray();

    return arr3;
}