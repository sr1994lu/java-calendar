package my.beans.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * MyCalendar01 Class. 日付の管理と出力の機能を組み合わせた自作クラス.
 */
public class MyCalendar01 {

  protected Calendar cal = Calendar.getInstance();
  protected int year;
  protected int month;
  protected int day;
  public static int NEN = 0;
  public static int TSUKI = 1;
  public static int HI = 2;

  /**
   * Constructor. 現在日時を取得する.
   */
  public MyCalendar01() {
    this.cal.clear(Calendar.YEAR);
    this.cal.clear(Calendar.MONTH);
    this.cal.clear(Calendar.DAY_OF_MONTH);
    this.cal.clear(Calendar.AM_PM);
    this.cal.clear(Calendar.HOUR);
    this.cal.clear(Calendar.HOUR_OF_DAY);
    this.cal.clear(Calendar.MINUTE);
    this.cal.clear(Calendar.SECOND);
    this.cal.clear(Calendar.MILLISECOND);
    this.cal = Calendar.getInstance();

    this.year = this.cal.get(Calendar.YEAR);
    this.month = this.cal.get(Calendar.MONTH) + 1;
    this.day = this.cal.get(Calendar.DAY_OF_MONTH);

    this.cal.set(Calendar.YEAR, this.year);
    this.cal.set(Calendar.MONTH, this.month - 1);
    this.cal.set(Calendar.DAY_OF_MONTH, this.day);
  }

  /**
   * Constructor. 指定された年、月、日をセットする.
   *
   * @param year 年.
   * @param month 月.
   * @param day 日.
   */
  public MyCalendar01(int year, int month, int day) {
    this.cal.clear(Calendar.YEAR);
    this.cal.clear(Calendar.MONTH);
    this.cal.clear(Calendar.DAY_OF_MONTH);
    this.cal.clear(Calendar.AM_PM);
    this.cal.clear(Calendar.HOUR);
    this.cal.clear(Calendar.HOUR_OF_DAY);
    this.cal.clear(Calendar.MINUTE);
    this.cal.clear(Calendar.SECOND);
    this.cal.clear(Calendar.MILLISECOND);
    this.cal = Calendar.getInstance();

    this.year = year;
    this.month = month;
    this.day = day;

    this.cal.set(Calendar.YEAR, this.year);
    this.cal.set(Calendar.MONTH, this.month - 1);
    this.cal.set(Calendar.DAY_OF_MONTH, this.day);
  }

  /**
   * Constructor. 指定された年、月、日をセットする.
   *
   * @param year 年.
   * @param month 月.
   * @param day 日.
   */
  public MyCalendar01(String year, String month, String day) {
    this.cal.clear(Calendar.YEAR);
    this.cal.clear(Calendar.MONTH);
    this.cal.clear(Calendar.DAY_OF_MONTH);
    this.cal.clear(Calendar.AM_PM);
    this.cal.clear(Calendar.HOUR);
    this.cal.clear(Calendar.HOUR_OF_DAY);
    this.cal.clear(Calendar.MINUTE);
    this.cal.clear(Calendar.SECOND);
    this.cal.clear(Calendar.MILLISECOND);
    this.cal = Calendar.getInstance();

    this.year = Integer.parseInt(year);
    this.month = Integer.parseInt(month);
    this.day = Integer.parseInt(day);

    this.cal.set(Calendar.YEAR, this.year);
    this.cal.set(Calendar.MONTH, this.month - 1);
    this.cal.set(Calendar.DAY_OF_MONTH, this.day);
  }

  /**
   * setYear. 引数を年としてセットする.
   *
   * @param year 年.
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * setYear. 引数を年としてセットする.
   *
   * @param year 年.
   */
  public void setYear(String year) {
    this.year = Integer.parseInt(year);
  }

  /**
   * setMonth. 引数を月としてセットする.
   *
   * @param month 月.
   */
  public void setMonth(int month) {
    this.month = month;
  }

  /**
   * setMonth. 引数を月としてセットする.
   *
   * @param month 月.
   */
  public void setMonth(String month) {
    this.month = Integer.parseInt(month);
  }

  /**
   * setDay. 引数を日としてセットする.
   *
   * @param day 日.
   */
  public void setDay(int day) {
    this.day = day;
  }

  /**
   * setDay. 引数を日としてセットする.
   *
   * @param day 日.
   */
  public void setDay(String day) {
    this.day = Integer.parseInt(day);
  }

  /**
   * set. 年月日をセットする.
   *
   * @param year 年.
   * @param month 月.
   * @param day 日.
   */
  public void set(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  /**
   * set. 年月日をセットする.
   *
   * @param year 年.
   * @param month 月.
   * @param day 日.
   */
  public void set(String year, String month, String day) {
    this.year = Integer.parseInt(year);
    this.month = Integer.parseInt(month);
    this.day = Integer.parseInt(day);
  }

  /**
   * set. 定数で指定された年月日に値をセット.
   *
   * @param CONST 定数.
   * @param param 値.
   */
  public void set(int CONST, int param) {
    switch (CONST) {
      case 0:
        this.year = param;
        break;
      case 1:
        this.month = param;
        break;
      case 2:
        this.day = param;
        break;
      default:
        break;
    }
  }

  /**
   * set. 定数で指定された年月日に値をセット.
   *
   * @param CONST 定数.
   * @param param 値.
   */
  public void set(int CONST, String param) {
    switch (CONST) {
      case 0:
        this.year = Integer.parseInt(param);
        break;
      case 1:
        this.month = Integer.parseInt(param);
        break;
      case 2:
        this.day = Integer.parseInt(param);
        break;
      default:
        break;
    }
  }

  /**
   * add. 引数の値を加算する.
   *
   * @param day 加算日.
   */
  public void add(int day) {
    this.day += day;
  }

  /**
   * add. 引数の値を加算する.
   *
   * @param day 加算日.
   */
  public void add(String day) {
    this.day += Integer.parseInt(day);
  }

  /**
   * add. 定数で指定された年月日に値を加算.
   *
   * @param CONST 定数.
   * @param param 値.
   */
  public void add(int CONST, int param) {
    switch (CONST) {
      case 0:
        this.year += param;
        break;
      case 1:
        this.month += param;
        break;
      case 2:
        this.day += param;
        break;
      default:
        break;
    }
  }

  /**
   * add. 定数で指定された年月日に値を加算.
   *
   * @param CONST 定数.
   * @param param 値.
   */
  public void add(int CONST, String param) {
    switch (CONST) {
      case 0:
        this.year += Integer.parseInt(param);
        break;
      case 1:
        this.month += Integer.parseInt(param);
        break;
      case 2:
        this.day += Integer.parseInt(param);
        break;
      default:
        break;
    }
  }

  /**
   * difference. 引数の年月日との日数差を返す.
   *
   * @param year 年.
   * @param month 月.
   * @param day 日.
   * @return 引数の年月日との日数差.
   */
  public int difference(int year, int month, int day) {
    Calendar differentCal = Calendar.getInstance();
    differentCal.set(Calendar.YEAR, year);
    differentCal.set(Calendar.MONTH, month - 1);
    differentCal.set(Calendar.DAY_OF_MONTH, day);
    long timeInMillis = this.cal.getTimeInMillis() - differentCal.getTimeInMillis();
    timeInMillis = timeInMillis / 1000 / 60 / 60 / 24;
    String timeInMillisAbs = Long.toString(Math.abs(timeInMillis));
    return Integer.parseInt(timeInMillisAbs);
  }

  /**
   * difference. 引数の年月日との日数差を返す.
   *
   * @param year 年.
   * @param month 月.
   * @param day 日.
   * @return 引数の年月日との日数差.
   */
  public int difference(String year, String month, String day) {
    Calendar differentCal = Calendar.getInstance();
    differentCal.set(Calendar.YEAR, Integer.parseInt(year));
    differentCal.set(Calendar.MONTH, Integer.parseInt(month) - 1);
    differentCal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
    long timeInMillis = this.cal.getTimeInMillis() - differentCal.getTimeInMillis();
    timeInMillis = timeInMillis / 1000 / 60 / 60 / 24;
    String timeInMillisAbs = Long.toString(Math.abs(timeInMillis));
    return Integer.parseInt(timeInMillisAbs);
  }

  /**
   * getYear. 年をStringで返す.
   *
   * @return 年.
   */
  public String getYear() {
    return Integer.toString(this.year);
  }

  /**
   * getMonth. 月をStringで返す.
   *
   * @return 月.
   */
  public String getMonth() {
    return Integer.toString(this.month);
  }

  /**
   * getDay. 日をStringで返す.
   *
   * @return 日.
   */
  public String getDay() {
    return Integer.toString(this.day);
  }

  /**
   * getJapaneseFormat. yyyy年MM月dd日を返す.
   *
   * @return yyyy年MM月dd日
   */
  public String getJapaneseFormat() {
    this.cal.set(Calendar.YEAR, this.year);
    this.cal.set(Calendar.MONTH, this.month - 1);
    this.cal.set(Calendar.DAY_OF_MONTH, this.day);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日", Locale.JAPANESE);
    return sdf.format(this.cal.getTime());
  }

  /**
   * getJapaneseWeek. 指定された日付の曜日を日〜土で返す.
   *
   * @return 指定された日付の曜日.
   */
  public String getJapaneseWeek() {
    this.cal.set(Calendar.YEAR, this.year);
    this.cal.set(Calendar.MONTH, this.month - 1);
    this.cal.set(Calendar.DAY_OF_MONTH, this.day);

    SimpleDateFormat sdf = new SimpleDateFormat("EEE曜日", Locale.JAPANESE);
    return sdf.format(this.cal.getTime());
  }

  /**
   * getSimpleFormat. yyyy/MM/ddを返す.
   *
   * @return yyyy/MM/dd
   */
  public String getSimpleFormat() {
    this.cal.set(Calendar.YEAR, this.year);
    this.cal.set(Calendar.MONTH, this.month - 1);
    this.cal.set(Calendar.DAY_OF_MONTH, this.day);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.JAPANESE);
    return sdf.format(this.cal.getTime());
  }

  /**
   * getEnglishWeek. 指定された曜日の英語表記(3文字)を返す.
   *
   * @param cal Calendar Object.
   * @return 指定された曜日の英語表記.
   */
  public String getEnglishWeek(Calendar cal) {
    this.cal.set(Calendar.YEAR, this.year);
    this.cal.set(Calendar.MONTH, this.month - 1);
    this.cal.set(Calendar.DAY_OF_MONTH, this.day);

    SimpleDateFormat sdf = new SimpleDateFormat("EEE", Locale.ENGLISH);
    return sdf.format(cal.getTime());
  }

  /**
   * getJapaneseMonth. 指定された月を(ex: 9月)の形で返す.
   *
   * @return 指定された月.
   */
  public String getJapaneseMonth() {
    return MyCalendarStatic01.getMonthString(this.cal);
  }
}
