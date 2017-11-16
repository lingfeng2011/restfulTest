package person.restful.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import person.restful.pojo.User;

public class RestfulServelt extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		ObjectMapper mapper = new ObjectMapper();
//		User user = new User();
//    	user.name = "lisi";
//		String json = mapper.writeValueAsString(user);
//		response.setContentType("text/json;charset=GBK");
//		response.getWriter().println(json);
//	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		User user = new User();
    	user.name = "lisi_post";
		String json = mapper.writeValueAsString(user);
		response.setContentType("text/json;charset=GBK");
		response.getWriter().println(json);
	}
	

}
