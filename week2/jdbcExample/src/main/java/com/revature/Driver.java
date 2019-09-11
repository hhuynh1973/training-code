package com.revature;

import com.revature.model.Player;
import com.revature.repositories.PlayerDAO;
import com.revature.repositories.PlayerDAOImplPJDBC;
import com.revature.utils.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		//ConnectionUtil.getConnection();
		
		PlayerDAO playerDAO = new PlayerDAOImplPJDBC();
		
		playerDAO.getPlayers()
				.forEach((Player p)->{System.out.println(p);});
		
		for(Player p : playerDAO.getPlayers()) {
			System.out.println(p);
		}

	}

}
