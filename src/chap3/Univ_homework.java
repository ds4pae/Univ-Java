package chap3;

class Card{
	int number;
	String shape;

	void print() {
		if(number == 1)
			System.out.printf("Card Number : ACE\t Card Shape : %s%n",shape);
		else if(number == 10)
			System.out.printf("Card Number : 10\t Card Shape : %s%n",shape);
		else if(number == 11)
			System.out.printf("Card Number : JACK\t Card Shape : %s%n",shape);
		else if(number == 12)
			System.out.printf("Card Number : QUEEN\t Card Shape : %s%n",shape);
		else if(number == 13)
			System.out.printf("Card Number : KING\t Card Shape : %s%n",shape);
		else
			System.out.printf("Card Number : %d \t Card Shape : %s%n",number,shape);		
	}
}

public class Univ_homework {
	public static void main(String[] args) {

		Card[] card = new Card[52];
		String[] cardShape = {"Spade", "Diamond", "Heart", "Clover"};
		for (int i = 0 ; i < card.length ; i++) {
			card[i] = new Card();
			card[i].number = i%13+1;
			card[i].shape = cardShape[i/13];
			card[i].print();
		}

	}

}
