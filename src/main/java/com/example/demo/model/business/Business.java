package com.example.demo.model.business;


import com.example.demo.model.business.review.Review;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @Embedded
    private BusinessAddress address;
    private String website;
    private String phoneNumber;
    private String about;
    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL)
    private Set<WorkingHours> workingHours;
    @ManyToOne
    @JoinColumn(name = "business_user_id")
    private BusinessUser businessUser;

    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL)
    private List<Review> reviews;

}
