package com.example.demo.model.business;


import com.example.demo.model.business.menu.Menu;
import jakarta.persistence.*;

import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Restaurant  extends Business {

    private String price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Catagory> catagories;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Features> features;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
    private List<Image> images;

}
