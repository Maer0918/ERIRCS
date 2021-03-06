package org.erircs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.erircs.pojos.SubmitAnswer;
import org.erircs.pojos.SubmitAnswerExample;
import org.erircs.pojos.SubmitAnswerKey;

public interface SubmitAnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    long countByExample(SubmitAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int deleteByExample(SubmitAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int deleteByPrimaryKey(SubmitAnswerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int insert(SubmitAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int insertSelective(SubmitAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    List<SubmitAnswer> selectByExample(SubmitAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    SubmitAnswer selectByPrimaryKey(SubmitAnswerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") SubmitAnswer record, @Param("example") SubmitAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int updateByExample(@Param("record") SubmitAnswer record, @Param("example") SubmitAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int updateByPrimaryKeySelective(SubmitAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table submit_answer
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    int updateByPrimaryKey(SubmitAnswer record);
}