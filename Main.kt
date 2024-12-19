/*fun List<String>.toBulletedList(): String
{
    val separator = "\n - "
    return this.map { it }.joinToString(separator, prefix = separator, postfix = "\n")
}*/

fun List<String>.toOrderedList(): String
{
    var index = 1
    return this.map { "\n${index++}. $it" }.joinToString(separator = "")
}

fun <T> List<T>.toBulletedList(): String
{
    val separator = "\n - "
    return this.map { it }.joinToString(separator, prefix = separator, postfix = "\n")
}

fun main()
{
    val names: List<String> = listOf("Bob", "Carol", "Ted", "Alice")
    println("Names: ${names.toBulletedList()}")
    println("Names: ${names.toOrderedList()}")
    val firstName = names.first()
    println(firstName)
    val numbers: List<Int> = listOf(100, 200, 300, 400, 500)
    println("Numbers: ${numbers.toBulletedList()}")
    val currency: List<Number> = listOf(1_000_000, 50.15, 3000, .4, .55)
    println("Currency: ${currency.toBulletedList()}")
    val things = mutableListOf<Any>(1, 2)
    things.add("Steve")
    println("Things: ${things.toBulletedList()}")
    val map = mapOf(
        Pair("one", 1),
        Pair("two", "II"),
        Pair("three", 3.0f)
    )
    val valuesForKeyWithE = map.keys
        .filter { it.contains("e") }
        .map { "Value For $it: ${map[it]}" }
    println("Values for keys with E: $valuesForKeyWithE")
}