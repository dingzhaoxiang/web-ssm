package com.dzx.ssm.service.impl;

import com.dzx.ssm.dao.GoodsMapper;
import com.dzx.ssm.model.Goods;
import com.dzx.ssm.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/10/12.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsServiceImpl implements GoodsService {

    @Resource
    GoodsMapper goodsMapper;

    public List<Goods> getAllGoods() {
        return goodsMapper.selectAllGoods();
    }
}
