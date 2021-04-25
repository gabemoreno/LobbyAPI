package me.gerpaderp.lobbyapi.events;

import org.bukkit.event.HandlerList;

import me.gerpaderp.lobbyapi.objects.Lobby;

public final class LobbyLeaveEvent extends GenericLobbyEvent {

	public LobbyLeaveEvent(Lobby lobby) {
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
