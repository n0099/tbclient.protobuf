package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeBubble extends Message {
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_PACKAGE_ID;
  
  public static final Integer DEFAULT_PROPS_ID;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer package_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_PACKAGE_ID = integer;
  }
  
  public ThemeBubble(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.props_id;
      if (integer == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer;
      } 
      integer = paramBuilder.package_id;
      if (integer == null) {
        this.package_id = DEFAULT_PACKAGE_ID;
      } else {
        this.package_id = integer;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.package_id = ((Builder)str).package_id;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public ThemeBubble(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeBubble> {
    public String jump_url;
    
    public Integer package_id;
    
    public Integer props_id;
    
    public Builder() {}
    
    public Builder(ThemeBubble param1ThemeBubble) {
      super(param1ThemeBubble);
      if (param1ThemeBubble == null)
        return; 
      this.props_id = param1ThemeBubble.props_id;
      this.package_id = param1ThemeBubble.package_id;
      this.jump_url = param1ThemeBubble.jump_url;
    }
    
    public ThemeBubble build(boolean param1Boolean) {
      return new ThemeBubble(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
