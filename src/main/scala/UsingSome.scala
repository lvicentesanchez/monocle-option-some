import monocle.function.Each._
import monocle.std.option._
import monocle.syntax.lens._
import monocle.syntax.traversal._

object UsingSome extends App {
  import User._
  
  val user = Some(User("Luis", "Hack"))

  println(user |->> each |->> _name modify (_.toUpperCase))
}
