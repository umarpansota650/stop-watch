

public class Stopwatch {
    private long startTime;
    private long stopTime;
    private boolean running;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    public void reset() {
        this.startTime = 0;
        this.stopTime = 0;
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = System.currentTimeMillis() - startTime;
        } else {
            elapsed = stopTime - startTime;
        }
        return elapsed;
    }

    public String getFormattedElapsedTime() {
        long elapsed = getElapsedTime();
        long milliseconds = (elapsed % 1000) / 10;
        long seconds = (elapsed / 1000) % 60;
        long minutes = (elapsed / (1000 * 60)) % 60;
        long hours = (elapsed / (1000 * 60 * 60)) % 24;
        return String.format("%02d:%02d:%02d:%02d", hours, minutes, seconds, milliseconds);
    }
}
