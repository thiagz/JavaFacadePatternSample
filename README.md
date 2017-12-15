# JavaFacadePatternSample
Sample of Java Facade Design Pattern  

Requirement
-----------
Java8  
Netbeans IDE  


Java APIs that use Facade Design Pattern are
-----------------------------------------
javax.faces.context.FacesContext, it internally uses among others the abstract/interface types LifeCycle, ViewHandler, NavigationHandler and many more without that the enduser has to worry about it.  
javax.faces.context.ExternalContext, which internally uses ServletContext, HttpSession, HttpServletRequest, HttpServletResponse, etc.  
  
Type
-----  
Creational Pattern   

Author
------
Thiagu Subbiah  