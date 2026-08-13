package com.nt.controller;

import com.nt.payload.request.AirlineRequest;
import com.nt.payload.response.AirlineResponse;
import com.nt.service.AirlineService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/airlines")
@RequiredArgsConstructor
public class AirlineController {

    private final AirlineService airlineService;

    @PostMapping
    public ResponseEntity<AirlineResponse> createAirline(@RequestBody @Valid AirlineRequest request, @RequestHeader("X-User-Id") Long userId){
        AirlineResponse airline = airlineService.createAirline(request, userId);
        return ResponseEntity.status(HttpStatus.CREATED).body(airline);
    }
    @GetMapping("/admin")
    public ResponseEntity<AirlineResponse> getAirlineByOwner(@RequestHeader("X-User-Id") Long userId) throws Exception{
        AirlineResponse airlineByOwner = airlineService.getAirlineByOwner(userId);
        return ResponseEntity.ok(airlineByOwner);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AirlineResponse> getAirlineById(@PathVariable Long id) throws Exception{
        AirlineResponse airlineById = airlineService.getAirlineById(id);
        return ResponseEntity.ok(airlineById);
    }
}
