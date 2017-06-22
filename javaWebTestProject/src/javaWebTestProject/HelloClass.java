package javaWebTestProject;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloClass() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if(name == password){
			try {
				String sql = "select * from offer_user";
				DBHelper dbHelper = new DBHelper();
				ResultSet resultSet = dbHelper.executeSql(sql);
				while (resultSet.next()) {
					System.out.println(resultSet.getString(1));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// 处理 POST 方法请求的方法
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}