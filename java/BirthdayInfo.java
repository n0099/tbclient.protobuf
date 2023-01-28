package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BirthdayInfo extends Message {
  public static final Integer DEFAULT_AGE;
  
  public static final Integer DEFAULT_BIRTHDAY_SHOW_STATUS;
  
  public static final Long DEFAULT_BIRTHDAY_TIME = Long.valueOf(0L);
  
  public static final String DEFAULT_CONSTELLATION = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer age;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer birthday_show_status;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long birthday_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String constellation;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_BIRTHDAY_SHOW_STATUS = integer;
    DEFAULT_AGE = integer;
  }
  
  public BirthdayInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.birthday_time;
      if (long_ == null) {
        this.birthday_time = DEFAULT_BIRTHDAY_TIME;
      } else {
        this.birthday_time = long_;
      } 
      Integer integer1 = paramBuilder.birthday_show_status;
      if (integer1 == null) {
        this.birthday_show_status = DEFAULT_BIRTHDAY_SHOW_STATUS;
      } else {
        this.birthday_show_status = integer1;
      } 
      String str = paramBuilder.constellation;
      if (str == null) {
        this.constellation = "";
      } else {
        this.constellation = str;
      } 
      integer = paramBuilder.age;
      if (integer == null) {
        this.age = DEFAULT_AGE;
      } else {
        this.age = integer;
      } 
    } else {
      this.birthday_time = ((Builder)integer).birthday_time;
      this.birthday_show_status = ((Builder)integer).birthday_show_status;
      this.constellation = ((Builder)integer).constellation;
      this.age = ((Builder)integer).age;
    } 
  }
  
  public BirthdayInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BirthdayInfo> {
    public Integer age;
    
    public Integer birthday_show_status;
    
    public Long birthday_time;
    
    public String constellation;
    
    public Builder() {}
    
    public Builder(BirthdayInfo param1BirthdayInfo) {
      super(param1BirthdayInfo);
      if (param1BirthdayInfo == null)
        return; 
      this.birthday_time = param1BirthdayInfo.birthday_time;
      this.birthday_show_status = param1BirthdayInfo.birthday_show_status;
      this.constellation = param1BirthdayInfo.constellation;
      this.age = param1BirthdayInfo.age;
    }
    
    public BirthdayInfo build(boolean param1Boolean) {
      return new BirthdayInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
