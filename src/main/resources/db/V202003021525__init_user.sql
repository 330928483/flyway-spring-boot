DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar (8) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user`(user_id, name, sex, age, create_date, update_date) VALUES ('user_01', 'test01', 'MEN', 15, NOW(), NOW());
INSERT INTO `user`(user_id, name, sex, age, create_date, update_date) VALUES ('user_02', 'test02', 'WOMEN', 18, NOW(), NOW());
