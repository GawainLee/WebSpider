package com.gawain.WebSpider;

import java.util.Set;
import java.util.regex.Pattern;

import org.apache.http.Header;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;

public class MyCrawler extends WebCrawler {
	  
    private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|gif|jpg|png|mp3|ico|mp4|zip|gz))$");
//    private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|gif|))$");
    /**
     * This method receives two parameters. The first parameter is the page
     * in which we have discovered this new url and the second parameter is
     * the new url. You should implement this function to specify whether
     * the given url should be crawled or not (based on your crawling logic).
     * In this example, we are instructing the crawler to ignore urls that
     * have css, js, git, ... extensions and to only accept urls that start
     * with "http://www.ics.uci.edu/". In this case, we didn't need the
     * referringPage parameter to make the decision.
     */
     @Override
     public boolean shouldVisit(Page referringPage, WebURL url) {
         String href = url.getURL().toLowerCase();// 得到小写的url
         System.out.println("URL : " + href);
         System.out.println("URL Strar With : " + ((!FILTERS.matcher(href).matches()) && href.startsWith("http://www.humansa.com.hk/")));
         // 只接受 http://www.humansa.com.hk/ 开头的url
//         return true;
         return (!FILTERS.matcher(href).matches())//;
//                && href.startsWith("http://www.humansa.com.hk/");
         		&& href.startsWith("http://xh.5156edu.com/");
//         && (href.startsWith("http://www.youtube.com/") || href.startsWith("https://www.youtube.com/"));
     }
  
     /**
      * This function is called when a page is fetched and ready
      * to be processed by your program.
      */
     @Override
     public void visit(Page page) {
//         String url = page.getWebURL().getURL();
//         System.out.println("URL: " + url);
    	 int docid = page.getWebURL().getDocid(); // 获取docid url的唯一识别 类似主键
         String url = page.getWebURL().getURL();  // 获取url
         String domain = page.getWebURL().getDomain(); // 获取域名
         String path = page.getWebURL().getPath();  // 获取路径 
         String subDomain = page.getWebURL().getSubDomain(); // 获取子域名
         String parentUrl = page.getWebURL().getParentUrl(); // 获取上级Url
         String anchor = page.getWebURL().getAnchor(); // 获取锚点
  
         System.out.println("docid:"+docid);
         System.out.println("url:"+url);
         System.out.println("domain:"+domain);
         System.out.println("path:"+path);
         System.out.println("subDomain:"+subDomain);
         System.out.println("parentUrl:"+parentUrl);
         System.out.println("anchor:"+anchor);
  
         if (page.getParseData() instanceof HtmlParseData) {
             HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
             String text = htmlParseData.getText();
             String html = htmlParseData.getHtml();
             Set<WebURL> links = htmlParseData.getOutgoingUrls();
             
//             System.out.println("@@@!!! "+html);
  
             System.out.println("Text length: " + text.length());
             System.out.println("Html length: " + html.length());
             System.out.println("Number of outgoing links: " + links.size());
         }
         
         Header[] responseHeaders = page.getFetchResponseHeaders(); // 获取响应头消息
         if (responseHeaders != null) {
           System.out.println("响应的头消息");
           for (Header header : responseHeaders) {
            System.out.println(header.getName()+"+"+header.getValue());
           }
         }
  
    }
     
    
}