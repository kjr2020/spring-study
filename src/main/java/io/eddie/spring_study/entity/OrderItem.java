package io.eddie.spring_study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ice_cream_id")
    private IceCream iceCream;

    @Column(nullable = false)
    private Integer quantity;

    public OrderItem(Order order, IceCream iceCream, Integer quantity) {
        this.order = order;
        this.iceCream = iceCream;
        this.quantity = quantity;
    }
}
