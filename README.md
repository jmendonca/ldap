/* ------------------------------------------------------------
 * 							to execute
 * ------------------------------------------------------------ */


> mvn clean install

> keytool -genkey -alias jetty8 -keyalg RSA -keystore target/jetty-ssl.keystore -storepass jetty8 -keypass jetty8 -dname "cn=localhost"

> mvn jetty:run


/* ------------------------------------------------------------
 * 							references
 * ------------------------------------------------------------ */


book : Pro Spring Security 2013 (ISBN: 978-1-4302-4818-7)
urls :

  1. http://directory.apache.org/studio/users-guide/ldap_browser/gettingstarted_create_connection.html

  2. http://stackoverflow.com/questions/8995127/spring-security-and-ldap-authentication

  3. http://mrhaki.blogspot.com.br/2009/05/configure-maven-jetty-plugin-for-ssl.html

  4. http://www-01.ibm.com/support/docview.wss?uid=swg21290631

  5. http://www.zytrax.com/books/ldap/ape/

  6. http://docs.spring.io/spring-security/site/docs/3.2.3.RELEASE/reference/htmlsingle/#ldap

  7. http://docs.oracle.com/javase/jndi/tutorial/ldap/connect/config.html

  8. https://jira.spring.io/browse/SEC-2021