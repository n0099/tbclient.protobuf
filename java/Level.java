package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Level extends Message {
  public static final Integer DEFAULT_END_TIME;
  
  public static final String DEFAULT_EXPIRED_NOTIFY = "";
  
  public static final String DEFAULT_EXPIRING_NOTIFY = "";
  
  public static final Integer DEFAULT_LEFT_NUM;
  
  public static final String DEFAULT_MAX_FREE_SCORE = "";
  
  public static final String DEFAULT_OPEN_STATUS = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_PROPS_CATEGORY = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final String DEFAULT_PROPS_TYPE = "";
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  public static final String DEFAULT_USED_STATUS = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer end_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String expired_notify;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String expiring_notify;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer left_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String max_free_score;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String open_status;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String props_category;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String props_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer update_time;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String used_status;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_END_TIME = integer;
    DEFAULT_LEFT_NUM = integer;
    DEFAULT_UPDATE_TIME = integer;
  }
  
  public Level(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.props_id;
      if (integer2 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer2;
      } 
      String str2 = paramBuilder.props_type;
      if (str2 == null) {
        this.props_type = "";
      } else {
        this.props_type = str2;
      } 
      str2 = paramBuilder.props_category;
      if (str2 == null) {
        this.props_category = "";
      } else {
        this.props_category = str2;
      } 
      Integer integer1 = paramBuilder.end_time;
      if (integer1 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer1;
      } 
      integer1 = paramBuilder.left_num;
      if (integer1 == null) {
        this.left_num = DEFAULT_LEFT_NUM;
      } else {
        this.left_num = integer1;
      } 
      integer1 = paramBuilder.update_time;
      if (integer1 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer1;
      } 
      String str1 = paramBuilder.used_status;
      if (str1 == null) {
        this.used_status = "";
      } else {
        this.used_status = str1;
      } 
      str1 = paramBuilder.open_status;
      if (str1 == null) {
        this.open_status = "";
      } else {
        this.open_status = str1;
      } 
      str1 = paramBuilder.expiring_notify;
      if (str1 == null) {
        this.expiring_notify = "";
      } else {
        this.expiring_notify = str1;
      } 
      str1 = paramBuilder.expired_notify;
      if (str1 == null) {
        this.expired_notify = "";
      } else {
        this.expired_notify = str1;
      } 
      str1 = paramBuilder.max_free_score;
      if (str1 == null) {
        this.max_free_score = "";
      } else {
        this.max_free_score = str1;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.props_type = ((Builder)str).props_type;
      this.props_category = ((Builder)str).props_category;
      this.end_time = ((Builder)str).end_time;
      this.left_num = ((Builder)str).left_num;
      this.update_time = ((Builder)str).update_time;
      this.used_status = ((Builder)str).used_status;
      this.open_status = ((Builder)str).open_status;
      this.expiring_notify = ((Builder)str).expiring_notify;
      this.expired_notify = ((Builder)str).expired_notify;
      this.max_free_score = ((Builder)str).max_free_score;
      this.pic_url = ((Builder)str).pic_url;
    } 
  }
  
  public Level(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Level> {
    public Integer end_time;
    
    public String expired_notify;
    
    public String expiring_notify;
    
    public Integer left_num;
    
    public String max_free_score;
    
    public String open_status;
    
    public String pic_url;
    
    public String props_category;
    
    public Integer props_id;
    
    public String props_type;
    
    public Integer update_time;
    
    public String used_status;
    
    public Builder() {}
    
    public Builder(Level param1Level) {
      super(param1Level);
      if (param1Level == null)
        return; 
      this.props_id = param1Level.props_id;
      this.props_type = param1Level.props_type;
      this.props_category = param1Level.props_category;
      this.end_time = param1Level.end_time;
      this.left_num = param1Level.left_num;
      this.update_time = param1Level.update_time;
      this.used_status = param1Level.used_status;
      this.open_status = param1Level.open_status;
      this.expiring_notify = param1Level.expiring_notify;
      this.expired_notify = param1Level.expired_notify;
      this.max_free_score = param1Level.max_free_score;
      this.pic_url = param1Level.pic_url;
    }
    
    public Level build(boolean param1Boolean) {
      return new Level(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
