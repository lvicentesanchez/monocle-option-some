import monocle.function.Each._
import monocle.std.option._
import monocle.syntax.lens._
import monocle.syntax.traversal._

object UsingOption extends App {
  import User._
  
  val user: Option[User] = Option(User("Luis", "Pass"))

  println(user |->> each |->> _name modify (_.toUpperCase))
}
