package com.java.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class FrontController {
	
	// get방식이 들어온다
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	//get,post방식
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	//get,post방식
		@RequestMapping("/member") //회원가입폼
		public String member() {
			return "member";
		}
		
		
		@RequestMapping("/doMember") //회원가입
		public ModelAndView doForm2(HttpServletRequest request) {
			System.out.println("bid : "+request.getParameter("bid"));
			System.out.println("bname : "+request.getParameter("bname"));
			String[] hobby = request.getParameterValues("hobby");
			String hobbys = "";
			for(int i=0; i<hobby.length;i++) {
				if(i==0) hobbys += ""+hobby[i];
				else hobbys += ","+ hobby[i];
			}
			System.out.println("hobby : "+hobbys);
			
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("bid", request.getParameter("bid"));
			mv.addObject("bpw", request.getParameter("bpw"));
			mv.addObject("bname", request.getParameter("bname"));
			mv.addObject("bphone", request.getParameter("bphone"));
			mv.addObject("bgender", request.getParameter("bgender"));
			mv.addObject("hobbys", request.getParameterValues("hobby"));
			mv.setViewName("doMember");
			return mv;
		
	}
		//get,post방식
		@RequestMapping("/memUpdate") //회원정보 수정
		public ModelAndView memUpdate(HttpServletRequest request) {
			
			System.out.println("bid : "+request.getParameter("bid"));
			System.out.println("bname : "+request.getParameter("bname"));
			String[] hobby = request.getParameterValues("hobby");
			String hobbys = "";
			for(int i=0; i<hobby.length;i++) {
				if(i==0) hobbys += ""+hobby[i];
				else hobbys += ","+ hobby[i];
			}
			
			System.out.println("hobby : "+hobbys);
			ModelAndView mv = new ModelAndView();
			mv.addObject("bid", request.getParameter("bid"));
			mv.addObject("bpw", request.getParameter("bpw"));
			mv.addObject("bname", request.getParameter("bname"));
			mv.addObject("bphone", request.getParameter("bphone"));
			mv.addObject("bgender", request.getParameter("bgender"));
			mv.addObject("hobbys", request.getParameterValues("hobby"));
			
			return "memUpdate";
		}	
}

