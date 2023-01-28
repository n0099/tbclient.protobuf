package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommonLocation extends Message {
  public static final String DEFAULT_DISTANCE = "";
  
  public static final Long DEFAULT_TIME = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String distance;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long time;
  
  public CommonLocation(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.distance;
      if (str == null) {
        this.distance = "";
      } else {
        this.distance = str;
      } 
      long_ = paramBuilder.time;
      if (long_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = long_;
      } 
    } else {
      this.distance = ((Builder)long_).distance;
      this.time = ((Builder)long_).time;
    } 
  }
  
  public CommonLocation(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CommonLocation> {
    public String distance;
    
    public Long time;
    
    public Builder() {}
    
    public Builder(CommonLocation param1CommonLocation) {
      super(param1CommonLocation);
      if (param1CommonLocation == null)
        return; 
      this.distance = param1CommonLocation.distance;
      this.time = param1CommonLocation.time;
    }
    
    public CommonLocation build(boolean param1Boolean) {
      return new CommonLocation(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
