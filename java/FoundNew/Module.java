package tbclient.FoundNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Module extends Message {
  public static final List<Menu> DEFAULT_MENU_LIST;
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Menu> menu_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    DEFAULT_MENU_LIST = Collections.emptyList();
  }
  
  public Module(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Menu> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      list = paramBuilder.menu_list;
      if (list == null) {
        this.menu_list = DEFAULT_MENU_LIST;
      } else {
        this.menu_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.menu_list = Message.immutableCopyOf(((Builder)list).menu_list);
    } 
  }
  
  public Module(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Module> {
    public List<Menu> menu_list;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(Module param1Module) {
      super(param1Module);
      if (param1Module == null)
        return; 
      this.type = param1Module.type;
      this.menu_list = Message.copyOf(param1Module.menu_list);
    }
    
    public Module build(boolean param1Boolean) {
      return new Module(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
