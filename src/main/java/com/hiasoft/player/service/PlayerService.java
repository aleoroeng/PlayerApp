package com.hiasoft.player.service;

import com.hiasoft.player.model.Player;

import java.util.Set;

public interface PlayerService {
    Player getPlayerById(long id);
    Set<Player> getAllPlayers();
    Player deletePlayerById(long id);
    Player addPlayer(Player player);
}
