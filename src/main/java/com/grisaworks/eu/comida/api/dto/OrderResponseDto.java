package com.grisaworks.eu.comida.api.dto;

import com.grisaworks.eu.comida.domain.model.Order;
import com.grisaworks.eu.comida.domain.model.OrderStatus;
import lombok.Value;

import java.math.BigDecimal;

@Value
public class OrderResponseDto {
    Long id;
    BigDecimal subtotal;
    BigDecimal freightRate;
    BigDecimal totalValue;
    OrderStatus status;

    public static OrderResponseDto fromEntity(Order order) {
        return new OrderResponseDto(
                order.getId(),
                order.getSubtotal(),
                order.getFreightRate(),
                order.getTotalValue(),
                order.getStatus()
        );
    }
}
