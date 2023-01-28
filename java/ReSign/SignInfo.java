package tbclient.ReSign;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SignInfo extends Message {
  public static final Integer DEFAULT_IS_SIGN_IN = Integer.valueOf(0);
  
  public static final String DEFAULT_SIGN_DATE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_sign_in;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String sign_date;
  
  public SignInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.sign_date;
      if (str == null) {
        this.sign_date = "";
      } else {
        this.sign_date = str;
      } 
      integer = paramBuilder.is_sign_in;
      if (integer == null) {
        this.is_sign_in = DEFAULT_IS_SIGN_IN;
      } else {
        this.is_sign_in = integer;
      } 
    } else {
      this.sign_date = ((Builder)integer).sign_date;
      this.is_sign_in = ((Builder)integer).is_sign_in;
    } 
  }
  
  public SignInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SignInfo> {
    public Integer is_sign_in;
    
    public String sign_date;
    
    public Builder() {}
    
    public Builder(SignInfo param1SignInfo) {
      super(param1SignInfo);
      if (param1SignInfo == null)
        return; 
      this.sign_date = param1SignInfo.sign_date;
      this.is_sign_in = param1SignInfo.is_sign_in;
    }
    
    public SignInfo build(boolean param1Boolean) {
      return new SignInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
