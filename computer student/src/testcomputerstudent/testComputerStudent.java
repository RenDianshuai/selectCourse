package testcomputerstudent;
//测试类
import java.util.Scanner;
import computerstudent.*;

import computerstudent.ComputerStudent;
public class testComputerStudent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Course cou1 = new Course();
		Course cou2 = new Course();
		Course cou3 = new Course();
		cou1.addCourse("数学");
		cou2.addCourse("英语");
		cou3.addCourse("物理");
		ComputerStudent com1 = new ComputerStudent(2015011142,"潘兆元","数学");
		ComputerStudent com2 = new ComputerStudent(2015011143,"任典帅","数学");
		com2.addCourse("英语");
		ComputerStudent com3 = new ComputerStudent(2015011144,"孙仲翊","数学");
		com3.addCourse("物理");
		
		System.out.println(com1.toString());
		System.out.println(com2.toString());
		System.out.println(com3.toString());
		
	}

}

