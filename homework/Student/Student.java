public class Student {
    private String name;            // 姓名
    private String studentNumber;   // 学号
    private int age;                // 年龄
    private String sex;             // 性别

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void show(){
        System.out.println("大家好，我是"+ getName() + ",学号是：" + getStudentNumber() + ",性别：" + getSex() + ",今年" + getAge() +"岁。");
    }
}
