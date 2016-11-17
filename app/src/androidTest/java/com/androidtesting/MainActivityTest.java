package com.androidtesting;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Hari Prasad on 11/18/16.
 */
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void helloTest() {
        onView(withId(R.id.iv_hello)).check(matches(withText("")));
        onView(withId(R.id.btn_click)).perform(click());
        onView(withId(R.id.iv_hello)).check(matches(withText(R.string.text_clicked)));
    }

    @Test
    public void clickedButtonTest() {
        onView(withId(R.id.btn_click)).check(matches(withText(R.string.text_clicked)));
    }
}
