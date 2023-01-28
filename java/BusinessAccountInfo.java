package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BusinessAccountInfo extends Message {
  public static final String DEFAULT_BUSINESS_NAME = "";
  
  public static final String DEFAULT_IDENTIFI_EXPLAIN = "";
  
  public static final Integer DEFAULT_IS_BUSINESS_ACCOUNT;
  
  public static final Integer DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String business_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String identifi_explain;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_business_account;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_forum_business_account;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BUSINESS_ACCOUNT = integer;
    DEFAULT_IS_FORUM_BUSINESS_ACCOUNT = integer;
  }
  
  public BusinessAccountInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_business_account;
      if (integer == null) {
        this.is_business_account = DEFAULT_IS_BUSINESS_ACCOUNT;
      } else {
        this.is_business_account = integer;
      } 
      integer = paramBuilder.is_forum_business_account;
      if (integer == null) {
        this.is_forum_business_account = DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
      } else {
        this.is_forum_business_account = integer;
      } 
      String str1 = paramBuilder.business_name;
      if (str1 == null) {
        this.business_name = "";
      } else {
        this.business_name = str1;
      } 
      str = paramBuilder.identifi_explain;
      if (str == null) {
        this.identifi_explain = "";
      } else {
        this.identifi_explain = str;
      } 
    } else {
      this.is_business_account = ((Builder)str).is_business_account;
      this.is_forum_business_account = ((Builder)str).is_forum_business_account;
      this.business_name = ((Builder)str).business_name;
      this.identifi_explain = ((Builder)str).identifi_explain;
    } 
  }
  
  public BusinessAccountInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BusinessAccountInfo> {
    public String business_name;
    
    public String identifi_explain;
    
    public Integer is_business_account;
    
    public Integer is_forum_business_account;
    
    public Builder() {}
    
    public Builder(BusinessAccountInfo param1BusinessAccountInfo) {
      super(param1BusinessAccountInfo);
      if (param1BusinessAccountInfo == null)
        return; 
      this.is_business_account = param1BusinessAccountInfo.is_business_account;
      this.is_forum_business_account = param1BusinessAccountInfo.is_forum_business_account;
      this.business_name = param1BusinessAccountInfo.business_name;
      this.identifi_explain = param1BusinessAccountInfo.identifi_explain;
    }
    
    public BusinessAccountInfo build(boolean param1Boolean) {
      return new BusinessAccountInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
