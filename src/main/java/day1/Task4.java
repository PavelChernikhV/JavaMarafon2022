package day1;
/*
    Используя цикл while, выведите в столбик строки вида “Олимпиада year года”, где year - это число,
    которое принимает значения, начиная от 1980 до 2020, с шагом увеличения равным 4.
    То есть на первой итерации цикла, year равен 1980, а на каждой следующей итерации, значение year увеличивается на 4.
    Строки такого вида выводятся до тех пор, пока значение year не станет больше 2020.
    Пример:
year = 1980, вывод должен быть таким:
Олимпиада 1980 года
Олимпиада 1984 года
Олимпиада 1988 года
Олимпиада 1992 года
……
Олимпиада 2016 года
Олимпиада 2020 года
 */
public class Task4 {
    public static void main(String[] args) {
        int year = 1976;

        while(year <=2016){
            year +=4;
            System.out.println("Олимпиада " + year + " года");
        }
    }
}
