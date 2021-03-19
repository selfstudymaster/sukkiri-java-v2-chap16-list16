package helloservlet;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import javax.servlet.http.*;
@WebServlet("/HelloServlet")

// list16-07
// ※このコードをコンパイル、実行するにはサーブレットの開発環境が必要です
public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Date d = new Date();
		Writer w = res.getWriter();
		w.write("<html><body>");
		w.write("Today is" + d.toString());
		w.write("</body></html>");
	}
}
