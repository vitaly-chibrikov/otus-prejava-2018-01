package ru.otus;

import javax.management.*;
import java.lang.management.ManagementFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws Exception {
        System.out.println("Starting pid: " + ManagementFactory.getRuntimeMXBean().getName());

        SumServer server = new SumServer();

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("ru.otus:type=SumServer");
        mbs.registerMBean(server, name);

        server.run();

        //logExamples();
    }

    private static void logExamples() {
        System.out.println("Out hello!");
        System.err.println("Err hello!");

        logger.info("Main started");
        logger.log(Level.SEVERE, "File output error!");
    }
}
