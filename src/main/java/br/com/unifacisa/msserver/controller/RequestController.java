package br.com.unifacisa.msserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
@Slf4j
public class RequestController {
    private static final Integer TWO_SECONDS = 2000;

    @GetMapping
    public ResponseEntity<String> getRequest() throws InterruptedException {
        Thread.sleep(TWO_SECONDS);
        log.info("OK");
        return ResponseEntity.ok("OK");
    }

}
