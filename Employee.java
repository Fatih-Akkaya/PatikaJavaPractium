public class Employee{
	private String name;
	private double salary;
	private int workHour;
	private int hireYear;
	
	public Employee(String name, double salary, int workHour, int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHour=workHour;
		this.hireYear=hireYear;
	}
	
	public double tax(){
		double result = 0.0;
		if (this.salary>1000) result = this.salary * 0.03;
		return result;
	}
	
	public double bonus(){
		double result=0.0;
		if (this.workHour>40) result = (this.workHour-40) * 30;
		return result;
	}
	public double raiseSalary(){
		double result=0.0, netSalary= this.salary+bonus()-tax();
		int currentYear = 2021;
		if (this.hireYear<currentYear)
			if (currentYear-this.hireYear<10) result=netSalary * 0.05;
			else if (currentYear-this.hireYear<20) result=netSalary * 0.10;
			else if (currentYear-this.hireYear>19) result=netSalary * 0.15;
		return result;
	}
	
	public String toString(){
		return (
        "Adý : "+name+
        "\nMaaþý : "+salary+
        "\nÇalýþma Saati : "+workHour+
        "\nBaþlangýç Yýlý : "+hireYear+
        "\nVergi : "+ tax()+
        "\nBonus : "+ bonus()+
        "\nMaaþ Artýþý : "+raiseSalary()+        
        "\nToplam Maaþ : "+(salary+bonus()-tax()+raiseSalary()));
	}
	
}