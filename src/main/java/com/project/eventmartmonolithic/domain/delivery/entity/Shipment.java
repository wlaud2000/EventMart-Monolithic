package com.project.eventmartmonolithic.domain.delivery.entity;

import com.project.eventmartmonolithic.domain.delivery.enums.DeliveryStatus;
import com.project.eventmartmonolithic.domain.order.entity.Order;
import com.project.eventmartmonolithic.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "shipment")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class Shipment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(name = "status", nullable = false)
    private DeliveryStatus status;

    @Column(name = "tracking_number", nullable = false)
    private int trackingNumber;

    @Column(name = "carrier", nullable = false)
    private String carrier;

    @Column(name = "shipped_at")
    private LocalDateTime shippedAt;

    @Column(name = "estimated_delivery_at")
    private LocalDateTime estimatedDeliveryAt;

    @Column(name = "delivered_at")
    private LocalDateTime deliveredAt;
}
