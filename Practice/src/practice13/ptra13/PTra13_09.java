/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = { "山田", "佐藤", "小林" };

	/** メールデータ（定数） */
	public static final String[] MAILDATA = { "yamada@hoge.com", "satou@hoge.com", "kobayashi@hoge.com" };

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = { "rezo0001", "rezo0002", "rezo0003" };

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
			{ "総務部", "業務部", "システム部" },
			{ "5", "10", "35" },
	};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee[] employeeList = new Employee[3];

		for (int i = 0; i < employeeList.length; i++) {
			Employee employee = new Employee();
			employee.setUserNm(NAMEDATA[i]);
			employee.setMail(MAILDATA[i]);
			employee.setPassword(PASSDATA[i]);
			employee.setDepartmentNm(QUATERDATA[0][i]);
			employee.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));
			employeeList[i] = employee;
		}

		for (int i = 0; i < employeeList.length; i++) {
			System.out.println(employeeList[i].getUserNm());
			System.out.println(employeeList[i].getMail());
			System.out.println(employeeList[i].getPassword());
			System.out.println(employeeList[i].getDepartmentNm());
			System.out.println(employeeList[i].getDepartmentCnt());

		}

	}
}
