import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class temp implements Runnable {
    private Thread T;
    private String threadname;

    temp(String threadname) {
        this.threadname = threadname;
    }

    public void run() {
        while (true) {
            System.out.println(threadname);
        }
    }

    public void start() {
        if (T == null) {
            T = new Thread(this, threadname);
            T.start();
        }
    }

}
