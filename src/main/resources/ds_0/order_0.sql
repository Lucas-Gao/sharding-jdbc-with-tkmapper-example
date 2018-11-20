-- ----------------------------
-- Table structure for order_0
-- ----------------------------
DROP TABLE IF EXISTS `order_0`;
CREATE TABLE `order_0`  (
  `order_id` bigint(19) NOT NULL,
  `user_id` bigint(19) NOT NULL,
  `status` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_1
-- ----------------------------
DROP TABLE IF EXISTS `order_1`;
CREATE TABLE `order_1`  (
  `order_id` bigint(19) NOT NULL,
  `user_id` bigint(19) NOT NULL,
  `status` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_item_0
-- ----------------------------
DROP TABLE IF EXISTS `order_item_0`;
CREATE TABLE `order_item_0`  (
  `order_item_id` bigint(19) NOT NULL,
  `order_id` bigint(19) NOT NULL,
  `user_id` bigint(19) NOT NULL,
  `status` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`order_item_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;


-- ----------------------------
-- Table structure for order_item_1
-- ----------------------------
DROP TABLE IF EXISTS `order_item_1`;
CREATE TABLE `order_item_1`  (
  `order_item_id` bigint(19) NOT NULL,
  `order_id` bigint(19) NOT NULL,
  `user_id` bigint(19) NOT NULL,
  `status` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`order_item_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
