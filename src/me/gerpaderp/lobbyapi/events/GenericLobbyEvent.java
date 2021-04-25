package me.gerpaderp.lobbyapi.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.gerpaderp.lobbyapi.objects.Lobby;

public class GenericLobbyEvent extends Event {
	
	public GenericLobbyEvent(Lobby lobby) {
		this.lobby = lobby;
	}
	
	private final Lobby lobby;
	
	public Lobby getLobby() {
		return lobby;
	}

	public static final HandlerList handlers = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}

}
