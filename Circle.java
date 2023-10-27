class Circle{
    public static void main(String[] args){
         double diameter = 2.5;
         double rpm = 6;
         double time = 60;

         double circumference = 2 * Math.PI * diameter/2;
         double distance = circumference * rpm * time;

         System.out.println(distance);
    }
}