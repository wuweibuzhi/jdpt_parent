package com.djpt.qj.controller;


import com.djpt.qj.entity.Djfz;
import com.djpt.qj.service.DjfzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zw
 * @since 2021-12-22
 */
@RestController
@RequestMapping("/djpt")
public class DjfzController {

    @Autowired
    DjfzService djfzService;

    @GetMapping("/id")
    public List<Djfz> selectId(@RequestParam("id")  String id){
        List<Djfz> idList=djfzService.selectId(id);
        return idList;
    }
}

