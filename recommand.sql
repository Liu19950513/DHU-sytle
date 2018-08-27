/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : recommand

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-08-27 13:52:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for clothes_info
-- ----------------------------
DROP TABLE IF EXISTS `clothes_info`;
CREATE TABLE `clothes_info` (
  `clothes_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `style` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '六种风格 可爱 优雅 复古 淑女 浪漫 简约',
  `color` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `category` int(4) DEFAULT NULL COMMENT '四类：1(上衣) 2( 外套) 3( 裙装) 4( 裤子)',
  `sub_category` int(4) DEFAULT NULL,
  `body` varchar(255) DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `red` int(4) DEFAULT NULL,
  `green` int(4) DEFAULT NULL,
  `blue` int(4) DEFAULT NULL,
  `skin` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`clothes_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of clothes_info
-- ----------------------------
INSERT INTO `clothes_info` VALUES ('1', '粉色夹克衫', '/images/C1.jpg', 'cute', 'pink', '2', '1', 'standard', '可爱的', '222', '111', '233', 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('2', '牛仔外套', '/images/C2.jpg', 'cute', 'blue', '2', '1', 'standard', '帅气的', '111', '211', '111', 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('3', '格纹风衣', '/images/C3.jpg', 'lady', 'gray', '2', '1', 'standard', '优雅的', '23', '23', '24', 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('4', '白的短裙', '/images/D1.jpg', 'cute', 'white', '3', '1', 'standard', '百搭的', '123', '145', '24', 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('5', '格子吊带群', '/images/D2.jpg', 'classic', 'green', '3', '1', 'standard', '精致的', null, null, null, 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('6', '黑色无袖连衣裙', '/images/D3.jpg', 'elegant', 'black', '3', '1', 'standard', '优雅的', null, null, null, 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('7', '黑色阔腿裤', '/images/P1.jpg', 'lady', 'black', '4', '1', 'standard', '优雅的', null, null, null, 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('8', '白色牛仔短裤', '/images/P2.jpg', 'cute', 'white', '4', '1', 'standard', '可爱的', null, null, null, 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('9', '牛仔喇叭裤', '/images/P3.jpg', 'romantic', 'blue', '4', '1', 'standard', '浪漫的', null, null, null, 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('10', '白色T', '/images/T3.jpg', 'cute', 'pink', '1', '1', 'standard', '浪漫的', null, null, null, 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('11', '黑色修身短T', '/images/T1.jpg', 'cute', 'black', '1', '1', 'standard', '简约的', null, null, null, 'mid_warm', null);
INSERT INTO `clothes_info` VALUES ('12', '白色衬衣', '/images/T2.jpg', 'lady', 'white', '1', '1', 'standard', '优雅的', null, null, null, 'mid_warm', null);

-- ----------------------------
-- Table structure for favorate
-- ----------------------------
DROP TABLE IF EXISTS `favorate`;
CREATE TABLE `favorate` (
  `favorate_Id` int(10) NOT NULL,
  `user_id` int(10) DEFAULT NULL,
  `clothes_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`favorate_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of favorate
-- ----------------------------

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `body` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '五种身材：标准（standard）梨形（pear）圆型（circle）H（rectangle）T（triangle）',
  `skin` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '六种肤色浅冷 浅暖 中冷 中暖 深冷 深暖',
  `height` int(4) DEFAULT NULL,
  `style` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '六种风格 可爱 优雅 复古 淑女 浪漫 简约',
  `type` int(4) DEFAULT '0' COMMENT '用户在线状态：0（未测试）1（测试过）',
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email` (`email`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'liu', 'asd13579', '22', 'standard', 'mid_warm', '160', 'cute', '0', '984092512@qq.com');
INSERT INTO `user_info` VALUES ('2', 'ying', '123456', '21', 'pear', 'mid_cold', '170', 'lady', '0', '123456@qq.com');
INSERT INTO `user_info` VALUES ('3', 'ma', '111', '22', '标准', 'mid_warm', '160', 'lady', '0', '111');
INSERT INTO `user_info` VALUES ('4', '117lab', '117', '1', 'rectangle', 'mid_warm', '160', 'cute', '1', '117');
