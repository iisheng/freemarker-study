package com.example.controller.mis;

import com.example.entity.CaseDO;
import com.example.entity.CaseEnum;
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
        CaseDO article = caseService.getById(id);
        return article;
    }

    /**
     * 创建案例
     *
     * @return
     */
    @PostMapping("/case")
    public CaseDO create(@RequestBody CaseDO param) {
        CaseDO caseDO = caseService.create(param);
        return caseDO;
    }

    /**
     * 更新案例
     *
     * @param id
     * @return
     */
    @PutMapping("/case/{id}")
    public CaseDO update(@PathVariable Long id, @RequestBody CaseDO param) {
        CaseDO article = caseService.update(id, param);
        return article;
    }

    /**
     * 案例列表
     *
     * @param type
     */
    @GetMapping("/cases")
    public List<CaseDO> queryByPage(@RequestParam(defaultValue = "0") int page,
                                    @RequestParam(required = false) CaseEnum type) {
        return caseService.queryByPageAndType(page, type);
    }

}
