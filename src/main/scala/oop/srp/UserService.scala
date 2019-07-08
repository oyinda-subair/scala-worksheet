package oop.srp

trait UserService {
  def changeEmail: Unit
}

class UserCommand extends UserService {
  def changeEmail: Unit = {
    checkAccess match {
      case Some(_) ⇒ println("User is authorized")
      case None ⇒ println("not authorized")
    }
  }

  def checkAccess: Option[Any] = None
}
