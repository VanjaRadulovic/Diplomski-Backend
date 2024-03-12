package com.example.demo.model.business.review;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ReviewReaction {
    private int Helpful;
    private int Thanks;
    private int LoveThis;
    private int OhNo;

}
