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
            Document doc = Jsoup.connect("https://www.posao.hr/oglasi/angular-frontend-developer-m-z/703458/").userAgent("Mozilla/5.0").get();
           // System.out.println(doc.body());
            
            Elements temp=doc.select(".jobs_about_p, .jobs_about_right ");
            System.out.println(temp.size());
         
            for(Element posao:temp){
         
                System.out.println(posao.text());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("čđčšćđĐĆŽŠČĆž");
    }
}
