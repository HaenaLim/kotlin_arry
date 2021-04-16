fun main(){
    println("==프로그램시작")

    println("숫자:")
    val numb0 = readLine()?.trim()?.toInt()/**?의미 널이 아니면 진행*/
    println("숫자:")
    val numb1 = readLine()!!.trim()?.toInt()/**!!의미 null값이 아닐거야*/
    println("숫자:")
    val numb2 = (readLine()?:"").trim()?.toInt()/**?:의미 널이 아니면 값이넣어지고 널이면 공백*/
    val numb3 = readLine()?.trim()?.toInt() ?: 0/**실패하면0을 넌다 */


}