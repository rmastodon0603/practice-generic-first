package org.itstep.step04;

import org.itstep.step02.Pair;

/**
 * Обобщения. Вопросы о компиляции
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class CompileDriver {

    public static void main(String[] args) {

        // TODO: перед удалением комментариев отметьте каждую строчку, где есть присвоение - сокмпилируется ли код или нет
        Pair<String, Integer> p1;
        Pair<String, Number> p2;
        Pair<Object, Object> p3;
        Pair<?, ?> p4;
        Pair<?, ? extends Number> p5;

        p1 = new Pair<String, Integer>("A", 7);//Да
        int a = p1.getSecond();//Да
//
//        p1 = new Pair<Integer, Double>(23, 12.0);//Нет, для p1 уже определены типы String и Integer
//
//        p2 = new Pair<String, Integer>("B", 8);//Нет, для p2 уже определены типы String и Number
//
//        p3 = new Pair<String, Integer>("C", 9);//Да(Нет, нужно типы Pair должны быть тоже Object)
//
        p4 = new Pair<String, String>("House", "Car");//Да
        p4 = new Pair<String, Integer>("D", 10);//Да
//
//        Integer b = p4.getSecond();//Нет, нужно явное привидение типов
        Integer c = (Integer) p4.getSecond();//Да
//
//        p5 = new Pair<String, String>("E", "G");// Нет, второй параметр должен быть Byte, Double, Float, Integer, Long или Short
        p5 = new Pair<String, Double>("E", 11.0);//Да
        p5 = new Pair<String, Integer>("E", 11);//Да

//        Integer d = p5.getSecond();//Нет, нужно явное привидение типов
        Integer e = (Integer) p5.getSecond();//Да
    }

}
