package com.natrix.EazyBankBackendApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "notice_details")
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "notice_id")
    private Integer noticeId;

    @Column(name = "notice_summary")
    private String noticeSummary;

    @Column(name = "notice_details")
    private String noticeDetails;

    @Column(name = "notice_beg_date")
    private Date noticeBegDate;

    @Column(name = "notice_end_date")
    private Date noticeEndDate;

    @Column(name = "notice_create_date")
    private Date noticeCreateDate;

    @Column(name = "notice_update_date")
    private Date noticeUpdateDate;
}
