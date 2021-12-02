package com.xiaoke.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建5个学生类对象存入List集合中，并且创建方法按照学生的年龄对集合进行排序。
 * 注意：年龄和名字要一一对应。
 */
public class StudentTest {
    public static void main(String[] args) {
        List<Student> stuList =  new ArrayList();
        stuList.add(new Student("张三",19));
        stuList.add(new Student("李四",18));
        stuList.add(new Student("王五",20));
        stuList.add(new Student("赵六",17));
        stuList.add(new Student("孙七",19));
        // 按照学生的年龄对集合进行排序
        SortByAge(stuList);
        // 遍历
        for (Student it : stuList){
            System.out.println(it.getName() + it.getAge());
        }
    }

    public static void SortByAge(List<Student> stuList){
        for (int i=0;i<stuList.size()-1;i++){
            for (int j=0;j<stuList.size()-i-1;j++){
                if (stuList.get(j).getAge()>stuList.get(j+1).getAge()){
                    Student temp = stuList.get(j+1);
                    stuList.set(j+1, stuList.get(j));
                    stuList.set(j, temp);
                }
            }
        }
    }

}
