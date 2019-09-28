import java.util.Scanner;

public class TestMarks {
    public static void randomArray(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
                arr[i]= (int) (Math.random() * 90 + 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number floor points:=");
        int floorPoints= sc.nextInt();
        int amount=0;
        int[] All_points=new int[30];
        randomArray(All_points);
        for (int i = 0; i <30; i++) {
            System.out.print(All_points[i]+" ");
            if(All_points[i]>floorPoints){
                amount++;
            }
        }
        System.out.println();
        System.out.println("The number of students passing the exam is:=  "+amount);
    }
}
