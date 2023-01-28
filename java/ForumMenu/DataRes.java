package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final Integer DEFAULT_HAS_MENU;
  
  public static final List<Menu> DEFAULT_PARENT_MENU = Collections.emptyList();
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_menu;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Menu> parent_menu;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer update_time;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_HAS_MENU = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<Menu> list = paramBuilder.parent_menu;
      if (list == null) {
        this.parent_menu = DEFAULT_PARENT_MENU;
      } else {
        this.parent_menu = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.update_time;
      if (integer1 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer1;
      } 
      integer = paramBuilder.has_menu;
      if (integer == null) {
        this.has_menu = DEFAULT_HAS_MENU;
      } else {
        this.has_menu = integer;
      } 
    } else {
      this.parent_menu = Message.immutableCopyOf(((Builder)integer).parent_menu);
      this.update_time = ((Builder)integer).update_time;
      this.has_menu = ((Builder)integer).has_menu;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer has_menu;
    
    public List<Menu> parent_menu;
    
    public Integer update_time;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.parent_menu = Message.copyOf(param1DataRes.parent_menu);
      this.update_time = param1DataRes.update_time;
      this.has_menu = param1DataRes.has_menu;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
