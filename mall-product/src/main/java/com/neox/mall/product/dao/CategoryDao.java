package com.neox.mall.product.dao;

import com.neox.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kangfenghao
 * @email k18582599759@163.com
 * @date 2023-01-22 10:14:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
