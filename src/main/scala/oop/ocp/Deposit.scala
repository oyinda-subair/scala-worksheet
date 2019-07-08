package oop.ocp

import oop.model.Check

trait BankProcess {
  def deposit
  def withdraw
}

class Deposit {

  val checkList: List[Check] = List(Check(1, 3000.00, "GTB"), Check(2, 3040.00, "Zenith"), Check(3, 5040.00, "Zenith"))

  def confirmDeposit = for (check ← checkList) if (check.amount > 3000.00) contactBank else processDeposit

  def contactBank = {}

  def processDeposit = {}
}
