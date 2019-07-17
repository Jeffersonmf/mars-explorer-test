package enums;

import model.Probe;
import model.ProbePositioner;

/**
 * The Direction Manager Routine
 *
 * @author Jefferson Marchetti Ferreira
 *
 */
public enum Directions {

    NORTH(1, "N") {
        @Override
        public boolean isValidMovement(Probe probe, ProbePositioner probePositioner) {
            return probe.getPositionY() < probePositioner.getLimitPositionY();
        }
    },
    SOUTH(-1, "S") {
        @Override
        public boolean isValidMovement(Probe probe, ProbePositioner probePositioner) {
            return probe.getPositionY() > 0;
        }
    },
    EAST(1, "E") {
        @Override
        public boolean isValidMovement(Probe probe, ProbePositioner probePositioner) {
            return probe.getPositionX() < probePositioner.getLimitPositionY();
        }
    },
    WEST(-1, "W") {
        @Override
        public boolean isValidMovement(Probe probe, ProbePositioner probePositioner) {
            return probe.getPositionX() > 0;
        }
    };

    static {
        NORTH.configDirections(WEST, EAST);
        SOUTH.configDirections(EAST, WEST);
        EAST.configDirections(NORTH, SOUTH);
        WEST.configDirections(SOUTH, NORTH);
    }

    public abstract boolean isValidMovement(Probe probe, ProbePositioner probePositioner);

    private Directions leftDirection;
    private Directions rightDirection;
    private final int incrementPosition;
    private final String positionLetter;

    Directions(int incrementPosition, String letter) {
        this.incrementPosition = incrementPosition;
        this.positionLetter = letter;
    }

    private void configDirections(Directions leftDirection, Directions rightDirection) {
        this.leftDirection = leftDirection;
        this.rightDirection = rightDirection;
    }

    public Directions getLeftDirection() {
        return leftDirection;
    }

    public Directions getRightDirection() {
        return rightDirection;
    }

    public int getIncrementPosition() {
        return incrementPosition;
    }

    public String getPositionLetter() {
        return positionLetter;
    }

    public static Directions getByPositionLetter(String letter) {

        for (Directions direction : Directions.values()) {

            if (direction.getPositionLetter().equalsIgnoreCase(letter)){
                return direction;
            }
        }

        return null;
    }
}