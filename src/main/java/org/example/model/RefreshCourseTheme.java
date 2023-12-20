package org.example.model;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString

public class RefreshCourseTheme {
    public String title;
    public String description;
    public String content;
    public int courseThemeNumber;
    public int courseId;
}
