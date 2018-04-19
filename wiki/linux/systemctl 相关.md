## *----systemctl notes----*

### init system

#### A. 什么是 Init system ?

An **init system** is the first program, other than the kernel, to be run after a Linux distribution is booted. Due to the flexibility of Gentoo, several init systems are available for it. Beware, however, that even if another init system has been installed and set up quite often OpenRC is still required for other purposes.


#### B. 常见的有哪些?

* systemd (A init replacement daemon designed to start process in parallel, implemented in a number of standard distribution – Fedora, OpenSuSE, Arch, RHEL, CentOS, etc)
* sysV
* OpenRC
* upstart
* ...


### systemd 

A **systemd** is a System Management Daemon named with UNIX convention to add ‘d‘ at the end of daemon. So, that they can be easily recognized. Initially it was released under GNU General Public License, but now the releases are made under GNU Lesser General Public License. Similar to init, systemd is the parent of all other processes directly or indirectly and is the first process that starts at boot hence typically assigned a “pid=1“.

A **systemd**, may refer to all the packages, utilities and libraries around daemon. It was designed to overcome the shortcomings of init. It itself is a background processes which is designed to start processes in parallel, thus reducing the boot time and computational overhead. It has a lot other features as compared to init.

#### 1. 怎么使用?

* 



#### 2. 自定义服务?

#### 3. 跟 service的关系


The ```service``` command is a wrapper script that allows system administrators to start, stop, and check the status of services without worrying too much about the actual init system being used. Prior to systemd's introduction, it was a wrapper for ```/etc/init.d``` scripts and Upstart's ```initctl``` command, and now it is a wrapper for these two and ```systemctl``` as well.

说白了就是一个包装,具体是哪种init不清楚, 也有自己的特点;

Since the service command is a fairly simple wrapper, it only supports a limited subset of actions compared to what the actual init system might provide

因为是包装, 功能肯定不全(那么多init功能取常用的交集)

```service``` is an "high-level" command used for starting and stopping services in different unixes and linuxes. Depending on the "lower-level" service manager, service redirects on different binaries.

For example, on CentOS 7 it redirects to ```systemctl```, while on CentOS 6 it directly called the relative  ```/etc/init.d``` script. On the other hand, in older Ubuntu releases it redirects to upstart

service is adequate for basic service management, while directly calling ```systemctl``` give greater control options.


### 实战

多个tomcat尝试



## 参考和引用

* [init system](https://wiki.gentoo.org/wiki/Init_system)
* [init system comparison](https://wiki.gentoo.org/wiki/Comparison_of_init_systems)
* [systemd-replaces-init](https://www.tecmint.com/systemd-replaces-init-in-linux/)
* [defference-between](https://askubuntu.com/questions/903354/difference-between-systemctl-and-service)