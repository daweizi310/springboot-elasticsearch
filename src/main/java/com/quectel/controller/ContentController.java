package com.quectel.controller;

import com.quectel.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Maxton.Zhang
 * @Date: 2021/7/22 15:39
 * @Version 1.0
 */
@RestController
public class ContentController {
    @Autowired
    private ContentService contentService;

    /**
     * 根据条件数据爬取
     *
     * @param contentStr
     * @return
     * @throws Exception
     */
    @GetMapping("/parseContent/{contentStr}")
    public String parseContent(@PathVariable("contentStr") String contentStr) throws Exception {
        Boolean flag = contentService.parseContent(contentStr);
        if (flag) {
            return "爬取(" + contentStr + ")成功";
        } else {
            return "爬取(" + contentStr + ")失败";
        }
    }

    /**
     * 查询数据,分页,高亮
     *
     * @param keyword
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    @GetMapping("/search/{keyword}/{pageNum}/{pageSize}")
    public List<Map<String, Object>> search(@PathVariable("keyword") String keyword,
                                            @PathVariable("pageNum") int pageNum,
                                            @PathVariable("pageSize") int pageSize) throws Exception {
        return contentService.search(keyword, pageNum, pageSize);
    }
}
