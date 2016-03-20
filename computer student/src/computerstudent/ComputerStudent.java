package computerstudent;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputerStudent {
	Scanner input = new Scanner(System.in);
	
	private static String academyName = "计算机学院";          // 学院名称
	private int studentNumber;                //学生学号
	private String studentName;					//学生姓名
	private int studentCourseNumbers; 			//学生课程数目
	private ArrayList<String> studentCourse = new ArrayList<String>();      //学生课程
	Course c = new Course();
	
//默认构造方法	
	public ComputerStudent()
	{
		studentName = null;
		studentNumber = (Integer) null;
		studentCourseNumbers = 0;
		studentCourse = null;
		
	}
//初始化的构造方法
	public ComputerStudent(int studentNumber,String studentName,String studentCourse)
	{
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentCourse.add(studentCourse);
		studentCourseNumbers += 1;
		c.getCourseStudent(studentName);
		while (!c.judge(studentCourse)){
			System.out.println("没有此门课，在输入一次：");
			studentCourse = input.nextLine();
		}
		
	}
//修改学号
	public void setNumber(int studentNumber)
	{
		this.studentNumber = studentNumber;
	}
//得到学号
	public int getNumber()
	{
		return studentNumber;
	}
//修改姓名                      //这里目前无法将修改前的学生姓名覆盖
	public void setName(String studentName)
	{
		this.studentName = studentName;
		c.addName(studentName);
	}
//得到姓名
	public String getName()
	{
		return studentName;
	}
//得到选课数目
	public int getCourseNumbers()
	{
		return studentCourseNumbers;
	}
//得到选择的课程
	public void getCourse()
	{
		for(String course:studentCourse){            //利用ArrayList的遍历来输出所有课程
			System.out.println(course);
		}
	}
//添加课程              //这里目前无法将添加后的课程添加到同一个Course对象中
	public void addCourse(String course)
	{
		studentCourse.add(course);
		studentCourseNumbers += 1;
		while (!c.judge(course)){                //判断是否有课
			System.out.println("没有此门课，在输入一次：");
			course = input.nextLine();
		}
		
	}
//返回学生信息
	public String toString()
	{
		String information;
		information = "学生所在学院名称："+academyName+'\n'+"姓名:"+studentName+'\t'+"学号:"+studentNumber+'\t'+'\t'+"所选课程:"+studentCourse.toString()+'\t'+'\t'+'\t'+"课程数目:"+studentCourseNumbers;
		return information;
	}
	
}
