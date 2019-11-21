/*
 Navicat Premium Data Transfer

 Source Server         : 39.100.142.189_10001
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : 39.100.142.189:10001
 Source Schema         : plan-manager

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 21/11/2019 11:12:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories`  (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `material_typecode` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `material_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `material_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of categories
-- ----------------------------
INSERT INTO `categories` VALUES (1, 'S100101', 'S100101001', '文件夹');
INSERT INTO `categories` VALUES (2, 'S100101', 'S100101002', '档案盒');
INSERT INTO `categories` VALUES (3, 'S100101', 'S100101003', '拉杆夹');
INSERT INTO `categories` VALUES (4, 'S100102', 'S100102001', '计算机');
INSERT INTO `categories` VALUES (5, 'S100102', 'S100102002', '订书机');
INSERT INTO `categories` VALUES (6, 'S100102', 'S100102003', '回形针');
INSERT INTO `categories` VALUES (7, 'S100102', 'S100102004', '美工刀');
INSERT INTO `categories` VALUES (8, 'S100103', 'S100103001', '钢笔');
INSERT INTO `categories` VALUES (9, 'S100103', 'S100103002', '中性笔');
INSERT INTO `categories` VALUES (10, 'S100103', 'S100103003', 'POP笔');
INSERT INTO `categories` VALUES (11, 'S100104', 'S100104001', '打印纸');
INSERT INTO `categories` VALUES (12, 'S100104', 'S100104002', '复写纸');
INSERT INTO `categories` VALUES (13, 'S100104', 'S100104003', '笔记本');
INSERT INTO `categories` VALUES (14, 'S100104', 'S100104004', '彩色复印纸');
INSERT INTO `categories` VALUES (15, 'S100105', 'S100105001', '点钞机');
INSERT INTO `categories` VALUES (16, 'S100105', 'S100105002', '印章泥');
INSERT INTO `categories` VALUES (17, 'S100105', 'S100105003', '账本');
INSERT INTO `categories` VALUES (18, 'S100105', 'S100105004', '单据');
INSERT INTO `categories` VALUES (19, 'S100106', 'S100106001', '垃圾桶');
INSERT INTO `categories` VALUES (20, 'S100106', 'S100106002', '拖把');
INSERT INTO `categories` VALUES (21, 'S100106', 'S100106003', '烟灰缸');
INSERT INTO `categories` VALUES (22, 'S100106', 'S100106004', '洗手液');
INSERT INTO `categories` VALUES (23, 'S100106', 'S100106005', '纸杯');
INSERT INTO `categories` VALUES (24, 'S100107', 'S100107001', '碎纸机');
INSERT INTO `categories` VALUES (25, 'S100107', 'S100107002', '电脑');
INSERT INTO `categories` VALUES (26, 'S100107', 'S100107003', '打印机');

-- ----------------------------
-- Table structure for demand
-- ----------------------------
DROP TABLE IF EXISTS `demand`;
CREATE TABLE `demand`  (
  `demand_plancode` bigint(255) NOT NULL COMMENT '计划编码',
  `demand_plantype` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '需求计划类型',
  `demand_planname` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '需求计划名称',
  `demand_remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '备注',
  `demand_department` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '需求部门',
  `demand_personne` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '需求人员',
  `demand_state` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '未提交' COMMENT '需求状态',
  `approval_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '未审批' COMMENT '审批状态',
  `demand_month` int(255) NULL DEFAULT NULL COMMENT '月度需求计划月份',
  PRIMARY KEY (`demand_plancode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of demand
-- ----------------------------
INSERT INTO `demand` VALUES (1222, '年度计划', 'test', '1', 'bu', 'yms', '未提交', '未审核', 9);
INSERT INTO `demand` VALUES (2432, '年度计划', 'test', '1', 'bu', 'yms', '已提交', '已审核', 9);
INSERT INTO `demand` VALUES (6666, '年度计划', 'test', '1', 'bu', 'yms', '未提交', '未审核', 4);
INSERT INTO `demand` VALUES (7777, '年度计划', 'test', '1', 'bu', 'yms', '未提交', '已审核', 5);
INSERT INTO `demand` VALUES (8888, '年度计划', 'test', '1', 'bu', 'yms', '已提交', '未审核', 5);
INSERT INTO `demand` VALUES (62226, '月度计划', '123344444', '123', '123', '123', '已提交', '已审核', 3);
INSERT INTO `demand` VALUES (95293, '年度计划', '123', '123', '123', '123', '未提交', '已审核', NULL);
INSERT INTO `demand` VALUES (134234, '年度计划', 'test', '1', 'bu', 'yms', '已提交', '已审核', 4);
INSERT INTO `demand` VALUES (444444, '年度计划', 'test', '1', 'bu', 'yms', '未提交', '已审核', 2);
INSERT INTO `demand` VALUES (44878138, '月度计划', '123', '123', '123', '123', '未提交', '未审核', 2);
INSERT INTO `demand` VALUES (45281308, '月度计划', '12312', '', '', '', '未提交', '未审核', 2);
INSERT INTO `demand` VALUES (48666923, '年度计划', '123', '123', '123', '123', '未提交', '未审核', NULL);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `material_typecode` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '物料分类编码',
  `material_typename` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '物料分类名称',
  `material_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '物料编码',
  `material_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '物料名称',
  `material_spe` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '物料规格',
  `material_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '物料型号',
  `material_unit` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '物料单位',
  `material_num` int(11) NULL DEFAULT NULL COMMENT '物料数量',
  `material_dermandmoth` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '物料需求月份',
  `material_dermanddate` date NULL DEFAULT NULL COMMENT '物料需求日期',
  `source_sure` tinyint(1) NULL DEFAULT 0 COMMENT '货源是否确定',
  `expected_sup` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '期待供应商',
  `fixed_sup` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '固定供应商',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '备注',
  `material_tracode` bigint(255) NULL DEFAULT NULL COMMENT '物料追踪码',
  `demand_plancode` bigint(20) NULL DEFAULT NULL COMMENT '关联计划码'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '1', '1', '1', '1', '1', '4', 1, '6', '2019-10-28', 0, '2019-11-28', '7', '1', 1, 80430);
INSERT INTO `orders` VALUES ('3', '1', '5', '2', '1', '1', '7', 1, '10', '2019-11-11', 0, '2019-10-28', '6', '1', 1, 80430);
INSERT INTO `orders` VALUES ('2', '1', '1', '1', '1', '1', '4', 1, '6', '2019-10-28', 0, '2019-10-20', '7', '1', 1, 8888);
INSERT INTO `orders` VALUES ('4', '1', '1', '1', '1', '1', '4', 1, '6', '2019-10-28', 0, '2019-10-21', '7', '1', 1, 80430);
INSERT INTO `orders` VALUES ('3', '123', '3', '123', '123', '123', '2', 123, '2', '2019-11-19', 0, '1', '8', '123', 123, 79482);
INSERT INTO `orders` VALUES ('3', '123', '3', '123', '123', '123', '2', 123, '2', '2019-11-19', 0, '1', '8', '123', 123, 79482);
INSERT INTO `orders` VALUES ('3', '123', '3', '123', '123', '123', '2', 123, '2', '2019-11-19', 0, '1', '8', '123', 123, 95293);
INSERT INTO `orders` VALUES ('3', '123', '2', '123', '123', '123', '3', 123, '2', '2019-11-12', 0, '7', '3', '123', 123, 76191);
INSERT INTO `orders` VALUES ('3', '123', '3', '123', '123', '123', '4', 123, '2', '2019-11-19', 0, '2', '2', '123', 123, 8519);
INSERT INTO `orders` VALUES ('3', '123', '3', '123', '123', '123', '4', 123, '2', '2019-11-19', 0, '2', '2', '123', 123, 8519);
INSERT INTO `orders` VALUES ('3', '123', '3', '123', '123', '123', '4', 123, '2', '2019-11-19', 0, '2', '2', '123', 123, 62306);
INSERT INTO `orders` VALUES ('3', '123', '3', '41', '2', '2', '3', 2, '1', '2019-11-19', 0, '2', '1', '2', 2, 53991);
INSERT INTO `orders` VALUES ('3', '123', '3', '41', '2', '2', '3', 2, '1', '2019-11-19', 0, '2', '1', '2', 2, 53991);
INSERT INTO `orders` VALUES ('3', '123', '3', '41', '2', '2', '3', 2, '1', '2019-11-19', 0, '2', '1', '2', 2, 8888);
INSERT INTO `orders` VALUES ('2', '1', '1', '1', '1', '1', '1', 1, '1', '2019-11-19', 0, '1', '1', '1', 1, 39985);
INSERT INTO `orders` VALUES ('3', '123', '2', '1', '1', '1', '2', 1, '1', '2019-11-18', 0, '1', '2', '1', 1, 66147513);
INSERT INTO `orders` VALUES ('3', '123', '2', '1', '1', '1', '2', 1, '1', '2019-11-18', 0, '1', '2', '1', 1, 66147513);
INSERT INTO `orders` VALUES ('3', '123', '2', '1', '1', '1', '2', 1, '1', '2019-11-18', 0, '1', '2', '1', 1, 66147513);
INSERT INTO `orders` VALUES ('2', '2', '2', '2', '2', '2', '2', 2, '2', '2019-11-05', 0, '1', '1', '2', 2, 60005662);
INSERT INTO `orders` VALUES ('S100101', '123', 'S100101002', '123', '123', '123', '4', 123213, '1', '2019-11-12', 0, '1', '2', '123', 123, 10310696);
INSERT INTO `orders` VALUES ('1', '123', '2', '123', '123', '123', '2', 123, '1', '2019-11-13', 0, '1', '1', '123', 123, 48666923);
INSERT INTO `orders` VALUES ('S100102', '1', 'S100101002', '1', '1', '2', '3', 2, '9', '2019-11-04', 0, '1', '1', '2', 2, 70716726);
INSERT INTO `orders` VALUES ('S100101', '123', 'S100101001', '123', '123', '123', '2', 123, '1', '2019-11-20', 0, '1', '1', '123', 123, 45281308);
INSERT INTO `orders` VALUES ('S100101', '123', 'S100101002', '123', '123', '213', '2', 123, '1', '2019-11-10', 0, '2', '1', '123', 321, 69824810);
INSERT INTO `orders` VALUES ('S100101', '123', 'S100101002', '123', '321', '321', '1', 321, '3', '2019-11-12', 0, '1', '1', '321', 321, 44878138);
INSERT INTO `orders` VALUES ('S100101', '321', 'S100102001', '321', '321', '123', '4', 123, '2', '2019-11-07', 0, '2', '3', '123', 123, 44878138);

-- ----------------------------
-- Table structure for proinfo
-- ----------------------------
DROP TABLE IF EXISTS `proinfo`;
CREATE TABLE `proinfo`  (
  `approver` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '审批人',
  `approval_time` date NULL DEFAULT NULL COMMENT '审批时间',
  `approval_op` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '审批意见',
  `explain` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '说明',
  `demand_code` bigint(255) NULL DEFAULT NULL COMMENT '计划编码'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sysinfo
-- ----------------------------
DROP TABLE IF EXISTS `sysinfo`;
CREATE TABLE `sysinfo`  (
  `drawing_people` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '绘制人',
  `drawing_date` date NULL DEFAULT NULL COMMENT '绘制时间',
  `modifier` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '修改人',
  `modifier_date` date NULL DEFAULT NULL COMMENT '修改时间',
  `reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '原因',
  `demand_code` bigint(255) NULL DEFAULT NULL COMMENT '计划编码'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL,
  `user_name` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `user_pwd` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `user_job` int(1) NULL DEFAULT NULL COMMENT '1是普通员工2是管理员',
  `department` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '待定 可以不填',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (2, '张三', '456789', 2, '星际搬砖部');
INSERT INTO `user` VALUES (20191120095, 'yms', '123456', 1, '国际搬砖部');

SET FOREIGN_KEY_CHECKS = 1;
