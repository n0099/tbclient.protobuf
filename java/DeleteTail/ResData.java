package tbclient.DeleteTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ResData extends Message {
  public static final Long DEFAULT_TAILID = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tailId;
  
  public ResData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      long_ = paramBuilder.tailId;
      if (long_ == null) {
        this.tailId = DEFAULT_TAILID;
      } else {
        this.tailId = long_;
      } 
    } else {
      this.tailId = ((Builder)long_).tailId;
    } 
  }
  
  public ResData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ResData> {
    public Long tailId;
    
    public Builder() {}
    
    public Builder(ResData param1ResData) {
      super(param1ResData);
      if (param1ResData == null)
        return; 
      this.tailId = param1ResData.tailId;
    }
    
    public ResData build(boolean param1Boolean) {
      return new ResData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
