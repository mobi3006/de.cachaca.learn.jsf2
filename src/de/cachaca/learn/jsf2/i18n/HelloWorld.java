package de.cachaca.learn.jsf2.i18n;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;


public class HelloWorld {

    public static void main(String[] args) {
        List<Locale> locales = 
                new ArrayList<Locale>(
                        asList(
                                new Locale("pierre"),
                                new Locale("unitedstatesofamerica"),
                                new Locale("deutschland"),
                                new Locale("ch"),
                                new Locale("de", "CH")
                        )
                );
        for (Locale currentLocale : locales) {
            ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
            System.out.println(messages.getString("greetings"));
        }
    }
}
