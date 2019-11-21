

class Assignment2{

    public static void main(String[] args) {
        System.out.println("\nAssignment – 2 : Java Fundamentals – Using Loops, Conditions, Operators\n");

        String name = "ATOS-Syntel";

        System.out.println("First Pattern.");

        int i = 0;
        while(i <= name.length()){

            int k = name.length();
            while(k > i){
                System.out.print(" ");
                k--;
            }

            int j = 0;
            while(j < i){
                System.out.print(name.charAt(j) + " ");
                j++;
            }

            System.out.print("\n");
            i++;
        }
        

        System.out.println("\n\nSecond Pattern.");

        int i2 = 1;
        while(i2 <= name.length()){

            int k2 = name.length();
            while(k2 > i2){
                System.out.print(" ");
                k2--;
            }

            int j2 = 1;
            while(j2 <= (i2*2)-1){

                if(j2==1 || j2 == (i2*2)-1 || i2==name.length()){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

                j2++;
            }

            System.out.print("\n");
            i2++;
        }

    }
}