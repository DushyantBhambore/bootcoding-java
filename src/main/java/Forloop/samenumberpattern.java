package Forloop;

//WAP to make such a pattern like right angle triangle with a number
//        which will repeat a number in a row.
public class samenumberpattern {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
