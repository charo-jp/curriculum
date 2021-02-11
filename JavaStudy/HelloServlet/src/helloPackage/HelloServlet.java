package helloPackage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	//Webサーバーとやり取りするものがブラウザの場合はdoGet()とdoPost()の２つのみ。GETとPOSTの違いについては4章へ！
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// setContentTypeで設定された内容はそのままHTTPヘッダーのContent-Typeの値として指定される。
		// charset = Windows-31Jは英語。日本語にするにはEUC_JPを指定する！
		response.setContentType("text/html; charset=Windows-31J");

		PrintWriter out = response.getWriter();
		//コンソールに出力するのと同じ感覚で使うことが出来る
		out.println("<body>HelloServlet</body>");
	}
}
