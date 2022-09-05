package com.vinay.crud.bean;

import javax.validation.constraints.Pattern;

public class Stu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_stu.stu_id
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    private Integer stuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_stu.stu_name
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    @Pattern(regexp = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5})"
            ,message ="用户名可以是2-5位中文或者6-16位英文和数字的组合" )
    private String stuName;

    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Stu(Integer stuId, String stuName, String stuEmail, Integer stuGender, Integer deptId) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuEmail = stuEmail;
        this.stuGender = stuGender;
        this.deptId = deptId;
    }

    public Stu() {
    }

    @Override
    public String toString() {
        return "Stu{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", dept=" + dept +
                ", stuEmail='" + stuEmail + '\'' +
                ", stuGender=" + stuGender +
                ", deptId=" + deptId +
                '}';
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_stu.stu_email
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    @Pattern(regexp = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$"
            ,message ="请输入正确格式的邮箱" )
    private String stuEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_stu.stu_gender
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    private Integer stuGender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_stu.dept_id
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    private Integer deptId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_stu.stu_id
     *
     * @return the value of tbl_stu.stu_id
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    public Integer getStuId() {
        return stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_stu.stu_id
     *
     * @param stuId the value for tbl_stu.stu_id
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_stu.stu_name
     *
     * @return the value of tbl_stu.stu_name
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_stu.stu_name
     *
     * @param stuName the value for tbl_stu.stu_name
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_stu.stu_email
     *
     * @return the value of tbl_stu.stu_email
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    public String getStuEmail() {
        return stuEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_stu.stu_email
     *
     * @param stuEmail the value for tbl_stu.stu_email
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail == null ? null : stuEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_stu.stu_gender
     *
     * @return the value of tbl_stu.stu_gender
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    public Integer getStuGender() {
        return stuGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_stu.stu_gender
     *
     * @param stuGender the value for tbl_stu.stu_gender
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    public void setStuGender(Integer stuGender) {
        this.stuGender = stuGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_stu.dept_id
     *
     * @return the value of tbl_stu.dept_id
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_stu.dept_id
     *
     * @param deptId the value for tbl_stu.dept_id
     *
     * @mbggenerated Thu Aug 25 22:00:16 CST 2022
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}