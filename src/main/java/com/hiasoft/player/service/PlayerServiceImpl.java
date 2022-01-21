package com.hiasoft.player.service;

import com.hiasoft.player.model.Player;
import com.hiasoft.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepository playerRepository;

    @Override
    public Player getPlayerById(long id) {
        Optional<Player> fetchedPlayer = playerRepository.findById(id);
        return fetchedPlayer.orElse(null);
    }

    @Override
    public Set<Player> getAllPlayers() {
        return new HashSet<>(playerRepository.findAll());
    }

    @Override
    public Player deletePlayerById(long id) {
        Player playerToBeDeleted = getPlayerById(id);

        if(playerToBeDeleted != null){
            playerRepository.deleteById(id);
            return playerToBeDeleted;
        }

        return null;
    }

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }
}
