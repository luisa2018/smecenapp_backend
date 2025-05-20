package com.smecen.smecenapp_backend.service.impl;

import com.smecen.smecenapp_backend.model.FinancialGoal;
import com.smecen.smecenapp_backend.repo.IFinancialGoalRepo;
import com.smecen.smecenapp_backend.repo.IGenericRepo;
import com.smecen.smecenapp_backend.service.IFinancialGoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialGoalServiceImpl  extends CRUDImpl<FinancialGoal, Integer> implements IFinancialGoalService {
    @Autowired
    private IFinancialGoalRepo repo;

    @Override
    protected IGenericRepo<FinancialGoal, Integer> getRepo() {
        return repo;
    }

    @Override
    public FinancialGoal findByJourneyId(Integer journeyId) {
        return repo.findByJourneyId(journeyId);
    }
}
