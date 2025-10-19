package com.deeptrain.scenario.controller;

import com.deeptrain.scenario.entity.NodeBlock;
import com.deeptrain.scenario.service.NodeBlockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/scenario")
@CrossOrigin(origins = "*")
public class NodeBlockController {

    private final NodeBlockService service;

    public NodeBlockController(NodeBlockService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveScenario(@RequestBody List<NodeBlock> blocks) {
        service.saveAll(blocks);
        return ResponseEntity.ok("Scenario saved successfully");
    }

    @GetMapping("/list")
    public ResponseEntity<List<NodeBlock>> listAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/load/{id}")
    public ResponseEntity<List<NodeBlock>> loadScenario(@PathVariable ("id") Long scenarioId) {
        List<NodeBlock> blocks = service.findByScenarioId(scenarioId);
        if (blocks.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(blocks);

    }

    @PutMapping("/update/{scenarioId}")
    public ResponseEntity<String> updateScenario(
            @PathVariable Long scenarioId,
            @RequestBody List<NodeBlock> blocks) {
        try {
            service.updateScenario(scenarioId, blocks);
            return ResponseEntity.ok("Scenario updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError()
                    .body("Error updating scenario: " + e.getMessage());
        }
    }

}
