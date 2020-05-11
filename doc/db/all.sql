drop table if exists `chapter`;
create table `chapter`
(
    `id`        char(8)     not null comment 'ID',
    `course_id` char(8)     not null comment 'COURSE_ID',
    `name`      varchar(50) not null comment 'NAME',
    primary key (id)
) engine = innodb
  default charset = utf8mb4 comment = 'CHAPTER';