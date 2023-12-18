package org.example.model;
import lombok.*;

@Getter
@Builder
@With
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@ToString
public class CourseModel {
    private Integer courseId;
    private String title;

    @EqualsAndHashCode.Exclude
    private String creationDate;
    @EqualsAndHashCode.Exclude
    private String lastModified;
    private String description;
}
