package practice16;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 */
public class PTra16_01 {
    public static void main(String[] args) {

        /*
        * ★ 現在時刻を「YYYY年MM月DD日」形式で出力してください
        */

    	Date date = new Date();
    	SimpleDateFormat d = new SimpleDateFormat("YYYY年MM月dd日");
    	String  dateStr = d.format(date);
    	System.out.println(dateStr);

    }
}