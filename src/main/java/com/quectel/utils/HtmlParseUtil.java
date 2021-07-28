package com.quectel.utils;

import com.quectel.pojo.Content;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Maxton.Zhang
 * @Date: 2021/7/22 14:12
 * @Version 1.0
 */
public class HtmlParseUtil {
    /**
     * 爬取JD
     *
     * @param keyword
     * @return
     * @throws Exception
     */
    public static List<Content> parseJd(String keyword) throws Exception {
        String url = "https://search.jd.com/Search?keyword=" + keyword;
        Document document = Jsoup.parse(new URL(url), 30000);
        Element element = document.getElementById("J_goodsList");
        Elements elements = element.getElementsByTag("li");
        List<Content> contentList = new ArrayList<>();
        for (Element element1 : elements) {
            String title = element1.getElementsByClass("p-name").eq(0).text();
            String price = element1.getElementsByClass("p-price").eq(0).text();
            String img = element1.getElementsByTag("img").eq(0).attr("data-lazy-img");
            Content content = new Content();
            content.setTitle(title);
            content.setPrice(price);
            content.setImg(img);
            contentList.add(content);
        }
        return contentList;
    }

}
