package com.moa.moapay.domain.card.model.dto;

import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CardRegistrationRequestDto {
    private UUID memberUuid;
    private String cardNumber;
    private String cvc;
}
