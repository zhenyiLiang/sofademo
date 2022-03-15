#sofademo
## 项目结构
   1. ibs-sofawebdemo,ibs-sofaconsumerdemo和ibs-sofaproviderdemo依赖ibs-parent
   2. ibs-sofawebdemo是sofa web项目
   3. ibs-sofaconsumerdemo和ibs-sofaproviderdemo是sofa core项目
   4. ibs-sofawebdemo相当于内部网关webapi接收请求，然后通过泛化调用的方式调用ibs-sofaconsumerdemo的ConsumerDemoService；
   5. ibs-sofaconsumerdemo通过rpc调用调用ibs-sofaproviderdemo的ProviderDemoService服务；
   6. rpc调用都通过直连方式调用，没有注册中心。
## 运行
   1. 配置启动的jvm参数，-Dspring.profiles.active=port,否则会端口冲突 
   2. 启动ibs-sofawebdemo，ibs-sofaconsumerdemo和ibs-sofaproviderdemo
   3. 访问http://127.0.0.1:8341/sofarest/hello?message=sofademo
