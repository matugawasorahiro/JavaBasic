package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		
		Car car1 = new Car();
		car1.color = "red";
		car1.gasoline = 50;
		
		Car car2 = new Car();
		car2.color = "green";
		car2.gasoline = 40;
		
		Car car3 = new Car();
		car3.color = "black";
		car3.gasoline = 70;
		
		int distance = 300;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int count = 0;
		while(true) {
			int advanced1 = car1.run();
			int advanced2 = car2.run();
			int advanced3 = car3.run();

			count++;
			
			sum1 += advanced1;
			sum2 += advanced2;
			sum3 += advanced3;



			if(sum1 >= distance) {
				System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは" + car1.gasoline +"リットルです");
				break;
			}

			if(advanced1 == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
				
			}
		}
	}
}
