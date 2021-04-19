package servlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompanyController implements Controller{

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("CompanyComponent..진입..");
		//비지니스 로직 돌았다 치고
		String result = "<ul><li> Tomato System </li><br>"
				+"<li> NCSoft Corporation</li><br>"
				+"<li> EAST Engineering</li><br>"
				+"<li> Encore System Corporation</li><br>"
				+"<li> KTDS Company</li><br>"
				+"<li> LGCNS Company</li><br></ul>";
		
		request.setAttribute("result", result);
		return new ModelAndView("Result.jsp");
	}

}
