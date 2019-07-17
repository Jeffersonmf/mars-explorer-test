package core

import java.util

import actors.{LeftTurner, MoveAhead, MultipleMovimentations, RightTurner}
import contracts.ExecutorMovements

/**
  * The Core Flowing Routine
  *
  *  @autor Jefferson Marchetti Ferreira
  */
object ExploringMarsEngine {

  def createMoviments(_movements: String): ExecutorMovements = {
    val movements = _movements.split("")
    val movementExecutors = new util.LinkedList[ExecutorMovements]

    for (move <- movements) {
      move match {
        case "L" =>
          movementExecutors.add(new LeftTurner)
        case "R" =>
          movementExecutors.add(new RightTurner)
        case "M" =>
          movementExecutors.add(new MoveAhead)
        case _ =>
      }
    }

    new MultipleMovimentations(movementExecutors)
  }
}
