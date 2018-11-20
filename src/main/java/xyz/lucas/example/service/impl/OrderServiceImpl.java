package xyz.lucas.example.service.impl;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.lucas.example.entity.Order;
import xyz.lucas.example.entity.OrderItem;
import xyz.lucas.example.mapper.OrderItemMapper;
import xyz.lucas.example.mapper.OrderMapper;
import xyz.lucas.example.service.OrderService;

/**
 * 订单服务
 * @author lucas.gao.dev@gmail.com
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public Order getItemList(Long orderId) {
        return orderMapper.getItemList(orderId);
    }

    @Override
    public void saveOrderWithItem(Order order) {
        orderMapper.insertSelective(order);
        if (CollectionUtils.isNotEmpty(order.getOrderItemList())) {
            for (OrderItem orderItem : order.getOrderItemList()) {
                orderItem.setOrderId(order.getOrderId());
                orderItemMapper.insertSelective(orderItem);
            }
        }

    }
}





