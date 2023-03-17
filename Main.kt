fun main() {
    val n = readln().toInt()
    val numberList = mutableListOf<Int>()
    repeat(n) { numberList.add(readln().toInt()) }
    if (numberList == numberList.sorted()) println("YES") else println("NO")
}
