import core._
import model._
import java.util.Scanner

/**
  * The Main Unit of Solution and the Starter Pointer...
  *
  * @author Jefferson Marchetti Ferreira
  *
  */
object ExploringMarsApp {

  def main(args: Array[String]): Unit = {

    val scanner = new Scanner(System.in)

    System.out.println("Enter the Limit Position X...:")
    val limitPositionX = scanner.nextInt

    System.out.println("Enter the Limit Position Y...:")
    val limitPositionY = scanner.nextInt

    val probePositioners = new ProbePositioner(limitPositionX, limitPositionY)

    while (true) {

      ProbeFlow.startCalculation(scanner, probePositioners)
    }
  }
}
