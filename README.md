# ex_hibernate_xml_without_spring

## Run the project
#### Run class AppUniversal.java
#### If property is_xml=true is passed then hibernate with xml based configuration will run <br> otherwise annotation based configuration will run
#### Pass property is_xml: add to the command line -Dis_xml=true (in intellij - the section 'VM options:' in configuration)
#### By default HSQLDB is used. To change for using MySQL change this files:
<br> - HibernateConfig.java (for non xml configuration)
<br> - hibernate.cfg.xml (for xml configuration)
<br> - AppUniversal.java - remove method call

`
    startDBManager();
`

#### To use with jetty plugin (8000 port is default)
`

 $ mvn jetty:run


### to debug with embedded jetty:
    
    $ mvnDebug jetty:run
    
    then make config:
    - Run -> Edit Configuration
    - In Run/Debug Configuration window, you need to click on (+) button to add a new configuration
    - Select Remote
    - Keep the default configuration as is, just change the listening port to corresponding one (8000).
    Run Degug config
`