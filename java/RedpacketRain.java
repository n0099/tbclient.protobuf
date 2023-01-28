package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RedpacketRain extends Message {
  public static final String DEFAULT_ACTIVITY_ID = "";
  
  public static final List<String> DEFAULT_DYNAMIC_IMG;
  
  public static final Long DEFAULT_END_TIME;
  
  public static final String DEFAULT_FLOAT_URL = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_SHOW_TYPE;
  
  public static final Long DEFAULT_START_TIME;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String activity_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> dynamic_img;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long end_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String float_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer show_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long start_time;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
    DEFAULT_DYNAMIC_IMG = Collections.emptyList();
    DEFAULT_SHOW_TYPE = Integer.valueOf(0);
  }
  
  public RedpacketRain(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.start_time;
      if (long_ == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_;
      } 
      long_ = paramBuilder.end_time;
      if (long_ == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_;
      } 
      String str2 = paramBuilder.jump_url;
      if (str2 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str2;
      } 
      str2 = paramBuilder.float_url;
      if (str2 == null) {
        this.float_url = "";
      } else {
        this.float_url = str2;
      } 
      List<String> list = paramBuilder.dynamic_img;
      if (list == null) {
        this.dynamic_img = DEFAULT_DYNAMIC_IMG;
      } else {
        this.dynamic_img = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.activity_id;
      if (str1 == null) {
        this.activity_id = "";
      } else {
        this.activity_id = str1;
      } 
      integer = paramBuilder.show_type;
      if (integer == null) {
        this.show_type = DEFAULT_SHOW_TYPE;
      } else {
        this.show_type = integer;
      } 
    } else {
      this.start_time = ((Builder)integer).start_time;
      this.end_time = ((Builder)integer).end_time;
      this.jump_url = ((Builder)integer).jump_url;
      this.float_url = ((Builder)integer).float_url;
      this.dynamic_img = Message.immutableCopyOf(((Builder)integer).dynamic_img);
      this.activity_id = ((Builder)integer).activity_id;
      this.show_type = ((Builder)integer).show_type;
    } 
  }
  
  public RedpacketRain(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RedpacketRain> {
    public String activity_id;
    
    public List<String> dynamic_img;
    
    public Long end_time;
    
    public String float_url;
    
    public String jump_url;
    
    public Integer show_type;
    
    public Long start_time;
    
    public Builder() {}
    
    public Builder(RedpacketRain param1RedpacketRain) {
      super(param1RedpacketRain);
      if (param1RedpacketRain == null)
        return; 
      this.start_time = param1RedpacketRain.start_time;
      this.end_time = param1RedpacketRain.end_time;
      this.jump_url = param1RedpacketRain.jump_url;
      this.float_url = param1RedpacketRain.float_url;
      this.dynamic_img = Message.copyOf(param1RedpacketRain.dynamic_img);
      this.activity_id = param1RedpacketRain.activity_id;
      this.show_type = param1RedpacketRain.show_type;
    }
    
    public RedpacketRain build(boolean param1Boolean) {
      return new RedpacketRain(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
