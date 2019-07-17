package model

import contracts._

class ProbePositioner(_limitPositionX: Int, _limitPositionY: Int) {

  var limitPositionX: Int = _limitPositionX
  var limitPositionY: Int = _limitPositionY

  def probeMoviment(probe: Probe, executorMovements: ExecutorMovements): Unit = {
    executorMovements.movementExecutor(probe, this)
  }

  def getLimitPositionX: Int = limitPositionX
  def getLimitPositionY: Int = limitPositionY
}





