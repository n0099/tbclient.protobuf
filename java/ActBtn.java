package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActBtn extends Message {
  public static final String DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public ActBtn(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.url = ((Builder)str).url;
      this.text = ((Builder)str).text;
    } 
  }
  
  public ActBtn(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActBtn> {
    public String text;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ActBtn param1ActBtn) {
      super(param1ActBtn);
      if (param1ActBtn == null)
        return; 
      this.type = param1ActBtn.type;
      this.url = param1ActBtn.url;
      this.text = param1ActBtn.text;
    }
    
    public ActBtn build(boolean param1Boolean) {
      return new ActBtn(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
