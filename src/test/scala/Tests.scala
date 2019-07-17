import actors.MoveAhead
import enums._
import model.{Probe, ProbePositioner}
import org.scalatest._

class Tests extends FlatSpec with Matchers {

  /**
    * Some tests in Scala using native BDD and infix concepts.
    *
    * @author Jefferson Marchetti Ferreira
    *
    */

  it should "Change the direction of a Probe" in {
    import enums._

    val probe = new Probe(0, 0, Directions.NORTH)
    probe.turnLeft()
    probe.turnLeft()

    probe.getDirection should be(Directions.SOUTH)
  }

  it should "move a probe" in {

    val movements = new MoveAhead

    def probe = new Probe(0, 0, Directions.NORTH)

    val probePositioner = new ProbePositioner(2, 2)

    movements.movementExecutor(probe, probePositioner)
    movements.movementExecutor(probe, probePositioner)

    probe.getPositionX should be(0)
    probe.getPositionY should be(0)
  }

  it should "moving the Probe in the Direction the Probe is" in {
    val probe = new Probe(1, 2, Directions.EAST)

    probe.turnRight()
    probe.move()

    probe.getPositionX should be(1)
    probe.getPositionY should be(1)
  }

  it should "catching an exception" in {

    a[Exception] should be thrownBy {

      val movements = new MoveAhead

      val probe = new Probe(1, 1, Directions.WEST)
      val probePositioner = new ProbePositioner(3, 3)

      movements.movementExecutor(probe, probePositioner)
      movements.movementExecutor(probe, probePositioner)
      movements.movementExecutor(probe, probePositioner)
      movements.movementExecutor(probe, probePositioner)
    }
  }
}