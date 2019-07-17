package exception

import model._

class PositioningNotAllowedException(probe: Probe, probePositioner: ProbePositioner) extends Exception {

  throw new Exception(String.format("Probe Position...: X: %s, Y: %s --- Coordinators Positions...: X: %s, Y: %s", probe.positionX, probe.positionY, probePositioner.limitPositionX, probePositioner.limitPositionY))
}
