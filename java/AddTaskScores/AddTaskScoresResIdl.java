package tbclient.AddTaskScores;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class AddTaskScoresResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public AddTaskScoresResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public AddTaskScoresResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddTaskScoresResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(AddTaskScoresResIdl param1AddTaskScoresResIdl) {
      super(param1AddTaskScoresResIdl);
      if (param1AddTaskScoresResIdl == null)
        return; 
      this.error = param1AddTaskScoresResIdl.error;
      this.data = param1AddTaskScoresResIdl.data;
    }
    
    public AddTaskScoresResIdl build(boolean param1Boolean) {
      return new AddTaskScoresResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
