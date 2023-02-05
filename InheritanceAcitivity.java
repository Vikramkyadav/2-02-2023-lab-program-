class Employee
{
	long employeeid;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double hra=1000.50;

	
	public Employee(long id, String name, String address, long phone, double salary)
	{
		this.employeeid=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		this.basicSalary=salary;
	}
	public void calculateSalary()
	{
		double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary *
				hra/100);
		System.out.println("Total Salary: "+salary);
	}

	public void calculateTransportAllowance()
	{
		double transportAllowance = basicSalary*10/100;
		System.out.println("Travel Allowance :"+transportAllowance);
	}

}
class Manager extends Employee 
{
	//constructor overload
	Manager(long id, String name, String address, long phone, double salary)
	{
		super(id,name,address,phone,salary);

		System.out.println(id+"\t"+name+"\t"+address+"\t"+phone+"\t"+salary);
	}
	public void calculateTransportAllowance()
	{
		double transportAllowance = basicSalary*15/100;
		System.out.println("Travel Allowance :"+transportAllowance);
	}

}

class Trainee extends Employee 
{
	Trainee(long id, String name, String address, long phone, double salary)
	{
		super(id,name,address,phone,salary);
		System.out.println(id+"\t"+name+"\t"+address+"\t"+phone+"\t"+salary);
			
	}
}
class InheritanceAcitivity
{
	
	public static void main(String[] args)
	{
		//object creation
		Manager m=new Manager(126534,"Peter","Chennai India",234543,65000.00);
		m.calculateSalary();
		m.calculateTransportAllowance();
                Trainee T=new Trainee(364758,"Jack","Bangalore India",567543,34000.00);
		T.calculateSalary();
		T.calculateTransportAllowance();	
	}
}