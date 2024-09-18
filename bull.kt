fun main(){
    val finishedHomework = true
    val cleanedRoom = true
    val passedMathExam = false
    val canPlayGames = finishedHomework && cleanedRoom
    val canEatSweets = finishedHomework && passedMathExam
    print(canPlayGames)
    print(canEatSweets)
}