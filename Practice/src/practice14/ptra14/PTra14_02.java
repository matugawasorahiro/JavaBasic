/*
 * PTra14_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

public class PTra14_02 {
	public static void main(String[] args) {
		
		DBCourse dbcourse = new DBCourse();
		
		System.out.println(dbcourse.getCourseName());
		for(String unit : dbcourse.getCourseUnit()) {
			System.out.println(unit);
		}
		
		
	}

	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */

}
