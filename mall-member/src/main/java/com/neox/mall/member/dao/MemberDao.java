package com.neox.mall.member.dao;

import com.neox.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kangfenghao
 * @email k18582599759@163.com
 * @date 2023-01-24 11:29:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
