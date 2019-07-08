package oop.lsp

trait DogBehavior {
  def run
}

class RealDog extends DogBehavior {
  def run = println("run")
}

class ToyDog extends DogBehavior {
  val batteryPresent = true
  def run = {
    if(batteryPresent) println("run")
  }
}

object client {
  def runTheDog(dogBehavior: DogBehavior) = dogBehavior.run
}
