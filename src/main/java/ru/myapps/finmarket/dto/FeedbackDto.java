package ru.myapps.finmarket.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class FeedbackDto {
    private final Long id;
    private final String name;
    private final String phone;
    private final String email;
    private final String text;
    private final boolean processed;
}
