package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DislikeInfo extends Message {
  public static final Integer DEFAULT_DISLIKE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_DISLIKE_REASON = "";
  
  public static final String DEFAULT_EXTRA = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer dislike_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String dislike_reason;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String extra;
  
  public DislikeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.dislike_reason;
      if (str1 == null) {
        this.dislike_reason = "";
      } else {
        this.dislike_reason = str1;
      } 
      Integer integer = paramBuilder.dislike_id;
      if (integer == null) {
        this.dislike_id = DEFAULT_DISLIKE_ID;
      } else {
        this.dislike_id = integer;
      } 
      str = paramBuilder.extra;
      if (str == null) {
        this.extra = "";
      } else {
        this.extra = str;
      } 
    } else {
      this.dislike_reason = ((Builder)str).dislike_reason;
      this.dislike_id = ((Builder)str).dislike_id;
      this.extra = ((Builder)str).extra;
    } 
  }
  
  public DislikeInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DislikeInfo> {
    public Integer dislike_id;
    
    public String dislike_reason;
    
    public String extra;
    
    public Builder() {}
    
    public Builder(DislikeInfo param1DislikeInfo) {
      super(param1DislikeInfo);
      if (param1DislikeInfo == null)
        return; 
      this.dislike_reason = param1DislikeInfo.dislike_reason;
      this.dislike_id = param1DislikeInfo.dislike_id;
      this.extra = param1DislikeInfo.extra;
    }
    
    public DislikeInfo build(boolean param1Boolean) {
      return new DislikeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
