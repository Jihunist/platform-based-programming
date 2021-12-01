package uk.epl.player;

public class Forward extends Player {
    private int ACCELERATION_POINT = 10;

    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber);
        this.abilities[SPEED] = speed;
        this.abilities[STAMINA] = stamina;
        this.abilities[PASSING] = passing;
    }

    @Override
    protected float getSpeed() {
        return super.getSpeed() + ACCELERATION_POINT;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Forward SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",
                getSpeed(), getStamina(), getPassing());
    }
}
