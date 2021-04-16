

fun main(){
    var numbers = intArrayOf(3){0}

println("입력")

    //for(i in 0..numbers.size - 1)
    /**for(i in numbers.indices){
        println("${i+1}번째 숫자: ${numbers[i]}")
        numbers[i]= readLine()!!

    }*/

     for(number in numbers.indices){
         val i =0;
         i++
        println("${i+1}번째 숫자: ${numbers[i]}")
        numbers[i]=  readLine()!!.trim()?.toInt()
    }
    println("출력")

    println("입력된숫자:${numbers[0]}")
    println("입력된숫자:${numbers[1}")
    println("입력된숫자:${numbers[2]}")
}



/**fun main(args: Array<String>){//변수3개

    println("숫자:")
    val number1:Int= readLine()!!.toInt()
    println("숫자:")
    val number2:Int= readLine()!!.toInt()
    println("숫자:")
    val number3:Int= readLine()!!.toInt()


    println("입력한숫자 : ${number1} , ${number2}, ${number3}   ")

}**/


