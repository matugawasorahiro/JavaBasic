/*
 * PTra14_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

public class PTra14_01 {
	public static void main(String[] args) {
		
		JavaCouse javacouse = new JavaCouse();
		System.out.println(javacouse.getCourseName());
		
		for(String Unit : javacouse.getCourseUnit()) {
			System.out.println(Unit);
		}
		
	}
	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */

}
