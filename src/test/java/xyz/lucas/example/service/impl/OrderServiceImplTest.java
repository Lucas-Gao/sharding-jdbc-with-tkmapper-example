package xyz.lucas.example.service.impl;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import xyz.lucas.example.ShardingJdbcWithTkmapperExampleApplicationTests;
import xyz.lucas.example.entity.Order;
import xyz.lucas.example.entity.OrderItem;
import xyz.lucas.example.mapper.OrderMapper;
import xyz.lucas.example.service.OrderService;

public class OrderServiceImplTest extends ShardingJdbcWithTkmapperExampleApplicationTests {

    @MockBean
    private OrderMapper orderMapper;

    @Autowired
    private OrderService orderService;

    @Test
    public void getItemList() {

        List<OrderItem> orderItemList = new ArrayList<>();
        OrderItem orderItem = new OrderItem(1L, 1L, 1L, "1");
        orderItemList.add(orderItem);

        Order givenOrder = new Order(1L, 1L, "1", orderItemList);
        given(this.orderMapper.getItemList(1L)).willReturn(givenOrder);
        Order order = orderService.getItemList(1L);
        assertThat(order).isEqualTo(givenOrder);
    }

    @Test
    public void saveOrderWithItem() {
        Order order = new Order();
        order.setUserId((long) 1001);
        order.setStatus("1");
        OrderItem orderItem = new OrderItem();
        orderItem.setUserId((long) 1001);
        orderItem.setStatus("1");
        order.setOrderItemList(Arrays.asList(orderItem));
        orderService.saveOrderWithItem(order);
        assertThat(order.getOrderId()).isNotNull();
    }
}