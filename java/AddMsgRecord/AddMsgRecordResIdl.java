package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class AddMsgRecordResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public AddMsgRecordResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public AddMsgRecordResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddMsgRecordResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(AddMsgRecordResIdl param1AddMsgRecordResIdl) {
      super(param1AddMsgRecordResIdl);
      if (param1AddMsgRecordResIdl == null)
        return; 
      this.error = param1AddMsgRecordResIdl.error;
      this.data = param1AddMsgRecordResIdl.data;
    }
    
    public AddMsgRecordResIdl build(boolean param1Boolean) {
      return new AddMsgRecordResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
