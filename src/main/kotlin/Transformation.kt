fun mapping() {
    val numbers = setOf<Int>(1, 2, 3, 4, 5, 6, 7)

    println(numbers.map { number ->
        if (number == 3) number * 3 else number
    })
    println(numbers.mapIndexedNotNull { index, value ->
        index + value
    })


    val numbersMap = mapOf<String, Int>("key 1" to 1, "key 2" to 2)
    // mapKeys
    println(numbersMap.mapKeys {
        it.key.uppercase()
    })
    //  mapValues
    println(numbersMap.mapValues {
        it.value + it.key.length
    })
    // map with arrow function
    println(numbersMap.mapKeys { t ->
        t.key + "CC"
    })
}

fun zipping() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")

    // zip
    println(colors.zip(animals))
    println(colors zip animals)
    println(colors.zip(animals) { color, animal ->
        animal.replaceFirstChar {
            it.uppercase()
        }
    })

    // unzipping
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3)
    println(numberPairs)
    println(numberPairs.unzip())

    // association
    // as a key
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith {
        it.length
    })

    // as a value
    println(numbers.associateBy {
        it.first().uppercase()
    })

    // with value transformation
    println(numbers.associateBy(
        keySelector = { it.first().uppercase() },
        valueTransform = {
            it.length
        }
    ))
}

fun flatten() {
    val numbers = listOf(setOf(1, 2), setOf(3, 4), setOf(5, 6))
    val flattenList = numbers.flatten()
    println(flattenList)
}

fun toStringify() {
    val numbers = listOf("One", "Two")

    // with curly braces for transformation {}
    println(numbers.joinToString { s -> "$s " })
    // with the braces ()
    println(numbers.joinToString())

    val listString = StringBuffer("The List Numbers:")
    // joinTo to join two lists
    println(numbers.joinTo(listString))

    // can have separator
    println(numbers.joinToString(separator = " <3 "))
    // prefix and postfix
    println(numbers.joinToString(separator = " <3 ", prefix = "prefix ", postfix = " postfix"))

    val numberint = (1..100).toList()
    // can limit with limit keyword
    println(numberint.joinToString(limit = 10))
    // and use truncate with truncated keyword
    println(numberint.joinToString(limit = 10, truncated = "<..>"))

    // the transform function with {}
    println(numbers.joinToString { "Element: ${it.lowercase()}" })

}

fun filtering() {
    //  for list
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val x = numbers.filter { t ->
        t > 4
    }
    println(x)

    // for map
    val numberMap = mapOf("k" to 1, "k1" to 2)
    val filterMap = numberMap.filter {
        it.key.endsWith(
            "1"
        ) && it.value < 5
    }
    println(filterMap)

    // filter with index
    val filterIndex = numbers.filterIndexed { index, value ->
        (index != 0) && (value < 3)
    }
    println("filter with index $filterIndex")

    // if condition is true, return false
    val filterNot = numbers.filterNot { t -> t > 3 }
    println("filter Not $filterNot")

    // filter is instance
    val mixedList = listOf(1, 2, 3, "a", "b", "c", "hello worrld", "alex", true, 3.4)
    // filterIsInstance<Type to filter>()
    mixedList.filterIsInstance<Boolean>().forEach {
        println(it)
    }
    // Partition
    // separate a list into two based on the condition
    val (match, unmatch) = numbers.partition {
        it < 3
    }
    println(match)
    println(unmatch)
}

fun predicateTest() {
    val numbers = listOf(1, 22, 4, 44, 6, 5, 7)
    //any
    var isAny = numbers.any {
        it == 3
    }
    println(isAny)
    //none
    isAny = numbers.none {
        it == 3
    }
    println(isAny)
    // all
    isAny = numbers.all {
        it == 3
    }
    println(isAny)

}

fun plusMinus() {
    val numbers = mutableListOf("obe", "two", "thrree")
    val plusList = numbers + "FIVE"
    val minusList = numbers - "obe"
    println("$numbers, $plusList, $minusList")
}

fun grouping() {
    val numbers = listOf("one", "two", "three", "four", "five")

    // groupBy{}
    println(numbers.groupBy { it.first().uppercase() })

    // groupBy with KeySelector and value
    println(numbers.groupBy(keySelector = {
        it.first()
    }, valueTransform = {
        it.uppercase()
    }))
}

fun retrieveCollectionPart(){
    val numbers= listOf("one", "two", "three","four","five","six")
    //slice
    println(numbers.slice(1..3))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(setOf(3,5,0 )))
    // take
    println(numbers.take(3))
    println(numbers.takeLast(3))
    // drop
    println(numbers.drop(3))
    println(numbers.dropLast(5))

    // takeWhile
    println(
        numbers.takeWhile {
            !it.startsWith("f")
        }
    )

    // takeLastWhile
    println(numbers.takeLastWhile {
        it !="three"
    })

    // dropWhile
    println(numbers.dropWhile {
        !it.startsWith("f")
    })
    // dropLastWhile
    println(
        numbers.dropLastWhile {
            it.contains("i")
        }
    )
    // chunked
    val chunkNumber =( 0..13).toList()
    println(chunkNumber.chunked(3))
    println(chunkNumber.chunked(3){
        it.sum()
    })

    // windowed
    println(numbers.windowed(3))
}

fun retrieveSingleElement(){

    val numbers= listOf("One","Two","Three","Four","Five")
    // element position
    println(numbers.elementAt(1))
    //first
    println(numbers.first())
    println(numbers.first{
        it.length<3
    })
    // last
    println(numbers.last())
    println(numbers.last{
        it.length<3
    })

    // random
    println(numbers.random())

    // isEmpty
    println(numbers.isEmpty())
}

fun aggregation(){
    val numbers= listOf(5,10,14,5,3,120)
    // sum
    println(numbers.sum())
    // count
    println(numbers.count())
    // average
    println(numbers.average())
    // max
    println(numbers.max())
    println(numbers.maxOrNull())
    // min
    println(numbers.min())
    println(numbers.minOrNull())

    // sumOf
    println(numbers.sumOf{
        it*2
    })
}
