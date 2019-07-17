package actors

import contracts.{ExecutorMovements}
import exception._
import model.{Probe, ProbePositioner}

class RightTurner extends ExecutorMovements {

  @throws[PositioningNotAllowedException]
  override def movementExecutor(probe: Probe, probePositioner: ProbePositioner): Unit = {

    probe.turnRight()
  }
}