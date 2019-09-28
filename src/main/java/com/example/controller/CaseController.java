package com.example.controller;

import com.example.entity.ADImage;
import com.example.entity.CaseDO;
import com.example.model.CaseModel;
import com.example.model.HomeModel;
import com.example.service.ADImageService;
import com.example.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @Autowired
    private ADImageService adImageService;

    /**
     * 获取案例 model
     *
     * @param id
     * @return
     */
    @GetMapping("/case/{id}.html")
    public String getById(@PathVariable Long id, Model model) {
        CaseDO caseDO = caseService.getById(id);
        caseDO.setDescription("<p>" + caseDO.getDescription().replace("\n", "</p><p>") + "</p>");
        System.out.println(caseDO.getDescription());
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
        List<CaseModel> caseModels = new ArrayList<>();
        List<String> bannerImages = new ArrayList<>();
        List<String> merchantImages = new ArrayList<>();

        List<ADImage> adImages = adImageService.queryAll();

        adImages.forEach(adImage -> {
            if (adImage.getType() == 1) {
                bannerImages.add(adImage.getImgUrl());
            }
            if (adImage.getType() == 2) {
                merchantImages.add(adImage.getImgUrl());
            }
        });

        list.forEach(caseDO -> {
            CaseModel caseModel = CaseModel.builder()
                    .id(caseDO.getId())
                    .title(caseDO.getTitle())
                    .serviceContent(caseDO.getServiceContent())
                    .image(caseDO.getCoverImage())
                    .customerName(caseDO.getCustomerName())
                    .type("imgItem fl0" + caseDO.getType().getCode())
                    .build();
            caseModels.add(caseModel);
        });

        HomeModel homeModel = HomeModel.builder()
                .caseModels(caseModels)
                .bannerImages(bannerImages)
                .merchantImages(merchantImages)
                .build();

        model.addAttribute("homeModel", homeModel);
        return "cases";
    }

}
