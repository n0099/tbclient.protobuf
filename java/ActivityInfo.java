package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActivityInfo extends Message {
  public static final Long DEFAULT_ACTIVITY_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_BACK_PIC = "";
  
  public static final Integer DEFAULT_BACK_PIC_HEIGHT;
  
  public static final Integer DEFAULT_BACK_PIC_WIDTH;
  
  public static final String DEFAULT_MAIN_TITLE = "";
  
  public static final String DEFAULT_SUBPAGE_LINK = "";
  
  public static final String DEFAULT_SUB_TITLE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long activity_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String back_pic;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer back_pic_height;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer back_pic_width;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String main_title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sub_title;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String subpage_link;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_BACK_PIC_WIDTH = integer;
    DEFAULT_BACK_PIC_HEIGHT = integer;
  }
  
  public ActivityInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.activity_id;
      if (long_ == null) {
        this.activity_id = DEFAULT_ACTIVITY_ID;
      } else {
        this.activity_id = long_;
      } 
      String str1 = paramBuilder.main_title;
      if (str1 == null) {
        this.main_title = "";
      } else {
        this.main_title = str1;
      } 
      str1 = paramBuilder.sub_title;
      if (str1 == null) {
        this.sub_title = "";
      } else {
        this.sub_title = str1;
      } 
      str1 = paramBuilder.back_pic;
      if (str1 == null) {
        this.back_pic = "";
      } else {
        this.back_pic = str1;
      } 
      Integer integer = paramBuilder.back_pic_width;
      if (integer == null) {
        this.back_pic_width = DEFAULT_BACK_PIC_WIDTH;
      } else {
        this.back_pic_width = integer;
      } 
      integer = paramBuilder.back_pic_height;
      if (integer == null) {
        this.back_pic_height = DEFAULT_BACK_PIC_HEIGHT;
      } else {
        this.back_pic_height = integer;
      } 
      str = paramBuilder.subpage_link;
      if (str == null) {
        this.subpage_link = "";
      } else {
        this.subpage_link = str;
      } 
    } else {
      this.activity_id = ((Builder)str).activity_id;
      this.main_title = ((Builder)str).main_title;
      this.sub_title = ((Builder)str).sub_title;
      this.back_pic = ((Builder)str).back_pic;
      this.back_pic_width = ((Builder)str).back_pic_width;
      this.back_pic_height = ((Builder)str).back_pic_height;
      this.subpage_link = ((Builder)str).subpage_link;
    } 
  }
  
  public ActivityInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActivityInfo> {
    public Long activity_id;
    
    public String back_pic;
    
    public Integer back_pic_height;
    
    public Integer back_pic_width;
    
    public String main_title;
    
    public String sub_title;
    
    public String subpage_link;
    
    public Builder() {}
    
    public Builder(ActivityInfo param1ActivityInfo) {
      super(param1ActivityInfo);
      if (param1ActivityInfo == null)
        return; 
      this.activity_id = param1ActivityInfo.activity_id;
      this.main_title = param1ActivityInfo.main_title;
      this.sub_title = param1ActivityInfo.sub_title;
      this.back_pic = param1ActivityInfo.back_pic;
      this.back_pic_width = param1ActivityInfo.back_pic_width;
      this.back_pic_height = param1ActivityInfo.back_pic_height;
      this.subpage_link = param1ActivityInfo.subpage_link;
    }
    
    public ActivityInfo build(boolean param1Boolean) {
      return new ActivityInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
