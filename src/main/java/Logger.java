import java.util.Calendar;

public class Logger {

    protected int num = 1;

    protected long start;

    private static Logger logger=null;

    private Logger() {

        this.start = System.currentTimeMillis();

    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + num++ + "] "+ start+" - " + msg);
    }

    @Override
    public String toString() {
        return "Logger{" +
                "num=" + num +
                ", start=" + start +
                '}';
    }
}
