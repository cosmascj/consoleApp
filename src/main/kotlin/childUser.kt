import com.sun.jdi.IntegerValue
import kotlin.time.TimeSource.Monotonic.toString
class Child(val name: String, val age:Int, phone:Int): User(name, age, phone){

    override fun createAccount() {
    println("This is the child section your guardian will supervise you henceforth: Enter a name")

        var name = readLine()
        println("Enter an age")
        var age = readLine()
        println("Enter a phone number")
            var phone = readLine()

    }

    }

