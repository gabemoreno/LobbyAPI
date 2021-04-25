package me.gerpaderp.lobbyapi.util;

import java.util.ArrayList;
import java.util.List;

import me.gerpaderp.lobbyapi.objects.Lobby;

public class LobbyUtil {
	
	private static List<Lobby> lobbies = new ArrayList<Lobby>();
	
	public static List<Lobby> getLobbies(){
		return lobbies;
	}
	
}
