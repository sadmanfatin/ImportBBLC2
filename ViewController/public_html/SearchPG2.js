function onDocumentLoad(){
//      var screenHeight = screen.height;
//        // this height hasbeen adjusted to see in oaf 
//        var  height = screenHeight-210;
//         var panelsStretchLayout =   AdfPage.PAGE.findComponent("psl1");
//       panelsStretchLayout.setProperty("inlineStyle","height:"+height+'px');
     
}


function SearchHeaderDocument(event) {
        if (event.getKeyCode() == AdfKeyStroke.ENTER_KEY) {
            var source = event.getSource();
            var myButton = source.findComponent("cb1");
            var actionEvent = new AdfActionEvent(myButton);
            actionEvent.click();
          actionEvent.noResponseExpected();
            actionEvent.queue();
        }
    }   
        
function headerSearchValueEnter(event) {
        if (event.getKeyCode() == AdfKeyStroke.ENTER_KEY) {
            var source = event.getSource();
            var myButton = source.findComponent("cb1");
            var actionEvent = new AdfActionEvent(myButton);
            actionEvent.forceFullSubmit();
            actionEvent.noResponseExpected();
            actionEvent.queue();
        }
    }  
    
   
function onLoad() {
      alert("I am running bbbbbbbbbbbbbbbbbbb!");
//     var panelTabbed =   AdfPage.PAGE.findComponent("pt1");
//        panelTabbed.setProperty("inlineStyle","height:100px");
//        panelTabbed.setProperty("inlineStyle", "background-color:red");

   
}
    
  
    