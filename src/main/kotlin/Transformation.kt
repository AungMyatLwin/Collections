fun mapping(){
    val numbers= setOf<Int>(1,2,3,4,5,6,7)

    println(numbers.map {
        number-> if(number==3) number*3 else number
    })
    println(numbers.mapIndexedNotNull{
        index, value ->   index+value
    })


    val numbersMap=mapOf<String, Int>("key 1" to 1, "key 2" to 2)
    // mapKeys
    println(numbersMap.mapKeys {
        it.key.uppercase()
    })
    //  mapValues
    println(numbersMap.mapValues {
        it.value + it.key.length
    })
    // map with arrow function
    println(numbersMap.mapKeys {
        t->t.key+"CC"
    })
}

fun zipping(){
    val colors = listOf("red", "brown","grey")
    val animals = listOf("fox","bear","wolf")

    // zip
    println(colors.zip(animals))
    println(colors zip animals)
    println(colors.zip(animals){
        color, animal -> animal.replaceFirstChar {
            it.uppercase()
    }
    })

    // unzipping
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3)
    println(numberPairs)
    println(numberPairs.unzip())

    // association
    // as a key
    val numbers = listOf("one","two", "three", "four")
    println(numbers.associateWith {
        it.length
    })

    // as a value
    println(numbers.associateBy {
        it.first().uppercase()
    })

    // with value transformation
    println(numbers.associateBy (
        keySelector = { it.first().uppercase()},
        valueTransform={
            it.length
        }
    ))
}