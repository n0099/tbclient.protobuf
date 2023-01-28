package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Identify extends Message {
  public static final String DEFAULT_ID = "";
  
  public static final Integer DEFAULT_IS_IDENTIFY = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_identify;
  
  public Identify(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_identify;
      if (integer == null) {
        this.is_identify = DEFAULT_IS_IDENTIFY;
      } else {
        this.is_identify = integer;
      } 
      str = paramBuilder.id;
      if (str == null) {
        this.id = "";
      } else {
        this.id = str;
      } 
    } else {
      this.is_identify = ((Builder)str).is_identify;
      this.id = ((Builder)str).id;
    } 
  }
  
  public Identify(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Identify> {
    public String id;
    
    public Integer is_identify;
    
    public Builder() {}
    
    public Builder(Identify param1Identify) {
      super(param1Identify);
      if (param1Identify == null)
        return; 
      this.is_identify = param1Identify.is_identify;
      this.id = param1Identify.id;
    }
    
    public Identify build(boolean param1Boolean) {
      return new Identify(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
