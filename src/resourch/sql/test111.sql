/*
 Navicat Premium Data Transfer

 Source Server         : db_mysql
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : test1

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 19/01/2019 21:17:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test111
-- ----------------------------
DROP TABLE IF EXISTS `test111`;
CREATE TABLE `test111`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `head` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test111
-- ----------------------------
INSERT INTO `test111` VALUES (1, 'src\\resourch\\img\\timg1.jpg');
INSERT INTO `test111` VALUES (2, 'src\\resourch\\img\\timg0.jpg');

SET FOREIGN_KEY_CHECKS = 1;
