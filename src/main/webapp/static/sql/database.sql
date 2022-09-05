CREATE SCHEMA `ssm_crud` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `ssm_crud`.`tbl_stu` (
                                      `stu_id` INT NOT NULL AUTO_INCREMENT,
                                      `stu_name` VARCHAR(45) NOT NULL,
                                      `stu_email` VARCHAR(45) NOT NULL,
                                      `stu_gender` INT NOT NULL,
                                      `dept_id` INT NOT NULL,
                                      PRIMARY KEY (`stu_id`));

CREATE TABLE `ssm_crud`.`tbl_dept` (
                                       `dept_id` INT NOT NULL AUTO_INCREMENT,
                                       `dept_name` VARCHAR(45) NOT NULL,
                                       PRIMARY KEY (`dept_id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;
