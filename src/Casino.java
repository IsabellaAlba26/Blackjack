public class Casino {

    public Card aceHearts;
    public Card parkingLot;
    public Card[] deck;
    public int counter=0;
    public int randomInt;
    public static void main(String[] args) {
        Casino Encore = new Casino();
        System.out.println("Welcome to Encore - the home of gambling in Boston");
    }

    public Casino(){
  //    aceHearts = new Card(1,1);
  //    aceHearts.printInfo();
        System.out.println("this is the original, unshuffled deck");
        deck = new Card[52];
        for(int x=0; x<4; x=x+1) {//outer loop changes suitNum
            for (int i = 1; i < 14; i = i + 1) { //innter loop changes cardNum
                deck[counter] = new Card(i, x);
                counter=counter+1;
            }
        }
        for (int i=0; i<52; i=i+1){
            deck[i].printInfo();
        }

        System.out.println("this is the shuffled deck");
        shuffle();
        for (int i=0; i<52; i=i+1){
            deck[i].printInfo();
        }
    }

    public void shuffle(){
        for(int i=1; i<52; i=i+1){
            randomInt=(int)(Math.random()*53);
            parkingLot=deck[i];
            deck[i]=deck[randomInt];
            deck[randomInt]=parkingLot;

        }
    }

}
