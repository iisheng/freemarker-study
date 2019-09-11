package com.example.controller;

import com.example.entity.NewsDO;
import com.example.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/09/11 14:51:29
 */
@Controller
@RequestMapping("")
public class NewsController {

    @Autowired
    private NewsService newsService;

    /**
     * 获取案例 model
     *
     * @param id
     * @return
     */
    @GetMapping("/news/{id}.html")
    public String getById(@PathVariable Long id, Model model) {
        NewsDO newsDO = newsService.getById(id);
        model.addAttribute("newsModel", newsDO);
        return "news";
    }

    /**
     * 主页 案例列表
     *
     * @param page  页数
     * @param model
     * @return
     */
    @GetMapping("/newses.html")
    public String newsList(@RequestParam(defaultValue = "0") int page, Model model) {
        List<NewsDO> list = newsService.queryByPage(page);
        model.addAttribute("list", list);
        return "newses";
    }
}
