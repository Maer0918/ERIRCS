package org.erircs.pojos;

public class StudentSubmitKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_submit.submit_id
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    private Integer submitId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_submit.student_id
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    private String studentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_submit.submit_id
     *
     * @return the value of student_submit.submit_id
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    public Integer getSubmitId() {
        return submitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_submit.submit_id
     *
     * @param submitId the value for student_submit.submit_id
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    public void setSubmitId(Integer submitId) {
        this.submitId = submitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_submit.student_id
     *
     * @return the value of student_submit.student_id
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_submit.student_id
     *
     * @param studentId the value for student_submit.student_id
     *
     * @mbg.generated Sun Jul 22 15:12:54 CST 2018
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}