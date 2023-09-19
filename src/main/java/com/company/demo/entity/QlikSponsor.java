package com.company.demo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
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

    @InstanceName
    @Column(name = "SPONSOR_NAME", nullable = false)
    @NotNull
    private String sponsorName;

    @JoinColumn(name = "SERVER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QlikServer server;

    @Column(name = "USER_LIMIT")
    private Integer userLimit;

    @Column(name = "TMP_USER_LIMIT")
    private Integer tmpUserLimit;

    @Column(name = "DEV_LIMIT")
    private Integer devLimit;

    @Column(name = "TMP_DEV_LIMI")
    private Integer tmpDevLimi;

    @Column(name = "SEGMENT")
    private String segment;

    @Column(name = "COST_CENTER")
    private String costCenter;

    @Column(name = "COMMENT_")
    @Lob
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public Integer getTmpDevLimi() {
        return tmpDevLimi;
    }

    public void setTmpDevLimi(Integer tmpDevLimi) {
        this.tmpDevLimi = tmpDevLimi;
    }

    public Integer getDevLimit() {
        return devLimit;
    }

    public void setDevLimit(Integer devLimit) {
        this.devLimit = devLimit;
    }

    public Integer getTmpUserLimit() {
        return tmpUserLimit;
    }

    public void setTmpUserLimit(Integer tmpUserLimit) {
        this.tmpUserLimit = tmpUserLimit;
    }

    public Integer getUserLimit() {
        return userLimit;
    }

    public void setUserLimit(Integer userLimit) {
        this.userLimit = userLimit;
    }

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