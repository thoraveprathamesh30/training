package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Practise")
public class Practise extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Practise() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		PrintWriter pw=response.getWriter();

		if(request.getParameter("id").equals("system") & request.getParameter("pass").equals("seed@1234")){
			pw.println("congrts");
			pw.close();
			
		}		
		
		else
		{			

			pw.println("oohh nnoooo"+"<form action=uwbcw method=post>");
			
		}
			
			//doGet(request, response);
	
	}

}
