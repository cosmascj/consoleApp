import com.sun.jdi.IntegerValue
class Adultfunctions () {
    val post: MutableList<String> = ArrayList()

    fun homePage() {
        // The Home page will serve as a dashboard where user reverts back to

        println("To add your friends on facebook press 1")
        println("To make a post press 2")
        println("To make a flag post press 3")
        println("To make a Ban an account press 4")
        println("To edit post press 5")
        println("To View all the posts made press 6")
        println("To edit a post press 7")
        var action = Integer.valueOf(readLine())

        when (action) {
            1 -> addFriends()
            2 -> createPost()
            3 -> flagPost()
            4 -> banAccount()
            5 -> editPost()
            6 -> viewposts()
            7 -> deletepost()
            8 -> logout()

            else -> {
                println("You must choose a number from 1 to 8")
                homePage()
            }
        }
    }

    fun addFriends() {
        // This is expected to retrieve a repository names associated with the account

    }
    fun createPost() {
        val tempPosts: MutableList<String> = ArrayList()
        println("make a post")
        var postdetails = readLine()
        tempPosts.add("$postdetails")
        post.add("$tempPosts")
        homePage()
    }

    fun flagPost() {
        for (i in 0..post.size - 1) {
            var postView = post[i]
            println("$postView ID $i")
        }
        println("Enter the Id to be flagged")
        var id = Integer.valueOf(readLine())
        var flagPost: MutableList<String> = ArrayList()
        flagPost.add("$post")
        homePage()
    }

    fun banAccount() {
    }

    fun editPost() {
        val tempPosts: MutableList<String> = ArrayList()
        println("Edit a post")
        for (i in 0..post.size - 1) {
            var postView = post[i]
            println("$postView ID $i")

        }
        println("Add the posts ID")
        var postIdDetails = Integer.valueOf(readLine())
        println("make the edit")
        var postEdit = readLine()

        tempPosts.add("$postEdit")
        post.set(postIdDetails, "$tempPosts")
        println("your edit has been noted")
        homePage()
    }

    fun viewposts() {
        for (i in 0..post.size - 1) {
            var postView = post[i]
            println("$postView ID $i")
            homePage()
        }
    }

    fun deletepost() {

        val tempPosts: MutableList<String> = ArrayList()
        println("You want to delete a post")
        for (i in 0..post.size - 1) {
            var postView = post[i]
            println("$postView ID $i")

            println("select an ID to delete")
            var idDelete = Integer.valueOf(readLine())
            tempPosts.removeAt(idDelete)
            println("You selected post, $idDelete has been deleted ")
            homePage()

        }
    }

    fun logout(){

        return homePage()
    }

    private fun <E> MutableList<E>.add(index: E, element: E) {

    }
}


