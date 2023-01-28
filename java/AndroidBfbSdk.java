package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AndroidBfbSdk extends Message {
  public static final String DEFAULT_ACTIVITY_NO = "";
  
  public static final String DEFAULT_ORDER_NO = "";
  
  public static final String DEFAULT_RETURN_URL = "";
  
  public static final String DEFAULT_SIGN = "";
  
  public static final Integer DEFAULT_SIGN_METHOD;
  
  public static final Integer DEFAULT_SP_NO;
  
  public static final String DEFAULT_VERSION = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String activity_no;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String order_no;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String return_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String sign;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer sign_method;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer sp_no;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String version;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SP_NO = integer;
    DEFAULT_SIGN_METHOD = integer;
  }
  
  public AndroidBfbSdk(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.sp_no;
      if (integer1 == null) {
        this.sp_no = DEFAULT_SP_NO;
      } else {
        this.sp_no = integer1;
      } 
      String str = paramBuilder.version;
      if (str == null) {
        this.version = "";
      } else {
        this.version = str;
      } 
      str = paramBuilder.activity_no;
      if (str == null) {
        this.activity_no = "";
      } else {
        this.activity_no = str;
      } 
      str = paramBuilder.order_no;
      if (str == null) {
        this.order_no = "";
      } else {
        this.order_no = str;
      } 
      str = paramBuilder.return_url;
      if (str == null) {
        this.return_url = "";
      } else {
        this.return_url = str;
      } 
      str = paramBuilder.sign;
      if (str == null) {
        this.sign = "";
      } else {
        this.sign = str;
      } 
      integer = paramBuilder.sign_method;
      if (integer == null) {
        this.sign_method = DEFAULT_SIGN_METHOD;
      } else {
        this.sign_method = integer;
      } 
    } else {
      this.sp_no = ((Builder)integer).sp_no;
      this.version = ((Builder)integer).version;
      this.activity_no = ((Builder)integer).activity_no;
      this.order_no = ((Builder)integer).order_no;
      this.return_url = ((Builder)integer).return_url;
      this.sign = ((Builder)integer).sign;
      this.sign_method = ((Builder)integer).sign_method;
    } 
  }
  
  public AndroidBfbSdk(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AndroidBfbSdk> {
    public String activity_no;
    
    public String order_no;
    
    public String return_url;
    
    public String sign;
    
    public Integer sign_method;
    
    public Integer sp_no;
    
    public String version;
    
    public Builder() {}
    
    public Builder(AndroidBfbSdk param1AndroidBfbSdk) {
      super(param1AndroidBfbSdk);
      if (param1AndroidBfbSdk == null)
        return; 
      this.sp_no = param1AndroidBfbSdk.sp_no;
      this.version = param1AndroidBfbSdk.version;
      this.activity_no = param1AndroidBfbSdk.activity_no;
      this.order_no = param1AndroidBfbSdk.order_no;
      this.return_url = param1AndroidBfbSdk.return_url;
      this.sign = param1AndroidBfbSdk.sign;
      this.sign_method = param1AndroidBfbSdk.sign_method;
    }
    
    public AndroidBfbSdk build(boolean param1Boolean) {
      return new AndroidBfbSdk(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
