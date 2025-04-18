package com.moviebookingapp.project.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "users")
@Builder
public class User {
    @Id
    private String loginId;
    private String firstName;
    private String lastName;
    private String password;
    private String contactNumber;

    // Add unique index for email
    @Indexed(unique = true)
    private String email;
}
