package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetForumsFromForumClassResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetForumsFromForumClassResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetForumsFromForumClassResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetForumsFromForumClassResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetForumsFromForumClassResIdl param1GetForumsFromForumClassResIdl) {
      super(param1GetForumsFromForumClassResIdl);
      if (param1GetForumsFromForumClassResIdl == null)
        return; 
      this.data = param1GetForumsFromForumClassResIdl.data;
      this.error = param1GetForumsFromForumClassResIdl.error;
    }
    
    public GetForumsFromForumClassResIdl build(boolean param1Boolean) {
      return new GetForumsFromForumClassResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
