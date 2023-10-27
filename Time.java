class Time{
    public static void main(String[] args){

    int time = 3800;
     int hour = time /60 /60;
     int min = time %(60*10)/60 ;
     int sec = time % 60  ;

     System.out.println(hour + ":" + min/10 + min%10 + ":" +sec);
}
}