package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House Cards:\n" + game.getHouseCards().getCards());
        System.out.println("Your Cards:\n" + game.getYourCards().getCards() + "(" + game.score(game.getYourCards()) + ")" );
    }

  @Override
    public boolean hitMe() {
        System.out.println("Another Card?(y/n)");
        while (true){
            if (game.score(game.getYourCards()) > 21)
                return false;
            String s = user.nextLine();
            if (s.equals("y"))
                return true;
            if (s.equals("n"))
                return false;
            System.out.println("Please enter an acceptable option");
    }
    }

  @Override
    public void gameOver() {
        System.out.println("Game Over");
        System.out.println("House Holds: " + game.getHouseCards().getCards() + "(" + game.score(game.getHouseCards()) + ")" );
        System.out.println("You Hold: " + game.getYourCards().getCards() + "(" + game.score(game.getYourCards()) + ")" );
        if (game.score(game.getYourCards()) > 21 || game.score(game.getYourCards()) < game.score(game.getHouseCards()))
            System.out.println("You Lose!!!");
        else if (game.score(game.getYourCards()) == game.score(game.getHouseCards()))
            System.out.println("Draw!!!");
        else if (game.score(game.getYourCards()) == 21 || game.score(game.getHouseCards()) > 21 || game.score(game.getYourCards()) > game.score(game.getHouseCards()))
            System.out.println("You Win!!!");
    }

}