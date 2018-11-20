package xyz.lucas.example.service;

import xyz.lucas.example.entity.Order;

/**
 * 订单服务
 * @author lucas.gao.dev@gmail.com
 */
public interface OrderService {

    /**
     * 获取订单及其关联的订单条目
     * @param orderId 订单id
     * @return 订单及其关联的条目
     */
    Order getItemList(Long orderId);

    /**
     * 保存订单及其条目
     * @param order 订单及其条目
     */
    void saveOrderWithItem(Order order);
}
