package com.example.controller.mis;

import com.example.entity.CaseDO;
import com.example.entity.PageUtil;
import com.example.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/08/21 20:20:17
 */
@RestController
@RequestMapping("/mis")
public class MisCaseController {

    @Autowired
    private CaseService caseService;

    /**
     * 查看案例详情
     *
     * @param id
     * @return
     */
    @GetMapping("/case/{id}")
    public CaseDO getById(@PathVariable Long id) {
        CaseDO caseDO = caseService.getById(id);
        return caseDO;
    }

    /**
     * 创建案例
     *
     * @return
     */
    @PostMapping("/case")
    public void create(@RequestBody CaseDO param) {
        caseService.create(param);
    }

    /**
     * 更新案例
     *
     * @param id
     * @return
     */
    @PutMapping("/case/{id}")
    public CaseDO update(@PathVariable Long id, @RequestBody CaseDO param) {
        if (id == null) {
            throw new RuntimeException("id不能为空");
        }
        param.setId(id);
        CaseDO caseDO = caseService.update(param);
        return caseDO;
    }

    /**
     * 案例列表
     */
    @GetMapping("/cases")
    public PageUtil queryByPage(@RequestParam(defaultValue = "0") int page) {
        PageUtil pageUtil = PageUtil.builder()
                .cursor(page)
                .record(caseService.queryByPage(page))
                .totalPage(caseService.getCount())
                .build();
        return pageUtil;
    }

}
