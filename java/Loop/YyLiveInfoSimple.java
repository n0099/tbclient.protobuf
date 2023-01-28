package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.YyExt;

public final class YyLiveInfoSimple extends Message {
  public static final Integer DEFAULT_AUTHOR_TYPE;
  
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final Integer DEFAULT_DAY_MAX_NUM;
  
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_DESC_GLOBAL_MAX_NUM;
  
  public static final Integer DEFAULT_DISAPPEAR_SECOND;
  
  public static final Integer DEFAULT_DISAPPEAR_TYPE;
  
  public static final String DEFAULT_FEED_ID = "";
  
  public static final String DEFAULT_ICON_SCHEME = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_MIN_STEP_SECOND;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_REMIND_TYPE;
  
  public static final Long DEFAULT_ROOM_ID;
  
  public static final Integer DEFAULT_SHOW_PAGE;
  
  public static final Integer DEFAULT_SINGLE_OPEN_MAX_NUM;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer author_type;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer day_max_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer desc_global_max_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer disappear_second;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer disappear_type;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String feed_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_scheme;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer min_step_second;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer remind_type;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long room_id;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer show_page;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer single_open_max_num;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 13)
  public final YyExt yy_ext;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_DISAPPEAR_TYPE = integer;
    DEFAULT_DISAPPEAR_SECOND = integer;
    DEFAULT_DESC_GLOBAL_MAX_NUM = integer;
    DEFAULT_SINGLE_OPEN_MAX_NUM = integer;
    DEFAULT_DAY_MAX_NUM = integer;
    DEFAULT_MIN_STEP_SECOND = integer;
    DEFAULT_ROOM_ID = Long.valueOf(0L);
    DEFAULT_REMIND_TYPE = integer;
    DEFAULT_SHOW_PAGE = integer;
    DEFAULT_AUTHOR_TYPE = integer;
  }
  
  public YyLiveInfoSimple(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str4 = paramBuilder.icon_url;
      if (str4 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str4;
      } 
      str4 = paramBuilder.icon_scheme;
      if (str4 == null) {
        this.icon_scheme = "";
      } else {
        this.icon_scheme = str4;
      } 
      Integer integer3 = paramBuilder.disappear_type;
      if (integer3 == null) {
        this.disappear_type = DEFAULT_DISAPPEAR_TYPE;
      } else {
        this.disappear_type = integer3;
      } 
      integer3 = paramBuilder.disappear_second;
      if (integer3 == null) {
        this.disappear_second = DEFAULT_DISAPPEAR_SECOND;
      } else {
        this.disappear_second = integer3;
      } 
      String str3 = paramBuilder.desc;
      if (str3 == null) {
        this.desc = "";
      } else {
        this.desc = str3;
      } 
      Integer integer2 = paramBuilder.desc_global_max_num;
      if (integer2 == null) {
        this.desc_global_max_num = DEFAULT_DESC_GLOBAL_MAX_NUM;
      } else {
        this.desc_global_max_num = integer2;
      } 
      integer2 = paramBuilder.single_open_max_num;
      if (integer2 == null) {
        this.single_open_max_num = DEFAULT_SINGLE_OPEN_MAX_NUM;
      } else {
        this.single_open_max_num = integer2;
      } 
      integer2 = paramBuilder.day_max_num;
      if (integer2 == null) {
        this.day_max_num = DEFAULT_DAY_MAX_NUM;
      } else {
        this.day_max_num = integer2;
      } 
      integer2 = paramBuilder.min_step_second;
      if (integer2 == null) {
        this.min_step_second = DEFAULT_MIN_STEP_SECOND;
      } else {
        this.min_step_second = integer2;
      } 
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      this.yy_ext = paramBuilder.yy_ext;
      Long long_ = paramBuilder.room_id;
      if (long_ == null) {
        this.room_id = DEFAULT_ROOM_ID;
      } else {
        this.room_id = long_;
      } 
      String str1 = paramBuilder.btn_text;
      if (str1 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str1;
      } 
      str1 = paramBuilder.feed_id;
      if (str1 == null) {
        this.feed_id = "";
      } else {
        this.feed_id = str1;
      } 
      Integer integer1 = paramBuilder.remind_type;
      if (integer1 == null) {
        this.remind_type = DEFAULT_REMIND_TYPE;
      } else {
        this.remind_type = integer1;
      } 
      integer1 = paramBuilder.show_page;
      if (integer1 == null) {
        this.show_page = DEFAULT_SHOW_PAGE;
      } else {
        this.show_page = integer1;
      } 
      integer = paramBuilder.author_type;
      if (integer == null) {
        this.author_type = DEFAULT_AUTHOR_TYPE;
      } else {
        this.author_type = integer;
      } 
    } else {
      this.icon_url = ((Builder)integer).icon_url;
      this.icon_scheme = ((Builder)integer).icon_scheme;
      this.disappear_type = ((Builder)integer).disappear_type;
      this.disappear_second = ((Builder)integer).disappear_second;
      this.desc = ((Builder)integer).desc;
      this.desc_global_max_num = ((Builder)integer).desc_global_max_num;
      this.single_open_max_num = ((Builder)integer).single_open_max_num;
      this.day_max_num = ((Builder)integer).day_max_num;
      this.min_step_second = ((Builder)integer).min_step_second;
      this.user_name = ((Builder)integer).user_name;
      this.portrait = ((Builder)integer).portrait;
      this.title = ((Builder)integer).title;
      this.yy_ext = ((Builder)integer).yy_ext;
      this.room_id = ((Builder)integer).room_id;
      this.btn_text = ((Builder)integer).btn_text;
      this.feed_id = ((Builder)integer).feed_id;
      this.remind_type = ((Builder)integer).remind_type;
      this.show_page = ((Builder)integer).show_page;
      this.author_type = ((Builder)integer).author_type;
    } 
  }
  
  public YyLiveInfoSimple(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<YyLiveInfoSimple> {
    public Integer author_type;
    
    public String btn_text;
    
    public Integer day_max_num;
    
    public String desc;
    
    public Integer desc_global_max_num;
    
    public Integer disappear_second;
    
    public Integer disappear_type;
    
    public String feed_id;
    
    public String icon_scheme;
    
    public String icon_url;
    
    public Integer min_step_second;
    
    public String portrait;
    
    public Integer remind_type;
    
    public Long room_id;
    
    public Integer show_page;
    
    public Integer single_open_max_num;
    
    public String title;
    
    public String user_name;
    
    public YyExt yy_ext;
    
    public Builder() {}
    
    public Builder(YyLiveInfoSimple param1YyLiveInfoSimple) {
      super(param1YyLiveInfoSimple);
      if (param1YyLiveInfoSimple == null)
        return; 
      this.icon_url = param1YyLiveInfoSimple.icon_url;
      this.icon_scheme = param1YyLiveInfoSimple.icon_scheme;
      this.disappear_type = param1YyLiveInfoSimple.disappear_type;
      this.disappear_second = param1YyLiveInfoSimple.disappear_second;
      this.desc = param1YyLiveInfoSimple.desc;
      this.desc_global_max_num = param1YyLiveInfoSimple.desc_global_max_num;
      this.single_open_max_num = param1YyLiveInfoSimple.single_open_max_num;
      this.day_max_num = param1YyLiveInfoSimple.day_max_num;
      this.min_step_second = param1YyLiveInfoSimple.min_step_second;
      this.user_name = param1YyLiveInfoSimple.user_name;
      this.portrait = param1YyLiveInfoSimple.portrait;
      this.title = param1YyLiveInfoSimple.title;
      this.yy_ext = param1YyLiveInfoSimple.yy_ext;
      this.room_id = param1YyLiveInfoSimple.room_id;
      this.btn_text = param1YyLiveInfoSimple.btn_text;
      this.feed_id = param1YyLiveInfoSimple.feed_id;
      this.remind_type = param1YyLiveInfoSimple.remind_type;
      this.show_page = param1YyLiveInfoSimple.show_page;
      this.author_type = param1YyLiveInfoSimple.author_type;
    }
    
    public YyLiveInfoSimple build(boolean param1Boolean) {
      return new YyLiveInfoSimple(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
