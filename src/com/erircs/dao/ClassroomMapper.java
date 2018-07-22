package com.erircs.dao;

import com.erircs.pojos.Classroom;
import com.erircs.pojos.ClassroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassroomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    long countByExample(ClassroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int deleteByExample(ClassroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int deleteByPrimaryKey(Integer classId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int insert(Classroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int insertSelective(Classroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    List<Classroom> selectByExample(ClassroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    Classroom selectByPrimaryKey(Integer classId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") Classroom record, @Param("example") ClassroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int updateByExample(@Param("record") Classroom record, @Param("example") ClassroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int updateByPrimaryKeySelective(Classroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int updateByPrimaryKey(Classroom record);
}