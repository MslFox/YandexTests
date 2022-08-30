import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/InputFiles/input_test1.txt");
//        FileReader reader = new FileReader("src/InputFiles/input_test2.txt");
//        FileReader reader = new FileReader("src/InputFiles/input_test3.txt");
        Stack<Integer> stack = new Stack<>();
        // завожу счетчик-нумерации символов строки ,
        int count = 0;
        int x;
        // пробегаю по всей строке формулы
        while ((x = reader.read()) > 0) {
            //  по условию задачи нумерация символов с строке начинается с 1
            count++;
           // при парности скобок (см. ниже условие заполнения верхнего значения) удаляю из стека верхнее значение
            if (x == ')' && stack.size() > 0 && stack.peek() > 0 ) {
                stack.pop();
                continue;
            }
            // при остутствии пары, добавляю в стек счеткик с + либо -
            if (x == ')') stack.add((count) * -1);
            if (x == '(') stack.add((count));
        }
        // если в стеке один элемент - последовательность почти правильная
        // вывожу модуль count(номер символа в строке формулы)
        // В остальных случаях -1 согласно условию задачи
        System.out.println(stack.size() == 1 ? Math.abs(stack.pop()) : -1 );
    }
}

