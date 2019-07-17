# Design-Pattern-Note
[![996.icu](https://img.shields.io/badge/link-996.icu-red.svg)](https://996.icu)
[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)

 使用Java的设计模式的实现与解析

### 文件夹内容（忽略前缀）
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
