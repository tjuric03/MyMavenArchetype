package $package;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{
    public static final Logger Log = LogManager.getLogger();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Log.info("Testing the logger");
    }
}
