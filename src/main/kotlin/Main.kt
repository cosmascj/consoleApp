/*fun main() {

    println("Welcome to facebook please follow the process to create an account")

    val adult = Adult("x", 0, 0 )
    adult.createAccount()


 */
fun main() {


    var xArray = arrayListOf<String>("Mall", "Dennis", "max", " mracle", "peter", "james", "stanley")

    var hashmap = hashMapOf<String, Int>()

    for (i in xArray) {
        if (hashmap.contains(i)) {
            var value = hashmap.get(i)!!
            ++value
            hashmap.put(i, value)

        } else {
            hashmap.put(i, 1)
        }
    }

}

/*
fun main (){
    var squadMembers: ArrayList<String> = arrayListOf("Dubem","Stanley","Peter","Hakeem","Zino","Shak")
    var hashMap = HashMap<Int, ArrayList<String>>()

    squadMembers.groupBy { it.first() } // this first code; you can use it or the second one
    for (i in squadMembers){
        if (hashMap.containsKey(i.length)){
            var arrayOfValue = hashMap[i.length]
            arrayOfValue?.add(i)
        }
        else{
            val newList = arrayListOf<String>()
            hashMap.put(i.length, newList.apply { add(i) })
        }
    }
    println(hashMap)
 */





