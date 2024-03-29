package com.withsports.pointservice.domain.point.web;

import com.withsports.pointservice.domain.point.dto.PointDetailHistory;
import com.withsports.pointservice.domain.point.dto.PointDetailHistoryDto;
import com.withsports.pointservice.domain.point.web.response.PointBalanceResponse;
import com.withsports.pointservice.domain.point.service.PointService;
import com.withsports.pointservice.domain.point.dto.PointDto;
import com.withsports.pointservice.domain.point.web.response.PointDetailHistoryResponse;
import com.withsports.pointservice.global.dto.Result;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PointController {
    private final PointService pointService;


    //TODO 포인트 확인
    @GetMapping("/point")
    ResponseEntity<Result> getPoint(@RequestHeader("user-id") String userId){
        System.out.println("포인트 확인 요청 api");
        PointDto pointdto = pointService.getPoint(userId);

        PointBalanceResponse pointBalanceResponse = PointBalanceResponse.of(pointdto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Result.createSuccessResult(pointBalanceResponse));
    }

    //TODO : 포인트 내역 조회
    @GetMapping("/points")
    ResponseEntity<Result> getPoints(@RequestHeader("user-id") String userId,
                                     @PageableDefault Pageable pageable){
        System.out.println("포인트 내역 조회 요청 api");
        Page<PointDetailHistoryDto> pointDetailHistoryListDto = pointService.getPointDetailHistory(userId,pageable);
        System.out.println("pointDetailHistoryListDto = " + pointDetailHistoryListDto);
        List<PointDetailHistory>  pointDetailHistories = pointDetailHistoryListDto.stream()
                .map(PointDetailHistory::of)
                .toList();
        System.out.println("pointDetailHistories = " + pointDetailHistories);
        PointDetailHistoryResponse pointDetailHistoryResponse = new PointDetailHistoryResponse(
                pointDetailHistories,
                pointDetailHistoryListDto.getNumber(),
                pointDetailHistoryListDto.getTotalPages()
        );
        System.out.println("pointDetailHistoryResponse = " + pointDetailHistoryResponse);

        return ResponseEntity.status(HttpStatus.OK)
                .body(Result.createSuccessResult(pointDetailHistoryResponse));
    }

}
