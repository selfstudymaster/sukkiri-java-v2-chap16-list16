package main;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// chap16
// list16-01 ファイルから文字を読み取る
// import java.io.FileReader;
//public class Main {
//	public static void main(String[] args) throws Exception {
//
//		String filename = "c:¥¥test.txt"; // ファイル名をセット
//		FileReader fr = new FileReader(filename); // ファイルを開く
//		char c1 = (char) fr.read(); // 最初の1文字を読み込む
//		char c2 = (char) fr.read(); // 次の1文字を読み込む
//		fr.close(); // ファイルを閉じる 今回は記述していないが、IOExceptionを送出する可能せ性があるため、必ずfinallyの中に記述すること
//		// エラーメッセージ
//		// Exception in thread "main" java.io.FileNotFoundException: c:¥¥test.txt (No such file or directory)
//		// at java.base/java.io.FileInputStream.open0(Native Method)
//		// at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
//		// at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//		// at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
//		// at java.base/java.io.FileReader.<init>(FileReader.java:60)
//		// at main.Main.main(Main.java:10)
//	}
//}

// list16-02 ファイルに文字を書き込む
//public class Main {
//	public static void main(String[] args) throws Exception {
//		String filename = "c:¥¥test.txt"; // ファイルを開く
//		FileWriter fw = new FileWriter(filename);
//		fw.write('そ'); // 最初の1文字を書く
//		fw.write('れ'); // 次の1文字を書く
//		fw.write('な'); // 次の1文字を書く
//		fw.close(); // ファイルを閉じる
//	}
//}

// list16-03 Webページを取得する
//import java.io.InputStream;
//import java.net.URL;
//public class Main {
//	public static void main(String[] args) throws Exception {
//
//		URL url = new URL("http://www.impressjapan.jp/");
//		InputStream is = url.openStream(); // ネットへ接続 java.net.URLクラスのシンスタンスを生成し、openStream()メソッドで呼び出す
//		int i = is.read();
//		// ページの終わりまで繰り返す
//		while (i != -1) {
//			char c = (char) i;
//			System.out.println(c); // 読み込んだ内容を画面に表示する
//			i = is.read();
//		}
//	}
//}

// list16-04 データベースとSQL
//import java.sql.Connection;
//import java.sql.DriverManager;
//public class Main {
//	public static void main(String[] args) throws Exception {
//
//		Class.forName("ore.h2.Driver");
//			String dburl = "jdbc:h2:~/test"; // 接続先のDBを指定
//			String sql = " INSERT INTO EMPLOYEE(name) VALUE('iida') ";
//			Connection conn = DriverManager.getConnection(dburl); // DBに接続
//			conn.createStatement().executeUpdate(sql); // SQLを送信
//			conn.close(); // DB接続を閉じる
//	}
//}

// list16-05 JaveでGUIをプログラミング
//import java.awt.FlowLayout;
//import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("はじめてのGUI");
		JLabel label = new JLabel("Hellow World!");
		JButton button = new JButton("ボタンを押してね");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}
