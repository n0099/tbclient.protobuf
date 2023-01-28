package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ForumRuleDetailResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ForumRuleDetailResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ForumRuleDetailResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumRuleDetailResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ForumRuleDetailResIdl param1ForumRuleDetailResIdl) {
      super(param1ForumRuleDetailResIdl);
      if (param1ForumRuleDetailResIdl == null)
        return; 
      this.error = param1ForumRuleDetailResIdl.error;
      this.data = param1ForumRuleDetailResIdl.data;
    }
    
    public ForumRuleDetailResIdl build(boolean param1Boolean) {
      return new ForumRuleDetailResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
