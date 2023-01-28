package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BawuAction extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public BawuAction(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.type = ((Builder)str).type;
      this.url = ((Builder)str).url;
    } 
  }
  
  public BawuAction(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BawuAction> {
    public String name;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(BawuAction param1BawuAction) {
      super(param1BawuAction);
      if (param1BawuAction == null)
        return; 
      this.name = param1BawuAction.name;
      this.type = param1BawuAction.type;
      this.url = param1BawuAction.url;
    }
    
    public BawuAction build(boolean param1Boolean) {
      return new BawuAction(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
