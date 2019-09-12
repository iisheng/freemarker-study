package com.example.controller;

import com.example.entity.CaseDO;
import com.example.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/08/21 11:21:38
 */
@Controller
@RequestMapping("")
public class CaseController {

    @Autowired
    private CaseService caseService;

    /**
     * 获取案例 model
     *
     * @param id
     * @return
     */
    @GetMapping("/case/{id}.html")
    public String getById(@PathVariable Long id, Model model) {
        CaseDO caseDO = caseService.getById(id);
        model.addAttribute("caseModel", caseDO);
        return "case";
    }

    /**
     * 主页 案例列表
     *
     * @param page  页数
     * @param model
     * @return
     */
    @GetMapping("/home.html")
    public String home(@RequestParam(defaultValue = "0") int page, Model model) {
        List<CaseDO> list = caseService.queryByPage(page);
        model.addAttribute("list", list);
        return "cases";
    }

}
