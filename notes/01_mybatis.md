# MyBatis

## Docker命令

```bash
# MacOS
docker run -d -p 3310:3306 --privileged=true -v ~/Desktop/mysql_volume/log:/var/log/mysql -v ~/Desktop/mysql_volume/data:/var/lib/mysql -v ~/Desktop/mysql_volume/conf:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=123456 --name mysql mysql:8.0

# Windows
docker run -d -p 3310:3306 --privileged=true -v %USERPROFILE%\Desktop\mysql_volume\log:/var/log/mysql -v %USERPROFILE%\Desktop\mysql_volume\data:/var/lib/mysql -v %USERPROFILE%\Desktop\mysql_volume\conf:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=123456 --name mysql mysql:8.0
```

## 创建数据库和表

```mysql
create database ssm;
use ssm;

create table ssm.t_user
(
    id       int auto_increment
        primary key,
    username varchar(20) null,
    password varchar(20) null,
    age      int         null,
    gender   char        null,
    email    varchar(50) null
);
```

## 在IDEA中配置MyBatis核心配置文件和映射文件

1. 进入`设置` -> `Editor` -> `File and Code Templates`。
2. 按`加号`添加新的模板，输入模板的名字，后缀名，以及模板的内容。
3. 之后就可以在新建菜单，看到创建的模版。

## 创建表

```mysql
create table t_emp
(
    emp_id   int auto_increment
        primary key,
    emp_name varchar(20) null,
    age      int         null,
    gender   char        null,
    dept_id  int         null
);
INSERT INTO ssm.t_emp (emp_id, emp_name, age, gender, dept_id)
VALUES (1, '张三', 20, '男', 1);
INSERT INTO ssm.t_emp (emp_id, emp_name, age, gender, dept_id)
VALUES (2, '李四', 22, '女', 2);
INSERT INTO ssm.t_emp (emp_id, emp_name, age, gender, dept_id)
VALUES (3, '王五', 23, '男', 3);
INSERT INTO ssm.t_emp (emp_id, emp_name, age, gender, dept_id)
VALUES (4, '赵六', 25, '女', 1);

create table t_dept
(
    dept_id   int auto_increment
        primary key,
    dept_name varchar(20) null
);
INSERT INTO ssm.t_dept (dept_id, dept_name)
VALUES (1, 'A');
INSERT INTO ssm.t_dept (dept_id, dept_name)
VALUES (2, 'B');
INSERT INTO ssm.t_dept (dept_id, dept_name)
VALUES (3, 'C');
```

```mysql
CREATE TABLE t_book
(
    book_id   int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    book_name varchar(20)      DEFAULT NULL COMMENT '图书名称',
    price     int(11)          DEFAULT NULL COMMENT '价格',
    stock     int(10) unsigned DEFAULT NULL COMMENT '库存（无符号）',
    PRIMARY KEY (book_id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3;

insert into t_book (book_id, book_name, price, stock)
values (null, '斗破苍穹', 80, 100),
       (null, '斗罗大陆', 50, 100);

create table t_user
(
    user_id  int(11) not null auto_increment comment '主键',
    username varchar(20)      default null comment '用户名',
    balance  int(10) unsigned default null comment '余额(无符号)',
    primary key (user_id)
) engine = InnoDB
  auto_increment = 2;

create table t_book_user
(
    user_id  int(11) not null auto_increment comment '主键',
    username varchar(20)      default null comment '用户名',
    balance  int(10) unsigned default null comment '余额(无符号)',
    primary key (user_id)
) engine = InnoDB
  auto_increment = 2;

insert into t_book_user (user_id, username, balance)
values (1, 'admin', 50);
```