
class Main {
    public static void main(String[] args){

        int length = 100;
        int breath = 70;

        int area_of_rect = length * breath;

        int triL = length/2;
        int triB = breath;

        double area_of_tri =  1.0 / 2 *triL * breath;
         
         double area_of_shaded = (area_of_rect - 2*area_of_tri);

         System.out.println(area_of_shaded);
    }
}