package tbclient.CompleteTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CompleteTaskReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public CompleteTaskReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public CompleteTaskReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CompleteTaskReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(CompleteTaskReqIdl param1CompleteTaskReqIdl) {
      super(param1CompleteTaskReqIdl);
      if (param1CompleteTaskReqIdl == null)
        return; 
      this.data = param1CompleteTaskReqIdl.data;
    }
    
    public CompleteTaskReqIdl build(boolean param1Boolean) {
      return new CompleteTaskReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
