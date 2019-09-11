package com.example.controller.mis;

import com.example.entity.NewsDO;
import com.example.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/09/11 14:45:59
 */
@RestController
@RequestMapping("/mis")
public class MisNewsController {
    @Autowired
    private NewsService newsService;

    /**
     * 查看新闻详情
     *
     * @param id
     * @return
     */
    @GetMapping("/news/{id}")
    public NewsDO getById(@PathVariable Long id) {
        NewsDO newsDO = newsService.getById(id);
        return newsDO;
    }

    /**
     * 更新新闻
     *
     * @param id
     * @return
     */
    @PutMapping("/news/{id}")
    public NewsDO update(@PathVariable Long id, @RequestBody NewsDO param) {
        NewsDO newsDO = newsService.update(id, param);
        return newsDO;
    }

    /**
     * 新闻列表
     */
    @GetMapping("/newses")
    public List<NewsDO> queryByPage(@RequestParam(defaultValue = "0") int page) {
        return newsService.queryByPage(page);
    }
}
