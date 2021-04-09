package mnj.ont.model;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Message {
    public Message() {
        super();
    }
    
    public static void showMessage(String messege , String severity ) {
        
        
        FacesMessage fm = new FacesMessage(messege);
        
        if(severity.equals("info")){
            fm.setSeverity(FacesMessage.SEVERITY_INFO);
        }
        else if(severity.equals("warn")){
            fm.setSeverity(FacesMessage.SEVERITY_WARN);
        }
        else if(severity.equals("error")){
            fm.setSeverity(FacesMessage.SEVERITY_ERROR);
        }
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        
    }
    
}
