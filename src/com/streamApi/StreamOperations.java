package com.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	// ----Stream Operation-------------------------------------------------------------------------------------------------------
	/*
	 * Types of Stream Operation--> 1. Intermediate Operation 2. Terminal Operation.
	 * 
	 * 1. Intermediate Operation: When we call Intermediate Operation method, it
	 * will always returns another Stream of object as result. We can call as many
	 * as Intermediate Operation method on same stream object of operations results,
	 * this is called as pipelined on same Stream source.
	 * 
	 * 2. Terminal Operation: We can call only one terminal operation at a time on
	 * any stream object. when we call terminal method we will get the result of all
	 * pipelined operations on the stream object.
	 * 
	 * Methods of Stream API:
	 * 1. Intermediate Operation:-
	 * map(function), filter(predicate), distinct(consumer), 
	 * 
	 * 2. Terminal Operation:-
	 * toList(), forEach(consumer), 
	 * 
	 */
<<<<<<< HEAD

=======
	
>>>>>>> 3068996 (The complete Stream_API with real world project)
	public static void main(String[] args) {
		
		List<Employee> empList = empList();
//-------------------------------------------------------------------------------------------------------
		// 1. Requirement: map(function)				--> Print name of all emps.
			// empList.stream().map(emp->emp.getName()).forEach(System.out::println);
		
//-------------------------------------------------------------------------------------------------------
		// 2. Requirement: filter(predicate)			--> Print emp whose age>25.
			// empList().stream().filter(emp->emp.getAge()>25).map(emp->(emp.getId()+"- "+emp.getName())).forEach(System.out::println);
		
//-------------------------------------------------------------------------------------------------------
		// 3. Requirement: distinct(consumer)			--> Print all the city name of emps duplicate names not allowed.
			// empList.stream().map(emp->emp.getCity()).distinct().forEach(System.out::println);
		
//-------------------------------------------------------------------------------------------------------
		// 4. Requirement: count()						--> Get count of emp who's salary > 20k
			// long count = empList().stream().filter(emp->emp.getSalary()>20000).count();
			// System.out.println(count);
		
//-------------------------------------------------------------------------------------------------------
		// 5. Requirement: limit()						--> Get first three emp of list.
			// List<Employee> first3Emp = empList.stream().limit(3).toList();
			// System.out.println(first3Emp);
		
//-------------------------------------------------------------------------------------------------------
		// 6 Requirement: skip()						--> If in an operation we want to skip/exclude first three employee, inverse of limit()
			// List<Employee> list = empList.stream().skip(3).toList();
			// System.out.println(list);
		
//-------------------------------------------------------------------------------------------------------
		// 7. Requirement: anyMatch(predicate)			--> if we want to check any emp who's age > 18.						--> If any element should satisfy the specified condition then return true, else false.
			// boolean isUnderAge = empList.stream().anyMatch(emp->emp.getAge()<18);
			// System.out.println(isUnderAge);
		
//-------------------------------------------------------------------------------------------------------
		// 8. Requirement: allMatch(predicate)			--> if we want to check every emp join after 2010 or not.  	--> If every element should satisfy the specified condition then return true, else false.
			// boolean isAbove2010 = empList.stream().allMatch(emp->emp.getYearOfJoining()>2010);
			// System.out.println(isAbove2010);
		
//-------------------------------------------------------------------------------------------------------
		// 9. isAbove2010: noneMatch(predicate)			-->	if we want to check every emp salary<10,000				--> If every element should 'not' satisfy the specified condition then return true, else false. (Opposite of allMatch() )
			// boolean salLessThan1000 = empList.stream().noneMatch(emp->emp.getSalary()<1000);
			// System.out.println(salLessThan1000);
		
//-------------------------------------------------------------------------------------------------------
		// 10. findAny(predicate)						--> if we want to get any element from the stream, it may return first element or not.
			// Employee anyEmp = empList.stream().findAny().get();
			// System.out.println(anyEmp);
		
//-------------------------------------------------------------------------------------------------------
		// 11. finFirst()								--> if we want to get first element from the stream.
			// Employee firstEmp = empList.stream().findAny().get();
			// System.out.println(firstEmp);
		
//-------------------------------------------------------------------------------------------------------
		// 12. sorted()									--> if we want to sort the any data of collection
			// empList.stream().map(emp->emp.getId()).sorted().forEach(System.out::println);									// --> Ascending Order of Id
			// empList.stream().map(emp->emp.getId()).sorted((emp1,emp2)->emp2.compareTo(emp1)).forEach(System.out::println);	// --> Descending Order of Id
			// empList.stream().sorted((emp1,emp2)->emp2.getId() -emp1.getId()).forEach(System.out::println);					// --> Descending Order of emp object
		  
//-------------------------------------------------------------------------------------------------------
		// 13. min(comparator) 							--> Print the emp who's salary is minimum in the stream.
			// Employee minSalaryEmp = empList.stream().min((emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary())).get();
			// System.out.println(minSalaryEmp);
		
//-------------------------------------------------------------------------------------------------------
		// 14. max(comparator)							--> Print the emp who's salary is maximum in the stream.
			// Employee maxSalaryEmp = empList.stream().max((emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary())).get();
			// System.out.println(maxSalaryEmp);
		
//-------------------------------------------------------------------------------------------------------
		// 15. average()								--> average() method always returns OptionalDouble						// --> Print average of salary of all the emp.
		// @ TODO DoubleStream:- Stream which contain only double values/elements, mapToDouble() returns double Stream. same like this we have IntStream-->mapToInt(ToIntFunction), LongStream-->mapToLong(ToLongFunction).
			// double avgSalaryOfEmps = empList.stream().mapToDouble(emp->emp.getSalary()).average().getAsDouble();
			// System.out.println(avgSalaryOfEmps);	
			// double avgAgeOfEmp = empList.stream().mapToInt(emp->emp.getAge()).average().getAsDouble();
			// System.out.println(avgAgeOfEmp);
		
//-------------------------------------------------------------------------------------------------------
		// 16. peek(consumer) 							--> From all emp, find whose date of joining>2015 & track how many emp are being processed.
			// It perform a action on each element in the stream without affecting actual elements in the stream.
			//	empList.stream()
			//		.peek(System.out::print)									//	It will take all each element from the stream i.e. all 20 emp
			//		.filter(emp -> emp.getYearOfJoining()>=2015);				// 	It will filter all emp and get the result, i.e. it will get 0 or less than 20 emp.
																				// 	It will take the element from the stream perform action and process that element to filter(), like this for every element same process will be repeated.
//-------------------------------------------------------------------------------------------------------
		// 17. parallelStream()							--> 
		   /*
			*	It process values based on the operation parallelly by dividing into multiple section, it take less time as compare with stream(), we can perform all the stream operation/method on parallel stream also.
			*	@ TODO The difference between stream & parallelStream is,
			*	stream guaranteed the order of element processing but parallelStream dosen't guaranteed that.
			*
			* */
			// System.out.println("\n\nExecution of Sequential stream: ");
			// empList.stream().forEach(System.out::print);
			// System.out.println("\n\nExecution of Parallel stream: ");
			// empList.parallelStream().forEach(System.out::print);
		
//-------------------------------------------------------------------------------------------------------
		// 18. collect()	present in Collectors class
			/* It is terminal operation, to collect values from stream instance or to accumulate stream values to any collection type value.
			 * If we want to accumulate stream values to any collection type value,
			 * // Accumulate to List
			 * --->  .collect(Collectors.toList())
			 * // Accumulate to TreeSet
			 * --->  .collect(Collectors.toCollection(TreeSet::new))
			 * // Convert elements to strings & concatenate them ',' separate by comma.
			 * --->  .collect(Collectors.joining(", "))
			 * // Compute total sum of salary of emp
			 * --->  .collect(Collectors.summingInt(Employee::getSalary))
			 * // Group employees by Department
			 * --->  .collect(Collectors.groupBy(Employee::getDepartment))
			 * // Compute sum of salaries by Department
			 * --->  .collect(Collectors.groupBy(Employee::getDepartment, Collectors.summingInt(Employee::getSalary)))
			 * 
			 * Other methods() in Collectors class.
			 * 1.	averagingDouble(ToDoubleFunction)  					--> return double average
			 * 2.	averagingInt(ToLongFunction)	   					--> return int average
			 * 3.	averagingLong(ToLongFunction)	   					--> return long average
			 * 4.	counting()		   									--> return count of ele. in stream
			 * 5.	groupingBy(Function)								-->	return grouped ele.
			 * 6.	joining(), joining(CharSequence delimiter), joining(CharSequence delimiter, CharSequence suffix)		--> CharSequence delimiter means by what character we want to separate elements, we can add prefix to element 
			 * 7.	maxBy(Comparator)
			 * 8.	minBy(Comparator)
			 * 9.	summingInt(ToIntFunction)
			 * 10.	summingDouble(ToDoubleFunction)
			 * 11.	summingLong(ToLongFunction)
			 * 12.	toCollection(Supplier)					--> add element to new Collection & return it.
			 * 13.	toList()								--> add element to new List & return it.
			 * 14.	toMap(Function)							--> add element who's keys and values are the result of applying provided Function to new Map & return it.
			 * 15.	toSet()									--> add element to new Set & return it.
			 * 16.	summarizing()
			 * 
			 * */

//-------------------------------------------------------------------------------------------------------
		// 19. toList() 					--> Collect emp into list who's age is greater than 25
			// List<String> ageGreaterThen25 = empList.stream().filter(emp->emp.getAge()>25).map(Employee::getName).collect(Collectors.toList());
			// System.out.print(ageGreaterThen25);
		
//-------------------------------------------------------------------------------------------------------
		// 20. toSet()						--> get Unique department names.
			// Set<String> uniqueDeptNames = empList.stream().map(Employee::getDepartment).collect(Collectors.toSet());	//set dosen't allow duplicate
			// System.out.print(uniqueDeptNames);
		
//-------------------------------------------------------------------------------------------------------
		// 21. toMap()						--> get emp id's and their salaries.
			// Map<Integer, Double> empIdAndSal = empList.stream().collect(Collectors.toMap(Employee::getId, Employee::getSalary));
			// System.out.println(empIdAndSal);
		
//-------------------------------------------------------------------------------------------------------
		// 22. groupingBy(Function)			--> get avg. salary department wise
			// Map<String, Double> avgSalaryByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
			// System.out.println(avgSalaryByDept);
		
//-------------------------------------------------------------------------------------------------------
		// 23. counting()					--> get count of emp by gender wise.
			// Map<String, Long> genderWiseCount = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));			
			// System.out.println(genderWiseCount);
		
//-------------------------------------------------------------------------------------------------------
		// 24. summingInt(), summingDouble(), summingLong()		--> summing all employees salaries.
			// System.out.println(empList.stream().collect(Collectors.summingDouble(Employee::getSalary)));
			// System.out.println(empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));
		/* Difference between summing() & summarizing()
		 * summing() used to get sum of elements, get single double value.
		 * summarizing() used to get the over all SummaryStatistics i.e. count, sum, min, max, avg
		 * */
		
//-------------------------------------------------------------------------------------------------------
		// 25. maxBy() 						--> find max age of emp.
			// Employee maxAgeEmp = empList.stream().collect(Collectors.maxBy((e1, e2)->e1.getAge() - e2.getAge())).get();
			// System.out.println(maxAgeEmp);
			
//-------------------------------------------------------------------------------------------------------
		// 26. joining()					--> get all department with delimiter :::
		/*
		 * If we use joining() we get the department names but joined to each other.
		 * If we use joining(CharSequence delimiter) we get department names separated with specified delimiter. 
		 * */
			String allDeptName = empList.stream().map(Employee::getDepartment).collect(Collectors.joining(":::"));
			//String allDeptName = empList.stream().map(Employee::getDepartment).collect(Collectors.joining("\n"));
			System.out.println(allDeptName);	
	}
	
	// Dummy Data of Employees.
	public static List<Employee> empList() {
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(1, "Alice Johnson", "New York", 22, "Female", "HR", 2010, 75000.00));
		empList.add(new Employee(2, "Bob Smith", "Los Washington", 19, "Male", "IT", 2017, 82000.00));
		empList.add(new Employee(3, "Charlie Brown", "Chicago", 35, "Male", "Finance", 2012, 1800.00));
		empList.add(new Employee(4, "Diana Prince", "Washington", 29, "Female", "IT", 2018, 85000.00));
		empList.add(new Employee(5, "Ethan Hunt", "Philadelphia", 40, "Male", "Operations", 2011, 1200.00));
		empList.add(new Employee(6, "Fiona Gallagher", "Phoenix", 27, "Female", "Sales", 2019, 68000.00));
		empList.add(new Employee(7, "George Michael", "San Antonio", 32, "Male", "Marketing", 2016, 72000.00));
		empList.add(new Employee(8, "Hannah Montana", "San Diego", 26, "Female", "IT", 2020, 70000.00));
		empList.add(new Employee(9, "Ian Somerhalder", "Phoenix", 20, "Male", "Finance", 2013, 1800.00));
		empList.add(new Employee(10, "Jenna Fischer", "San Jose", 22, "Female", "HR", 2014, 76000.00));
		empList.add(new Employee(11, "Kevin Hart", "Phoenix", 36, "Male", "Operations", 2011, 91000.00));
		empList.add(new Employee(12, "Linda Martin", "Jacksonville", 31, "Female", "Sales", 2016, 70000.00));
		empList.add(new Employee(13, "Michael Scott", "Philadelphia", 45, "Male", "Management", 2019, 105000.00));
		empList.add(new Employee(14, "Nancy Wheeler", "Columbus", 25, "Female", "IT", 2021, 67000.00));
		empList.add(new Employee(15, "Oscar Martinez", "Charlotte", 24, "Male", "Finance", 2012, 89000.00));
		empList.add(new Employee(16, "Pam Beesly", "San Francisco", 34, "Female", "HR", 2013, 75000.00));
		empList.add(new Employee(17, "Quentin Tarantino", "Columbus", 48, "Male", "Creative", 2015, 115000.00));
		empList.add(new Employee(18, "Rachel Green", "Seattle", 28, "Female", "Sales", 2017, 1600.00));
		empList.add(new Employee(19, "Steve Rogers", "Columbus", 39, "Male", "Security", 2011, 93000.00));
		empList.add(new Employee(20, "Tina Fey", "Washington", 20, "Female", "Management", 2012, 102000.00));

		return empList;
	}

}
