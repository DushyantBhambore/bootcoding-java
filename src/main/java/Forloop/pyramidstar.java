package Forloop;

//WAP to make such a pattern like a pyramid with an asterisk
public class pyramidstar {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=(i);j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
