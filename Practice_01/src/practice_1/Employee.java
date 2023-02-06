package practice_1;

public class Employee {

	public int baseSalary = 3000000;
	int getSalary() {return baseSalary;}
}

class Manager extends Employee{
	@Override
	int getSalary() {return (baseSalary+2000000);}
}

class Programmer extends Employee{
	@Override
	int getSalary() {return (baseSalary+3000000);}
}