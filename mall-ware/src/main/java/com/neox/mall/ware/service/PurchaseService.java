package com.neox.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neox.common.utils.PageUtils;
import com.neox.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author kangfenghao
 * @email k18582599759@163.com
 * @date 2023-01-24 15:41:53
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

