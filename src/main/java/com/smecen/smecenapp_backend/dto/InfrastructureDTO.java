package com.smecen.smecenapp_backend.dto;

public class InfrastructureDTO {
    private Integer id;
    private Integer journeyId; // Referencia por ID
    private String environmentTypes;
    private String paymentModels;
    private String applicationTypes;
    private String computeServices;
    private String databaseServices;
    private String storageServices;
    private String networkSecurity;
    private String monitoringServices;

    // Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(Integer journeyId) {
        this.journeyId = journeyId;
    }

    public String getEnvironmentTypes() {
        return environmentTypes;
    }

    public void setEnvironmentTypes(String environmentTypes) {
        this.environmentTypes = environmentTypes;
    }

    public String getPaymentModels() {
        return paymentModels;
    }

    public void setPaymentModels(String paymentModels) {
        this.paymentModels = paymentModels;
    }

    public String getApplicationTypes() {
        return applicationTypes;
    }

    public void setApplicationTypes(String applicationTypes) {
        this.applicationTypes = applicationTypes;
    }

    public String getComputeServices() {
        return computeServices;
    }

    public void setComputeServices(String computeServices) {
        this.computeServices = computeServices;
    }

    public String getDatabaseServices() {
        return databaseServices;
    }

    public void setDatabaseServices(String databaseServices) {
        this.databaseServices = databaseServices;
    }

    public String getStorageServices() {
        return storageServices;
    }

    public void setStorageServices(String storageServices) {
        this.storageServices = storageServices;
    }

    public String getNetworkSecurity() {
        return networkSecurity;
    }

    public void setNetworkSecurity(String networkSecurity) {
        this.networkSecurity = networkSecurity;
    }

    public String getMonitoringServices() {
        return monitoringServices;
    }

    public void setMonitoringServices(String monitoringServices) {
        this.monitoringServices = monitoringServices;
    }
}
