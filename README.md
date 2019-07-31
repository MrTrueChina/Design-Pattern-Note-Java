# Design-Pattern-Note-Java
[![996.icu](https://img.shields.io/badge/link-996.icu-red.svg)](https://996.icu)
[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)

 使用Java的设计模式的实现与解析

### 文件夹内容（忽略前缀 src/org/mtc）
| 文件夹 | 内容 | 描述 |
|-------|:------|:------|
| pattern | 设计模式 | 经典设计模式的实现和解析 |
| pattern/factory | 工厂模式 | 将对象创建抽取到一个类中，使创建和应用分离 |
| pattern/abstractfactory | 抽象工厂模式 | 由抽象工厂决定产品类型，由实现工厂决定产品细节，用于创建整套对象 |
| pattern/singleton | 单例模式 | 将对象创建私有化，保证程序运行过程只有一个对象 |
| pattern/builder | 建造者模式 | 将对象创建过程划分为多个步骤由多个类负责，降低代码混乱程度 |
| pattern/prototype | 原型模式 | 将一个对象作为原型，其他对象直接复制，用于节约创建资源消耗和与外部资源脱钩 |
| pattern/adapter | 适配器模式 | 将旧类和新代码打包成一个新类，使新功能可以利用旧代码 |
| pattern/bridge | 桥接模式 | 将多级继承转为关联，以创建时组合代替子类组合，防止类爆炸 |
| pattern/filter | 过滤器模式 | 将过滤规则独立为过滤器类，通过过滤器类过滤对象 |
| pattern/composite | 组合模式 | 对象内部存储自身类对象列表，形成层级关系，外部可以通过对象操作他的子对象 |
| pattern/decorator | 装饰器模式 | 装饰器类对象内部存储被装饰类对象，不依赖继承实现扩展 |
| pattern/facade | 外观模式 | 在内外部之间加一个外观类，任何内外部不适合直接交流的情况都可以使用 |
| pattern/flyweight | 享元模式 | 用一个 Map 储存多个单例，摆脱单例模式无法提供多种实例的缺陷 |
| pattern/proxy | 代理模式 | 在内外部之间加一个代理类，用于控制访问流程 |
| pattern/chain | 责任链模式 | 将可能能够处理任务的对象串成链，将责任处理对外接口降到最简 |
| pattern/command | 命令模式 | 将请求封装为命令，实现命令发布和执行的分离，给执行部分更大的发挥空间 |
