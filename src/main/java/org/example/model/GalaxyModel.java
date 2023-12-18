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
public class GalaxyModel {
    private Integer galaxyId;
    private String galaxyName;
    private String galaxyDescription;
    private List<OrbitModel> OrbitList;
    private Integer systemCount;
    private Integer explorerCount;
    private Integer keeperCount;
    private List<PersonModel> keepers;
    private List<PersonModel> explorers;
}
