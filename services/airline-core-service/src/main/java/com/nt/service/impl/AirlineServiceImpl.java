package com.nt.service.impl;

import com.nt.enums.AirlineStatus;
import com.nt.payload.request.AirlineRequest;
import com.nt.payload.response.AirlineResponse;
import com.nt.service.AirlineService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AirlineServiceImpl implements AirlineService {

    @Override
    public AirlineResponse createAirline(AirlineRequest airlineRequest, Long ownerId) {
        return null;
    }

    @Override
    public AirlineResponse getAirlineByOwner(Long ownerId) throws Exception {
        return null;
    }

    @Override
    public AirlineResponse getAirlineById(Long id) throws Exception {
        return null;
    }

    @Override
    public Page<AirlineResponse> getAllAirLines(Pageable pageable) {
        return null;
    }

    @Override
    public AirlineResponse updateAirline(AirlineRequest airlineRequest, Long ownerId) throws Exception {
        return null;
    }

    @Override
    public void deleteAirline(Long id, Long ownerId) throws Exception {

    }

    @Override
    public AirlineResponse changeStatusByAdmin(Long airlineId, AirlineStatus status) throws Exception {
        return null;
    }

    @Override
    public List<AirlineDropdownItem> getAirlineDropdown() {
        return null;
    }
}
