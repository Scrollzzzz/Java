package com.company.task30;

import com.company.task24.Regex;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import java.io.IOException;
import java.io.PrintWriter;

//Тестирование метода isIP класса Regex (task24)

public class RegexTest {

    Regex regex = new Regex();
    boolean expected;
    boolean actual;
    private static StringBuilder builder = new StringBuilder("# Вывод из task30\n> Ошибка в 3-ем тесте допущена специально\n\n");

    @AfterClass
    public static void afterClass() throws IOException {
        PrintWriter logFile = new PrintWriter("src/com/company/task31/test30out.md");
        logFile.write(builder.toString());
        logFile.close();
    }

    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            if (description != null) {
                builder.append(description);
            }
            builder.append(" : test failed : ");
            if (e != null) {
                builder.append(e.toString().replace("<", " ").replace(">", ""));
                builder.append("<br/>");
            }
        }

        @Override
        protected void succeeded(Description description) {
            if (description != null) {
                builder.append(description);
            }
            builder.append(" : test passed<br/>");
        }
    };

    @Test
    public void test1() {
        expected = true;
        actual= regex.isIP("127.0.0.1");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        expected = true;
        actual= regex.isIP("255.255.255.0");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        expected = true;
        actual= regex.isIP("1300.6.7.8");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        expected = false;
        actual= regex.isIP("abc.def.gha.bcd");
        Assert.assertEquals(expected, actual);
    }
}