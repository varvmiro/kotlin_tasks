fun main(){
    //println("Hello METANIT.COM")
    var nums = intArrayOf(5, 8, 2, 4, 22, 245, 68, 57942, 5);
    sort(nums)
}

fun sort(arr: IntArray){
    var min = 1000000000;
    var index_min = 0; 
    // for (index in arr.indices) {
    for (i in arr.indices) {
        min = 1000000000;
        // var i = index;
        for (j in i..(arr.size-1)) {

        // }
        // while(i<arr.size){
            if (arr[j] < min)
            {
                min = arr[j];
                index_min = j;
            }
            //i++;
        }
        arr[index_min] = arr[i];
        arr[i] = min;
        // arr[index_min] = arr[index];
        // arr[index] = min;
    }
    for (i in arr) {
        print("$i ")
    }
}