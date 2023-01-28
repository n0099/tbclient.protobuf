package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MemberBlockInfo extends Message {
  public static final Integer DEFAULT_IS_AUTO_PAY;
  
  public static final Integer DEFAULT_IS_BAN;
  
  public static final Integer DEFAULT_IS_PERMANENT_BAN;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_auto_pay;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_ban;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_permanent_ban;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_PERMANENT_BAN = integer;
    DEFAULT_IS_AUTO_PAY = integer;
    DEFAULT_IS_BAN = integer;
  }
  
  public MemberBlockInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_permanent_ban;
      if (integer1 == null) {
        this.is_permanent_ban = DEFAULT_IS_PERMANENT_BAN;
      } else {
        this.is_permanent_ban = integer1;
      } 
      integer1 = paramBuilder.is_auto_pay;
      if (integer1 == null) {
        this.is_auto_pay = DEFAULT_IS_AUTO_PAY;
      } else {
        this.is_auto_pay = integer1;
      } 
      integer = paramBuilder.is_ban;
      if (integer == null) {
        this.is_ban = DEFAULT_IS_BAN;
      } else {
        this.is_ban = integer;
      } 
    } else {
      this.is_permanent_ban = ((Builder)integer).is_permanent_ban;
      this.is_auto_pay = ((Builder)integer).is_auto_pay;
      this.is_ban = ((Builder)integer).is_ban;
    } 
  }
  
  public MemberBlockInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MemberBlockInfo> {
    public Integer is_auto_pay;
    
    public Integer is_ban;
    
    public Integer is_permanent_ban;
    
    public Builder() {}
    
    public Builder(MemberBlockInfo param1MemberBlockInfo) {
      super(param1MemberBlockInfo);
      if (param1MemberBlockInfo == null)
        return; 
      this.is_permanent_ban = param1MemberBlockInfo.is_permanent_ban;
      this.is_auto_pay = param1MemberBlockInfo.is_auto_pay;
      this.is_ban = param1MemberBlockInfo.is_ban;
    }
    
    public MemberBlockInfo build(boolean param1Boolean) {
      return new MemberBlockInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
