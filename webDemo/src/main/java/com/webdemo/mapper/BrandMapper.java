package com.webdemo.mapper;

import com.webdemo.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BrandMapper {
    @Select("select * from tb_brand")
    List<Brand> selectAll();

    @Select("select * from tb_brand where id=#{id}")
    Brand selectByIdBrand(int id);

    /**
     * 多条件查询方式解决方案之一：
     * 1.散装参数形式 通过Param注解实现形参与sql站位参数的绑定。
     * @param status
     * @param brandName
     * @param companyName
     * @return
     */
//    List<Brand> selectBYCondition(@Param("status") int status
//                                 ,@Param("brandName") String brandName
//                                 ,@Param("companyName") String companyName);

//    /**
//     * 多条件查询解决方案之二：
//     * 2.实体类封装参数，适用于查询多条件为实体类的多个属性，
//     * 注意事项：sql站位参数名称和实体类属性保持一致。
//     * @param brand
//     * @return
//     */
//    List<Brand> selectBYCondition1(Brand brand);
//
//    /**
//     *多条件查询解决方案之三：
//     * 3.Map封装参数，具体做法为：将sql站位参数设置为Map的key，传进来的参数设置为value。
//     * @param map
//     * @return
//     */
//    List<Brand> selectBYCondition2(Map map);
//
//    /**
//     * 多条件查询解决方案之四：
//     * 4.动态查询，适用于多个条件提供查询，但用户只输入部分条件。
//     * @param map
//     * @return
//     */
//
//    List<Brand> selectBYCondition3(Map map);
//
//    /**
//     * 动态查询之单条件动态查询，适用于多个条件选择一个进行查询的情景。
//     * @param brand
//     * @return
//     */
//    List<Brand> selectBYConditionSingle(Brand brand);
//
//    /**
//     * 添加实体类对象
//     * @param brand
//     */
//    void add(Brand brand);
//
//    /**
//     * 添加记录实现主键返回，通过设置xml下sql标签的两个属性实现
//     * @param brand
//     */
//    void add1(Brand brand);
//
//    /**
//     * 修改记录，需要注意部分修改的情况，要对sql语句进行动态拼接。
//     * @param brand
//     */
//   void update(Brand brand);
//
//    /**
//     * 删除单个记录
//     * @param id
//     */
//   void deleteById(int id);
//
//    /**
//     * 批量删除ids数组提供的下标记录
//     * @param ids
//     */
//   void  deleteByIds(int[] ids);
//    /**
//     * 批量删除ids数组提供的下标记录
//     * @param ids
//     */
//    void  deleteByIds1(@Param("ids") int[] ids);
}
