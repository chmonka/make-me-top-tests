package org.example.model;

import lombok.*;

import java.util.List;
@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class ProgressUserGalaxy {
    private Integer personId;
    private String firstName;
    private String lastName;
    private String patronymic;
    private List<Integer> openedSystems;
    private List<StudySystem> studiedSystems;
    private List<Integer> closedSystems;


}


