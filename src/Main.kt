//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /// Polymorphism - > qayta ishlash override
    /// OverLoading -> bir xil nomli parametrlari xar xil


    val calculator = Calculator()
    println(calculator.add(4, 5))
    println(calculator.add(4.6, 5.4,8.0))
    println(calculator.add(4, 5, 6))
    println(calculator.add(4, 5, 6))

}