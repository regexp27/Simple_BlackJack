package BlackJack;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    private static Random rdm = new Random();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int card1 = rdm.nextInt(10);
        int card2 = rdm.nextInt(10);
        int drawCard = rdm.nextInt(10);
        System.out.println("Welcome to Mitchell's blackjack program!");
        System.out.println("### \t ###");
        System.out.println("### \t ###");
        System.out.println("### \t ###"+
                "\nYou get a "+ card1+" and a " +card2);
        int total  = card1 + card2;
        System.out.println("Your total is " +total );
        int dealersCard = rdm.nextInt(10);
        System.out.println("### \t ???");
        System.out.println("### \t ???");
        System.out.println("### \t ???"+
                "\nThe dealers has a "+ dealersCard+" showing, and a hidden card. " );
        System.out.println("His total is hidden, too.");
        int hidden_card = rdm.nextInt(10);
        int dealerDraw = rdm.nextInt(10);
        int my_total_cards = total + drawCard;
        int dealer_total_cards = dealersCard + hidden_card + dealerDraw;
        do{
            System.out.println("Would you like to \" hit \" or \"stay\" or \" check \" ");
            String res = input.next();
            if (res.equals("hit") || res.equals("HIT")){
                System.out.println("### \t ### \t ###");
                System.out.println("### \t ### \t ###");
                System.out.println("### \t ### \t ###"+
                                "\nYou drew a " +drawCard );
                System.out.println("Your total is " + my_total_cards);
            }else {
                if (res.equals("stay") || res.equals("STAY")) {
                    System.out.println("Okay, dealer's turn.");
                    System.out.println("### \t ###");
                    System.out.println("### \t ###");
                    System.out.println("### \t ###" +
                            "\nHis hidden card was a " + hidden_card);
                    System.out.println("His total was " + (dealersCard + hidden_card));
                    System.out.println("Dealer chooses to hit.");
                    System.out.println("### \t ### \t ###");
                    System.out.println("### \t ### \t ###");
                    System.out.println("### \t ### \t ###" +
                            "\nHe draws a " + dealerDraw);
                    System.out.println("His total is " + dealer_total_cards + "\n");
                    System.out.println("Dealer stays.");
                } else if(res.equals("check") || res.equals("CHECK")){
                    System.out.println("Dealer's total is : " + dealer_total_cards);
                    System.out.println("Your total is : " +my_total_cards );
                    if (my_total_cards > dealer_total_cards){
                        System.out.println("YOU WIN!");
                    }else {
                        System.out.println("DEALER WIN, YOU LOSE!");
                    }
                    break;
                }

            }
        }while (true);
    }
}
