package perpus.parent.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookCon {
	
	 @RequestMapping(value="/", method=RequestMethod.GET)
	 public ModelAndView listanggota(ModelAndView model) throws IOException{
		 model.setViewName("frontend");
		return model;
	 }
	 
	 @RequestMapping(value="/test", method=RequestMethod.POST, params="data")
	 public @ResponseBody String test (@RequestParam ("data") String  data){
		System.out.println(data);
		 return "Sukses"+data;
		 
	 } 
	  
	  
}
