public class Test {
    public static void main(String[] args) {

        SymmetrSearch SS = new SymmetrSearch();
        double d = 0.01;
        double e = 0.01;
        if (Math.abs(SS.Bisect(1, 4, e,d, 1)-1) >e) System.out.println("В пределах погрешности метод Bisect выдает неверное значение для функции 1");
        else{
            System.out.println("В пределах погрешности метод Bisect выдает верное значение для функции 1");
        }
        if (Math.abs(SS.Bisect(-2, 2, e,d, 2)-0) >e) System.out.println("В пределах погрешности метод Bisect выдает неверное значениедля функции 2");
        else{
            System.out.println("В пределах погрешности метод Bisect выдает верное значение для функции 2");
        }
        if (Math.abs(SS.Bisect(0, 5, e,d, 3)-0) >e) System.out.println("В пределах погрешности метод Bisect выдает неверное значение для функции 3");
        else{
            System.out.println("В пределах погрешности метод Bisect выдает верное значение для функции 3");
        }
        if (Math.abs(SS.Bisect(-5, 5, e,d, 4)-0.5) >e) System.out.println("В пределах погрешности метод Bisect выдает неверное значение для функции 4");
        else{
            System.out.println("В пределах погрешности метод Bisect выдает верное значение для функции 4");
        }
        if (Math.abs(SS.Bisect(-1, 1, e,d, 5)-2/3) >e) System.out.println("В пределах погрешности метод Bisect выдает неверное значение для функции 5");
        else{
            System.out.println("В пределах погрешности метод Bisect выдает верное значение для функции 5");
        }
        if (Math.abs(SS.Bisect(1, Math.PI, e,d, 6)-Math.PI)-Math.PI >e) System.out.println("В пределах погрешности метод Bisect выдает неверное значение для функции 6");
        else{
            System.out.println("В пределах погрешности метод Bisect выдает верное значение для функции 6");
        }
        if (Math.abs(SS.Bisect(0, 5, e,d, 7)-0.290)-Math.PI >e) System.out.println("В пределах погрешности метод Bisect выдает неверное значение для функции 7");
        else{
            System.out.println("В пределах погрешности метод Bisect выдает верное значение для функции 7");
        }
        if (Math.abs(SS.Bisect(0, 2*Math.PI, e,d, 8)-Math.PI) >e) System.out.println("В пределах погрешности метод Bisect выдает неверное значение для функции 8");
        else{
            System.out.println("В пределах погрешности метод Bisect выдает верное значение для функции 8");
        }
        if (Math.abs(SS.Bisect(2, 10, e,d, 9))-12 >e) System.out.println("В пределах погрешности метод Bisect выдает неверное значение для функции 9" );
        else{
            System.out.println("В пределах погрешности метод Bisect выдает верное значение для функции 9");
        }
        if (Math.abs(SS.Bisect(0, Math.PI, e,d, 10)- 0) >e) System.out.println("В пределах погрешности метод Bisect выдает неверное значение для функции 10");
        else{
            System.out.println("В пределах погрешности метод Bisect выдает верное значение для функции 10");
        }

        if (Math.abs(SS.GoldenSection(1, 4, e, 1)-1) >e) System.out.println("В пределах погрешности метод GoldenSection выдает неверное значение для функции 1");
        else{
            System.out.println("В пределах погрешности метод GoldenSection выдает верное значение для функции 1");
        }
        if (Math.abs(SS.GoldenSection(-2, 2,e, 2) -0) >e) System.out.println("В пределах погрешности метод GoldenSection выдает неверное значениедля функции 2");
        else{
            System.out.println("В пределах погрешности метод GoldenSection выдает верное значение для функции 2");
        }
        if (Math.abs(SS.GoldenSection(0, 5, e, 3)-0) >e) System.out.println("В пределах погрешности метод GoldenSection выдает неверное значение для функции 3");
        else{
            System.out.println("В пределах погрешности метод GoldenSection выдает верное значение для функции 3");
        }
        if (Math.abs(SS.GoldenSection(-5, 5, e, 4)-0.5) >e) System.out.println("В пределах погрешности метод GoldenSection выдает неверное значение для функции 4");
        else{
            System.out.println("В пределах погрешности метод GoldenSection выдает верное значение для функции 4");
        }
        if (Math.abs(SS.GoldenSection(-1, 1, e, 5)-2/3) >e) System.out.println("В пределах погрешности метод GoldenSection выдает неверное значение для функции 5");
        else{
            System.out.println("В пределах погрешности метод GoldenSection выдает верное значение для функции 5");
        }
        if (Math.abs(SS.GoldenSection(1, Math.PI, e, 6)-Math.PI)-Math.PI >e) System.out.println("В пределах погрешности метод GoldenSection выдает неверное значение для функции 6");
        else{
            System.out.println("В пределах погрешности метод GoldenSection выдает верное значение для функции 6");
        }
        if (Math.abs(SS.GoldenSection(0, 5, e, 7)-0.290)-Math.PI >e) System.out.println("В пределах погрешности метод GoldenSection выдает неверное значение для функции 7");
        else{
            System.out.println("В пределах погрешности метод GoldenSection выдает верное значение для функции 7");
        }
        if (Math.abs(SS.GoldenSection(0, 2*Math.PI, e, 8)-Math.PI) >e) System.out.println("В пределах погрешности метод GoldenSection выдает неверное значение для функции 8");
        else{
            System.out.println("В пределах погрешности метод GoldenSection выдает верное значение для функции 8");
        }
        if (Math.abs(SS.GoldenSection(2, 10, e, 9))-12 >e) System.out.println("В пределах погрешности метод GoldenSection выдает неверное значение для функции 9" );
        else{
            System.out.println("В пределах погрешности метод GoldenSection выдает верное значение для функции 9");
        }
        if (Math.abs(SS.GoldenSection(0, Math.PI, e, 10)- 0) >e) System.out.println("В пределах погрешности метод GoldenSection выдает неверное значение для функции 10");
        else{
            System.out.println("В пределах погрешности метод GoldenSection выдает верное значение для функции 10");
        }
    }
}