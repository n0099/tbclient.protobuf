package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HotUserRankEntry extends Message {
  public static final List<ShortUserInfo> DEFAULT_HOT_USER = Collections.emptyList();
  
  public static final Boolean DEFAULT_IS_IN_RANK;
  
  public static final String DEFAULT_MODULE_ICON = "";
  
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final Integer DEFAULT_TODAY_RANK;
  
  public static final Integer DEFAULT_YESTERDAY_RANK;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ShortUserInfo> hot_user;
  
  @ProtoField(tag = 6, type = Message.Datatype.BOOL)
  public final Boolean is_in_rank;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String module_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer today_rank;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer yesterday_rank;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TODAY_RANK = integer;
    DEFAULT_YESTERDAY_RANK = integer;
    DEFAULT_IS_IN_RANK = Boolean.FALSE;
  }
  
  public HotUserRankEntry(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      List<ShortUserInfo> list = paramBuilder.hot_user;
      if (list == null) {
        this.hot_user = DEFAULT_HOT_USER;
      } else {
        this.hot_user = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.module_name;
      if (str == null) {
        this.module_name = "";
      } else {
        this.module_name = str;
      } 
      str = paramBuilder.module_icon;
      if (str == null) {
        this.module_icon = "";
      } else {
        this.module_icon = str;
      } 
      Integer integer = paramBuilder.today_rank;
      if (integer == null) {
        this.today_rank = DEFAULT_TODAY_RANK;
      } else {
        this.today_rank = integer;
      } 
      integer = paramBuilder.yesterday_rank;
      if (integer == null) {
        this.yesterday_rank = DEFAULT_YESTERDAY_RANK;
      } else {
        this.yesterday_rank = integer;
      } 
      bool = paramBuilder.is_in_rank;
      if (bool == null) {
        this.is_in_rank = DEFAULT_IS_IN_RANK;
      } else {
        this.is_in_rank = bool;
      } 
    } else {
      this.hot_user = Message.immutableCopyOf(((Builder)bool).hot_user);
      this.module_name = ((Builder)bool).module_name;
      this.module_icon = ((Builder)bool).module_icon;
      this.today_rank = ((Builder)bool).today_rank;
      this.yesterday_rank = ((Builder)bool).yesterday_rank;
      this.is_in_rank = ((Builder)bool).is_in_rank;
    } 
  }
  
  public HotUserRankEntry(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotUserRankEntry> {
    public List<ShortUserInfo> hot_user;
    
    public Boolean is_in_rank;
    
    public String module_icon;
    
    public String module_name;
    
    public Integer today_rank;
    
    public Integer yesterday_rank;
    
    public Builder() {}
    
    public Builder(HotUserRankEntry param1HotUserRankEntry) {
      super(param1HotUserRankEntry);
      if (param1HotUserRankEntry == null)
        return; 
      this.hot_user = Message.copyOf(param1HotUserRankEntry.hot_user);
      this.module_name = param1HotUserRankEntry.module_name;
      this.module_icon = param1HotUserRankEntry.module_icon;
      this.today_rank = param1HotUserRankEntry.today_rank;
      this.yesterday_rank = param1HotUserRankEntry.yesterday_rank;
      this.is_in_rank = param1HotUserRankEntry.is_in_rank;
    }
    
    public HotUserRankEntry build(boolean param1Boolean) {
      return new HotUserRankEntry(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
