import org.junit.Assert;
import org.junit.Test;

public class Hacker {
    public static void main(String[] args) {

    } public static int [] secret_lenin(int players, int [] ages, int time){
        if ((players < 4)||(players > 27))return new int[]{-1};
        int bolsheviks = players/2;

        players -= bolsheviks;
        int monarchists = (int)Math.ceil(players/3.0);
        players-=monarchists;

        int liberals = players;
        boolean b = false;
        for(int i: ages){
            if (i>=18){
                b=true;
                break;
            }
        }
        int lenin = 0;
        if(b) {
          if (Math.abs(bolsheviks - monarchists) <= 3) {
                lenin = 4;

            } else {
                lenin = 5;
            }
            if (liberals%monarchists==0){
                lenin--;
            }

            if(players%2>0){
                lenin++;
            }

            if (time<120){
                lenin=3;
            }



        }


        int [] array = new int[4];
        array[0]=bolsheviks;
        array[1]=monarchists;
        array[2]=liberals;
        array[3]=lenin;
        return array;

    }

    @Test
    public void invalidNumberOfPlayers(){
       int[] array =  secret_lenin(2,new int[]{18,20},130 );
        Assert.assertArrayEquals( new int []{-1},array);
    }
    @Test
    public void unitTests2(){
        int[] array =  secret_lenin(2,new int[]{18,20},130 );
        Assert.assertArrayEquals( new int []{-1},array);
    }







}
