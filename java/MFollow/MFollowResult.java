package tbclient.MFollow;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MFollowResult extends Message {
  public static final Boolean DEFAULT_IS_SUCCESS = Boolean.FALSE;
  
  public static final String DEFAULT_MSG = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.BOOL)
  public final Boolean is_success;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String msg;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String portrait;
  
  public MFollowResult(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      Boolean bool = paramBuilder.is_success;
      if (bool == null) {
        this.is_success = DEFAULT_IS_SUCCESS;
      } else {
        this.is_success = bool;
      } 
      str = paramBuilder.msg;
      if (str == null) {
        this.msg = "";
      } else {
        this.msg = str;
      } 
    } else {
      this.portrait = ((Builder)str).portrait;
      this.is_success = ((Builder)str).is_success;
      this.msg = ((Builder)str).msg;
    } 
  }
  
  public MFollowResult(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MFollowResult> {
    public Boolean is_success;
    
    public String msg;
    
    public String portrait;
    
    public Builder() {}
    
    public Builder(MFollowResult param1MFollowResult) {
      super(param1MFollowResult);
      if (param1MFollowResult == null)
        return; 
      this.portrait = param1MFollowResult.portrait;
      this.is_success = param1MFollowResult.is_success;
      this.msg = param1MFollowResult.msg;
    }
    
    public MFollowResult build(boolean param1Boolean) {
      return new MFollowResult(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
