fun main() {
    println("How many numbers are you gonna input?")
    val n = readln().toInt()
    
    println("Type your numbers, one after the other.")
    val numberList = mutableListOf<Int>()
    repeat(n) { numberList.add(readln().toInt()) }
    
    if (numberList == numberList.sorted()) println("YES") else println("NO")
}
