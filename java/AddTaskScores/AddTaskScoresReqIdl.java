package tbclient.AddTaskScores;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AddTaskScoresReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public AddTaskScoresReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public AddTaskScoresReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddTaskScoresReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(AddTaskScoresReqIdl param1AddTaskScoresReqIdl) {
      super(param1AddTaskScoresReqIdl);
      if (param1AddTaskScoresReqIdl == null)
        return; 
      this.data = param1AddTaskScoresReqIdl.data;
    }
    
    public AddTaskScoresReqIdl build(boolean param1Boolean) {
      return new AddTaskScoresReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
