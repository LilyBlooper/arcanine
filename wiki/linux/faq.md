## linux faq

### differences between ?

```/sbin``` - Binaries needed for booting, low-level system repair, or maintenance (run level 1 or S)

```/bin``` - Binaries needed for normal/standard system functioning at any run level.

```/usr/bin``` - Application/distribution binaries meant to be accessed by locally logged in users

```/usr/sbin``` - Application/distribution binaries that support or configure stuff in /sbin.

```/usr/share/bin``` - Application/distribution binaries or scripts meant to be accesed via the web, i.e. Apache web applications

```*local*``` - Binaries not part of a distribution; locally compiled or manually installed. There's usually never a /local/bin but always a /usr/local/bin and /usr/local/share/bin.



### kill

```which kill``` - show kill location
```kill -9``` Most system administrators will usually resort to the more abrupt signal when an application doesn’t respond to a SIGTERM
```kill``` = kill SIGTERM


```batch
kill -9 8888
kill -s 9 8888

kill -s HUP
kill -1 
```




### 