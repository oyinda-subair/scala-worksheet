package oop.isp


trait CatBehavior {
  def mood: Any
  def hungry: Any
  def energy: Any
}

class CatService extends CatBehavior {
  def mood: Any = {}
  def hungry: Any = {}
  def energy: Any = {}
}

trait CatCommand {
  def moeow()
}

class CatTime extends CatBehavior with CatCommand {
  def mood: Any = {}
  def hungry: Any = {}
  def energy: Any = {}

  def moeow(): Unit = {}
}

trait DoorService {
  def isOpen
  def open
  def close
}

trait TimerDoorService {
  def closeAfterMinutes(duration: Int)
}

class Door extends DoorService {
  def isOpen = {}
  def open = {}
  def close = {}
}

class TimerDoor extends DoorService with TimerDoorService {
  def isOpen = {}
  def open = {}
  def close = {}

  def closeAfterMinutes(duration: Int) = {}
}

trait BearFeeder {
  def feedTheBear
}

trait BearWasher {
  def washTheBear
}

trait BearPetter {
  def petTheBear
}

class BearCarer extends BearWasher with BearFeeder {
  def washTheBear = {}
  def feedTheBear = {}
}

class BravePerson extends BearPetter {
  def petTheBear = {}
}