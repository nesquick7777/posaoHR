/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fetch;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 *
 * @author Bole
 */
public class FetchData {
    public static void main(String[] args) {
        
        System.out.println("hello");
        
        try {
            Document doc = Jsoup.connect("https://www.posao.hr/poslovi/izraz/java/").userAgent("Mozilla/5.0").get();
            Elements temp=doc.select("jobs_about_p jobs_about_right");
            
            int i =0;
            for(Element posao:temp){
         i++;
                System.out.println(i + " " + posao.getElementsByTag("b").first().text());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
