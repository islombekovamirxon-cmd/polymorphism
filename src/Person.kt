open class Person(val gender: String) {
    open fun show(name: String,age: Int){
        println("My Gender $gender")
        println("My name is $name")
        println("I'm $name yers old")
    }
}