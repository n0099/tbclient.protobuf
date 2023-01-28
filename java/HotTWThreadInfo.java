package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HotTWThreadInfo extends Message {
  public static final Integer DEFAULT_FANS_COUNT;
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer fans_count;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> user_list;
  
  static {
    DEFAULT_FANS_COUNT = Integer.valueOf(0);
  }
  
  public HotTWThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<User> list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.fans_count;
      if (integer == null) {
        this.fans_count = DEFAULT_FANS_COUNT;
      } else {
        this.fans_count = integer;
      } 
    } else {
      this.user_list = Message.immutableCopyOf(((Builder)integer).user_list);
      this.fans_count = ((Builder)integer).fans_count;
    } 
  }
  
  public HotTWThreadInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotTWThreadInfo> {
    public Integer fans_count;
    
    public List<User> user_list;
    
    public Builder() {}
    
    public Builder(HotTWThreadInfo param1HotTWThreadInfo) {
      super(param1HotTWThreadInfo);
      if (param1HotTWThreadInfo == null)
        return; 
      this.user_list = Message.copyOf(param1HotTWThreadInfo.user_list);
      this.fans_count = param1HotTWThreadInfo.fans_count;
    }
    
    public HotTWThreadInfo build(boolean param1Boolean) {
      return new HotTWThreadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
