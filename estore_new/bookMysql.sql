#书的大类
create table s_cate (
 id bigint primary key auto_increment,
 name varchar(100)
) ;
#书的小类
create table s_cate_detail (
  id bigint primary key auto_increment,
  name varchar(100) ,
  category_id bigint references s_cate(id)
) ;
#书
create table s_product (
 id bigint primary key auto_increment,
 name varchar(60),
 price bigint,
 publish varchar(60),
 img varchar(1000),
 parameter text,
 introduction text,
 wraplist text,
 hot bigint,
 remain bigint,
 sellnum bigint,
 clickrate bigint,
 publishdate bigint ,
 cate_detail_id bigint references s_cate_detail (id) on delete cascade
);
#用户
create table s_user (
  id bigint primary key auto_increment,
  username varchar(30),
  password varchar(30),
  zip varchar(60),
  address varchar(60),
  phone varchar(60),
  email varchar(60),
  dob date
);
#订单
create table s_order (
  id bigint primary key auto_increment,
  orderid varchar(60) ,
  paystatus bigint,
  receivename varchar(60),
  receiveaddress varchar(240),
  receivephone varchar(60),
  sum bigint,
  dob date,
  user_id bigint references s_user(id)
);
#订单项
create table  orderline (
  id bigint primary key auto_increment,
  num bigint,
  order_id bigint  references s_order (id) on delete cascade,
  product_id bigint references s_product(id)
) ;
#价格区间
create table s_price_scope (
  id bigint primary key auto_increment,
  min bigint ,
  max bigint
) ;
#公告
create table s_report (
  id bigint primary key auto_increment,
  name varchar(60),
  rankaaa bigint,
  publish_date date,
  department varchar(60),
  publish_writer varchar(60),
  content varchar(4000)
) ;
create table s_shopcart_item(
  id bigint primary key auto_increment,
  user_id bigint references s_user(id),
  product_id bigint references s_product(id),
  num bigint
);
create table s_reduce(
  id bigint primary key auto_increment,
  user_id bigint references s_user(id),
  product_id bigint references s_product(id),
  baseprice bigint
);


#mysql中没有序列
#create sequence my_seq;


insert into s_cate(name) values('文学类');
insert into s_cate(name) values('教育类');
insert into s_cate(name) values('计算机类');
insert into s_cate(name) values('儿童类');
insert into s_cate(name) values('漫画类');
insert into s_cate(name) values('工具类');
insert into s_cate(name) values('期刊类');

insert into s_cate_detail(name,category_id) values('校园文学',1);
insert into s_cate_detail(name,category_id) values('纪实文学',1);
insert into s_cate_detail(name,category_id) values('职业技术培训教材',2);
insert into s_cate_detail(name,category_id) values('注册会计师',2);
insert into s_cate_detail(name,category_id) values('研究生/本科/专科教材',2);
insert into s_cate_detail(name,category_id) values('数据库',3);
insert into s_cate_detail(name,category_id) values('编程语言',3);
insert into s_cate_detail(name,category_id) values('算法',3);
insert into s_cate_detail(name,category_id) values('故事书',4);
insert into s_cate_detail(name,category_id) values('国内漫画',5);
insert into s_cate_detail(name,category_id) values('国外漫画',5);
insert into s_cate_detail(name,category_id) values('驾驶工具书',6);



insert into s_price_scope(id,min,max) values(1,1,100);
insert into s_price_scope(id,min,max) values(2,101,200);
insert into s_price_scope(id,min,max) values(3,201,300);
insert into s_price_scope(id,min,max) values(4,301,400);

insert into s_product(name,price,publish,img,publishdate,cate_detail_id) values('草原帝国',100,'南京出版社','upload/c66f7019e93746c1b98da6421f27d088.jpg#upload/c66f7019e93746c1b98da6421f27d088.jpg',1529299201214,1);
insert into s_product(name,price,publish,img,publishdate,cate_detail_id) values('java入门',70,'清华出版社','upload/6c53626c6a5a41fda4990c2e552cd416.jpg#upload/6c53626c6a5a41fda4990c2e552cd416.jpg',1529299201214,8);
insert into s_product(name,price,publish,img,publishdate,cate_detail_id) values('android开发',80,'清华出版社','upload/903d4092f8e24f4f9c8b56a18a8f1cac.jpg#upload/903d4092f8e24f4f9c8b56a18a8f1cac.jpg',1529299201214,8);







