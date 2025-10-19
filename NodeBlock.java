package com.deeptrain.scenario.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Map;

@Entity
@Table(name = "node_blocks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NodeBlock {

    @Id
    private String id;

    private Long scenarioId;
    private String type;
    private String title;
    private String parentId;
    private Double offsetX;
    private Double offsetY;
    private String lessonType;

    @Column(length = 2000)
    private String lessonContent;
    private String lessonImage;
    private String lessonVideo;
    private String estimatedTime;
    private String quizTitle;
    private String passingScore;
    private String timeLimit;

    @Column(columnDefinition = "TEXT")
    private String questionsJson; // JSON string for questions list
    private String conditionExpression;
    private String truePathLabel;
    private String falsePathLabel;
    private String checkpointTitle;
    private String checkpointNote;
    private String welcomeMessage;
    private String eventType;
    private String triggerCondition;

    @Column(length = 2000)
    private String eventContent;
    private String eventAnswer;
    private Integer randomTriggerChance;
    private String description;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getScenarioId() {
        return scenarioId;
    }

    public void setScenarioId(Long scenarioId) {
        this.scenarioId = scenarioId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public String getLessonContent() {
        return lessonContent;
    }

    public void setLessonContent(String lessonContent) {
        this.lessonContent = lessonContent;
    }

    public String getLessonImage() {
        return lessonImage;
    }

    public void setLessonImage(String lessonImage) {
        this.lessonImage = lessonImage;
    }

    public String getLessonVideo() {
        return lessonVideo;
    }

    public void setLessonVideo(String lessonVideo) {
        this.lessonVideo = lessonVideo;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getQuizTitle() {
        return quizTitle;
    }

    public void setQuizTitle(String quizTitle) {
        this.quizTitle = quizTitle;
    }

    public String getPassingScore() {
        return passingScore;
    }

    public void setPassingScore(String passingScore) {
        this.passingScore = passingScore;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getQuestionsJson() {
        return questionsJson;
    }

    public void setQuestionsJson(String questionsJson) {
        this.questionsJson = questionsJson;
    }

    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public String getTruePathLabel() {
        return truePathLabel;
    }

    public void setTruePathLabel(String truePathLabel) {
        this.truePathLabel = truePathLabel;
    }

    public String getFalsePathLabel() {
        return falsePathLabel;
    }

    public void setFalsePathLabel(String falsePathLabel) {
        this.falsePathLabel = falsePathLabel;
    }

    public String getCheckpointTitle() {
        return checkpointTitle;
    }

    public void setCheckpointTitle(String checkpointTitle) {
        this.checkpointTitle = checkpointTitle;
    }

    public String getCheckpointNote() {
        return checkpointNote;
    }

    public void setCheckpointNote(String checkpointNote) {
        this.checkpointNote = checkpointNote;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTriggerCondition() {
        return triggerCondition;
    }

    public void setTriggerCondition(String triggerCondition) {
        this.triggerCondition = triggerCondition;
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }

    public String getEventAnswer() {
        return eventAnswer;
    }

    public void setEventAnswer(String eventAnswer) {
        this.eventAnswer = eventAnswer;
    }

    public Integer getRandomTriggerChance() {
        return randomTriggerChance;
    }

    public void setRandomTriggerChance(Integer randomTriggerChance) {
        this.randomTriggerChance = randomTriggerChance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
