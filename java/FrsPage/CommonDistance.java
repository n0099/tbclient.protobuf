package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommonDistance extends Message {
  public static final Integer DEFAULT_DISTANCE;
  
  public static final Integer DEFAULT_IS_HIDE;
  
  public static final Integer DEFAULT_TIME;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer distance;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer is_hide;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer time;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_DISTANCE = integer;
    DEFAULT_TIME = integer;
    DEFAULT_IS_HIDE = integer;
  }
  
  public CommonDistance(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.distance;
      if (integer1 == null) {
        this.distance = DEFAULT_DISTANCE;
      } else {
        this.distance = integer1;
      } 
      integer1 = paramBuilder.time;
      if (integer1 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer1;
      } 
      integer = paramBuilder.is_hide;
      if (integer == null) {
        this.is_hide = DEFAULT_IS_HIDE;
      } else {
        this.is_hide = integer;
      } 
    } else {
      this.distance = ((Builder)integer).distance;
      this.time = ((Builder)integer).time;
      this.is_hide = ((Builder)integer).is_hide;
    } 
  }
  
  public CommonDistance(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CommonDistance> {
    public Integer distance;
    
    public Integer is_hide;
    
    public Integer time;
    
    public Builder() {}
    
    public Builder(CommonDistance param1CommonDistance) {
      super(param1CommonDistance);
      if (param1CommonDistance == null)
        return; 
      this.distance = param1CommonDistance.distance;
      this.time = param1CommonDistance.time;
      this.is_hide = param1CommonDistance.is_hide;
    }
    
    public CommonDistance build(boolean param1Boolean) {
      return new CommonDistance(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
