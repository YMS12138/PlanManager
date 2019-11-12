package pro.entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.StringProperty;

/**
 * 系统用户
 */
public class User {
    /*LongProperty id;//员工工号
    StringProperty userName;//员工姓名
    StringProperty userPwd;//员工密码
    IntegerProperty userJob;//员工职位
    StringProperty department;//员工部门*/

    Long id;//员工工号*/
    String userName;//员工姓名
    String userPwd;//员工密码
    Integer userJob;//员工职位
    String department;//员工部门

  /*  public long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }

    public String getUserName() {
        return userName.get();
    }

    public StringProperty userNameProperty() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName.set(userName);
    }

    public String getUserPwd() {
        return userPwd.get();
    }

    public StringProperty userPwdProperty() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd.set(userPwd);
    }

    public int getUserJob() {
        return userJob.get();
    }

    public IntegerProperty userJobProperty() {
        return userJob;
    }

    public void setUserJob(int userJob) {
        this.userJob.set(userJob);
    }

    public String getDepartment() {
        return department.get();
    }

    public StringProperty departmentProperty() {
        return department;
    }

    public void setDepartment(String department) {
        this.department.set(department);
    }

    public User() {
    }

    public User(StringProperty userName, StringProperty department) {
        this.userName = userName;
        this.department = department;
    }*/

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserJob() {
        return userJob;
    }

    public void setUserJob(Integer userJob) {
        this.userJob = userJob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userJob=" + userJob +
                ", department='" + department + '\'' +
                '}';
    }
}
