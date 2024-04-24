package com.chriswininger;

import java.io.IOException;

import ch.qos.logback.core.net.HardenedObjectInputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        final HardenedObjectInputStream stream = new HardenedObjectInputStream(null, new String[]{});
        System.out.println( "Hello World!" );
    }
}
