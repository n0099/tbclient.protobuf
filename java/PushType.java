package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PushType extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  public PushType(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.name = ((Builder)str).name;
      this.icon = ((Builder)str).icon;
    } 
  }
  
  public PushType(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PushType> {
    public String icon;
    
    public String name;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(PushType param1PushType) {
      super(param1PushType);
      if (param1PushType == null)
        return; 
      this.type = param1PushType.type;
      this.name = param1PushType.name;
      this.icon = param1PushType.icon;
    }
    
    public PushType build(boolean param1Boolean) {
      return new PushType(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
