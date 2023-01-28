package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class High extends Message {
  public static final Long DEFAULT_ALBUM_ID;
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final Long DEFAULT_HID;
  
  public static final Integer DEFAULT_NUM_CAI;
  
  public static final Integer DEFAULT_NUM_ZAN;
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Long DEFAULT_UID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final Integer DEFAULT_WEIGHT;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long album_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer create_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long hid;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer num_cai;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer num_zan;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long uid;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer weight;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ALBUM_ID = long_;
    DEFAULT_HID = long_;
    DEFAULT_UID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_NUM_ZAN = integer;
    DEFAULT_NUM_CAI = integer;
    DEFAULT_WEIGHT = integer;
    DEFAULT_TYPE = integer;
  }
  
  public High(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.album_id;
      if (long_ == null) {
        this.album_id = DEFAULT_ALBUM_ID;
      } else {
        this.album_id = long_;
      } 
      long_ = paramBuilder.hid;
      if (long_ == null) {
        this.hid = DEFAULT_HID;
      } else {
        this.hid = long_;
      } 
      long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      String str2 = paramBuilder.pic_url;
      if (str2 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str2;
      } 
      Integer integer = paramBuilder.create_time;
      if (integer == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer;
      } 
      integer = paramBuilder.num_zan;
      if (integer == null) {
        this.num_zan = DEFAULT_NUM_ZAN;
      } else {
        this.num_zan = integer;
      } 
      integer = paramBuilder.num_cai;
      if (integer == null) {
        this.num_cai = DEFAULT_NUM_CAI;
      } else {
        this.num_cai = integer;
      } 
      integer = paramBuilder.weight;
      if (integer == null) {
        this.weight = DEFAULT_WEIGHT;
      } else {
        this.weight = integer;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      str = paramBuilder.user_name;
      if (str == null) {
        this.user_name = "";
      } else {
        this.user_name = str;
      } 
    } else {
      this.album_id = ((Builder)str).album_id;
      this.hid = ((Builder)str).hid;
      this.uid = ((Builder)str).uid;
      this.pic_url = ((Builder)str).pic_url;
      this.create_time = ((Builder)str).create_time;
      this.num_zan = ((Builder)str).num_zan;
      this.num_cai = ((Builder)str).num_cai;
      this.weight = ((Builder)str).weight;
      this.type = ((Builder)str).type;
      this.portrait = ((Builder)str).portrait;
      this.user_name = ((Builder)str).user_name;
    } 
  }
  
  public High(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<High> {
    public Long album_id;
    
    public Integer create_time;
    
    public Long hid;
    
    public Integer num_cai;
    
    public Integer num_zan;
    
    public String pic_url;
    
    public String portrait;
    
    public Integer type;
    
    public Long uid;
    
    public String user_name;
    
    public Integer weight;
    
    public Builder() {}
    
    public Builder(High param1High) {
      super(param1High);
      if (param1High == null)
        return; 
      this.album_id = param1High.album_id;
      this.hid = param1High.hid;
      this.uid = param1High.uid;
      this.pic_url = param1High.pic_url;
      this.create_time = param1High.create_time;
      this.num_zan = param1High.num_zan;
      this.num_cai = param1High.num_cai;
      this.weight = param1High.weight;
      this.type = param1High.type;
      this.portrait = param1High.portrait;
      this.user_name = param1High.user_name;
    }
    
    public High build(boolean param1Boolean) {
      return new High(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
