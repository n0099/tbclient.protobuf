package tbclient.GetMemberInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ManagerApplyInfo extends Message {
  public static final String DEFAULT_ASSIST_APPLY_URL = "";
  
  public static final Integer DEFAULT_ASSIST_LEFT_NUM;
  
  public static final Integer DEFAULT_MANAGER_APPLY_STATUS;
  
  public static final String DEFAULT_MANAGER_APPLY_URL = "";
  
  public static final Integer DEFAULT_MANAGER_LEFT_NUM;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String assist_apply_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer assist_left_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer manager_apply_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String manager_apply_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer manager_left_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MANAGER_LEFT_NUM = integer;
    DEFAULT_ASSIST_LEFT_NUM = integer;
    DEFAULT_MANAGER_APPLY_STATUS = integer;
  }
  
  public ManagerApplyInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.manager_left_num;
      if (integer2 == null) {
        this.manager_left_num = DEFAULT_MANAGER_LEFT_NUM;
      } else {
        this.manager_left_num = integer2;
      } 
      String str2 = paramBuilder.manager_apply_url;
      if (str2 == null) {
        this.manager_apply_url = "";
      } else {
        this.manager_apply_url = str2;
      } 
      Integer integer1 = paramBuilder.assist_left_num;
      if (integer1 == null) {
        this.assist_left_num = DEFAULT_ASSIST_LEFT_NUM;
      } else {
        this.assist_left_num = integer1;
      } 
      String str1 = paramBuilder.assist_apply_url;
      if (str1 == null) {
        this.assist_apply_url = "";
      } else {
        this.assist_apply_url = str1;
      } 
      integer = paramBuilder.manager_apply_status;
      if (integer == null) {
        this.manager_apply_status = DEFAULT_MANAGER_APPLY_STATUS;
      } else {
        this.manager_apply_status = integer;
      } 
    } else {
      this.manager_left_num = ((Builder)integer).manager_left_num;
      this.manager_apply_url = ((Builder)integer).manager_apply_url;
      this.assist_left_num = ((Builder)integer).assist_left_num;
      this.assist_apply_url = ((Builder)integer).assist_apply_url;
      this.manager_apply_status = ((Builder)integer).manager_apply_status;
    } 
  }
  
  public ManagerApplyInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ManagerApplyInfo> {
    public String assist_apply_url;
    
    public Integer assist_left_num;
    
    public Integer manager_apply_status;
    
    public String manager_apply_url;
    
    public Integer manager_left_num;
    
    public Builder() {}
    
    public Builder(ManagerApplyInfo param1ManagerApplyInfo) {
      super(param1ManagerApplyInfo);
      if (param1ManagerApplyInfo == null)
        return; 
      this.manager_left_num = param1ManagerApplyInfo.manager_left_num;
      this.manager_apply_url = param1ManagerApplyInfo.manager_apply_url;
      this.assist_left_num = param1ManagerApplyInfo.assist_left_num;
      this.assist_apply_url = param1ManagerApplyInfo.assist_apply_url;
      this.manager_apply_status = param1ManagerApplyInfo.manager_apply_status;
    }
    
    public ManagerApplyInfo build(boolean param1Boolean) {
      return new ManagerApplyInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
