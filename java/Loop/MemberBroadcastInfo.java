package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;

public final class MemberBroadcastInfo extends Message {
  public static final String DEFAULT_BACKGROUND_SRC = "";
  
  public static final Integer DEFAULT_BROADCAST_TYPE;
  
  public static final String DEFAULT_BTN_BACKGROUND_COLOR = "";
  
  public static final String DEFAULT_BTN_TEXT_COLOR = "";
  
  public static final Integer DEFAULT_DAILY_MAX_NUM;
  
  public static final Integer DEFAULT_DAILY_MIN_STEP;
  
  public static final Integer DEFAULT_LEFT_ICON_HEIGHT;
  
  public static final String DEFAULT_LEFT_ICON_SRC = "";
  
  public static final Integer DEFAULT_LEFT_ICON_WIDTH;
  
  public static final List<PbContent> DEFAULT_MIDDLE_CONTENT;
  
  public static final Integer DEFAULT_OM_MAX_NUM;
  
  public static final Integer DEFAULT_OM_MIN_STEP;
  
  public static final String DEFAULT_RIGHT_BTN_TEXT = "";
  
  public static final String DEFAULT_RIGHT_BTN_URL = "";
  
  public static final Integer DEFAULT_SCENE_CONDITION;
  
  public static final Integer DEFAULT_SHOW_TIME;
  
  public static final String DEFAULT_TEXT_COLOR = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String background_src;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer broadcast_type;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String btn_background_color;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String btn_text_color;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer daily_max_num;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer daily_min_step;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer left_icon_height;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String left_icon_src;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer left_icon_width;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<PbContent> middle_content;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer om_max_num;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer om_min_step;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String right_btn_text;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String right_btn_url;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer scene_condition;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer show_time;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String text_color;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_LEFT_ICON_WIDTH = integer;
    DEFAULT_LEFT_ICON_HEIGHT = integer;
    DEFAULT_MIDDLE_CONTENT = Collections.emptyList();
    DEFAULT_BROADCAST_TYPE = integer;
    DEFAULT_DAILY_MIN_STEP = integer;
    DEFAULT_DAILY_MAX_NUM = integer;
    DEFAULT_OM_MIN_STEP = integer;
    DEFAULT_OM_MAX_NUM = integer;
    DEFAULT_SCENE_CONDITION = integer;
    DEFAULT_SHOW_TIME = integer;
  }
  
  public MemberBroadcastInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str4 = paramBuilder.left_icon_src;
      if (str4 == null) {
        this.left_icon_src = "";
      } else {
        this.left_icon_src = str4;
      } 
      Integer integer2 = paramBuilder.left_icon_width;
      if (integer2 == null) {
        this.left_icon_width = DEFAULT_LEFT_ICON_WIDTH;
      } else {
        this.left_icon_width = integer2;
      } 
      integer2 = paramBuilder.left_icon_height;
      if (integer2 == null) {
        this.left_icon_height = DEFAULT_LEFT_ICON_HEIGHT;
      } else {
        this.left_icon_height = integer2;
      } 
      String str3 = paramBuilder.background_src;
      if (str3 == null) {
        this.background_src = "";
      } else {
        this.background_src = str3;
      } 
      List<PbContent> list = paramBuilder.middle_content;
      if (list == null) {
        this.middle_content = DEFAULT_MIDDLE_CONTENT;
      } else {
        this.middle_content = Message.immutableCopyOf(list);
      } 
      String str2 = paramBuilder.right_btn_text;
      if (str2 == null) {
        this.right_btn_text = "";
      } else {
        this.right_btn_text = str2;
      } 
      str2 = paramBuilder.right_btn_url;
      if (str2 == null) {
        this.right_btn_url = "";
      } else {
        this.right_btn_url = str2;
      } 
      str2 = paramBuilder.text_color;
      if (str2 == null) {
        this.text_color = "";
      } else {
        this.text_color = str2;
      } 
      Integer integer1 = paramBuilder.broadcast_type;
      if (integer1 == null) {
        this.broadcast_type = DEFAULT_BROADCAST_TYPE;
      } else {
        this.broadcast_type = integer1;
      } 
      integer1 = paramBuilder.daily_min_step;
      if (integer1 == null) {
        this.daily_min_step = DEFAULT_DAILY_MIN_STEP;
      } else {
        this.daily_min_step = integer1;
      } 
      integer1 = paramBuilder.daily_max_num;
      if (integer1 == null) {
        this.daily_max_num = DEFAULT_DAILY_MAX_NUM;
      } else {
        this.daily_max_num = integer1;
      } 
      integer1 = paramBuilder.om_min_step;
      if (integer1 == null) {
        this.om_min_step = DEFAULT_OM_MIN_STEP;
      } else {
        this.om_min_step = integer1;
      } 
      integer1 = paramBuilder.om_max_num;
      if (integer1 == null) {
        this.om_max_num = DEFAULT_OM_MAX_NUM;
      } else {
        this.om_max_num = integer1;
      } 
      integer1 = paramBuilder.scene_condition;
      if (integer1 == null) {
        this.scene_condition = DEFAULT_SCENE_CONDITION;
      } else {
        this.scene_condition = integer1;
      } 
      integer1 = paramBuilder.show_time;
      if (integer1 == null) {
        this.show_time = DEFAULT_SHOW_TIME;
      } else {
        this.show_time = integer1;
      } 
      String str1 = paramBuilder.btn_text_color;
      if (str1 == null) {
        this.btn_text_color = "";
      } else {
        this.btn_text_color = str1;
      } 
      str = paramBuilder.btn_background_color;
      if (str == null) {
        this.btn_background_color = "";
      } else {
        this.btn_background_color = str;
      } 
    } else {
      this.left_icon_src = ((Builder)str).left_icon_src;
      this.left_icon_width = ((Builder)str).left_icon_width;
      this.left_icon_height = ((Builder)str).left_icon_height;
      this.background_src = ((Builder)str).background_src;
      this.middle_content = Message.immutableCopyOf(((Builder)str).middle_content);
      this.right_btn_text = ((Builder)str).right_btn_text;
      this.right_btn_url = ((Builder)str).right_btn_url;
      this.text_color = ((Builder)str).text_color;
      this.broadcast_type = ((Builder)str).broadcast_type;
      this.daily_min_step = ((Builder)str).daily_min_step;
      this.daily_max_num = ((Builder)str).daily_max_num;
      this.om_min_step = ((Builder)str).om_min_step;
      this.om_max_num = ((Builder)str).om_max_num;
      this.scene_condition = ((Builder)str).scene_condition;
      this.show_time = ((Builder)str).show_time;
      this.btn_text_color = ((Builder)str).btn_text_color;
      this.btn_background_color = ((Builder)str).btn_background_color;
    } 
  }
  
  public MemberBroadcastInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MemberBroadcastInfo> {
    public String background_src;
    
    public Integer broadcast_type;
    
    public String btn_background_color;
    
    public String btn_text_color;
    
    public Integer daily_max_num;
    
    public Integer daily_min_step;
    
    public Integer left_icon_height;
    
    public String left_icon_src;
    
    public Integer left_icon_width;
    
    public List<PbContent> middle_content;
    
    public Integer om_max_num;
    
    public Integer om_min_step;
    
    public String right_btn_text;
    
    public String right_btn_url;
    
    public Integer scene_condition;
    
    public Integer show_time;
    
    public String text_color;
    
    public Builder() {}
    
    public Builder(MemberBroadcastInfo param1MemberBroadcastInfo) {
      super(param1MemberBroadcastInfo);
      if (param1MemberBroadcastInfo == null)
        return; 
      this.left_icon_src = param1MemberBroadcastInfo.left_icon_src;
      this.left_icon_width = param1MemberBroadcastInfo.left_icon_width;
      this.left_icon_height = param1MemberBroadcastInfo.left_icon_height;
      this.background_src = param1MemberBroadcastInfo.background_src;
      this.middle_content = Message.copyOf(param1MemberBroadcastInfo.middle_content);
      this.right_btn_text = param1MemberBroadcastInfo.right_btn_text;
      this.right_btn_url = param1MemberBroadcastInfo.right_btn_url;
      this.text_color = param1MemberBroadcastInfo.text_color;
      this.broadcast_type = param1MemberBroadcastInfo.broadcast_type;
      this.daily_min_step = param1MemberBroadcastInfo.daily_min_step;
      this.daily_max_num = param1MemberBroadcastInfo.daily_max_num;
      this.om_min_step = param1MemberBroadcastInfo.om_min_step;
      this.om_max_num = param1MemberBroadcastInfo.om_max_num;
      this.scene_condition = param1MemberBroadcastInfo.scene_condition;
      this.show_time = param1MemberBroadcastInfo.show_time;
      this.btn_text_color = param1MemberBroadcastInfo.btn_text_color;
      this.btn_background_color = param1MemberBroadcastInfo.btn_background_color;
    }
    
    public MemberBroadcastInfo build(boolean param1Boolean) {
      return new MemberBroadcastInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
