package com.example.ws.server3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user_info")
public class UserInfo {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String phone;
    @Column(name = "e_mail")
    private String eMail;
}
