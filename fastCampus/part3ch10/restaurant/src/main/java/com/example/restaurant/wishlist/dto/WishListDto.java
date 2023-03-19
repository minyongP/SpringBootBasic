package com.example.restaurant.wishlist.dto;

import com.example.restaurant.db.MemoryDbEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishListDto {
    private int index;

    private String title;
    private String category;
    private String address;
    private String roadAddress;
    private String homePageLink;
    private String imageLink;
    private Boolean isVisit;
    private int visitCount;
    private LocalDateTime lastVisitData;
}