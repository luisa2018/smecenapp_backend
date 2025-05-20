package com.smecen.smecenapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "financial_goals")
public class FinancialGoal {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Journey getJourney() {
        return journey;
    }

    public void setJourney(Journey journey) {
        this.journey = journey;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "estimated_budget")
    private Double estimatedBudget;

    @Column(name = "monthly_limit")
    private Double monthlyLimit;

    @Column(name = "optimization_priority")
    private String optimizationPriority;

    @Column(name = "evaluation_period")
    private String evaluationPeriod;

    @ManyToOne
    @JoinColumn(name = "journey_id", nullable = false)
    private Journey journey;
}
