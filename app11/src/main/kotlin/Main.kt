//3 класса в разных файлах, вызов через main:
//1) post: name, content, comments (no author)
//2) comment: author, post
//3) author/user: comments
import user.*
import post.*
import comment.*


fun main() {
    var post1 = Post("miku rulez!", "heck yeah, she does")
    var user1 = User("mikulover9000")
    var comment1 = Comment(post1, user1, "pingas")
    var post2 = Post("the game", "u lost it")
    var post3 = Post("life is hard","AITA for stealing my wife's last ritual knife")
    var user2 = User("an_absolute_menace")
    var user3 = User("7 foot rats")
    var user4 = User("three sardines in a trenchcoat")
    var comment2 = Comment(post3, user3, "i mss my wife, tails, i miss her a lot")
    var comment3 = Comment(post1, user4, "have you ever thought that we may be living in a simulaion")
    var comment4 = Comment(post1, user2, "ye, in a shitty one")
    var comment5 = Comment(post1, user1, "guys, dont derail, post 'bout miku-chan!! >.<")
    var comment6 = Comment(post1, user2, "no it isnt")
    var comment7 = Comment(post3, user4, "mss")
    var comment8 = Comment(post3, user2, "mss")
    var comment9 = Comment(post3, user1, "mss lol")
    var comment10 = Comment(post2, user2, "MAN")
    //println(post1.name)
    //println(user1.name)
    //println(comment1.content)
    //println("123")
    println("Welcome to your dash!")
    println("!-------------------------------------------!")
    post1.show()
    println("!-------------------------------------------!")
    post2.show()
    println("!-------------------------------------------!")
    post3.show()
    println("!-------------------------------------------!")
    
}
