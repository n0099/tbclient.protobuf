package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DeletedReasonInfo extends Message {
  public static final Integer DEFAULT_IS_BOOMGROW;
  
  public static final Integer DEFAULT_IS_GRAYS_CALE_FORUM;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_boomgrow;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_grays_cale_forum;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_GRAYS_CALE_FORUM = integer;
    DEFAULT_IS_BOOMGROW = integer;
  }
  
  public DeletedReasonInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_grays_cale_forum;
      if (integer1 == null) {
        this.is_grays_cale_forum = DEFAULT_IS_GRAYS_CALE_FORUM;
      } else {
        this.is_grays_cale_forum = integer1;
      } 
      integer = paramBuilder.is_boomgrow;
      if (integer == null) {
        this.is_boomgrow = DEFAULT_IS_BOOMGROW;
      } else {
        this.is_boomgrow = integer;
      } 
    } else {
      this.is_grays_cale_forum = ((Builder)integer).is_grays_cale_forum;
      this.is_boomgrow = ((Builder)integer).is_boomgrow;
    } 
  }
  
  public DeletedReasonInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DeletedReasonInfo> {
    public Integer is_boomgrow;
    
    public Integer is_grays_cale_forum;
    
    public Builder() {}
    
    public Builder(DeletedReasonInfo param1DeletedReasonInfo) {
      super(param1DeletedReasonInfo);
      if (param1DeletedReasonInfo == null)
        return; 
      this.is_grays_cale_forum = param1DeletedReasonInfo.is_grays_cale_forum;
      this.is_boomgrow = param1DeletedReasonInfo.is_boomgrow;
    }
    
    public DeletedReasonInfo build(boolean param1Boolean) {
      return new DeletedReasonInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
