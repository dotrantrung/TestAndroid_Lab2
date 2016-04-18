package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.*;
import com.example.ttd025.myapplication.R;
import com.example.ttd025.myapplication.MainActivity;

/**
 * Created by ttd025 on 4/17/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public  JUnit_test(){
            super(MainActivity.class);
    }
    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView .getText().toString();

        assertEquals("Hello World!", tester);
    }
}
