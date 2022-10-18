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
		double result=0.0;
		int currentYear = 2021;
		if (this.hireYear<currentYear)
			if (currentYear-this.hireYear<10) result=this.salary * 0.05;
			else if (currentYear-this.hireYear<20) result=this.salary * 0.10;
			else if (currentYear-this.hireYear>19) result=this.salary * 0.15;
		return result;
	}
	
	public String toString(){
		return (
        "Adı : "+name+
        "\nMaaşı : "+salary+
        "\nÇalışma Saati : "+workHour+
        "\nBaşlangıç Yılı : "+hireYear+
        "\nVergi : "+ tax()+
        "\nBonus : "+ bonus()+
        "\nMaaş Artışı : "+raiseSalary()+        
        "\nVergi ve Bonuslarla Birlikte Maaş : "+(salary+bonus()-tax()) +
        "\nToplam Maaş : "+(salary+bonus()+raiseSalary()-tax())
	}
	
}
