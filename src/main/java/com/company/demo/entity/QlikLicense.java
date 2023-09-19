package com.company.demo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "QLIK_LICENSE", indexes = {
        @Index(name = "IDX_QLIK_LICENSE_USER", columnList = "USER_ID"),
        @Index(name = "IDX_QLIK_LICENSE_SPONSOR", columnList = "SPONSOR_ID")
})
@Entity
public class QlikLicense {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QlikUser user;

    @JoinColumn(name = "SPONSOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QlikSponsor sponsor;

    @Column(name = "EXP_DATE")
    private LocalDate expDate;

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public QlikSponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(QlikSponsor sponsor) {
        this.sponsor = sponsor;
    }

    public QlikUser getUser() {
        return user;
    }

    public void setUser(QlikUser user) {
        this.user = user;
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