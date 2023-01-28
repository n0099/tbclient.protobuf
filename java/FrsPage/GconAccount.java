package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GconAccount extends Message {
  public static final Integer DEFAULT_HAS_ACCOUNT = Integer.valueOf(0);
  
  public static final String DEFAULT_MENU_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer has_account;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String menu_name;
  
  public GconAccount(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.has_account;
      if (integer == null) {
        this.has_account = DEFAULT_HAS_ACCOUNT;
      } else {
        this.has_account = integer;
      } 
      str = paramBuilder.menu_name;
      if (str == null) {
        this.menu_name = "";
      } else {
        this.menu_name = str;
      } 
    } else {
      this.has_account = ((Builder)str).has_account;
      this.menu_name = ((Builder)str).menu_name;
    } 
  }
  
  public GconAccount(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GconAccount> {
    public Integer has_account;
    
    public String menu_name;
    
    public Builder() {}
    
    public Builder(GconAccount param1GconAccount) {
      super(param1GconAccount);
      if (param1GconAccount == null)
        return; 
      this.has_account = param1GconAccount.has_account;
      this.menu_name = param1GconAccount.menu_name;
    }
    
    public GconAccount build(boolean param1Boolean) {
      return new GconAccount(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
