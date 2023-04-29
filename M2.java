class Job
{
	String title ;
	double salary;
	Job(String title, double salary)
	{
		this.title = title;
		this.salary = salary;
	}
}

class Employee
{
	String name;
	Job [] jobs ;
	int location;
	Employee(String name , Job[] jobs)
	{
		this.name = name ;
		this.jobs =jobs ;
		
	}
	public boolean hasNext()
	{
		return location <jobs.length;
		
	}
	public Job next()
	{
		return jobs[location++];
	}
	
}

public class M2 {public static void main(String[] args) {
	Job j1 = new Job("software", 10000.9);
    Job j2 = new Job("hardware", 5000.6);
    Job j3 = new Job("marketting", 3000.6);
    Job j4 = new Job("sales", 8000.6);
	
        Job[] alljobs = { j1,j2,j3,j4};
	
	
		Employee emp = new Employee("Mohan", alljobs);
		System.out.println("print all jobs");
		while(emp.hasNext())
		{
			Job job = emp.next();
			System.out.println(job.title + ":" + job.salary);
		}
		System.out.println("print all jobs in the second time");
		while(emp.hasNext())
		{
			Job job = emp.next();
			
			System.out.println(job.title + ":" + job.salary);
	     }
		System.out.println("print all jobs in the third time");
		while(emp.hasNext())
		{
			Job job = emp.next();
			
			System.out.println(job.title + ":" + job.salary);
		}
}

}