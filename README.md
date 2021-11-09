# 源码构建

前置要求

- 了解使用git
- idea IDE
- java1.8

## 1. 下载源码

- 在本地创建一个文件夹用于存放源码
- 克隆该仓库，下载zip再解压会快一点

- 使用idea打开
  ![image-20211109221202157](img/README/image-20211109221202157-16364671404581.png)

## 2.配置环境

1. 添加javaSDK为自定义SDK
   ![image-20211109221343312](img/README/image-20211109221343312.png)
   
2. 在自己原先java1.8的SDK包下进行修改，删掉原本提供的src.zip包，然后添加自己的src目录
   1. 删除src![image-20211109222019447](img/README/image-20211109222019447.png)
   
   2. 添加自己的源码目录
      ![image-20211109222405450](img/README/image-20211109222405450.png)
      
      ![image-20211109222444802](img/README/image-20211109222444802.png)
      
   3. 修改模块中使用自己设定的SDK
      ![image-20211109222917939](img/README/image-20211109222917939.png)
   
   4. 添加一个lib，（因为编译的时候，会有一个tool包找不到）
      ![image-20211109223417357](img/README/image-20211109223417357.png)
   
      ![image-20211109223222450](img/README/image-20211109223222450.png)

## idea配置

1. 为了防止编译报错资源不足，这里需要修改一下编译环境，进入settings-》Build,Execution,Deployment-》Compiler-》Shared build process heap size（Mbytes） =  `1700`
   ![image-20211109223618735](img/README/image-20211109223618735.png)
2. 为了在Debugger的时候能够跳转到菜单下一级，Debugger-》Stepping-》Do not step into the classes的勾取消掉。
   ![image-20211109223907308](img/README/image-20211109223907308.png)

## 运行起来

1. 来到Main方法，运行起来，等待一段很长很长时间的编译即可。
