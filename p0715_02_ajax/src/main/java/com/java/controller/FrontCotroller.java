package com.java.controller;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.dto.BoardDto;
import com.java.service.boardService;

@Controller
public class FrontCotroller {
	
	@Autowired boardService boardService;

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/json_data")
	public String json_data() {
		return "json_data";
	}
	
	@RequestMapping("/ajaxSend")
	@ResponseBody
	public ArrayList<BoardDto> ajaxSend(String category,String sword) {
		System.out.println("category : "+category);
		System.out.println("sword : "+sword);
		System.out.println("ajaxSend 페이지 호출됨2222");
		
//		BoardDto b1 = new BoardDto(1,"aaa","제목1","내용1",new Timestamp(System.currentTimeMillis()),1,0,0,0,"");
//		BoardDto b2 = new BoardDto(2,"bbb","제목2","내용2",new Timestamp(System.currentTimeMillis()),2,0,0,0,"");
//		ArrayList<BoardDto> list = new ArrayList<>();
//		list.add(b1);
//		list.add(b2);
		
		//service의 selectSearch
		ArrayList<BoardDto> list = boardService.selectAll(category,sword);
		
		
		return list;//게시글리스트.jsp 
	} 
	
	
	
	
	
	
	
	
	
}
