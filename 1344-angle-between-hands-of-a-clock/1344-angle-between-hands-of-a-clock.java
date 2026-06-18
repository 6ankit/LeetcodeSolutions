class Solution {
    public double angleClock(int hour, int minutes) {
        double m = minutes * 6;
        double h = (hour % 12) * 30 + minutes * 0.5;

        double diff = Math.abs(h - m);

        return Math.min(diff, 360 - diff);
    }
}