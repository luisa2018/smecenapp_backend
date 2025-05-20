package com.smecen.smecenapp_backend.service;

import com.smecen.smecenapp_backend.model.FinancialGoal;

public interface IFinancialGoalService extends ICRUD<FinancialGoal, Integer> {
    FinancialGoal findByJourneyId(Integer journeyId);
}
