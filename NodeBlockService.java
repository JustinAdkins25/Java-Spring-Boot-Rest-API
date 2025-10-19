package com.deeptrain.scenario.service;

import com.deeptrain.scenario.entity.NodeBlock;
import com.deeptrain.scenario.repository.NodeBlockRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NodeBlockService {

    private final NodeBlockRepository repository;

    public NodeBlockService(NodeBlockRepository repository) {
        this.repository = repository;
    }

    public List<NodeBlock> saveAll(List<NodeBlock> blocks) {
        return repository.saveAll(blocks);
    }

    public List<NodeBlock> findAll() {
        return repository.findAll();
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public void findById(String id) {
        repository.findById(id);
    }

    public List<NodeBlock> findByScenarioId(Long scenarioId) {
        return repository.findByScenarioId(scenarioId);
    }

    @Transactional 
    public void updateScenario(Long scenarioId, List<NodeBlock> blocks) {
        repository.deleteByScenarioId(scenarioId);
        // Assign the scenarioId to all new blocks before saving
       for (NodeBlock block : blocks) {
           block.setScenarioId(scenarioId);
            }
            repository.saveAll(blocks);
        }
    







    public void deleteByScenarioId(Long scenarioId) {
        repository.deleteByScenarioId(scenarioId);
    }



}
