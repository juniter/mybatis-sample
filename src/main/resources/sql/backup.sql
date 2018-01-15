CREATE TABLE `student` (
  `student_id`   INT(11)                 NOT NULL AUTO_INCREMENT,
  `student_name` VARCHAR(45)
                 COLLATE utf8_unicode_ci NOT NULL,
  `teacher_id`   INT(11)                 NOT NULL,
  PRIMARY KEY (`student_id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 12
  DEFAULT CHARSET = utf8
  COLLATE = utf8_unicode_ci;
CREATE TABLE `teacher` (
  `teacher_id`   INT(11)                 NOT NULL AUTO_INCREMENT,
  `teacher_name` VARCHAR(45)
                 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`teacher_id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = utf8
  COLLATE = utf8_unicode_ci;
CREATE TABLE `user` (
  `name`     VARCHAR(12)
             COLLATE utf8_unicode_ci NOT NULL,
  `passport` VARCHAR(45)
             COLLATE utf8_unicode_ci NOT NULL,
  `uid`      INT(11)                 NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`uid`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 50113
  DEFAULT CHARSET = utf8
  COLLATE = utf8_unicode_ci
  COMMENT ='User table for testing';


