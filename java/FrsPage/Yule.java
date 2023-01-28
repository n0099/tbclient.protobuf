package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Yule extends Message {
  public static final Integer DEFAULT_ACTIVITY_SHOW = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer activity_show;
  
  @ProtoField(tag = 1)
  public final YuleActivity yule_activity;
  
  public Yule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.yule_activity = paramBuilder.yule_activity;
      integer = paramBuilder.activity_show;
      if (integer == null) {
        this.activity_show = DEFAULT_ACTIVITY_SHOW;
      } else {
        this.activity_show = integer;
      } 
    } else {
      this.yule_activity = ((Builder)integer).yule_activity;
      this.activity_show = ((Builder)integer).activity_show;
    } 
  }
  
  public Yule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Yule> {
    public Integer activity_show;
    
    public YuleActivity yule_activity;
    
    public Builder() {}
    
    public Builder(Yule param1Yule) {
      super(param1Yule);
      if (param1Yule == null)
        return; 
      this.yule_activity = param1Yule.yule_activity;
      this.activity_show = param1Yule.activity_show;
    }
    
    public Yule build(boolean param1Boolean) {
      return new Yule(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
