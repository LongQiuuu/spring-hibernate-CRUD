package lab01.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import lab01.model.MemberBean;
import lab01.service.MemberService;
import lab01.service.impl.MemberServiceHiberImpl;

@WebServlet("/lab01/queryMember.do")
public class QueryAllMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		MemberService ms = new MemberServiceHiberImpl();
		//要轉成spring 框架不能自己創物件 要改寫成下面那樣
		//==========================================================
		ServletContext  sc = getServletContext();
		WebApplicationContext  ctx = WebApplicationContextUtils.getWebApplicationContext(sc);
		MemberService ms = ctx.getBean(MemberService.class);
		//==========================================================
		List <MemberBean>list = ms.findAll();
		request.setAttribute("allMembers", list);
		RequestDispatcher rd = request.getRequestDispatcher("/lab01/showMembers.jsp");
		rd.forward(request, response);
		return;		
	}

}
