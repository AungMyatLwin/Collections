
// must implements Comparable to use Sorted function
data class Laptop(val brand:String, val year:Int, val price:Int):Comparable<Laptop>{
    override fun compareTo(other: Laptop): Int {
        return if (this.price > other.price){
            1
        } else if(this.price<other.price){
            -1
        } else{
            0
        }
    }

}

class ComparatorRam:Comparator<Laptop>{
    override fun compare(laptop1:Laptop, laptop2:Laptop): Int {
        return if(laptop1.price >laptop2.price){
            1
        }else if(laptop1.price<laptop2.price){
            -1
        } else{
            0
        }
    }
}

class ComparatorYear:Comparator<Laptop>{
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if(laptop1.year<laptop2.year){
            1
        }else if(laptop1.year>laptop2.year){
            -1
        }else{
            0
        }
    }
}