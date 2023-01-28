package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DoDailyTaskReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public DoDailyTaskReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public DoDailyTaskReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DoDailyTaskReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(DoDailyTaskReqIdl param1DoDailyTaskReqIdl) {
      super(param1DoDailyTaskReqIdl);
      if (param1DoDailyTaskReqIdl == null)
        return; 
      this.data = param1DoDailyTaskReqIdl.data;
    }
    
    public DoDailyTaskReqIdl build(boolean param1Boolean) {
      return new DoDailyTaskReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
