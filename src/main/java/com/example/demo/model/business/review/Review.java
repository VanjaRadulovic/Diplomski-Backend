package com.example.demo.model.business.review;

import com.example.demo.model.business.Business;
import com.example.demo.model.business.Features;
import com.example.demo.model.business.Image;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String review;
    private Long userId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "review")
    private List<Image> images;
    private int stars;
    @Embedded
    private ReviewReaction reviewReaction;

    @ManyToOne  // Review belongs to a Business
    @JoinColumn(name = "business_id")
    private Business business;
}
