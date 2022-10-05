public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		if (this.salary >= 1000) {
			return this.salary * 3 / 100;
		}

		return 0;
	}

	public double bonus() {
		if (this.workHours > 40) {
			return (this.workHours - 40) * 30;
		}

		return 0;
	}

	public double raiseSalary() {
		int yearDifference = 2021 - this.hireYear;
		double newSalary = (this.salary - tax() + bonus());

		if (yearDifference < 10) {
			return newSalary * 5 / 100;

		} else if (yearDifference > 9 && yearDifference < 20) {
			return newSalary * 10 / 100;
		}

		return newSalary * 15 / 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear=" + hireYear
				+ "]";
	}
}
