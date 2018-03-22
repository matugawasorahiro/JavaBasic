package practice14.ptra14;

import practice14.common.Course;

public class JavaCouse implements Course{

	public String getCourseName() {
		return  PREFIX + "java";
	}

	public String[] getCourseUnit() {
		String[] Unit = {"制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return  Unit;
	}
}
