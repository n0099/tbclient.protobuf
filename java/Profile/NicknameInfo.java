package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NicknameInfo extends Message {
  public static final Integer DEFAULT_LEFT_DAYS = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer left_days;
  
  public NicknameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.left_days;
      if (integer == null) {
        this.left_days = DEFAULT_LEFT_DAYS;
      } else {
        this.left_days = integer;
      } 
    } else {
      this.left_days = ((Builder)integer).left_days;
    } 
  }
  
  public NicknameInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NicknameInfo> {
    public Integer left_days;
    
    public Builder() {}
    
    public Builder(NicknameInfo param1NicknameInfo) {
      super(param1NicknameInfo);
      if (param1NicknameInfo == null)
        return; 
      this.left_days = param1NicknameInfo.left_days;
    }
    
    public NicknameInfo build(boolean param1Boolean) {
      return new NicknameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
