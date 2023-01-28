package tbclient.Personal;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class PersonalResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public PersonalResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public PersonalResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PersonalResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(PersonalResIdl param1PersonalResIdl) {
      super(param1PersonalResIdl);
      if (param1PersonalResIdl == null)
        return; 
      this.error = param1PersonalResIdl.error;
      this.data = param1PersonalResIdl.data;
    }
    
    public PersonalResIdl build(boolean param1Boolean) {
      return new PersonalResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
