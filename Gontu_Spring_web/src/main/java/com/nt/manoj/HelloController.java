package com.nt.manoj;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.xml.ws.BindingType;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	/*
	 * @RequestMapping(value="/anyName1/{name}/{company}") public ModelAndView
	 * getdetail1(@PathVariable Map<String, String> map) {
	 * 
	 * String id=map.get("company"); String name=map.get("name"); ModelAndView
	 * mv=new ModelAndView("helloPage"); mv.addObject("student", "company "
	 * +id+" name"+name); System.out.println(id+"  "+name); return mv;
	 * 
	 * }
	 */
	/*
	 * @RequestMapping(value = "/home/companyName/{userName}") public ModelAndView
	 * test(@PathVariable("userName") String name) { System.out.println(name);
	 * ModelAndView mv=new ModelAndView(); //mv.addObject("hii", myName);
	 * mv.setViewName("home"); System.out.println("1"); return mv;
	 * 
	 * }
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] { "address.pincode" });
		SimpleDateFormat sf = new SimpleDateFormat("dd-mm-yyyy");
		binder.registerCustomEditor(Date.class, "doj", new CustomDateEditor(sf, false));
	}

	@ModelAttribute
	public void everypage(Model model) {
		model.addAttribute("frontPage", "Company Details");
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(){
		/*
		 * String exceptionOcurred="Null_Pointer";
		 * 
		 * if(exceptionOcurred.equalsIgnoreCase("Null_Pointer")) { throw new
		 * NullPointerException("Null Pointer Exception"); }
		 */
		ModelAndView mv = new ModelAndView("home");
		return mv;

	}
	// this method used when we submit the request,
	
	@RequestMapping(value = "/anyName", method = RequestMethod.POST)
	public String getdetail(@ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "home";
		}
		return "helloPage";
	}
	@ResponseBody
	@RequestMapping(value = "/students",method = RequestMethod.GET)
	public ArrayList<Student> listOfStudent(){
		Student s=new Student();
		s.setSname("manoj tiwari");s.setCompany("TCS");
		
		Student s1=new Student();
		s1.setSname("happy");s1.setCompany("Wipro");
		
		Student s2=new Student();
		s2.setSname("rinku Shukla");s2.setCompany("Infosys");
		
		ArrayList<Student> al= new ArrayList<>();
		al.add(s);al.add(s1);al.add(s2);
		return al;
	}
	
	@ResponseBody
	@RequestMapping(value = "/students/{name}",method = RequestMethod.GET)
	public Student  getStudent(@PathVariable("name") String name){
		Student s=new Student();
		s.setSname(name);
		s.setCompany(s.getSname());
		return s;
	}
	
	/*
	 * // this method used when we submit the request,
	 * 
	 * @RequestMapping(value="/anyName",method = RequestMethod.POST) public
	 * ModelAndView getdetail(@RequestParam Map<String, String> map) {
	 * 
	 * String company=map.get("company"); String name=map.get("name");
	 * 
	 * // this is where we send the result to other page i.e helloPage ModelAndView
	 * mv=new ModelAndView("helloPage");
	 * 
	 * mv.addObject("student", "name: " +name+"company:  "+company);
	 * System.out.println("hello"); return mv;
	 * 
	 * }
	 */

	/*
	 * @RequestMapping("/") public ModelAndView home() {
	 * 
	 * System.out.println("Controller"); ModelAndView mv = new ModelAndView();
	 * mv.addObject("name","helllluuulllll"); mv.setViewName("home"); return mv; }
	 */
	/*
	 * @RequestMapping("welcome") public ModelAndView sayHello() {
	 * 
	 * ModelAndView mv= new ModelAndView(); mv.setViewName("helloPage");
	 * mv.addObject("hello","This is Basic Page"); return mv; }
	 */
}
