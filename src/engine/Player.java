package engine;

import java.util.ArrayList;

import model.world.Champion;

public class Player  {
	private String name;
	private Champion leader;
	private ArrayList<Champion> team;

	public void setLeader(Champion leader) {
		this.leader = leader;
	}
	public Champion getLeader() {
		return this.leader;
	}


	public String getName() {
		return name;
	}
	public ArrayList<Champion> getTeam() {
		return team;
	}
	public Player(String name) {
		this.name=name;
		team=new ArrayList<Champion>();
	}
}