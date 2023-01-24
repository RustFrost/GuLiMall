package com.neox.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neox.common.utils.PageUtils;
import com.neox.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author kangfenghao
 * @email k18582599759@163.com
 * @date 2023-01-22 10:04:39
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

