package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlaStageDislikeInfo extends Message {
  public static final Integer DEFAULT_DISLIKE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_DISLIKE_REASON = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer dislike_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String dislike_reason;
  
  public AlaStageDislikeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.dislike_reason;
      if (str == null) {
        this.dislike_reason = "";
      } else {
        this.dislike_reason = str;
      } 
      integer = paramBuilder.dislike_id;
      if (integer == null) {
        this.dislike_id = DEFAULT_DISLIKE_ID;
      } else {
        this.dislike_id = integer;
      } 
    } else {
      this.dislike_reason = ((Builder)integer).dislike_reason;
      this.dislike_id = ((Builder)integer).dislike_id;
    } 
  }
  
  public AlaStageDislikeInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlaStageDislikeInfo> {
    public Integer dislike_id;
    
    public String dislike_reason;
    
    public Builder() {}
    
    public Builder(AlaStageDislikeInfo param1AlaStageDislikeInfo) {
      super(param1AlaStageDislikeInfo);
      if (param1AlaStageDislikeInfo == null)
        return; 
      this.dislike_reason = param1AlaStageDislikeInfo.dislike_reason;
      this.dislike_id = param1AlaStageDislikeInfo.dislike_id;
    }
    
    public AlaStageDislikeInfo build(boolean param1Boolean) {
      return new AlaStageDislikeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
