package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFull;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.entity.SetmealDish;
import com.sky.enumeration.OperationType;
import com.sky.vo.DishVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetMealDishMapper {
    /**
     * 根据菜品id来查询套餐id
     * @param dishIds
     * @return
     */

    List<Long> getSetMealDishIdsBySetMealId(List<Long> dishIds);


    /**
     * 套餐里面包含的菜品
     * @param setMealDishs
     */
    void insertBatch(List<SetmealDish> setMealDishs);

    /**
     * 根据套餐id删除套餐和菜品的关联关系
     * @param setmealId
     */
    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId}")
    void deleteBySetmealId(Long setmealId);

    @Select("select * from setmeal_dish where setmeal_id =#{setmealId}")
    List<SetmealDish> getBySetmealId(Long setmealId);

}
