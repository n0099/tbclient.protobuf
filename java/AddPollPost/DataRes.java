package tbclient.AddPollPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_ERROR_CODE = Integer.valueOf(0);
  
  public static final String DEFAULT_ERROR_MSG = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer error_code;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String error_msg;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.error_code;
      if (integer == null) {
        this.error_code = DEFAULT_ERROR_CODE;
      } else {
        this.error_code = integer;
      } 
      str = paramBuilder.error_msg;
      if (str == null) {
        this.error_msg = "";
      } else {
        this.error_msg = str;
      } 
    } else {
      this.error_code = ((Builder)str).error_code;
      this.error_msg = ((Builder)str).error_msg;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer error_code;
    
    public String error_msg;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.error_code = param1DataRes.error_code;
      this.error_msg = param1DataRes.error_msg;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
