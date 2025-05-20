package com.smecen.smecenapp_backend.dto;

public class FinancialGoalDTO {
    private Integer id;
    private Double estimatedBudget;
    private Double monthlyLimit;
    private String optimizationPriority;
    private String evaluationPeriod;
    private Integer journeyId;

    public Double getEstimatedBudget() {
        return estimatedBudget;
    }

    public void setEstimatedBudget(Double estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public Double getMonthlyLimit() {
        return monthlyLimit;
    }

    public void setMonthlyLimit(Double monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptimizationPriority() {
        return optimizationPriority;
    }

    public void setOptimizationPriority(String optimizationPriority) {
        this.optimizationPriority = optimizationPriority;
    }

    public String getEvaluationPeriod() {
        return evaluationPeriod;
    }

    public void setEvaluationPeriod(String evaluationPeriod) {
        this.evaluationPeriod = evaluationPeriod;
    }

    public Integer getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(Integer journeyId) {
        this.journeyId = journeyId;
    }
}
