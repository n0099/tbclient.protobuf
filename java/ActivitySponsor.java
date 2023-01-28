package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActivitySponsor extends Message {
  public static final Integer DEFAULT_IS_SPONSOR = Integer.valueOf(0);
  
  public static final String DEFAULT_SPONSOR_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_sponsor;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sponsor_url;
  
  public ActivitySponsor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_sponsor;
      if (integer == null) {
        this.is_sponsor = DEFAULT_IS_SPONSOR;
      } else {
        this.is_sponsor = integer;
      } 
      str = paramBuilder.sponsor_url;
      if (str == null) {
        this.sponsor_url = "";
      } else {
        this.sponsor_url = str;
      } 
    } else {
      this.is_sponsor = ((Builder)str).is_sponsor;
      this.sponsor_url = ((Builder)str).sponsor_url;
    } 
  }
  
  public ActivitySponsor(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActivitySponsor> {
    public Integer is_sponsor;
    
    public String sponsor_url;
    
    public Builder() {}
    
    public Builder(ActivitySponsor param1ActivitySponsor) {
      super(param1ActivitySponsor);
      if (param1ActivitySponsor == null)
        return; 
      this.is_sponsor = param1ActivitySponsor.is_sponsor;
      this.sponsor_url = param1ActivitySponsor.sponsor_url;
    }
    
    public ActivitySponsor build(boolean param1Boolean) {
      return new ActivitySponsor(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
