package javaExamDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Comparable<Employee>{

	private int sabun;
	private String name;
	
	@Override
	public int compareTo(Employee o) { // 객체 정렬법
		
		// return this.sabun - o.sabun; // 오름차순
		return o.sabun - this.sabun; // 내림차순
	}
	
}
