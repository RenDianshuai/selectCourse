package computerstudent;

import java.util.ArrayList;

//课程类         
public class Course
{
	private String courseName;           //课程名称
	private static float courseGrade = 2;          //课程学分
	private static int coursePersons = 0;             //选课人数
	private static ArrayList<String> courseStudent = new ArrayList<String>();      //用容器来存储多个选课学生的姓名
	private static ArrayList<String> AllCourse = new ArrayList<String>();        //保存所有课程
//无参的构造方法
	public Course(){
		courseName = "无";
		courseGrade = 0;
		coursePersons = 0;
	}
//课程名称访问器
	public String getCourseName()
	{
		return AllCourse.toString();
	}
//添加课程
	public void addCourse(String courseName)
	{
		AllCourse.add(courseName);
		this.courseName = courseName;
	}
//课程名称的修改器
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
		int index = 0;
		for (String name:AllCourse){
			if (name == courseName){
				AllCourse.remove(index);
			}
			index++;
		}
	}
//学分的访问器
	public float getCourseGrade()
	{
		return courseGrade;
	}
//学分的修改器
	public void setCourseGrade(float courseGrade)
	{
		this.courseGrade = courseGrade;
	}
//选课人数的访问器
	public int getCoursePersons()
	{
		return coursePersons;
	}
//添加选课学生
	public  void getCourseStudent(String courseStudent)
	{
		Course.courseStudent.add(courseStudent);
		coursePersons+=1;
		//this.courseName = courseName;
		courseGrade = 2;           //学分默认为2
		//AllCourse.add(courseName);
	}
//描述课程信息
	public String toString()
	{
		String couseInformation = "课程名称："+courseName+'\t'+"学分："+courseGrade+'\t'+"选择此课程的人数："+coursePersons;
		return couseInformation;
	}
//选修本课程的学生名单
	public void studentsNames()
	{
		for (String name:courseStudent){
			System.out.println(name);
		}
	}
//增加姓名
	public void addName(String name)
	{
		Course.courseStudent.add(name);
	}
//判断是否有本门课程
	public boolean judge(String coursename)
	{
		boolean OK = false;                      //若没有，返回false
		for (String course:AllCourse){
			if (course == coursename){         //若有，返回true
				OK = true;
			}
		}
		return OK;
	}
//添加课程人数
	public void addPersons()
	{
		this.coursePersons++;
	}
	
}