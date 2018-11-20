package xyz.lucas.example.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;
import xyz.lucas.example.mybatis.SnowflakeGenId;

/**
 * 订单关联条目表实体类
 * @author lucas.gao.dev@gmail.com
 */
@Data
@Table(name = "order_item")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderItem {

    /**
     * 主键
     */
    @Id
    @KeySql(genId = SnowflakeGenId.class)
    private Long orderItemId;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 状态
     */
    private String status;
}
