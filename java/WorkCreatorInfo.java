package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WorkCreatorInfo extends Message {
  public static final String DEFAULT_AUTH_DESC = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String auth_desc;
  
  public WorkCreatorInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.auth_desc;
      if (str == null) {
        this.auth_desc = "";
      } else {
        this.auth_desc = str;
      } 
    } else {
      this.auth_desc = ((Builder)str).auth_desc;
    } 
  }
  
  public WorkCreatorInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<WorkCreatorInfo> {
    public String auth_desc;
    
    public Builder() {}
    
    public Builder(WorkCreatorInfo param1WorkCreatorInfo) {
      super(param1WorkCreatorInfo);
      if (param1WorkCreatorInfo == null)
        return; 
      this.auth_desc = param1WorkCreatorInfo.auth_desc;
    }
    
    public WorkCreatorInfo build(boolean param1Boolean) {
      return new WorkCreatorInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
