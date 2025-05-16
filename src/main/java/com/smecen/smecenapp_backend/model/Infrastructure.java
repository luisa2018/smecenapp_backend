package com.smecen.smecenapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "infrastructure")
public class Infrastructure {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        // Relación con Journey
        @ManyToOne
        @JoinColumn(name = "journey_id", nullable = false)
        private Journey journey;

        // Campos seleccionados como strings separados por coma
        @Column(name = "environment_types", length = 100)
        private String environmentTypes; // dev,test,prod

        @Column(name = "payment_models", length = 100)
        private String paymentModels; // ondemand,reserved,spot

        @Column(name = "application_types", length = 100)
        private String applicationTypes; // web,mobile,backend

        @Column(name = "compute_services", length = 100)
        private String computeServices; // ec2,fargate,eks

        @Column(name = "database_services", length = 100)
        private String databaseServices; // rds,dynamo,elasticache

        @Column(name = "storage_services", length = 100)
        private String storageServices; // s3,cloudfront

        @Column(name = "network_security", length = 100)
        private String networkSecurity; // waf,elb,vpc,subnet

        @Column(name = "monitoring_services", length = 100)
        private String monitoringServices; // guardduty,cloudwatch,config

        // Getters y setters

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Journey getJourney() {
            return journey;
        }

        public void setJourney(Journey journey) {
            this.journey = journey;
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
