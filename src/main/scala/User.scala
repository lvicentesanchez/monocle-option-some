import monocle.Lens
import monocle.Macro._

case class User(name: String, pass: String)

object User {
  val _name: Lens[User, User, String, String] = mkLens[User, String]("name")
  val _pass: Lens[User, User, String, String] = mkLens[User, String]("pass")
}
