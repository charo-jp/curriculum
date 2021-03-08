package controller;

/**
 * 社員情報管理コントローラー
 */

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EmployeeBean;
import service.EmployeeService;

public class EmployeeController extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {

 try {
  // 問① index.htmlから送信されたIDとPassWordの値を取得できるように修正しましょう。
 String id = request.getParameter("id");
 String password = request.getParameter("pass");

 /*
 * IDとPassWordと元に、社員情報を検索する関数の呼び出し、結果をJSPに渡す処理
 * ※ EmployeeBeanとEmployeeServiceをimportするのを忘れないでください。
 */

  // 問② EmployeeServiceクラスをインスタンス化する。
 EmployeeService service = new EmployeeService();
  // 問③ EmployeeBeanに、EmployeeServiceよりsearch関数を呼び出し、返り値を格納する。
 EmployeeBean bean = service.search(id, password);
  // 問④ nullの部分に適切な引数をセットする。サーブレット内に値を保管している。
 request.setAttribute("EmployeeBean", bean);

 } catch (Exception e) {
 e.printStackTrace();
 } finally {
 ServletContext context = this.getServletContext();
 //requestdispatcherはサーブレットからjspを表示するためのインターフェイス
 //そのインターフェイスでgetRequestDispatcher(相対パス)を指定することで、指定先のjspを表示する
 RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");
 //forward は
 dispatcher.forward(request, response);
 }
 }
}
