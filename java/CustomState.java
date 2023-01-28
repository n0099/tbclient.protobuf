package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CustomState extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_ICON_TYPE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_type;
  
  public CustomState(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str = paramBuilder.icon_type;
      if (str == null) {
        this.icon_type = "";
      } else {
        this.icon_type = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.content = ((Builder)str).content;
      this.icon_type = ((Builder)str).icon_type;
    } 
  }
  
  public CustomState(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CustomState> {
    public String content;
    
    public String icon;
    
    public String icon_type;
    
    public Builder() {}
    
    public Builder(CustomState param1CustomState) {
      super(param1CustomState);
      if (param1CustomState == null)
        return; 
      this.icon = param1CustomState.icon;
      this.content = param1CustomState.content;
      this.icon_type = param1CustomState.icon_type;
    }
    
    public CustomState build(boolean param1Boolean) {
      return new CustomState(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
