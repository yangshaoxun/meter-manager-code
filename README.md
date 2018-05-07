# 抄表系统

## 版本说明

### Version 1.0.0

## 开发环境功能说明&部署说明

| 序号 | 项目 | 功能 | 版本 | 端口分配 | 部署说明 |
| ---- | ---- | ---- | ---- | ---- | ---- |
| 1 | spring-cloud-registry-microservice | 服务注册中心 | 1.0.0 | 8761 | 159 server,160 server |
| 2 | spring-cloud-gateway-microservice | 路由网关 | 1.0.0 | 8762 | 159 server，160 server |
| 3 | spring-cloud-auth-microservice | 权限认证微服务 | 1.0.0 | 8763 | 159 server，160 server |
| 4 | spring-cloud-fee-microservice | 费用管理微服务 | 1.0.0 | 8764 | 159 server，160 server |
| 5 | spring-cloud-admin-microservice | 后台管理微服务 | 1.0.0 | 8765 | 159 server，160 server |
| 6 | spring-cloud-dataanalysis-microservice | 表计上传微服务 | 1.0.0 | 8766 | 159 server,160 server |
| 7 | spring-cloud-report-microservice | 报表微服务 | 1.0.0 | 8767 | 159 server，160 server |

##本地环境说明

| 序号 | 项目 | 功能 | 版本 | 端口分配 | 部署说明 |
| ---- | ---- | ---- | ---- | ---- | ---- |
| 1 | spring-cloud-registry-microservice | 服务注册中心 | 1.0.0 | 8761 | localhost |
| 2 | ***spring-cloud-gateway-microservice（暂时集成到auth中去）*** | 路由网关 | 1.0.0 | 8502 | 159 server，160 server |
| 3 | spring-cloud-auth-microservice | 路由网关，权限认证微服务 | 1.0.0 | 8763 | 159 server，160 server |
| 4 | spring-cloud-fee-microservice | 费用管理微服务 | 1.0.0 | 8764 | 159 server，160 server |
| 5 | spring-cloud-admin-microservice | 后台管理微服务 | 1.0.0 | 8765 | 159 server，160 server |
| 6 | spring-cloud-dataanalysis-microservice | 表计上传微服务 | 1.0.0 | 8766 | 159 server,160 server |
| 7 | spring-cloud-report-microservice | 报表微服务 | 1.0.0 | 8767 | 159 server，160 server |

## 功能说明
1. registry注册中心（单个实例）：暂时承担注册中心任务
2. auth：路由网关以及权限控制微服务, 路由前缀 /auth/**
3. admin后台管理微服务：表计，系统设置等模块代码服务 路由前缀 /**
3. fee费用管理微服务：费用管理模块，需要跟抄表微服务进行交互,路由前缀/fee/**
4. datanaalysis抄表微服务：抄表统计，需要与费用管理微服务,路由前缀 /record/**
5. reprot报表微服务：报表统计模块代码，路由前缀 /report/**