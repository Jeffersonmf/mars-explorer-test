package model

import enums._

class Probe(_positionX: Int, _positionY: Int, _startDirection: Directions) {

  var direction: Directions = _startDirection
  var positionX = _positionX
  var positionY = _positionY

  def turnLeft(): Unit = {
    direction = direction.getLeftDirection
  }

  def getDirection: Directions = direction

  def turnRight(): Unit = {
    direction = direction.getRightDirection
  }

  def move(): Unit = {
    if (Directions.EAST == direction || Directions.WEST == direction) positionX += direction.getIncrementPosition
    else positionY += direction.getIncrementPosition
  }

  def getPositionX: Int = positionX

  def getPositionY: Int = positionY

}
