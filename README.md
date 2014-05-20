monocle-option-some
===================

UsingOption.scala : if we create user as Option(User(...)), there is no problem.

UsingSome.scala : if we create user as Some(User(...)), we get an ambigous implicit values compile error:

>[error]  both method mapEach in trait EachInstances of type [K, V]=> monocle.function.Each[Map[K,V],V]
>[error]  and method optEach in trait EachInstances of type [A]=> monocle.function.Each[Option[A],A]
>[error]  match expected type monocle.function.Each[S,A]
>[error]   println(user |->> each |->> _name modify (_.toUpperCase))

We can solve the problem if we add the type to the user variable like this:

val user: Option[User]
