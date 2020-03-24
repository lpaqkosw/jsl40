package sample.control;

import sample.action.Action;
import sample.action.board.*;

public class BoardActionFactory {
	private static BoardActionFactory instance = new BoardActionFactory();
	public static BoardActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.print("ActionFactory : "+ command);
		if(command.equals("board_list")) {
			action = new BoardListAction();
		}
		else if (command.equals("board_view")) {
			action = new BoardViewAction();
		}
		else if (command.equals("board_write")) {
			action = new BoardWriteAction();
		}
		else if (command.equals("board_write_pro")) {
			action = new BoardWriteProAction();
		}
		else if (command.equals("board_view")) {
			action = new BoardViewAction();
		}
		else if (command.equals("board_del")) {
			action = new BoardDelAction();
		}
		else if (command.equals("board_del_pro")) {
			action = new BoardDelProAction();
		}
		else if (command.equals("board_mod")) {
			action = new BoardModAction();
		}
		else if (command.equals("board_mod_pro")) {
			action = new BoardModProAction();
		}
		else if (command.equals("board_search")) {
			action = new BoardSearchAction();
		}
		
		return action;
	}
}
