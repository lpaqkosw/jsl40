package sample.control;

import sample.action.Action;

import sample.action.guest.*;

public class GuestActionFactory {
	private static GuestActionFactory instance = new GuestActionFactory();
	public static GuestActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.print("ActionFactory : "+ command);
		if(command.equals("guest_list")) {
			action = new GuestListAction();
		}
		else if (command.equals("guest_view")) {
			action = new GuestViewAction();
		}
		else if (command.equals("guest_write")) {
			action = new GuestWriteAction();
		}
		else if (command.equals("guest_write_pro")) {
			action = new GuestWriteProAction();
		}
		else if (command.equals("guest_view")) {
			action = new GuestViewAction();
		}
		else if (command.equals("guest_mod")) {
			action = new GuestModAction();
		}
		else if (command.equals("guest_mod_pro")) {
			action = new GuestModProAction();
		}
		
		return action;
	}
}
