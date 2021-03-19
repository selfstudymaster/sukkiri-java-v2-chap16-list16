package helloandroid;
//package my.packages;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

// list16-06 Android端末用のHelloWorld
// ※このコードをコンパイルするにはAndroid用のSDKが必要です
public class HelloAndroid extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(this);
		tv.setText("Hello Android");
		setContentView(tv);
	}
}
