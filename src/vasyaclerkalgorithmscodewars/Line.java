package vasyaclerkalgorithmscodewars;

/**
 *
 * @author Amr Halawani
 */
public class Line {
     // static int noOf25= 0 ;
    //  static int noOf50= 0 ;
    //  static int noOf100= 0 ;
     // static boolean check=true;
     // static int i= 0;
      
  public static String Tickets(int[] peopleInLine)
  {
       int noOf25= 0 ;
      int noOf50= 0 ;
      int noOf100= 0 ;
      boolean check=true;
      int i= 0;
        for(i=0;i <= peopleInLine.length-1 ;i++){
            switch (peopleInLine[i]) {
                case 25:
                    noOf25++;
                    break;
                case 50:
                    if (noOf25 <=0){
                        check = false;
                    }else{
                          noOf50++;
                          noOf25--;
                    }
                    break;
                case 100:
                    if( noOf25 <=0 ){
                        check = false;
                    }
                    else if( noOf50 <= 0 && noOf25 <=2 ){
                        check = false;
                    }
                    else if (noOf50 <= 0 && noOf25 >=3){
                        noOf25= noOf25-3;
                    }
                    else if(noOf25 >=1 && noOf50 >= 1){ 
                     noOf25--;
                     noOf50--;
                    }
                    noOf100++;
                    break;
                default:
                    break;
            }
          
       
        }
        System.out.println(" noOf25=" + noOf25+" noOf50="+noOf50+" noOf100="+noOf100);
       return check ? "YES" : "NO" ;
  }

}