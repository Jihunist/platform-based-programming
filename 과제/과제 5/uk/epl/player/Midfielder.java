package uk.epl.player;

public class Midfielder extends Player {
    private int PASSING_POINT = 10;

    public Midfielder(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber);
        this.abilities[SPEED] = speed;
        this.abilities[STAMINA] = stamina;
        this.abilities[PASSING] = passing;
    }
    @Override
    protected float getPassing() {
        return super.getPassing() + PASSING_POINT;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Midfielder SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",
                        getSpeed(), getStamina(), getPassing());
    }
}
