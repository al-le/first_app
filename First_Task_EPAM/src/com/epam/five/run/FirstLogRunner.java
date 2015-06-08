package com.epam.five.run;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Created by aleks.levchenko on 25-May-15.
 */
public class FirstLogRunner {
    public final static Logger LOG = Logger.getLogger(FirstLogRunner.class);
    static {
        new DOMConfigurator().doConfigure("config/log4j.xml", LogManager.getLoggerRepository());
    }
}
