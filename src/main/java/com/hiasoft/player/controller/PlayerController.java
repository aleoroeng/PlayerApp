package com.hiasoft.player.controller;

import com.hiasoft.player.model.Player;
import com.hiasoft.player.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/player")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PlayerController {

    private final PlayerService playerService;

    @GetMapping
    public String sayHi(){
        String l = "hi";
        return l;
    }

    @PostMapping
    public Player addPlayer(@RequestBody Player body){
        return playerService.addPlayer(body);
    }
}
