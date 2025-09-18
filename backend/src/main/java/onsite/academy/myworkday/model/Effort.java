package onsite.academy.myworkday.model;

public enum Effort {
    ONE_HOUR(1),
    TWO_HOURS(2),
    FOUR_HOURS(4);

    private final int hours;

    Effort(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return this.hours;
    }
}