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
public class PersonModel {
    private Integer personId;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Integer rating;
    private List<Integer> systems;
}
