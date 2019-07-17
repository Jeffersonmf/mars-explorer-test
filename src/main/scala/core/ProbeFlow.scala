package core

import java.util.Scanner

import contracts.{ExecutorMovements}
import enums.Directions
import exception._
import model.{Probe, ProbePositioner}

object ProbeFlow {

  def startCalculation(scanner: Scanner, probePositioners: ProbePositioner): Unit = {

    System.out.println("Enter the X Position of Probe...:")
    var positionX: Int = scanner.nextInt()

    System.out.println("Enter the Y Position of Probe...:")
    var positionY: Int = scanner.nextInt()

    System.out.println("Enter the Directions of Probe (N|S|E|W)...:")
    var direction: String = scanner.next()

    System.out.println("Enter the Movements (L|R|M)...:")
    var stringMovings: String = scanner.next()

    var probe: Probe = new Probe(positionX, positionY, Directions.getByPositionLetter(direction))
    var movementsExecutor: ExecutorMovements = ExploringMarsEngine.createMoviments(stringMovings)

    try {
      probePositioners.probeMoviment(probe, movementsExecutor)
      System.out.println(String.format("Output...: %s %s %s", probe.getPositionX, probe.getPositionY, probe.getDirection.getPositionLetter))
    } catch {
      case (e: PositioningNotAllowedException) => {
        System.out.println("Movement not Allowed. " + e.getMessage())
      }
    }
    System.out.println()
  }
}

