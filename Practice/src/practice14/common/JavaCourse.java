package practice14.common;

public class JavaCourse implements Course {

	public String getCourseName() {
		return PREFIX + "Java";
	}

	public String[] getCourseUnit() {
		String[] list = { "式と演算", "制御構文", "メソッド", "配列", "オブジェクト指向", "継承", "高度な継承" };
		return list;
	}

}
