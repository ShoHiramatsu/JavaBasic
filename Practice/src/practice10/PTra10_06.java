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
		Car[] cars = new Car[3];

		Car car1 = new Car();
		car1.color = "red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.color = "bule";
		car2.gasoline = 50;

		Car car3 = new Car();
		car3.color = "yellow";
		car3.gasoline = 50;

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;

		final int distance = 300;

		int sum = 0;
		int count = 0;

		for (int i = 0; i < cars.length; i++) {

			while (true) {
				int t = cars[i].run();

				count++;

				if (t == -1) {
					System.out.println("目的地に到達できませんでした");
					break;
				}
				sum += t;

				if (sum > distance) {
					System.out.println("目的地にまで" + count + "時間かかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです");
					sum = 0;
					count = 0;
					break;
				}

			}

		}
	}
}
