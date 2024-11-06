package post
import comment.*

class Post(val name: String = "default name", val content: String = "lorem ipsum etc") {

    var comments = mutableListOf<Comment>()

    fun show(){
        println(this.name)
        println(this.content)
        println()
        this.showComments()
    }

    fun showComments(){
        for (i in comments) {
            i.showComment()     
        }
    }

    /*init{
        posts.add(this)
    }

    companion object {
        var posts: MutableSet<Post> = mutableSetOf()
    }*/
}