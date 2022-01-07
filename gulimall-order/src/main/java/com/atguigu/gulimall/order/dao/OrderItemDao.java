package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author bit3tbb
 * @email bit3tbb@gmail.com
 * @date 2022-01-07 14:34:22
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
