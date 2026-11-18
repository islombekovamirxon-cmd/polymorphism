open class Animal(val name: String) {
    open fun show(color: String){
        println("Your name $name")
        println("Your color $color")
    }
}
