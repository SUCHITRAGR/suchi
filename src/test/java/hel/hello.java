package hel;

public class hello {

        public static void main(String[] args) {
            int no=5;
            boolean flag=false;
            for(int i=2;i <= no /2; i++){
                if(no % i == 0){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println(no+"is a prime no");}
            else{
                System.out.println(no+"not a prime no");}
        }
    }


