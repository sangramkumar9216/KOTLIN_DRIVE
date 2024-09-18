fun main(){
    for (i in 1 until 6){
        for (j in 1 until i ){
            print(" % ")
        }
        println()
    }
    for (i in 1 until 6){
        val number:Int = 5-i
        for (j in 1 until number ){
            print(" % ")
        }
        println()
    }
}