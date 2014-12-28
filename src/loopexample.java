/**
 * Created by deepak on 27/12/14.
 */
public class loopexample {
    public static void main(String[] args){
        int beerNum =99;
        String name= "bottles";
        while (beerNum > 0) {
            if ( beerNum ==10)
            {
             name="Last bottles";

        }
            System.out.println(beerNum + " " + name +"of beer on the wall" );

            System.out.println(beerNum + " " + name +"of beer" );

            System.out.println(" Take one down." );
            System.out.println(" pass arround." );
            beerNum = beerNum - 1;
            if (beerNum > 0){
                System.out.println( beerNum+ " " + name + " last beer on the wall" );

            }
            else {

                System.out.println( "no more bottles of beer on the wall");
            }

        }
    }
}
