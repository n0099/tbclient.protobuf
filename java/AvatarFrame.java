package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AvatarFrame extends Message {
  public static final Integer DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_PROPS_ID;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer end_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_END_TIME = integer;
  }
  
  public AvatarFrame(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.props_id;
      if (integer1 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer1;
      } 
      integer = paramBuilder.end_time;
      if (integer == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer;
      } 
    } else {
      this.props_id = ((Builder)integer).props_id;
      this.end_time = ((Builder)integer).end_time;
    } 
  }
  
  public AvatarFrame(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AvatarFrame> {
    public Integer end_time;
    
    public Integer props_id;
    
    public Builder() {}
    
    public Builder(AvatarFrame param1AvatarFrame) {
      super(param1AvatarFrame);
      if (param1AvatarFrame == null)
        return; 
      this.props_id = param1AvatarFrame.props_id;
      this.end_time = param1AvatarFrame.end_time;
    }
    
    public AvatarFrame build(boolean param1Boolean) {
      return new AvatarFrame(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
