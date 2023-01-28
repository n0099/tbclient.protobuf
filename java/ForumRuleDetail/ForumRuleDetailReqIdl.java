package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumRuleDetailReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ForumRuleDetailReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ForumRuleDetailReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumRuleDetailReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ForumRuleDetailReqIdl param1ForumRuleDetailReqIdl) {
      super(param1ForumRuleDetailReqIdl);
      if (param1ForumRuleDetailReqIdl == null)
        return; 
      this.data = param1ForumRuleDetailReqIdl.data;
    }
    
    public ForumRuleDetailReqIdl build(boolean param1Boolean) {
      return new ForumRuleDetailReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
