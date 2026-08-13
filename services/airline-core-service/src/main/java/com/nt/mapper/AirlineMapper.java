package com.nt.mapper;

import com.nt.embeddable.Support;
import com.nt.model.Airline;
import com.nt.payload.request.AirlineRequest;
import com.nt.payload.response.AirlineResponse;

public class AirlineMapper {

    public static Airline toEntity(AirlineRequest request, Long ownerId){
        if(request == null){return null;}

        Airline airline = Airline.builder()
                .iataCode(request.getIataCode())
                .icaoCode(request.getIcaoCode())
                .name(request.getName())
                .alias(request.getAlias())
                .logoUrl(request.getLogoUrl())
                .website(request.getWebsite())
                .status(request.getStatus())
                .alliance(request.getAlliance())
                .headquartersCityId(request.getHeadquartersCityId())
                .ownerId(ownerId)
                .build();

        if(request.getSupportEmail()!=null
        || request.getSupportPhone()!= null
        || request.getSupportHours()!= null){
            airline.setSupport(
                    Support.builder()
                            .email(request.getSupportEmail())
                            .phone(request.getSupportPhone())
                            .hours(request.getSupportHours())
                            .build()
            );
        }
        return airline;
    }

    public static AirlineResponse toResponse(Airline airline){
        if(airline == null) return null;

        return AirlineResponse.builder()
                .id(airline.getId())
                .iataCode(airline.getIataCode())
                .icaoCode(airline.getIcaoCode())
                .name(airline.getName())
                .alias(airline.getAlias())
                .logoUrl(airline.getLogoUrl())
                .website(airline.getWebsite())
                .status(airline.getStatus())
                .alliance(airline.getAlliance())
                .support(airline.getSupport())
                .createdAt(airline.getCreatedAt())
                .updatedAt(airline.getUpdatedAt())
                .ownerId(airline.getOwnerId())
                .updatedById(airline.getUpdatedById())
                .build();
    }
}
