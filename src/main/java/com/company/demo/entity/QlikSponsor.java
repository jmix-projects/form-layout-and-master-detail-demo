package com.company.demo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "QLIK_SPONSOR", indexes = {
        @Index(name = "IDX_QLIK_SPONSOR_SERVER", columnList = "SERVER_ID")
})
@Entity
public class QlikSponsor {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "SPONSOR_NAME", nullable = false)
    @NotNull
    private String sponsorName;

    @JoinColumn(name = "SERVER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QlikServer server;

    public QlikServer getServer() {
        return server;
    }

    public void setServer(QlikServer server) {
        this.server = server;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}