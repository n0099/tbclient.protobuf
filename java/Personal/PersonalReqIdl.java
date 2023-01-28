package tbclient.Personal;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PersonalReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public PersonalReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public PersonalReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PersonalReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(PersonalReqIdl param1PersonalReqIdl) {
      super(param1PersonalReqIdl);
      if (param1PersonalReqIdl == null)
        return; 
      this.data = param1PersonalReqIdl.data;
    }
    
    public PersonalReqIdl build(boolean param1Boolean) {
      return new PersonalReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
