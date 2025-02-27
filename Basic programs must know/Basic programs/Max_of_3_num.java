public class Max_of_3_num {
    public static void main(String[] args) {

        int a = 120, b = 40, c = 140, max;

        max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);

        // max=0;
        // if(a>b){
        //     max=a;
        // }
        // else{
        //     max=b;
        // }
        // if(c>b){
        //     max=c;
        // }
        // System.out.println(max);

    }

}
