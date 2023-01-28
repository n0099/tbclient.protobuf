package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;

public final class LikeForum extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_HOT_NUM;
  
  public static final Integer DEFAULT_IS_SIGN;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  public static final Boolean DEFAULT_NEED_TRANS;
  
  public static final Long DEFAULT_SORT_VALUE;
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer hot_num;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer is_sign;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer member_count;
  
  @ProtoField(tag = 9, type = Message.Datatype.BOOL)
  public final Boolean need_trans;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long sort_value;
  
  @ProtoField(tag = 8)
  public final ThemeColorInfo theme_color;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer thread_num;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_HOT_NUM = integer;
    DEFAULT_MEMBER_COUNT = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_SORT_VALUE = long_;
    DEFAULT_NEED_TRANS = Boolean.FALSE;
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_IS_SIGN = integer;
  }
  
  public LikeForum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      str2 = paramBuilder.avatar;
      if (str2 == null) {
        this.avatar = "";
      } else {
        this.avatar = str2;
      } 
      Integer integer2 = paramBuilder.hot_num;
      if (integer2 == null) {
        this.hot_num = DEFAULT_HOT_NUM;
      } else {
        this.hot_num = integer2;
      } 
      integer2 = paramBuilder.member_count;
      if (integer2 == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer2;
      } 
      integer2 = paramBuilder.thread_num;
      if (integer2 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer2;
      } 
      Long long_1 = paramBuilder.sort_value;
      if (long_1 == null) {
        this.sort_value = DEFAULT_SORT_VALUE;
      } else {
        this.sort_value = long_1;
      } 
      this.theme_color = paramBuilder.theme_color;
      Boolean bool = paramBuilder.need_trans;
      if (bool == null) {
        this.need_trans = DEFAULT_NEED_TRANS;
      } else {
        this.need_trans = bool;
      } 
      Integer integer1 = paramBuilder.level_id;
      if (integer1 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer1;
      } 
      String str1 = paramBuilder.level_name;
      if (str1 == null) {
        this.level_name = "";
      } else {
        this.level_name = str1;
      } 
      integer = paramBuilder.is_sign;
      if (integer == null) {
        this.is_sign = DEFAULT_IS_SIGN;
      } else {
        this.is_sign = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.avatar = ((Builder)integer).avatar;
      this.hot_num = ((Builder)integer).hot_num;
      this.member_count = ((Builder)integer).member_count;
      this.thread_num = ((Builder)integer).thread_num;
      this.sort_value = ((Builder)integer).sort_value;
      this.theme_color = ((Builder)integer).theme_color;
      this.need_trans = ((Builder)integer).need_trans;
      this.level_id = ((Builder)integer).level_id;
      this.level_name = ((Builder)integer).level_name;
      this.is_sign = ((Builder)integer).is_sign;
    } 
  }
  
  public LikeForum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LikeForum> {
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer hot_num;
    
    public Integer is_sign;
    
    public Integer level_id;
    
    public String level_name;
    
    public Integer member_count;
    
    public Boolean need_trans;
    
    public Long sort_value;
    
    public ThemeColorInfo theme_color;
    
    public Integer thread_num;
    
    public Builder() {}
    
    public Builder(LikeForum param1LikeForum) {
      super(param1LikeForum);
      if (param1LikeForum == null)
        return; 
      this.forum_id = param1LikeForum.forum_id;
      this.forum_name = param1LikeForum.forum_name;
      this.avatar = param1LikeForum.avatar;
      this.hot_num = param1LikeForum.hot_num;
      this.member_count = param1LikeForum.member_count;
      this.thread_num = param1LikeForum.thread_num;
      this.sort_value = param1LikeForum.sort_value;
      this.theme_color = param1LikeForum.theme_color;
      this.need_trans = param1LikeForum.need_trans;
      this.level_id = param1LikeForum.level_id;
      this.level_name = param1LikeForum.level_name;
      this.is_sign = param1LikeForum.is_sign;
    }
    
    public LikeForum build(boolean param1Boolean) {
      return new LikeForum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
