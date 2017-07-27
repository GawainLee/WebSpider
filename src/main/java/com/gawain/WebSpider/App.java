package com.gawain.WebSpider;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Controller controller = new Controller();
        ArrayList<String> seeds = new ArrayList<String>();
        seeds.add("www.youtube.com");
        controller.search(seeds);
    }
}
