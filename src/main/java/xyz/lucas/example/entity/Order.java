package xyz.lucas.example.entity;

import java.util.List;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;
import xyz.lucas.example.mybatis.SnowflakeGenId;


/**
 * 订单表实体类
 * @author lucas.gao.dev@gmail.com
 */
@Data
@Table(name = "order")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    /**
     * 主键
     */
    @Id
    @KeySql(genId = SnowflakeGenId.class)
    private Long orderId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 状态
     */
    private String status;

    /**
     * 关联的订单条目
     */
    @Transient
    private List<OrderItem> orderItemList;
}
