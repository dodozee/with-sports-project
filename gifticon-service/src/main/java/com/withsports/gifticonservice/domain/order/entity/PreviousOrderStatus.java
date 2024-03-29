package com.withsports.gifticonservice.domain.order.entity;


import lombok.Getter;

@Getter
public enum PreviousOrderStatus {
    PENDING("주문직전"),
    PLACED("주문신청(결제전)"),
    ACCEPTED("주문완료(결제후)"),
    REJECTED("주문거절"),
    CANCELED("주문취소"),
    COMPLETED("선물수령완료");

    private String message;

    PreviousOrderStatus(String message) {
        this.message = message;
    }
}
