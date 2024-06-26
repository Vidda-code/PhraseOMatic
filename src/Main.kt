fun main() {

    //Array of random words
    val wordArray1 = arrayOf(
        "24/7",
        "multi-tier",
        "B-to-B",
        "dynamic",
        "pervasive"
    )
    val wordArray2 = arrayOf(
        "empowered",
        "leveraged",
        "aligned",
        "targeted"
    )
    val wordArray3 = arrayOf(
        "process",
        "paradigm",
        "solution",
        "portal",
        "vision"
    )

    //Get lengths of array
    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    //Random number generated
    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    //Putting it all together
    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
}