package me.gerpaderp.lobbyapi.objects;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.gerpaderp.lobbyapi.enums.LobbyState;
import me.gerpaderp.lobbyapi.events.LobbyEndEvent;
import me.gerpaderp.lobbyapi.events.LobbyJoinEvent;
import me.gerpaderp.lobbyapi.events.LobbyLeaveEvent;
import me.gerpaderp.lobbyapi.events.LobbyStartEvent;
import me.gerpaderp.lobbyapi.util.LobbyUtil;

public class Lobby {
	
	public Lobby(String id) {
		this.id = id;
		this.lobbyState = LobbyState.INACTIVE;
		LobbyUtil.getLobbies().add(this);
	}
	
	private String id;
	private int maxPlayers;
	private int minPlayers;
	private final List<Player> players = new ArrayList<Player>();
	private LobbyState lobbyState;
	
	public final String getID() {
		return id;
	}
	
	public final void setID(String id) {
		this.id = id;
	}
	
	public final int getMaxPlayers() {
		return maxPlayers;
	}
	
	public final void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}
	
	public final int getMinPlayers() {
		return minPlayers;
	}
	
	public final void setMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
	}
	
	public final boolean isFull() {
		return getPlayers().size() >= getMaxPlayers();
	}
	
	public final List<Player> getPlayers(){
		return players;
	}
	
	public final LobbyState getState() {
		return this.lobbyState;
	}
	
	public final void addPlayer(Player player) {
		players.add(player);
		Bukkit.getPluginManager().callEvent(new LobbyJoinEvent(this));
	}
	
	public final void removePlayer(Player player) {
		players.remove(player);
		Bukkit.getPluginManager().callEvent(new LobbyLeaveEvent(this));
	}
	
	public final void start() {
		Bukkit.getPluginManager().callEvent(new LobbyStartEvent(this));
		this.lobbyState = LobbyState.ACTIVE;
	}
	
	public final void end() {
		Bukkit.getPluginManager().callEvent(new LobbyEndEvent(this));
		getPlayers().forEach(this::removePlayer);
		this.lobbyState = LobbyState.INACTIVE;
	}
}
