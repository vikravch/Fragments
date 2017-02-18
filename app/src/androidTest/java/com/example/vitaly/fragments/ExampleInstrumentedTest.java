package com.example.vitaly.fragments;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.robotium.solo.Solo;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<TestActivity> atr = new ActivityTestRule<TestActivity>(TestActivity.class);
    private Solo solo ;

    @Before
    public void setUp() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        solo = new Solo(InstrumentationRegistry.getInstrumentation(),atr.getActivity());
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.example.vitaly.fragments", appContext.getPackageName());
    }

    @Test
    public void editTextTest(){


        String inputStr = "asdsadsadasdsa";

        for (int i=0; i<100; i++) {
            solo.enterText(((EditText) solo.getView(R.id.etInputActivityTest)), inputStr+" -  "+i);
            solo.sleep(2000);
            solo.clickOnText(solo.getString(R.string.show_button));
            solo.sleep(2000);

            assertEquals(inputStr+" -  "+i, ((TextView) solo.getView(R.id.tvResultActivityTest)).getText().toString());
            solo.enterText(((EditText) solo.getView(R.id.etInputActivityTest)),"");
        }
    }

}
