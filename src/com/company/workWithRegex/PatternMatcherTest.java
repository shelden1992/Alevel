package com.company.workWithRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {


        String text="\n" +
                "We frequently nerd out about HTML emails. Whether it’s Scoping beautiful messages to share, or writing about tips and tricks to successfully build and troubleshoot them, we often concentrate on HTML-based emails. And, we’re not alone—the majority of email-related articles out there focus on emails with graphics, images, colors, and links—all of which require HTML. But, what about the equally-as-important-yet-often-forgotten plain-text emails?\n" +
                "\n" +
                "Plain-text emails are just that—plain text. They are the email equivalent to a letter written on a typewriter—no images, no pretty fonts, no hyperlinks. While they may not be nearly as attractive as HTML-based emails, they play a significant role in a well-rounded email marketing strategy.\n" +
                "\n" +
                "In this post, we’ll give plain-text emails the attention they deserve—focusing on why they’re important, how to properly build them, and we’ll provide plenty of examples along the way.";
        Pattern emails  = Pattern.compile("([a-zA-Z]+)-(text|bases|related)"); //обьект не создается через NEW!!!! группа - это все,что заключенно в круглые скобки ()!!!!!
        Matcher matcher = emails.matcher(text);  //вызываем метод на паттерне, а матчер возвращает новый обьект класса матчер

        while (matcher.find()){//очередное соответствие
            System.out.println(matcher.group());//получаем совпадение может вызываться с аргументами или без! можем при вызове передать число, и это будет ID группы() group(1)- выведет ([a-zA-Z]+)




        }



    }
}

