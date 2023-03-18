package com.roky.thunderspi.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class LibCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idLibCategory;
    String categoryName;
}
