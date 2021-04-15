import java.util.*;

class Main {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();
    // System.out.println("Input Num: " + x);
    // System.out.println("After add 10, the value is " + (x+10));
    // System.out.println("After sub 10, the value is " + (x-10));
    
    // 마지막 숫자 잘라 내기
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Input num: ");
    // int x = sc.nextInt(); // 그냥 next()만 쓰면 string으로 받는다.
    // System.out.println("cut last number" + (x/10));
    // System.out.println("last number is " + (x %10));

    // 삼각형 넓이
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Find area of triangle");

    // System.out.print("base: ");
    // double x = sc.nextDouble();

    // System.out.print("hight: ");
    // double y = sc.nextDouble();
    // System.out.println("Area is " + (x*y)/2);

    // 구이 겉넓이와 부피
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Find area and volume of pharase ");
    // double pi = 3.1416;
    // System.out.print("radius: ");
    // double x = sc.nextDouble();

    // System.out.println("Area: " + (4*pi*Math.pow(x,2)));
    // System.out.println("Volume: " + (4*pi*Math.pow(x,3))/3);
    

    //random
    // Random rand = new Random();
    
    // int x = 1 + rand.nextInt(9);
    // int y = - 1 - rand.nextInt(9);
    // int z = 10 + rand.nextInt(89);

    // System.out.println("3 Cases of random num");
    // System.out.println("Positive Single digit number"+x);
    // System.out.println("Negative Single digit number"+y);
    // System.out.println("Double digit number"+z);

    // 
    // Scanner sc = new Scanner(System.in);
    // Random rand = new Random();

    // int x = rand.nextInt(5);
    // // System.out.print("Input number");
    // // int y = sc.nextInt();
    // System.out.println(x);

    // 이름 출력
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Family name: ");
    // String x = sc.next();
    // System.out.print("Last name: ");
    // String y = sc.next();
    // System.out.println("Hello Welcome to Java World mr." + x+y);


    // String 변수를 문자열로 초기화 하거나 변수에 문자열을 대입
    // String s1 = "ABC";
    // String s2 = "XYZ";
    // System.out.println("String s1 is " + s1);
    // System.out.println("String s2 is " + s2);

    // String s1 = "FBI";
    // String s2 = "CSI";
    // System.out.println("String s1 is " + s1);
    // System.out.println("String s2 is " + s2);

    // 입력한 값이 음이면 음이라 표시
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Input Num: ");
    // int x = sc.nextInt();

    // if (x < 0) {
    //   System.out.println(x +" is negative");
    // } else {
    //   System.out.println(x +" is positive");
    // }

    // 절대값
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Intput num: ");
    // int x = sc.nextInt();

    // if (x < 0) {
    //   System.out.println(-x);
    // } else {
    //   System.out.println(x);
    // }

    // 2개의 정수를 입력 받아 그 수가 약수 인지 아닌지 확인
    // Scanner sc = new Scanner(System.in);

    // System.out.print("find num: ");
    // int x = sc.nextInt();

    // System.out.print("input num: ");
    // int y = sc.nextInt();

    // if(x % y == 0) {
    //   System.out.println(y + " is " + x + "'s factor");
    // } else {
    //   System.out.println("no relation between two number");
    // }

    // ! 를 사용
    // Scanner sc = new Scanner(System.in);

    // System.out.print("find num: ");
    // int x = sc.nextInt();

    // System.out.print("input num: ");
    // int y = sc.nextInt();

    // if(x % y != 0) {
    //   System.out.println("no relation between two number");
      
    // } else {
    //   System.out.println(y + " is " + x + "'s factor");
    // }


    // 3 가지 양수, 음수, 0 을 판단
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Input number: ");
    // int x = sc.nextInt();

    // if (x == 0) {
    //   System.out.println("The value is 0");
    // } else if (x < 0) {
    //   System.out.println("The value is negative number");
    // } else {
    //   System.out.println("The value is positive number");
    // }

    //
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Input number: ");
    // int x = sc.nextInt();
    // System.out.print("Input number: ");
    // int y = sc.nextInt();
    
    // if (x > y) {
    //   System.out.println("x is bigger than y");
    // } else if (x < y) {
    //   System.out.println("y is bigger than x");
    // } else {
    //   System.out.println("y and x are same");
    // }

    // 수/우/미/양/가
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Your Score: ");
    // int x = sc.nextInt();

    // if (x > 100) {
    //   System.out.println("Wrong Score");
    // } else if(x >= 90) {
    //   System.out.println("A");
    // } else if (x >= 80){
    //   System.out.println("B");
    // } else if (x >= 70) {
    //   System.out.println("C");
    // } else if (x >= 60) {
    //   System.out.println("D");
    // } else {
    //   System.out.println("F");
    // }

    // 두 수의 차
    // Scanner sc = new Scanner(System.in);
    // System.out.print("number x is: ");
    // int x = sc.nextInt();
    // System.out.print("number y is: ");
    // int y = sc.nextInt();
    // int z = (x-y);
    // int min = ((z)<0 ? (-z):z);

    // System.out.println("diffence between two number is " + min);
    // if (z > 0) {
    //   System.out.println("diffence between two number is " + z);
    // } else {
    //   System.out.println("diffence between two number is " + (-z));
    // }

    // 최솟값 찾기
    // Scanner sc = new Scanner(System.in);
    // System.out.print("number x is: ");
    // int x = sc.nextInt();
    // System.out.print("number y is: ");
    // int y = sc.nextInt();
    // System.out.print("number z is: ");
    // int z = sc.nextInt();
    // int min = x;

    // if (min > y) min = y;
    // if (min > z) min = z;
    // System.out.print("Min number is " + min);

    // 중앙값
    // Scanner sc = new Scanner(System.in);
    // System.out.print("number x is: ");
    // int x = sc.nextInt();
    // System.out.print("number y is: ");
    // int y = sc.nextInt();
    // System.out.print("number z is: ");
    // int z = sc.nextInt();

    // if((x <= y && y <= z) || (z <= y && y <= x)) {
    //   System.out.println("Mid number is " + y);
    // } else if ((z <= x && x <= y) || (y <= x && x <= z)) {
    //   System.out.println("Mid number is " + x);
    // } else {
    //   System.out.println("Mid number is " + z);
    // }

    // 내림차순
    Scanner sc = new Scanner(System.in);
    System.out.print("number a is: ");
    int a = sc.nextInt();
    System.out.print("number b is: ");
    int b = sc.nextInt();
    System.out.print("number c is: ");
    int c = sc.nextInt();
    // System.out.println("a>=b가 되도록 정렬했습니다.");
    // if (a < b) {
    //   int t = a;
    //   a = b;
    //   b = t;
    // }
    if (a > b) {
      int t = a;
      a = b;
      b = t;
    } else if(b > c) {
      int t = b;
      b = c; 
      c = t;
    } else if(c > a) {
      int t = c;
      c = a;
      b = t;
    }

    System.out.println("변수 a는 " + a + "입니다.");
    System.out.println("변수 b는 " + b + "입니다.");
    System.out.println("변수 c는 " + c + "입니다.");

  }
}