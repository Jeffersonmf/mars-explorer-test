package actors

import contracts.{ExecutorMovements}
import exception._
import model.{Probe, ProbePositioner}

class MoveAhead extends ExecutorMovements {

  @throws[PositioningNotAllowedException]
  override def movementExecutor(probe: Probe, probePositioner: ProbePositioner): Unit = {

    if (probe.getDirection.isValidMovement(probe, probePositioner)) probe.move()
    else throw new PositioningNotAllowedException(probe, probePositioner)
  }
}
