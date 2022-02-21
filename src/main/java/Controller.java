import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Text text=new Text(readInputStream(request,response));	
		request.setAttribute("text", text.getPartText());
		request.getRequestDispatcher("/result.jsp").forward(request, response);

	}
		
			
		
	
		public StringBuffer readInputStream(HttpServletRequest request, HttpServletResponse response) throws IOException {
			InputStream in = request.getInputStream();			
			BufferedReader buf=new BufferedReader(new InputStreamReader(in, "UTF-8"));
			
			
			
			String line;
			StringBuffer sbuf=new StringBuffer();
			while((line=buf.readLine())!=null) {
				sbuf.append(line+"\n");
			}
			
			if(sbuf.length()>1048576) {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out=response.getWriter();
				out.print("<a>Файл превышвает 1 мегабайт</a><br>");
				out.print("<a href=\"index.jsp\">Выберите другой файл</a>");
				out.close();
			}
			
			return sbuf;
		}
		
		
			
			
		
			
			
			
	
		
			 
}
