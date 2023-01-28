package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SubBottomMenu extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public SubBottomMenu(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.url = ((Builder)integer).url;
      this.type = ((Builder)integer).type;
    } 
  }
  
  public SubBottomMenu(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SubBottomMenu> {
    public String name;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(SubBottomMenu param1SubBottomMenu) {
      super(param1SubBottomMenu);
      if (param1SubBottomMenu == null)
        return; 
      this.name = param1SubBottomMenu.name;
      this.url = param1SubBottomMenu.url;
      this.type = param1SubBottomMenu.type;
    }
    
    public SubBottomMenu build(boolean param1Boolean) {
      return new SubBottomMenu(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
