package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EDDto {
	
	//두개를 불러온다
	private EmpDto empDto;
	private DepartDto departDto;

}
