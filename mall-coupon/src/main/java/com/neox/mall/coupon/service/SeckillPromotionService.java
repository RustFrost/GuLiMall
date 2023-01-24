package com.neox.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neox.common.utils.PageUtils;
import com.neox.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author kangfenghao
 * @email k18582599759@163.com
 * @date 2023-01-23 22:15:48
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

