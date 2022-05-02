package com.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "cart_item")
public class CartItem extends BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "cart_item_id")
    private Long id;                // 상품 코드

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;              // 장바구니 엔티티

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;              // 상품 엔티티

    private int count;              // 상품 개수
}
