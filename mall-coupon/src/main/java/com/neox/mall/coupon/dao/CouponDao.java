package com.neox.mall.coupon.dao;

import com.neox.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kangfenghao
 * @email k18582599759@163.com
 * @date 2023-01-23 22:15:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
