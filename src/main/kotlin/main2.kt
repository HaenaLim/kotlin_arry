// 첫번째 사람은 철수/남자/23살/철원
// 두번째 사람은 영희/여자/22살/남원
// 세번째 사람은 영수/남자/25살/진천

fun main() {
    val person1 = Person(1,"철수","남자",23,"철원")

    println(person1)




    val person2 = Person(2,"영희","여자",22,"남원")


    println(person2);



    val person3 = Person(3, "영수","남자",25,"진천")

    println(person3);



}

/**class Person(
var id :Int ,
var name :String,
var gender :String,
var age :Int ,
var hometown :String){//주생성자
fun introduceMsg(): String = "안녕하세요 저는 ${age}살,$name 입니다 저는 $hometown 출신입니다"

}*/


data class Person(
    var id :Int ,
    var name :String,
    var gender :String,
    var age :Int ,
    var hometown :String){//data주생성자필수
fun introduceMsg(): String = "안녕하세요 저는 ${age}살,$name 입니다 저는 $hometown 출신입니다"



}



// override fun toString(): String = "id: $id, name: $name, gender: $gender, age: $age, hometown: $hometown"//부모클래수있는거를 다시만들때(override)