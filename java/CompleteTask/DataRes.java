package tbclient.CompleteTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_ACTIVITY_ID;
  
  public static final Integer DEFAULT_AHEAD_TYPE;
  
  public static final String DEFAULT_BTN_CANCEL = "";
  
  public static final String DEFAULT_BTN_COLOR = "";
  
  public static final String DEFAULT_BTN_CONFIRM = "";
  
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final String DEFAULT_BTN_TEXT_COLOR = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final Integer DEFAULT_INTERFACE_TYPE;
  
  public static final Integer DEFAULT_IS_NOT_COMPLETE;
  
  public static final String DEFAULT_MESSAGE = "";
  
  public static final String DEFAULT_MESSAGE_COLOR = "";
  
  public static final Integer DEFAULT_MISSION_ID;
  
  public static final Double DEFAULT_OPACITY;
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final Integer DEFAULT_SHOW_TYPE;
  
  public static final Integer DEFAULT_TOAST_DURATION;
  
  public static final String DEFAULT_TOKEN = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer activity_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer ahead_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String btn_cancel;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String btn_color;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String btn_confirm;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String btn_text_color;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer interface_type;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer is_not_complete;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String message;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String message_color;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer mission_id;
  
  @ProtoField(tag = 14, type = Message.Datatype.DOUBLE)
  public final Double opacity;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer show_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer toast_duration;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String token;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHOW_TYPE = integer;
    DEFAULT_AHEAD_TYPE = integer;
    DEFAULT_TOAST_DURATION = integer;
    DEFAULT_ACTIVITY_ID = integer;
    DEFAULT_MISSION_ID = integer;
    DEFAULT_OPACITY = Double.valueOf(0.0D);
    DEFAULT_INTERFACE_TYPE = integer;
    DEFAULT_IS_NOT_COMPLETE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer4 = paramBuilder.show_type;
      if (integer4 == null) {
        this.show_type = DEFAULT_SHOW_TYPE;
      } else {
        this.show_type = integer4;
      } 
      integer4 = paramBuilder.ahead_type;
      if (integer4 == null) {
        this.ahead_type = DEFAULT_AHEAD_TYPE;
      } else {
        this.ahead_type = integer4;
      } 
      String str3 = paramBuilder.message;
      if (str3 == null) {
        this.message = "";
      } else {
        this.message = str3;
      } 
      str3 = paramBuilder.btn_text;
      if (str3 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str3;
      } 
      str3 = paramBuilder.btn_confirm;
      if (str3 == null) {
        this.btn_confirm = "";
      } else {
        this.btn_confirm = str3;
      } 
      str3 = paramBuilder.btn_cancel;
      if (str3 == null) {
        this.btn_cancel = "";
      } else {
        this.btn_cancel = str3;
      } 
      Integer integer3 = paramBuilder.toast_duration;
      if (integer3 == null) {
        this.toast_duration = DEFAULT_TOAST_DURATION;
      } else {
        this.toast_duration = integer3;
      } 
      String str2 = paramBuilder.img_url;
      if (str2 == null) {
        this.img_url = "";
      } else {
        this.img_url = str2;
      } 
      str2 = paramBuilder.url;
      if (str2 == null) {
        this.url = "";
      } else {
        this.url = str2;
      } 
      str2 = paramBuilder.schema;
      if (str2 == null) {
        this.schema = "";
      } else {
        this.schema = str2;
      } 
      str2 = paramBuilder.token;
      if (str2 == null) {
        this.token = "";
      } else {
        this.token = str2;
      } 
      Integer integer2 = paramBuilder.activity_id;
      if (integer2 == null) {
        this.activity_id = DEFAULT_ACTIVITY_ID;
      } else {
        this.activity_id = integer2;
      } 
      integer2 = paramBuilder.mission_id;
      if (integer2 == null) {
        this.mission_id = DEFAULT_MISSION_ID;
      } else {
        this.mission_id = integer2;
      } 
      Double double_ = paramBuilder.opacity;
      if (double_ == null) {
        this.opacity = DEFAULT_OPACITY;
      } else {
        this.opacity = double_;
      } 
      String str1 = paramBuilder.btn_color;
      if (str1 == null) {
        this.btn_color = "";
      } else {
        this.btn_color = str1;
      } 
      str1 = paramBuilder.message_color;
      if (str1 == null) {
        this.message_color = "";
      } else {
        this.message_color = str1;
      } 
      str1 = paramBuilder.btn_text_color;
      if (str1 == null) {
        this.btn_text_color = "";
      } else {
        this.btn_text_color = str1;
      } 
      Integer integer1 = paramBuilder.interface_type;
      if (integer1 == null) {
        this.interface_type = DEFAULT_INTERFACE_TYPE;
      } else {
        this.interface_type = integer1;
      } 
      integer = paramBuilder.is_not_complete;
      if (integer == null) {
        this.is_not_complete = DEFAULT_IS_NOT_COMPLETE;
      } else {
        this.is_not_complete = integer;
      } 
    } else {
      this.show_type = ((Builder)integer).show_type;
      this.ahead_type = ((Builder)integer).ahead_type;
      this.message = ((Builder)integer).message;
      this.btn_text = ((Builder)integer).btn_text;
      this.btn_confirm = ((Builder)integer).btn_confirm;
      this.btn_cancel = ((Builder)integer).btn_cancel;
      this.toast_duration = ((Builder)integer).toast_duration;
      this.img_url = ((Builder)integer).img_url;
      this.url = ((Builder)integer).url;
      this.schema = ((Builder)integer).schema;
      this.token = ((Builder)integer).token;
      this.activity_id = ((Builder)integer).activity_id;
      this.mission_id = ((Builder)integer).mission_id;
      this.opacity = ((Builder)integer).opacity;
      this.btn_color = ((Builder)integer).btn_color;
      this.message_color = ((Builder)integer).message_color;
      this.btn_text_color = ((Builder)integer).btn_text_color;
      this.interface_type = ((Builder)integer).interface_type;
      this.is_not_complete = ((Builder)integer).is_not_complete;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer activity_id;
    
    public Integer ahead_type;
    
    public String btn_cancel;
    
    public String btn_color;
    
    public String btn_confirm;
    
    public String btn_text;
    
    public String btn_text_color;
    
    public String img_url;
    
    public Integer interface_type;
    
    public Integer is_not_complete;
    
    public String message;
    
    public String message_color;
    
    public Integer mission_id;
    
    public Double opacity;
    
    public String schema;
    
    public Integer show_type;
    
    public Integer toast_duration;
    
    public String token;
    
    public String url;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.show_type = param1DataRes.show_type;
      this.ahead_type = param1DataRes.ahead_type;
      this.message = param1DataRes.message;
      this.btn_text = param1DataRes.btn_text;
      this.btn_confirm = param1DataRes.btn_confirm;
      this.btn_cancel = param1DataRes.btn_cancel;
      this.toast_duration = param1DataRes.toast_duration;
      this.img_url = param1DataRes.img_url;
      this.url = param1DataRes.url;
      this.schema = param1DataRes.schema;
      this.token = param1DataRes.token;
      this.activity_id = param1DataRes.activity_id;
      this.mission_id = param1DataRes.mission_id;
      this.opacity = param1DataRes.opacity;
      this.btn_color = param1DataRes.btn_color;
      this.message_color = param1DataRes.message_color;
      this.btn_text_color = param1DataRes.btn_text_color;
      this.interface_type = param1DataRes.interface_type;
      this.is_not_complete = param1DataRes.is_not_complete;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
