package com.example.controller.mis;

import com.example.entity.CaseDO;
import com.example.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author iisheng
 * @date 2019/08/21 20:20:17
 */
@RestController
@RequestMapping("/mis/case")
public class MisCaseController {

    @Autowired
    private CaseService caseService;

    /**
     * 获取文章
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public CaseDO getById(@PathVariable Long id) {
        CaseDO article = caseService.getById(id);
        return article;
    }

    /**
     * 更新文章
     *
     * @param id
     * @return
     */
    @PutMapping("/{id}")
    public CaseDO update(@PathVariable Long id, @RequestBody CaseDO param) {
        CaseDO article = caseService.update(id, param);
        return article;
    }
}
