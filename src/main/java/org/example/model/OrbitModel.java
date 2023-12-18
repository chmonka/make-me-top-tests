package org.example.model;
import lombok.*;



import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@With
@Builder
@EqualsAndHashCode
@ToString
public class OrbitModel {
    private Integer orbitId;
    private Integer systemCount;
    private Integer orbitLevel;
    private Integer galaxyId;

}
