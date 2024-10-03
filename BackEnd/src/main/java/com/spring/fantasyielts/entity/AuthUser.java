package com.spring.fantasyielts.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Document(collection = "user")
@AllArgsConstructor
@NoArgsConstructor
public class AuthUser {
    @Id
    private ObjectId id;

    private String username;

    private String password;

    private String firstname;

    private String lastname;

    private String role;

    private boolean active;

   
}
