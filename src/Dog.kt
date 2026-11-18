class Dog(name: String): Animal(name) {
    override fun show(color: String){
        println("Dog's' name is $name")
        println("Dog's' color is $color")
    }
}