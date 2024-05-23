public class Card {
    public int cardNum, suitNum, cardValue;
    public String suitName, cardName;

    //suitNUm --> 0 = spade, 1 = heart, 2 = clubs, 3 = diamonds
    //cardNum+name --> 1 = ace, 2-10 = integer.toString(), 11 = Jack, 12 = Queen, King = 13

    public Card(int pcardNum, int psuitNum){
       cardNum=pcardNum;
       suitNum=psuitNum;
        if (suitNum==0){
           suitName="spade";
       } else if (suitNum==1) {
           suitName="heart";
       } else if (suitNum==2) {
            suitName="clubs";
        }
        else{
            suitName="diamonds";
        }

        if(cardNum>1 && cardNum<11){
            cardName=Integer.toString(cardNum);
        } else if (cardNum==1) {
            cardName="Ace";
        } else if (cardNum==11) {
            cardName="Jack";
        } else if (cardNum==12) {
            cardName="Queen";
        }else{
            cardName="King";
        }

    }

    public void printInfo(){
        System.out.println(cardName + " of " + suitName);
    }
}
