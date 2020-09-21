package View;

import com.vaadin.annotations.Title;
import com.vaadin.event.ShortcutAction;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.*;





public class Login {
	
  public Login () {
	  
	  HorizontalLayout content =setSiteLayout();
	  
  }
  
  private HorizontalLayout setSiteLayout() {
	 
	  	VerticalLayout layce = setLayoutCentre();
	  	VerticalLayout layri = new VerticalLayout();
	  	VerticalLayout layle = setLayoutLeft();

	  	new Button("Registrieren",
                 UI.getCurrent().getNavigator().navigateTo(Registrieren.getName() //Registrieren muss noch angelegt werden
                		)
                );
	  	
	    HorizontalLayout layout = new HorizontalLayout(
	            layle,
	            layce,
	            layri
	    );
	    
	    layle.setSizeUndefined();
	    layce.setSizeFull();
	    layri.setSizeUndefined();
	    
	    
	    layout.setComponentAlignment(layle,  Alignment.TOP_LEFT);
	    layout.setComponentAlignment(layce, Alignment.TOP_RIGHT);
	    layout.setComponentAlignment(layri, Alignment.TOP_RIGHT);
	    
	    return layout;
  }
  
  private VerticalLayout setLayoutCentre() {
	  Label head = new Label("LOGIN");
	  VerticalLayout centre = new VerticalLayout(
	  
	  new FormLayout(
			  new TextField("Email"),
			  new PasswordField("Password");
			  
	  )
	  setButton(new Button(
			  "Login",
			  UI.getCurrent().getNavigator().navigateTo("MainView + Benutzerdaten weiterleiten")
              ),
              ShortcutAction.KeyCode.ENTER);
	  
	  
      layout.setComponentAlignment(head, Alignment.TOP_CENTER);
      layout.setComponentAlignment(centre, Alignment.MIDDLE_CENTER);
      layout.setComponentAlignment(foot, Alignment.BOTTOM_CENTER);

      return layout;
      
  	  
  }
  
  private HorizontalLayout footer = new HorizontalLayout();
  
  private VerticalLayout setLayoutLeft() {
	  return new VerticalLayout();
  }
  



  


  

  
  
		  


}
