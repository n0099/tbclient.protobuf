package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserMap extends Message {
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public UserMap(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.url = ((Builder)str).url;
    } 
  }
  
  public UserMap(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserMap> {
    public Integer id;
    
    public String name;
    
    public String url;
    
    public Builder() {}
    
    public Builder(UserMap param1UserMap) {
      super(param1UserMap);
      if (param1UserMap == null)
        return; 
      this.id = param1UserMap.id;
      this.name = param1UserMap.name;
      this.url = param1UserMap.url;
    }
    
    public UserMap build(boolean param1Boolean) {
      return new UserMap(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
