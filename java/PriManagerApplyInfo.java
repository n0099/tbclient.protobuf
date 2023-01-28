package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PriManagerApplyInfo extends Message {
  public static final Integer DEFAULT_ASSIST_APPLY_STATUS;
  
  public static final String DEFAULT_ASSIST_APPLY_URL = "";
  
  public static final Integer DEFAULT_ASSIST_LEFT_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer assist_apply_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String assist_apply_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer assist_left_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ASSIST_LEFT_NUM = integer;
    DEFAULT_ASSIST_APPLY_STATUS = integer;
  }
  
  public PriManagerApplyInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.assist_left_num;
      if (integer1 == null) {
        this.assist_left_num = DEFAULT_ASSIST_LEFT_NUM;
      } else {
        this.assist_left_num = integer1;
      } 
      String str = paramBuilder.assist_apply_url;
      if (str == null) {
        this.assist_apply_url = "";
      } else {
        this.assist_apply_url = str;
      } 
      integer = paramBuilder.assist_apply_status;
      if (integer == null) {
        this.assist_apply_status = DEFAULT_ASSIST_APPLY_STATUS;
      } else {
        this.assist_apply_status = integer;
      } 
    } else {
      this.assist_left_num = ((Builder)integer).assist_left_num;
      this.assist_apply_url = ((Builder)integer).assist_apply_url;
      this.assist_apply_status = ((Builder)integer).assist_apply_status;
    } 
  }
  
  public PriManagerApplyInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PriManagerApplyInfo> {
    public Integer assist_apply_status;
    
    public String assist_apply_url;
    
    public Integer assist_left_num;
    
    public Builder() {}
    
    public Builder(PriManagerApplyInfo param1PriManagerApplyInfo) {
      super(param1PriManagerApplyInfo);
      if (param1PriManagerApplyInfo == null)
        return; 
      this.assist_left_num = param1PriManagerApplyInfo.assist_left_num;
      this.assist_apply_url = param1PriManagerApplyInfo.assist_apply_url;
      this.assist_apply_status = param1PriManagerApplyInfo.assist_apply_status;
    }
    
    public PriManagerApplyInfo build(boolean param1Boolean) {
      return new PriManagerApplyInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
