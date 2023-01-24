package com.neox.mall.order.dao;

import com.neox.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author kangfenghao
 * @email k18582599759@163.com
 * @date 2023-01-22 10:04:39
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
