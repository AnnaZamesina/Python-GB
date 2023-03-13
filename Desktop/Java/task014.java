import java.util.logging.*;
import java.io.IOException;
public class task014 {
    public static void main(String[] args) throws IOException{
        Logger ll = Logger.getLogger(lg.class.getName());
        String logsPath = "log.txt";
        FileHandler fh = new FileHandler(logsPath, false);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        // XMLFormatter form = new XMLFormatter();
        fh.setFormatter(formatter);

        ll.log(Level.INFO,"element: " + i);
        ll.log(Level.WARNING, "logger off" );

        ll.info("test" );
        ll.warning("logsPath");
    

    }
}
