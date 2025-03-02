package com.project.eventmartmonolithic.global.security.dto;

import lombok.Builder;

@Builder
public record JwtDTO (

        String accessToken,

        String refreshToken
){

}
