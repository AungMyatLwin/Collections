fun main(args: Array<String>) {
searchElement(28, mutableListOf(1,2,3,4,5,6,7,8,20,3,4,3,393,5,28,23,3,44,53,5,345,3,45,34,5,345))
    searchElementBinary(28, mutableListOf(1,2,3,4,5,6,7,8,20,3,4,3,393,5,28,23,3,44,53,5,345,3,45,34,5,345))
   val bs= binarySearch(28, mutableListOf(1,2,3,4,5,6,7,8,20,3,4,3,393,5,28,23,3,44,53,5,345,3,45,34,5,345))
    println(bs)
}
    fun col(){
    Collections.lists()
    Collections.sets()
    Collections.maps()
}
fun transformation(){
    mapping()
    zipping()
    flatten()
    toStringify()
    filtering()
    predicateTest()
    plusMinus()
    grouping()
    retrieveCollectionPart()
    retrieveSingleElement()
    aggregation()
    toCompare()
}

// linear search
private fun searchElement(searchedElement: Int, numbers:MutableList<Int>):Int{
    for(number in numbers){
        if(number==searchedElement){
            println(number)
            return number
        }

    }
    return -1
}

private fun searchElementBinary(searchedElement: Int, numbers:MutableList<Int>):Int{
    var low=0
    var high = numbers.size - 1
    var i=0
    while (low <= high){
        i++
        println("searched $i")
        val mid= (low + high ) / 2
         val cmp = numbers[mid]==searchedElement
        low = if(cmp<true){
            mid+1
        }else if(cmp>false){
            mid-1
        } else{
            return numbers[mid]
        }
    }
    return -1
}