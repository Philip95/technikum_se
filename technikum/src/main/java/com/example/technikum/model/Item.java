package com.example.technikum.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Getter
public class Item {
    @NonNull private String name;
    private Date dueDate;
    private String category;

}
