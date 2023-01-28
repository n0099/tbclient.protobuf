package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AddMsgRecordReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public AddMsgRecordReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public AddMsgRecordReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddMsgRecordReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(AddMsgRecordReqIdl param1AddMsgRecordReqIdl) {
      super(param1AddMsgRecordReqIdl);
      if (param1AddMsgRecordReqIdl == null)
        return; 
      this.data = param1AddMsgRecordReqIdl.data;
    }
    
    public AddMsgRecordReqIdl build(boolean param1Boolean) {
      return new AddMsgRecordReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
