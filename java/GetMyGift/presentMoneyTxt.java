package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class presentMoneyTxt extends Message {
  public static final String DEFAULT_TXT = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String txt;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public presentMoneyTxt(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.txt;
      if (str1 == null) {
        this.txt = "";
      } else {
        this.txt = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.txt = ((Builder)str).txt;
      this.url = ((Builder)str).url;
    } 
  }
  
  public presentMoneyTxt(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<presentMoneyTxt> {
    public String txt;
    
    public String url;
    
    public Builder() {}
    
    public Builder(presentMoneyTxt param1presentMoneyTxt) {
      super(param1presentMoneyTxt);
      if (param1presentMoneyTxt == null)
        return; 
      this.txt = param1presentMoneyTxt.txt;
      this.url = param1presentMoneyTxt.url;
    }
    
    public presentMoneyTxt build(boolean param1Boolean) {
      return new presentMoneyTxt(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
