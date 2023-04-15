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

fun flatten(){
    val numbers = listOf(setOf(1,2), setOf(3,4), setOf(5,6))
    val flattenList= numbers.flatten()
    println(flattenList)
}

fun toStringify(){
    val numbers = listOf("One","Two")

    // with curly braces for transformation {}
    println(numbers.joinToString { s-> "$s " })
    // with the braces ()
    println(numbers.joinToString())

    val listString=StringBuffer("The List Numbers:")
    // joinTo to join two lists
    println(numbers.joinTo(listString))

    // can have separator
    println(numbers.joinToString (separator = " <3 "))
    // prefix and postfix
    println(numbers.joinToString (separator = " <3 ", prefix = "prefix ", postfix = " postfix"))

    val numberint=(1..100).toList()
    // can limit with limit keyword
    println(numberint.joinToString(limit=10))
    // and use truncate with truncated keyword
    println(numberint.joinToString(limit=10, truncated = "<..>"))

    // the transform function with {}
    println(numbers.joinToString { "Element: ${it.lowercase()}" })

}

fun filtering(){
    //  for list
    val numbers=listOf(1,2,3,4,5,6,7)
    val x = numbers.filter{
        t-> t>4
    }
    println(x)

    // for map
    val numberMap= mapOf("k" to 1, "k1" to 2)
    val filterMap = numberMap.filter { it.key.endsWith(
        "1"
    ) && it.value < 5 }
    println(filterMap)

    // filter with index
    val filterIndex= numbers.filterIndexed{
        index, value -> (index!=0) && (value<3)
    }
    println("filter with index $filterIndex")

    // if condition is true, return false
    val filterNot = numbers.filterNot{ t->t>3 }
    println("filter Not $filterNot")

    // filter is instance
    val mixedList = listOf(1,2,3, "a","b","c", "hello worrld", "alex", true, 3.4)
    // filterIsInstance<Type to filter>()
    mixedList.filterIsInstance<Boolean>().forEach{
        println(it)
    }

}