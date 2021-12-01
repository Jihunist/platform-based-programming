package uk.epl.player;

public class Defender extends Player {
    private int STRENGTH_POINT = 10;

    public Defender(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber);
        this.abilities[SPEED] = speed;
        this.abilities[STAMINA] = stamina;
        this.abilities[PASSING] = passing;
    }

    @Override
    protected float getStamina() {
        return super.getStamina() + STRENGTH_POINT;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Defender SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",
                        getSpeed(), getStamina(), getPassing());
    }
}
