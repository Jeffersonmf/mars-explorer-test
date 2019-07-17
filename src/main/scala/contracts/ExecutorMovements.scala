package contracts

import exception._
import model._

trait ExecutorMovements {

  @throws[PositioningNotAllowedException]
  def movementExecutor(probe: Probe, probePositioner: ProbePositioner): Unit
}
