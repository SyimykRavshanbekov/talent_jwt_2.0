package com.example.spring_rest_api_session_java7.dto.student;

import com.example.spring_rest_api_session_java7.enums.StudyFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {
    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String password;

    private StudyFormat studyFormat;
}
