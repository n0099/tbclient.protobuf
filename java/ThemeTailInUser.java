package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeTailInUser extends Message {
  public static final String DEFAULT_DYNAMIC = "";
  
  public static final String DEFAULT_PROPS_ID = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String dynamic;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String props_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public ThemeTailInUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.dynamic;
      if (str1 == null) {
        this.dynamic = "";
      } else {
        this.dynamic = str1;
      } 
      str = paramBuilder.props_id;
      if (str == null) {
        this.props_id = "";
      } else {
        this.props_id = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.dynamic = ((Builder)str).dynamic;
      this.props_id = ((Builder)str).props_id;
    } 
  }
  
  public ThemeTailInUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeTailInUser> {
    public String dynamic;
    
    public String props_id;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ThemeTailInUser param1ThemeTailInUser) {
      super(param1ThemeTailInUser);
      if (param1ThemeTailInUser == null)
        return; 
      this.url = param1ThemeTailInUser.url;
      this.dynamic = param1ThemeTailInUser.dynamic;
      this.props_id = param1ThemeTailInUser.props_id;
    }
    
    public ThemeTailInUser build(boolean param1Boolean) {
      return new ThemeTailInUser(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
