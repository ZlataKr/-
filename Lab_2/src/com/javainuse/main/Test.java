package com.javainuse.main;
import com.javainuse.main.*;
import org.junit.runner.RunWith;
import java.awt.*;
import java.awt.print.Book;
KieServices ks = KieServices.Factory.get();
KieContainer kContainer = ks.getKieClasspathContainer();
KieSession kSession = kContainer.newKieSession ("ksession-rules");
kSession = kContainer.newKieSession("ksession-rules");

@RunWith(DroolsJUnitRunner.class)
@DroolsFiles(value = "Rules.drl", location = "/drl/")

public class Test {
   @DroolsSession
  StatefulSession session;

    Client a = new Client(1, "Den","a@gmail.com", false);
    Client b = new Client(2, "Hope","b@mail.com", false);

    //акция ко дню рождения автора (скидка 50%)
    {
        Book b1 = new Book (001, "Haruki Murakami", "1Q84", 400, 5, a);
        kSession.insert(b1);
        kSession.fireAllRules();
    }
    //Распродажа! Скидка 20% на книги со склада
    {
        Book b3 = new Book (003, "Son Won-Pyung", "Almond", 313, 10, a);
        kSession.insert(b3);
        kSession.fireAllRules();
    }
    //Распродажа книг Марка Леви с большим кол-вом на складе. Скидка 80% и бонус на следующую покупку
    {
        Book b2 = new Book (002, "Mark Levi", "P.S. from Paris", 257, 13, b);
        kSession.insert(b2);
        kSession.fireAllRules();
    }
    //Бонус со следуюзей покупки
    {
        Book b4 = new Book (004, "Jeffrey Young", "Get out of the vicious circle", 500, 2, b);
        kSession.insert(b4);
        kSession.fireAllRules();
    }

    private static class kSession {
        public static void insert(Book b1) {
        }

        public static void fireAllRules() {
        }
    }
}
