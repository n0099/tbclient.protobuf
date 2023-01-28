package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetWorksTagsResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetWorksTagsResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetWorksTagsResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetWorksTagsResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetWorksTagsResIdl param1GetWorksTagsResIdl) {
      super(param1GetWorksTagsResIdl);
      if (param1GetWorksTagsResIdl == null)
        return; 
      this.error = param1GetWorksTagsResIdl.error;
      this.data = param1GetWorksTagsResIdl.data;
    }
    
    public GetWorksTagsResIdl build(boolean param1Boolean) {
      return new GetWorksTagsResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
