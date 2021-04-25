package me.gerpaderp.lobbyapi.events;

import org.bukkit.event.HandlerList;

import me.gerpaderp.lobbyapi.objects.Lobby;

public final class LobbyStartEvent extends GenericLobbyEvent {

	public LobbyStartEvent(Lobby lobby) {
		super(lobby);
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
