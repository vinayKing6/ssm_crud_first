package com.vinay.crud.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vinay.crud.bean.Stu;
import com.vinay.crud.bean.StuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@JsonIgnoreProperties(value = "handler")
public interface StuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    int countByExample(StuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    int deleteByExample(StuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    int deleteByPrimaryKey(Integer stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    int insert(Stu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    int insertSelective(Stu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    List<Stu> selectByExample(StuExample example);

    List<Stu> selectByExampleWithDept(StuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    Stu selectByPrimaryKey(Integer stuId);

    Stu selectByPrimaryKeyWithDept(Integer stuId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    int updateByExampleSelective(@Param("record") Stu record, @Param("example") StuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    int updateByExample(@Param("record") Stu record, @Param("example") StuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    int updateByPrimaryKeySelective(Stu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    int updateByPrimaryKey(Stu record);
}