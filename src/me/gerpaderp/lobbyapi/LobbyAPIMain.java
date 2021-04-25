package me.gerpaderp.lobbyapi;

import org.bukkit.plugin.java.JavaPlugin;

import me.gerpaderp.lobbyapi.objects.Lobby;
import me.gerpaderp.lobbyapi.util.LobbyUtil;

public class LobbyAPIMain extends JavaPlugin {

	public void onEnable() {
		instance = this;
	}

	public void onDisable() {
		LobbyUtil.getLobbies().forEach(Lobby::end);
	}
	
	private static LobbyAPIMain instance;
	
	public static LobbyAPIMain getInstance() {
		return instance;
	}

}
