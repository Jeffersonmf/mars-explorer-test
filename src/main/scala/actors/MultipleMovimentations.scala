package actors

import contracts.ExecutorMovements
import model.{Probe, ProbePositioner}
import java.util

class MultipleMovimentations(_executionerMovements: util.LinkedList[ExecutorMovements]) extends ExecutorMovements {

  var executionerMovements = _executionerMovements

  override def movementExecutor(probe: Probe, probePositioners: ProbePositioner): Unit = {
    _executionerMovements.forEach(control => control.movementExecutor(probe, probePositioners))
  }
}