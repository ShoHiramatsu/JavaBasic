/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		// ★ 削除後のArrayListの中身を全件出力してください

		ArrayList<Player> array = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();

				String[] soccer = line.split(",", 0);

				Player player = new Player();
				player.setPosition(soccer[0]);
				player.setName(soccer[1]);
				player.setCountry(soccer[2]);
				player.setTeam(soccer[3]);
				
				

				array.add(player);
				
				while(array.remove((String)"レアル・マドリード")){}
				while(array.remove((String)"バルセロナ")){}

				



			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

	}
}
