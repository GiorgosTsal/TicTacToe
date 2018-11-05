package ticTacToe;

import java.util.Scanner;

public class Main {
	
	private static Scanner systIn;

	public static void main(String[] args) {
		
		
		System.out.println("*************************");
		System.out.println("Tic-Tac-Toe vs DummyBot!");
		System.out.println("*************************");
		System.out.println();
		System.out.println("You will play first. "
				+ "\r\n" + 
				"Please enter the column (A, B or C) and then the row (1, 2, or 3) of your move. (e.g. B2)" );
		System.out.println();
		// TODO Auto-generated method stub
		
// Create game and initialize it.
// First player will be 'x'
		Tictactoe game = new Tictactoe();
		
		
// Lets print the board
		game.printBoard();
	
		systIn = new Scanner(System.in);
		int x = 0,y=0;
while ((!game.checkForWin()) && (!game.isBoardFull())){
	
	
	
	System.out.print("Player Move (X) :" );
	String input = systIn.nextLine();
	
	
	if(game.checkInput(input)){
		switch(input.charAt(0)){
	
		case('A') : y = 0 ; break ;
		case('B') : y = 1 ; break ;
		case('C') : y = 2 ; break ;
		}
		switch(input.charAt(1)){
		case('1') : x = 0 ; break ;
		case('2') : x = 1 ; break ;
		case('3') :  x = 2 ; break ;
		
		}
		if(game.placeMark(x, y)){
			if ((game.checkForWin()) || (game.isBoardFull())){
				break;
			}
			game.printBoard();
			game.changePlayer();
			game.ComputerPlay();
			game.printBoard();
		}
		else{
			System.out.println("Place already taken, play again");
		}

	}
	
	

}
game.printBoard();

		
		
// Did we have a winner?
		if (game.checkForWin()) {
			game.printWinner();
			System.out.println(" won!");
		   System.exit(0);
		}
		else if (game.isBoardFull()) {
			   System.out.println("Appears we have a draw!");
			   System.exit(0);
	}

// No winner or draw, switch players to 'o'
		game.changePlayer();
}
	
	
	
	
}
