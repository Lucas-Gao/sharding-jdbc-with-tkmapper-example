# sharding-jdbc-with-tkmapper-example

### 集成tkMapper与sharding-jdbc的一个spring boot 项目小例子

**分库，分表**: 配置了两个库，每个库各包含2张表（order及order_item），每张表有两张分表(带下标，如 order_0)

**读写分离**: 每个master库配置了一个slave库

**分布式主键(雪花算法)与通用Mapper集成**: 通用Mapper中集成sharding-jdbc的默认采用的全局主键，支持主键回写。

