package pro.entity;

/**
 * 系统用户
 */
public class User {
    Long id;//员工工号
    String userName;//员工姓名
    String userPwd;//员工密码
    int userJob;//员工职位
    String department;//员工部门

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

    public int getUserJob() {
        return userJob;
    }

    public void setUserJob(int userJob) {
        this.userJob = userJob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
