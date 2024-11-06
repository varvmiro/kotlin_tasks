fun main() {
    println(sum(4)(3)) // 7
    print(sum(6)(2))
}

fun sum(num: Int): (Int) -> Int{
    return fun(num2: Int): Int{return num+num2};
}