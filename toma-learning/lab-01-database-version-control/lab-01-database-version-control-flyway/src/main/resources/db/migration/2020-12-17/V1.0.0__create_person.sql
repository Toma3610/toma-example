CREATE TABLE `person`
(
    `id`     bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `name`   varchar(30) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '姓名',
    `age`    int                             DEFAULT NULL COMMENT '年龄',
    `email`  varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '邮箱',
    `status` int                             DEFAULT '0' COMMENT '状态 0.正常 1.删除',
    `info`   json                            DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 14
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin;
