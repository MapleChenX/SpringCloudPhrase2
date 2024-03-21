1 nacos实现服务注册与发现
2 nacos集群分区；区域内调用优先级更高，需要使用LoadBalancer实现；调用权重设置(网页或配置文件)
3 配置中心：配置文件放在nacos，微服务找nacos要；@RefreshScope配置文件热更新
4 使用命名空间进行环境隔离，例如隔离开发、生产环境，不同命名空间的微服务不可以相互调用，当然，走网关可以

5 sentinel：
    · 流量控制、限流的异常处理、服务熔断和降级
    · 熔断方法和流量控制方法同样用@SentinelResource注解，同样有fallback方法，不同的只是在控制台的配置区域不同
6 feign的fallback调用三步走：1.在@FeignClient注解中加上fallback属性，指定fallback类；2.在fallback类中实现@FeignClient注解的接口的方法；3.配置文件中的feign启用sentinel

7 seata分布式事务：
    · pom引入seata
    · 每个微服务配置yml
    · @GlobalTransactional启用分布式事务
8 分布式事务的机制--https://www.itbaima.cn/document/f6eya9taaelsl35p
    · XA分布式事务协议 - 2PC（两阶段提交实现）
    · XA分布式事务协议 - 3PC（三阶段提交实现）
    · TCC（补偿事务）Try、Confirm、Cancel
    · seata的事务机制：
        · AT：本质是2PC的升级版；关键字：before image, after image, lock