package tbclient.LogTogether;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LogTogetherReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public LogTogetherReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public LogTogetherReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LogTogetherReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(LogTogetherReqIdl param1LogTogetherReqIdl) {
      super(param1LogTogetherReqIdl);
      if (param1LogTogetherReqIdl == null)
        return; 
      this.data = param1LogTogetherReqIdl.data;
    }
    
    public LogTogetherReqIdl build(boolean param1Boolean) {
      return new LogTogetherReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
