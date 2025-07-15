package org.example.ex2;

public class Time {
    private int time;
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int time) {
        this.time = time;
    }

    public void calculate() {
        this.hours = this.time / 3600;
        this.minutes = this.time / 60 % 60;
        this.seconds = this.time % 60;

        System.out.printf("%02d:%02d:%02d\n", this.hours, this.minutes, this.seconds);
    }

}
