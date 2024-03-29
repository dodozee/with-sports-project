package com.withsports.gifticonservice.domain.order.dto.producer;


import com.withsports.gifticonservice.domain.order.entity.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KafkaProduceOrderAcceptedDto {
    private Long id;
    private Long pointId;
    private Long gifticonId;
    private String gifticonName;
    private Long fromUserId;
    private String fromUserNickname;
    private Long toUserId;
    private String toUserNickname;
    private Long price;
    private Long amount;
    private LocalDateTime orderTime;
    private OrderStatus orderStatus;


    public static KafkaProduceOrderAcceptedDto of(KafkaProduceOrderPlacedDto dto, Long pointId) {
        return KafkaProduceOrderAcceptedDto.builder()
                .id(dto.getId())
                .pointId(pointId)
                .gifticonId(dto.getGifticonId())
                .gifticonName(dto.getGifticonName())
                .fromUserId(dto.getFromUserId())
                .fromUserNickname(dto.getFromUserNickname())
                .toUserId(dto.getToUserId())
                .toUserNickname(dto.getToUserNickname())
                .price(dto.getPrice())
                .amount(dto.getAmount())
                .orderTime(dto.getOrderTime())
                .orderStatus(OrderStatus.ACCEPTED)
                .build();
    }


}
