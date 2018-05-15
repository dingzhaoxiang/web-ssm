package com.dzx.ssm.controller;

import com.dzx.ssm.model.Goods;
import com.dzx.ssm.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/10/12.
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    @RequestMapping("showGoods.do")
    public String showGoods(HttpServletRequest request, Model model){
        List<Goods> goodsList = goodsService.getAllGoods();
        model.addAttribute("goodsList",goodsList);
        return "showGoods";
    }

}
