package pro.entity;/*
 *@author LeeXy
 *@date 2019/10/21 14:37
 */

/**
 * 测试类
 *
 * @program: springTest
 * @description:
 * @author: LeeXy
 * @create: 2019-10-21 14:37
 **/

public class Account {
    int id;
    String accName;
    String accAge;

    public Account(int id, String accName, String accAge) {
        this.id = id;
        this.accName = accName;
        this.accAge = accAge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccAge() {
        return accAge;
    }

    public void setAccAge(String accAge) {
        this.accAge = accAge;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accName='" + accName + '\'' +
                ", accAge='" + accAge + '\'' +
                '}';
    }
}
