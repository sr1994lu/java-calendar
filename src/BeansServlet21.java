import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.beans.sample.MyCalendar01;

/**
 * Servlet implementation class Servlet0001
 */
@WebServlet("/my.beans.sample.BeansServlet21")
public class BeansServlet21 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeansServlet21() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    request.setCharacterEncoding("UTF-8");

	    out.print("<html>");
	    out.print("<head>");
	    out.print("<title>my.beans.sample.BeansServlet21 テスト</title>");
	    out.print("</head>");
	    out.print("<body>");
	    out.print("<h2>my.beans.sample.BeansServlet21 テスト</h2>");


	    out.println("①今の日付を表示<br />");
	    MyCalendar01 myCal1 = new MyCalendar01();
	    out.println("年："+myCal1.getYear() + "<br />");
	    out.println("月："+myCal1.getMonth() + "<br />");
	    out.println("日："+myCal1.getDay() + "<br />");
	    out.println("シンプル表記："+myCal1.getSimpleFormat() + "<br />");
	    out.println("日本表記：" + myCal1.getJapaneseFormat() + "<br />");
	    out.println("曜日："+myCal1.getJapaneseWeek() + "<hr />");

	    out.println("②日付を一括セット（int型　2017/1/31）<br />");
	    MyCalendar01 myCal2 = new MyCalendar01(2017,1,31);
	    out.println("年："+myCal2.getYear() + "<br />");
	    out.println("月："+myCal2.getMonth() + "<br />");
	    out.println("日："+myCal2.getDay() + "<br />");
	    out.println("シンプル表記："+myCal2.getSimpleFormat() + "<br />");
	    out.println("日本表記：" + myCal2.getJapaneseFormat() + "<br />");
	    out.println("曜日："+myCal2.getJapaneseWeek() + "<hr />");

	    out.println("③日付を一括セット（String型　2017/3/31）<br />");
	    MyCalendar01 myCal3 = new MyCalendar01("2017","3","31");
	    out.println("年："+myCal3.getYear() + "<br />");
	    out.println("月："+myCal3.getMonth() + "<br />");
	    out.println("日："+myCal3.getDay() + "<br />");
	    out.println("シンプル表記："+myCal3.getSimpleFormat() + "<br />");
	    out.println("日本表記：" + myCal3.getJapaneseFormat() + "<br />");
	    out.println("曜日："+myCal3.getJapaneseWeek() + "<hr />");

	    out.println("④日付を個別セット（int型　2017/5/31）<br />");
	    MyCalendar01 myCal4 = new MyCalendar01();
	    myCal4.setYear(2017);
	    myCal4.setMonth(5);
	    myCal4.setDay(31);
	    out.println("年："+myCal4.getYear() + "<br />");
	    out.println("月："+myCal4.getMonth() + "<br />");
	    out.println("日："+myCal4.getDay() + "<br />");
	    out.println("シンプル表記："+myCal4.getSimpleFormat() + "<br />");
	    out.println("日本表記：" + myCal4.getJapaneseFormat() + "<br />");
	    out.println("曜日："+myCal4.getJapaneseWeek() + "<hr />");

	    out.println("⑤日付を個別セット（String型　2017/7/31）<br />");
	    MyCalendar01 myCal5 = new MyCalendar01();
	    myCal5.setYear("2017");
	    myCal5.setMonth("7");
	    myCal5.setDay("31");
	    out.println("年："+myCal5.getYear() + "<br />");
	    out.println("月："+myCal5.getMonth() + "<br />");
	    out.println("日："+myCal5.getDay() + "<br />");
	    out.println("シンプル表記："+myCal5.getSimpleFormat() + "<br />");
	    out.println("日本表記：" + myCal5.getJapaneseFormat() + "<br />");
	    out.println("曜日："+myCal5.getJapaneseWeek() + "<hr />");

        out.println("<hr />");

	    out.println("⑥【⑤】のオブジェクトの日付を10日加算する（int型）<br />");
	    myCal5.add(10);
	    out.println("年："+myCal5.getYear() + "<br />");
	    out.println("月："+myCal5.getMonth() + "<br />");
	    out.println("日："+myCal5.getDay() + "<br />");
	    out.println("シンプル表記："+myCal5.getSimpleFormat() + "<br />");
	    out.println("日本表記：" + myCal5.getJapaneseFormat() + "<br />");
	    out.println("曜日："+myCal5.getJapaneseWeek() + "<hr />");

	    out.println("⑦【⑤】のオブジェクトの日付を10日加算する（String型）<br />");
	    myCal5.add("10");
	    out.println("年："+myCal5.getYear() + "<br />");
	    out.println("月："+myCal5.getMonth() + "<br />");
	    out.println("日："+myCal5.getDay() + "<br />");
	    out.println("シンプル表記："+myCal5.getSimpleFormat() + "<br />");
	    out.println("日本表記：" + myCal5.getJapaneseFormat() + "<br />");
	    out.println("曜日："+myCal5.getJapaneseWeek() + "<hr />");

	    out.println("⑥【⑤】のオブジェクトの日付を10日加算する（int型）<br />");
	    myCal5.add(10);
	    out.println("日本表記：" + myCal5.getJapaneseFormat() + "<br />");
	    out.println("シンプル表記："+myCal5.getSimpleFormat() + "<br />");
	    out.println("曜日："+myCal5.getJapaneseWeek() + "<hr />");

	    out.println("⑦【⑤】のオブジェクトの日付を10日加算する（String型）<br />");
	    myCal5.add("10");
	    out.println("日本表記：" + myCal5.getJapaneseFormat() + "<br />");
	    out.println("シンプル表記："+myCal5.getSimpleFormat() + "<br />");
	    out.println("曜日："+myCal5.getJapaneseWeek() + "<hr />");


        out.println("⑧定数で指定された年月日に値をセット（int型）<br />");
        MyCalendar01 myCal8 = new MyCalendar01();
        myCal8.set(MyCalendar01.NEN, 2017);
        myCal8.set(MyCalendar01.TSUKI, 10);
        myCal8.set(MyCalendar01.HI, 31);
        out.println("日本表記：" + myCal8.getJapaneseFormat() + "<br />");
        out.println("シンプル表記："+myCal8.getSimpleFormat() + "<br />");
        out.println("曜日："+myCal8.getJapaneseWeek() + "<br />");
        out.println("月："+myCal8.getJapaneseMonth() + "<hr />");

        out.println("⑨定数で指定された年月日に値をセット（String型）<br />");
        MyCalendar01 myCal9 = new MyCalendar01();
        myCal9.set(MyCalendar01.NEN, "2017");
        myCal9.set(MyCalendar01.TSUKI, "12");
        myCal9.set(MyCalendar01.HI, "31");
        out.println("日本表記：" + myCal9.getJapaneseFormat() + "<br />");
        out.println("シンプル表記："+myCal9.getSimpleFormat() + "<br />");
        out.println("曜日："+myCal9.getJapaneseWeek() + "<br />");
        out.println("月："+myCal9.getJapaneseMonth() + "<hr />");

        out.println("⑩定数で指定された年月日に値を加算（int型）<br />");
        MyCalendar01 myCal10 = new MyCalendar01();
        myCal10.add(MyCalendar01.NEN, 1);
        myCal10.add(MyCalendar01.TSUKI, 1);
        myCal10.add(MyCalendar01.HI, 1);
        out.println("日本表記：" + myCal10.getJapaneseFormat() + "<br />");
        out.println("シンプル表記："+myCal10.getSimpleFormat() + "<br />");
        out.println("曜日："+myCal10.getJapaneseWeek() + "<br />");
        out.println("月："+myCal10.getJapaneseMonth() + "<hr />");

        out.println("⑪定数で指定された年月日に値を加算（String型）<br />");
        MyCalendar01 myCal11 = new MyCalendar01();
        myCal11.add(MyCalendar01.NEN, "2");
        myCal11.add(MyCalendar01.TSUKI, "2");
        myCal11.add(MyCalendar01.HI, "2");

        out.println("日本表記：" + myCal11.getJapaneseFormat() + "<br />");
        out.println("シンプル表記："+myCal11.getSimpleFormat() + "<br />");
        out.println("曜日："+myCal11.getJapaneseWeek() + "<br />");
        out.println("月："+myCal11.getJapaneseMonth() + "<hr />");

        out.println("⑫引数との日数差を返す（int型）<br />");
        MyCalendar01 myCal12 = new MyCalendar01();
        out.println("日数差(入学から)：" + myCal12.difference(2014,4,1) + "日<br />");
        out.println("日数差(社会人まで)：" + myCal12.difference(2018,4,1) + "日<br />");
        out.println("日本表記：" + myCal12.getJapaneseFormat() + "<br />");
        out.println("シンプル表記："+myCal12.getSimpleFormat() + "<br />");
        out.println("曜日："+myCal12.getJapaneseWeek() + "<br />");
        out.println("月："+myCal12.getJapaneseMonth() + "<hr />");

        out.println("⑬引数との日数差を返す（String型）<br />");
        MyCalendar01 myCal13 = new MyCalendar01();
        out.println("日数差(入学から)：" + myCal13.difference("2014","4","1") + "日<br />");
        out.println("日数差(社会人まで)：" + myCal13.difference("2018","4","1") + "日<br />");
        out.println("日本表記：" + myCal13.getJapaneseFormat() + "<br />");
        out.println("シンプル表記："+myCal13.getSimpleFormat() + "<br />");
        out.println("曜日："+myCal13.getJapaneseWeek() + "<br />");
        out.println("月："+myCal12.getJapaneseMonth() + "<hr />");

        out.println("⑭getEnglishWeekを実行してみる（今日の曜日）<br />");
        MyCalendar01 myCal14 = new MyCalendar01();
        out.println("Week："+myCal14.getEnglishWeek(Calendar.getInstance()) + "<br />");

        out.println("<hr />");

        out.println("</body>");
	    out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
