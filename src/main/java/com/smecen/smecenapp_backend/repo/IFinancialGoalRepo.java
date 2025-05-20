package com.smecen.smecenapp_backend.repo;

import com.smecen.smecenapp_backend.model.FinancialGoal;

public interface IFinancialGoalRepo extends IGenericRepo<FinancialGoal, Integer> {
    default FinancialGoal findByJourneyId(Integer journeyId) {
        return null;
    }
}
