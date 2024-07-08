package com.java.Controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FrontController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/member") //회원가입 폼
	public String member() {
		return "member";
	}
	
	// HttpServletRequest 는 값을 받아올 수 있다.
	// @RequestMapping : 클라이언트이 요청(url)에 맞는 클래스나 메서드를 연결시켜주는 어노테이션이다.
	// HTTP 요청의 파라미터 값을 얻기 위해 사용하는 것이 request.getParameter() 메쏘드입니다.
	
	@RequestMapping("/doMember") //회원가입 저장
	public ModelAndView doMember(HttpServletRequest request) {
		System.out.println("id : "+request.getParameter("id"));
		System.out.println("name : "+request.getParameter("name"));
		String[] hobby = request.getParameterValues("hobby");
		String hobbys = "";   // game,golf,run,swim,book
		for(int i=0;i<hobby.length;i++) {
			if(i==0) hobbys += ""+hobby[i];
			else hobbys += ","+hobby[i];
		}//인덱스가 0이면,앞에 쉽표없이 첫번째 요소를 추가하고 -> 후속요소에는 ,를 추가해서 출력
		System.out.println("hobbys : "+hobbys);
		
		ModelAndView mv = new ModelAndView(); //ModelAndView : 데이터를 전송시킬 수 있는 리턴 타입
		mv.addObject("id",request.getParameter("id"));// addObject : key와 value를 담아 보낼 수 있는 메서드
		mv.addObject("pw",request.getParameter("pw"));
		mv.addObject("name",request.getParameter("name"));
		mv.addObject("phone",request.getParameter("phone"));
		mv.addObject("gender",request.getParameter("gender"));
		mv.addObject("hobby",hobbys);
		mv.setViewName("doMember"); //파일이름
		return mv;
	}	//동일한 이름으로 파라미터를 전송한 경우 getParameter()는 펏 번째 파라미터를 받는다.
	
	@RequestMapping("/memUpdate") //회원정보수정
	public ModelAndView memUpdate(HttpServletRequest request) {
		
		System.out.println("id : "+request.getParameter("id"));
		System.out.println("name : "+request.getParameter("name"));
		String[] hobby = request.getParameterValues("hobby");
		//동일한 이름의 파라미터가 두 개 이상인 경우 반드시 getParameterValues()로 받는다.
		String hobbys = "";   // game,golf,run,swim,book
		for(int i=0;i<hobby.length;i++) {
			if(i==0) hobbys += ""+hobby[i];
			else hobbys += ","+hobby[i];
		} //인덱스가 0이면,앞에 쉽표없이 첫번째 요소를 추가하고-> 후속요소에는 ,를 추가해서 출력
		System.out.println("hobbys : "+hobbys);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",request.getParameter("id"));
		mv.addObject("pw",request.getParameter("pw"));
		mv.addObject("name",request.getParameter("name"));
		mv.addObject("phone",request.getParameter("phone"));
		mv.addObject("gender",request.getParameter("gender"));
		mv.addObject("hobby",hobbys);
		
		return mv;
	}
	
	
	
	
}