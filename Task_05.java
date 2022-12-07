/**
 * Task_05 (Логирование. Использование. Основы)
 */
import java.util.logging.*;
public class Task_05 {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task_05.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Test logging");
        logger.info("Test logging");
    }
}
