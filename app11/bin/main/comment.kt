package comment
import post.*
import user.*

class Comment(val post: Post, val author: User, val content: String = "so anyway, i started commenting") {

    init{
        post.comments.add(this)//???
        author.comments.add(this)//???
    }

    fun showComment(){
        println(this.author.name)
        println(this.content) 
        println() 
    }

    /*init{
        if (Post.posts.contains post) {
            post.comments.add(this) //?
        }
        else{
            //??
        }

        if (User.users.contains author) {
            author.comments.add(this) //?
        }
        else{
            //??
        }
    }*/

}