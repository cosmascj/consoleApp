
    class Adult( val name: String, val age:Int, phone:Int ): User(name, age, phone) {

        override fun createAccount() {
           println("Enter your name")
            var name = readLine()
            println("Enter a password")
            var password = readLine()
            println("Enter your age")
            var age = Integer.valueOf(readLine())
            if (age > 18)
            println("You have successfully created an adult account")
            else{
                println("Not authorised, follow the next steps to have a child account")
                var child = Child("name",0,0)
                child.createAccount()
            }
            var user = User(name,age,phone = 0)
            var details: MutableList<String> = ArrayList()
            details.add("$name")
            details.add("$age")
            details.add("$password")

            userdetails.add("$details")
           var adultfunctions = Adultfunctions()
            adultfunctions.homePage()

        }
    }








