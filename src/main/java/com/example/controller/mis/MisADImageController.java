package com.example.controller.mis;

import com.example.entity.ADImage;
import com.example.entity.PageUtil;
import com.example.service.ADImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author iisheng
 * @date 2019/09/25 22:37:37
 */
@RestController
@RequestMapping("/mis")
public class MisADImageController {
    @Autowired
    private ADImageService adImageService;

    /**
     * 创建案例
     *
     * @return
     */
    @PostMapping("/adImage")
    public void create(@RequestBody ADImage adImage) {
        adImageService.create(adImage);
    }


    /**
     * 案例列表
     */
    @GetMapping("/adImages")
    public PageUtil queryByPage(@RequestParam(defaultValue = "0") int page,
                                @RequestParam int type) {
        PageUtil pageUtil = PageUtil.builder()
                .cursor(page)
                .record(adImageService.queryByPageAndType(page, type))
                .totalPage(adImageService.getCountByType(type))
                .build();
        return pageUtil;
    }

}
