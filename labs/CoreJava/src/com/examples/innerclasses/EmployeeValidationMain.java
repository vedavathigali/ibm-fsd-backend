package com.examples.innerclasses;
import java.util.function.Consumer;
import java.util.function.Predicate;
import com.examples.java.oops.Employee;

public class EmployeeValidationMain {
	
	// Validator interface
	// can be qualified as functional interface as it is performing single task
/*	public interface ValidateEmployee {
		public boolean check(Employee<Double> emp);
	}
	// Validate method definition
	public static boolean validate(Employee<Double> emp, ValidateEmployee validator)
	{
		return validator.check(emp);
	}
	
	*/	
	
	public static boolean validate(Employee<Double> emp, Predicate<Employee<Double>> validator)
	{
		return validator.test(emp); // executes lambda expression body
	}
public static void handleError(String errorMessage,Consumer<String> consumer) {
	consumer.accept(errorMessage);
}
	
	public static void main(String[] args)
	{
		Employee<Double> employee = new Employee<>(100, "Anand", -1, "Male", "Software Engineer", "Admin", 25000.0);
		
		// Employee Validatio with Anonymous inner class 
//		boolean valStatus = validate(emp, new ValidateEmployee() {
//			
//			@Override
//			public boolean check(Employee<Double> emp) {
//				return emp.getAge() > 0 && emp.getSalary() > 0 && (emp.getDepartment().equals("Admin") || emp.getDepartment().equals("IT"));
//			}
//		});
		
		boolean valStatus = validate(employee, (Employee<Double> e) -> {return e.getAge() > 0 && e.getSalary() > 0 && (e.getDepartment().equals("Admin") || e.getDepartment().equals("IT"));});
		
		if(valStatus)
		{
			// Logic to save employee details
			System.out.println("Employee saved");
		}
		else {
			handleError("Inavlid age or salary",msg->{System.out.println("validation error");});
		}
		
	}
	

}

