class Cat(name: String) : Animal(name) {
    override fun show(color: String) {
        println("Cat's name is $name")
        println("Cat's color is $color")
    }
}