### 1.数据表的创建
```sql
create table table_name(
    column1 datatype,
    column2 datatype,
    column3 datatype,
    ...
    );
```

### 2.数据表的删除
```sql
drop table table_name;
```

### 3.修改表
要修改数据表的结构，你可以使用ALTER TABLE语句。以下是一些常见的表结构修改操作：
>- 添加列：<br>
alter table table_name add column_name datatype;

>- 删除列：
>- alter table table_name drop column column_name;

>- 修改列的数据类型：
>- ALTER TABLE table_name MODIFY COLUMN column_name new_datatype;

>- 修改列的名称：
>- ALTER TABLE table_name RENAME COLUMN old_column_name TO new_column_name;

### 4.查询
要查询数据表中的数据，你可以使用SELECT语句。以下是一个查询表数据的示例：
>- 查询表中所有数据：
>- select * from table_name;

>- 条件查询数据：
>- 使用SELECT语句结合WHERE子句来执行条件查询。可以在WHERE子句中使用比较运算符（如=、<、>、<=、>=）和逻辑运算符（如`AND`、`OR`、`NOT`）来指定条件。 
>- 示例 1：查询年龄大于等于18岁的用户：
>- SELECT * FROM users WHERE age >= 18; 
>- 示例 2：查询性别为女性且年龄在20到30岁之间的用户：
>- SELECT * FROM users WHERE gender = 'Female' AND age BETWEEN 20 AND 30;

>- 模糊查询数据：
>- 使用LIKE操作符进行模糊查询，配合通配符%（表示任意字符序列）和_（表示任意单个字符）来匹配模式。
>- 示例 1：查询以"John"开头的用户名：
>- SELECT * FROM users WHERE username LIKE 'John%';
>- 示例 2：查询包含"apple"的产品名称：
>- SELECT * FROM products WHERE product_name LIKE '%apple%';
>- 在上述示例中，%可以出现在模式的任意位置，代表任意字符序列。你可以根据实际需求调整通配符的使用位置。

请注意，条件查询和模糊查询还可以与其他SQL语句（如JOIN、ORDER BY、GROUP BY等）结合使用，以满足更复杂的查询需求。

>- 插入表数据：
>- INSERT INTO table_name (column1, column2, column3, ...)
   VALUES (value1, value2, value3, ...);

>- 更新表数据：
>- UPDATE table_name
   SET column1 = new_value1, column2 = new_value2, ...
   WHERE condition;

>- 删除表数据：
>- DELETE FROM table_name WHERE condition;

### 5.主键
`设置主键`：\
1.创建表时设置主键：
在创建表时，你可以使用PRIMARY KEY关键字来指定一个或多个列作为主键。以下是一个示例：
>-CREATE TABLE table_name (
column1 datatype,
column2 datatype,
column3 datatype,
PRIMARY KEY (column1)
);

在上面的示例中，column1被指定为主键列。

2.使用ALTER TABLE语句添加主键：
如果表已经存在，你可以使用ALTER TABLE语句来添加主键。以下是一个示例：
>- ALTER TABLE table_name
   ADD PRIMARY KEY (column1);

在上面的示例中，将column1添加为主键列。

`修改主键`：

如果要修改主键列或更改现有的主键，你需要执行以下步骤：

1.删除现有的主键约束：
使用ALTER TABLE语句和DROP PRIMARY KEY子句来删除现有的主键约束。以下是一个示例：
>- ALTER TABLE table_name
   DROP PRIMARY KEY;

2.添加新的主键约束：
在删除现有的主键约束后，你可以使用上述方法之一来设置新的主键。

请注意，修改主键可能会对数据表的结构和相关依赖关系产生影响。在执行此类操作之前，请确保了解修改的后果，并备份重要的数据。

另外，还要注意以下事项：
>- 表中的主键必须是唯一的，不能重复。
>- 主键列通常还会自动增加（Auto Increment），以确保每个新行都具有唯一的主键值。
>- 在表中只能有一个主键，但主键可以由多个列组成，这称为复合主键。在创建或修改表时，你可以指定多个列作为主键。