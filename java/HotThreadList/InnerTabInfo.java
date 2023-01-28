package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class InnerTabInfo extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_JUMP_SCHEME = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NOTIFY_VERSION = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_scheme;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer notify_version;
  
  public InnerTabInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.jump_scheme;
      if (str == null) {
        this.jump_scheme = "";
      } else {
        this.jump_scheme = str;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
      integer = paramBuilder.notify_version;
      if (integer == null) {
        this.notify_version = DEFAULT_NOTIFY_VERSION;
      } else {
        this.notify_version = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.jump_scheme = ((Builder)integer).jump_scheme;
      this.icon = ((Builder)integer).icon;
      this.notify_version = ((Builder)integer).notify_version;
    } 
  }
  
  public InnerTabInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<InnerTabInfo> {
    public String icon;
    
    public String jump_scheme;
    
    public String name;
    
    public Integer notify_version;
    
    public Builder() {}
    
    public Builder(InnerTabInfo param1InnerTabInfo) {
      super(param1InnerTabInfo);
      if (param1InnerTabInfo == null)
        return; 
      this.name = param1InnerTabInfo.name;
      this.jump_scheme = param1InnerTabInfo.jump_scheme;
      this.icon = param1InnerTabInfo.icon;
      this.notify_version = param1InnerTabInfo.notify_version;
    }
    
    public InnerTabInfo build(boolean param1Boolean) {
      return new InnerTabInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
