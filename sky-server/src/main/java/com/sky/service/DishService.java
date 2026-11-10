package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DishService {
    //添加菜品以及口味
    public void saveDishWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     */
    public PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     */
    public void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品
     * @param id
     * @return
     */
    public DishVO getByIdWithFlavor(Long id);

    /**
     * 修改菜品基本信息
     * @param dishDTO
     */
    public void updateWithFlavor(DishDTO dishDTO);


    /**
     * 根据分类id查询菜品
     * @return
     */
    public List<Dish> list(Long categoryId);
}
