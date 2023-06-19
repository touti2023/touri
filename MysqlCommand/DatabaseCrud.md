### 1.数据库的创建
```sql
create database your_database_name;
```

### 2.数据库的删除
```sql
drop database your_database_name;
```

### 3.数据库的修改
```sql
1.由于mysql【5.1.23】版本去除了直接重命名数据库的指令。以下为最新方法：
#查询目标数据库下面的所有表
SELECT table_name,TABLE_SCHEMA FROM information_schema.TABLES WHERE TABLE_SCHEMA='旧数据库名称';

#创建新数据库
CREATE DATABASE IF NOT EXISTS 新数据库名称 DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_unicode_ci;
#将每个旧表迁移到新的数据库里面
RENAME TABLE 旧数据库名称.表1 TO 新数据库名称.表1,旧数据库名称.表2 TO 新数据库名称.表2,……;

#查询新数据库下面的所有表是否迁移成功
SELECT table_name,TABLE_SCHEMA FROM information_schema.TABLES WHERE TABLE_SCHEMA='新数据库名称';

#最后删除旧数据库
DROP DATABASE 旧数据库名称;
```

### 4.查询mysql下所有数据库
```sql
show databases;
```

### 5.进入数据库
```sql
use database_name;
```

