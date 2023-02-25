package com.assessment.exchangeapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name ="auditInfo")
public class Audit {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long requestId;

    public enum Status{
        REQUEST_SENT,
        RESPONSE_RECEIVED
    }

    @Enumerated
    @Column(name = "status")
    private Status status;

    @Column(name = "request")
    private String request;

    @Column(name = "response")
    private String response;

    @Column(name = "create_ts")
    private LocalDateTime createTime;

    @Column(name = "updated_ts")
    private LocalDateTime updateTime;
}