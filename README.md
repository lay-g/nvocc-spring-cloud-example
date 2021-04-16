# Spring Cloud Example
## 版本说明
* Spring Cloud: 2020.0.2
* Spring Cloud Alibaba: 2021.1
* Nacos: 2.0.0
* Seata: 1.4.1

## 模块说明
* traditional-module: 传统不使用 Spring Cloud 的应用调用
* cloud-loadbalancer: 使用 Spring Cloud Loadbalancer 后的接口调用
* nacos-example：使用 Nacos 作为注册中心后的接口调用
* open-feign-example：使用 Spring Cloud Openfeign 的接口调用
* nacos-config-example：配置中心的使用效果
* gateway-example：可与 openfeign 模块的服务搭配测试
* seata-example：分布式事务

## 备注
示例主要目的是为了分解每个单独组件的功能以及产生的效果，可按照上面「模块说明」内的顺序查看以及对比。
有一些使用 Nacos 的模块需要自己 [下载](https://github.com/alibaba/nacos/releases/download/2.0.0-bugfix/nacos-server-2.0.0.tar.gz)
，按照 [手册](https://nacos.io/zh-cn/docs/quick-start.html) 安装后自行修改 Nacos 相关地址以及 namespace。

# 未完待续......