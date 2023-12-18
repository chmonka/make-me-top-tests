package org.example.database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum DbList {

    GALAXY_DB("galaxy_db", "galaxyCreate.sql", "galInsert.sql"),
    AUTH_DB("auth_db", "authCreate.sql", "authInsert.sql"),
    COURSE_DB("course_db", "courseCreate.sql", "courseInsert.sql"),
    COURSE_REGISTRATION_DB("course_registration_db", "courseRegistrationCreate.sql", "courseRegistrationInsert.sql"),
    EXPLORER_DB("explorer_db", "explorerCreate.sql", "explorerInsert.sql"),
    FEEDBACK_DB("feedback_db", "feedbackCreate.sql", "feedbackInsert.sql"),
    HOMEWORK_DB("homework_db", "homeworkCreate.sql", "homeworkInsert.sql"),
    KEEPER_DB("keeper_db", "keeperCreate.sql", "keeperInsert.sql"),
    PERSON_DB("person_db", "personCreate.sql", "personInsert.sql"),
    PROGRESS_DB("progress_db", "progressCreate.sql", "progressInsert.sql"),;

    private String dbName;
    private String createQuery;
    private String insertQuery;

}
