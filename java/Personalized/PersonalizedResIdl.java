package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class PersonalizedResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public PersonalizedResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public PersonalizedResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PersonalizedResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(PersonalizedResIdl param1PersonalizedResIdl) {
      super(param1PersonalizedResIdl);
      if (param1PersonalizedResIdl == null)
        return; 
      this.error = param1PersonalizedResIdl.error;
      this.data = param1PersonalizedResIdl.data;
    }
    
    public PersonalizedResIdl build(boolean param1Boolean) {
      return new PersonalizedResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
