/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : plan-manager

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-11-12 22:48:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for demand
-- ----------------------------
DROP TABLE IF EXISTS `demand`;
CREATE TABLE `demand` (
  `demand_plancode` bigint(255) NOT NULL COMMENT '计划编码',
  `demand_plantype` int(1) DEFAULT NULL COMMENT '需求计划类型',
  `demand_planname` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '需求计划名称',
  `demand_remarks` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `demand_department` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '需求部门',
  `demand_personne` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '需求人员',
  `demand_state` int(255) DEFAULT NULL COMMENT '需求状态',
  `approval_status` int(1) DEFAULT NULL COMMENT '审批状态',
  `demand_month` int(255) DEFAULT NULL COMMENT '月度需求计划月份',
  `order_code` bigint(255) DEFAULT NULL COMMENT '订单编码',
  PRIMARY KEY (`demand_plancode`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of demand
-- ----------------------------
INSERT INTO `demand` VALUES ('1', '45', '11', '1111', '12121', '1', '0', '1', '24', '0');
INSERT INTO `demand` VALUES ('2', '1', '3', '4', '5', '6', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `material_typecode` int(255) DEFAULT NULL COMMENT '物料分类编码',
  `material_typename` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '物料分类名称',
  `material_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '物料名称',
  `material_spe` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '物料规格',
  `material_type` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '物料型号',
  `material_unit` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '物料单位',
  `material_num` int(11) DEFAULT NULL COMMENT '物料数量',
  `material_dermandmoth` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '物料需求月份',
  `material_dermanddate` date DEFAULT NULL COMMENT '物料需求日期',
  `source_sure` tinyint(1) DEFAULT '0' COMMENT '货源是否确定',
  `expected_sup` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '期待供应商',
  `fixed_sup` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '固定供应商',
  `remarks` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `material_tracode` bigint(255) DEFAULT NULL COMMENT '物料追踪码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for proinfo
-- ----------------------------
DROP TABLE IF EXISTS `proinfo`;
CREATE TABLE `proinfo` (
  `approver` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '审批人',
  `approval_time` date DEFAULT NULL COMMENT '审批时间',
  `approval_op` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '审批意见',
  `explain` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '说明',
  `demand_code` bigint(255) DEFAULT NULL COMMENT '计划编码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of proinfo
-- ----------------------------

-- ----------------------------
-- Table structure for sysinfo
-- ----------------------------
DROP TABLE IF EXISTS `sysinfo`;
CREATE TABLE `sysinfo` (
  `drawing_people` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '绘制人',
  `drawing_date` date DEFAULT NULL COMMENT '绘制时间',
  `modifier` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `modifier_date` date DEFAULT NULL COMMENT '修改时间',
  `reason` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '原因',
  `demand_code` bigint(255) DEFAULT NULL COMMENT '计划编码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sysinfo
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `user_name` varchar(16) COLLATE utf8_bin DEFAULT NULL,
  `user_pwd` varchar(16) COLLATE utf8_bin DEFAULT NULL,
  `user_job` int(1) DEFAULT NULL COMMENT '1是普通员工2是管理员',
  `department` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '待定 可以不填',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'aa', 'sadsad', '1', 'dsadas');
INSERT INTO `user` VALUES ('2', '啊', 'dd', '0', 'dddd');
