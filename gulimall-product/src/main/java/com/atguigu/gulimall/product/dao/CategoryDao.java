package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author bit3tbb
 * @email bit3tbb@gmail.com
 * @date 2022-01-02 11:56:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
