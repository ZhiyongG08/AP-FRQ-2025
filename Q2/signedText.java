public class SignedText{
  private String firstN;
  private String lastN;

  public SignedText(String fN, Strinf lN){
    firstN = fN;
    lastN = ln;
  }

  public String getSignature(){
      if(fN.equals(""){
        return lN;
      }
      return fN.substring(0,1) + "-" + lN;
  }
  public String addSignature(String text){
    String r = "";
    if(getSignature().indexOF(text) == -1){
        r = text + getSignature();
    }
    if(text.indexOf(getSignature()) >= 0){
        r = text;
    }

    if(text.indexOf(getSignature()) == 0){
      r = text.substring(getSignature().length() + getSignature();
    }
    return r;
  }
}
