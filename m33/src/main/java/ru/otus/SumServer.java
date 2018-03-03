package ru.otus;

public class SumServer implements SumServerMBean {
    private static final String DEFAULT_MESSAGE = "sum(%d): %d";

    private String message = DEFAULT_MESSAGE;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void run() throws InterruptedException {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            sum = increment(sum, i);
            Thread.sleep(1000);
        }
    }

    private int increment(int sum, int i) {
        sum += i;
        System.out.println(String.format(message, i, sum));
        return sum;
    }
}
