package oop.dip

trait ProcessorService {
  def process(list: List[String])
}

class TwitterProcessor {
  val myProcessor: ProcessorService = new Processors
  def processTweets = myProcessor.process(List("1", "2"))
}

class Processors extends ProcessorService {
  def process(list: List[String]) = process(list, true)
  def process(list: List[String], someCheck: Boolean) = {}
}
