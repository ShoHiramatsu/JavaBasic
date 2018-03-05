package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */

		for (int i = 0; i < 5; i++) {
			for (int r = 0; r < i; r++) {
				System.out.print("■");
			}

			for (int t = 5; t > i; t--) {
				System.out.print("□");
			}
			System.out.println("");
		}

	}
}
