package inheri;

public class Main {

        int a=10;
    }

    class Sample extends Main{
        void disp() {
            System.out.println("dispuu");

        }
    }
    class Mainclass {
        public static void main(String[] args) {
            Sample s1=new Sample();
            System.out.println(s1.a);
            s1.disp();
        }





    }

