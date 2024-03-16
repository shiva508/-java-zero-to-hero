package com.comrade.java_8.collectors.groupingBy;


import com.comrade.utils.AwbNumber;
import com.comrade.utils.FacultyData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapClient {
	public static void main(String[] args) {
		List<FacultyData> facultyDatas = List.of(
				new FacultyData().setDepartmentCode("ECE").setFacultyName("Vara Prasad"),
				new FacultyData().setDepartmentCode("CSE").setFacultyName("Venkat"),
				new FacultyData().setDepartmentCode("CSE").setFacultyName("Sridevi"));

		Map<String, List<FacultyData>> byDepartment = facultyDatas.stream().collect(Collectors.groupingBy(FacultyData::getDepartmentCode, Collectors.toList()));
		Map<String, Long> byDepartmentCount = facultyDatas.stream().collect(Collectors.groupingBy(FacultyData::getDepartmentCode, Collectors.counting()));
		System.out.println(byDepartment);
		System.out.println(byDepartmentCount);
		List<AwbNumber> awbNumbers=List.of( new AwbNumber().setAwbNumber(3).setStatus("R"),
											new AwbNumber().setAwbNumber(3).setStatus("P"),
											new AwbNumber().setAwbNumber(3).setStatus("W"),
											new AwbNumber().setAwbNumber(3).setStatus("C"),
											new AwbNumber().setAwbNumber(5).setStatus("R"),
											new AwbNumber().setAwbNumber(5).setStatus("C"),
											new AwbNumber().setAwbNumber(3).setStatus("Q"),
											new AwbNumber().setAwbNumber(6).setStatus("Q"),
											new AwbNumber().setAwbNumber(8).setStatus("Q"),
											new AwbNumber().setAwbNumber(9).setStatus("Q"));
		var output = awbNumbers.stream().collect(Collectors.groupingBy(AwbNumber::getAwbNumber,Collectors.mapping(AwbNumber::getStatus,Collectors.toList())));
		System.out.println(output);
		var outputCount = awbNumbers.stream().collect(Collectors.groupingBy(AwbNumber::getAwbNumber,Collectors.mapping(AwbNumber::getStatus,Collectors.counting())));
		System.out.println(outputCount);

	}

}
