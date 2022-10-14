package helpers;

public class Timer {
    private long start_time;
    private long end_time;

    public Timer() {
        this.start_time = 0;
        this.end_time = 0;
    }

    public void start() {
        this.start_time = System.currentTimeMillis();
    }

    public void stop() {
        this.end_time = System.currentTimeMillis();
    }

    public void getElapsedTime() {
        System.out.println("\nO Tempo Decorrido em Milisegundos é:");
        System.out.println(this.end_time - this.start_time);
    }
}
