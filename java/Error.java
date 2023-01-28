package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Error extends Message {
  public static final String DEFAULT_ERRMSG = "";
  
  public static final Integer DEFAULT_ERRORNO = Integer.valueOf(0);
  
  public static final String DEFAULT_USERMSG = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String errmsg;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer errorno;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String usermsg;
  
  public Error(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.errorno;
      if (integer == null) {
        this.errorno = DEFAULT_ERRORNO;
      } else {
        this.errorno = integer;
      } 
      String str1 = paramBuilder.errmsg;
      if (str1 == null) {
        this.errmsg = "";
      } else {
        this.errmsg = str1;
      } 
      str = paramBuilder.usermsg;
      if (str == null) {
        this.usermsg = "";
      } else {
        this.usermsg = str;
      } 
    } else {
      this.errorno = ((Builder)str).errorno;
      this.errmsg = ((Builder)str).errmsg;
      this.usermsg = ((Builder)str).usermsg;
    } 
  }
  
  public Error(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Error> {
    public String errmsg;
    
    public Integer errorno;
    
    public String usermsg;
    
    public Builder() {}
    
    public Builder(Error param1Error) {
      super(param1Error);
      if (param1Error == null)
        return; 
      this.errorno = param1Error.errorno;
      this.errmsg = param1Error.errmsg;
      this.usermsg = param1Error.usermsg;
    }
    
    public Error build(boolean param1Boolean) {
      return new Error(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
