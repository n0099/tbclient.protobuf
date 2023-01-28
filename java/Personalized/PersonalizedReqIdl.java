package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PersonalizedReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public PersonalizedReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public PersonalizedReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PersonalizedReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(PersonalizedReqIdl param1PersonalizedReqIdl) {
      super(param1PersonalizedReqIdl);
      if (param1PersonalizedReqIdl == null)
        return; 
      this.data = param1PersonalizedReqIdl.data;
    }
    
    public PersonalizedReqIdl build(boolean param1Boolean) {
      return new PersonalizedReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
