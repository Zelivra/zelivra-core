package pl.dayfit.zelivracore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.dayfit.zelivracore.dto.AreaRequest;
import pl.dayfit.zelivracore.service.AreaService;

import java.util.Map;

@RestController
class AreaController {
    private final AreaService areaService;

    AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @PostMapping("/areas")
    public ResponseEntity<?> createArea(@RequestBody AreaRequest area)
    {
        areaService.createArea(area);
        return ResponseEntity
                .ok(Map.of("message", "Area created successfully"));
    }
}
