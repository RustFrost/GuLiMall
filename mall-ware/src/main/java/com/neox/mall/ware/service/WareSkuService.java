package com.neox.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neox.common.utils.PageUtils;
import com.neox.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author kangfenghao
 * @email k18582599759@163.com
 * @date 2023-01-24 15:41:20
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

