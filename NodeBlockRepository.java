package com.deeptrain.scenario.repository;

import com.deeptrain.scenario.entity.NodeBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NodeBlockRepository extends JpaRepository<NodeBlock, String> {


    List<NodeBlock> findByScenarioId(Long scenarioId);

    void deleteByScenarioId(Long scenarioId);

}
