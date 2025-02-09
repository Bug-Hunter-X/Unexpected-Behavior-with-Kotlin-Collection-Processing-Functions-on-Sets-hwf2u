fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result)
    //This will print [2, 4, 6, 8, 10]

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val result2 = map.map { it.key }
    println(result2)
    //This will print [a, b, c]

    val set = setOf(1, 2, 3, 4, 5)
    //If the order matters, convert the set to a list first
    val result3 = set.toList().map { it * 2 }
    println(result3) //This will print [2, 4, 6, 8, 10]. The order is preserved.
    
    //Alternatively, if order doesn't matter, use the set directly
    val result4 = set.map { it * 2 }.toSet()
    println(result4) //This will print [2, 4, 6, 8, 10]. The order might not be preserved, but that's OK.
} 