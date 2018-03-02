/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

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

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(array);

		int gkCount = 0;
		int dfCount = 0;
		int mfCount = 0;
		int fwCount = 0;

		for (Player player : array) {
			if (player.getPosition().equals("GK")) {
				if (gkCount < 1) {
					System.out.println(player.toString());
					gkCount++;
				}
			}

			if (player.getPosition().equals("DF")) {
				if (dfCount < 4) {
					System.out.println(player.toString());
					dfCount++;
				}
			}
			if (player.getPosition().equals("MF")) {
				if (mfCount < 4) {
					System.out.println(player.toString());
					mfCount++;
				}
			}
			if (player.getPosition().equals("FW")) {
				if (fwCount < 2) {
					System.out.println(player.toString());
					fwCount++;
				}
			}

		}

	}
}
