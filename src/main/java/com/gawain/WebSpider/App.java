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
//        controller.search();
        
        ArrayList<String> seeds = new ArrayList<String>();
//        seeds.add("http://www.humansa.com.hk/");
//        seeds.add("http://www.humansa.com.hk/mobile/tc/");
//        seeds.add("http://www.humansa.com.hk/tc/");
//        seeds.add("http://www.humansa.com.hk/mobile/en/");
//        seeds.add("http://www.humansa.com.hk/en/");
//        seeds.add("http://youtube.com");
        seeds.add("http://xh.5156edu.com");
        controller.search(seeds);
    }
}
