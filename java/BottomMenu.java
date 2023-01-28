package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BottomMenu extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final List<SubBottomMenu> DEFAULT_SUBMENU = Collections.emptyList();
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<SubBottomMenu> submenu;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public BottomMenu(Builder paramBuilder, boolean paramBoolean) {
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
      List<SubBottomMenu> list = paramBuilder.submenu;
      if (list == null) {
        this.submenu = DEFAULT_SUBMENU;
      } else {
        this.submenu = Message.immutableCopyOf(list);
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
      this.submenu = Message.immutableCopyOf(((Builder)integer).submenu);
      this.type = ((Builder)integer).type;
    } 
  }
  
  public BottomMenu(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BottomMenu> {
    public String name;
    
    public List<SubBottomMenu> submenu;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(BottomMenu param1BottomMenu) {
      super(param1BottomMenu);
      if (param1BottomMenu == null)
        return; 
      this.name = param1BottomMenu.name;
      this.url = param1BottomMenu.url;
      this.submenu = Message.copyOf(param1BottomMenu.submenu);
      this.type = param1BottomMenu.type;
    }
    
    public BottomMenu build(boolean param1Boolean) {
      return new BottomMenu(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
