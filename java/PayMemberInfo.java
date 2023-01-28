package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PayMemberInfo extends Message {
  public static final Integer DEFAULT_END_TIME;
  
  public static final String DEFAULT_EXPIRE_REMIND = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer end_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String expire_remind;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_END_TIME = integer;
  }
  
  public PayMemberInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.props_id;
      if (integer == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer;
      } 
      integer = paramBuilder.end_time;
      if (integer == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.expire_remind;
      if (str1 == null) {
        this.expire_remind = "";
      } else {
        this.expire_remind = str1;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.end_time = ((Builder)str).end_time;
      this.url = ((Builder)str).url;
      this.expire_remind = ((Builder)str).expire_remind;
      this.pic_url = ((Builder)str).pic_url;
    } 
  }
  
  public PayMemberInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PayMemberInfo> {
    public Integer end_time;
    
    public String expire_remind;
    
    public String pic_url;
    
    public Integer props_id;
    
    public String url;
    
    public Builder() {}
    
    public Builder(PayMemberInfo param1PayMemberInfo) {
      super(param1PayMemberInfo);
      if (param1PayMemberInfo == null)
        return; 
      this.props_id = param1PayMemberInfo.props_id;
      this.end_time = param1PayMemberInfo.end_time;
      this.url = param1PayMemberInfo.url;
      this.expire_remind = param1PayMemberInfo.expire_remind;
      this.pic_url = param1PayMemberInfo.pic_url;
    }
    
    public PayMemberInfo build(boolean param1Boolean) {
      return new PayMemberInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
