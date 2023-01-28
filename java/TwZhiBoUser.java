package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TwZhiBoUser extends Message {
  public static final Integer DEFAULT_ANCHOR_LEVEL;
  
  public static final String DEFAULT_FIELD_EX = "";
  
  public static final Integer DEFAULT_IN_BLACK_LIST;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer anchor_level;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String field_ex;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer in_black_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ANCHOR_LEVEL = integer;
    DEFAULT_IN_BLACK_LIST = integer;
  }
  
  public TwZhiBoUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.anchor_level;
      if (integer == null) {
        this.anchor_level = DEFAULT_ANCHOR_LEVEL;
      } else {
        this.anchor_level = integer;
      } 
      integer = paramBuilder.in_black_list;
      if (integer == null) {
        this.in_black_list = DEFAULT_IN_BLACK_LIST;
      } else {
        this.in_black_list = integer;
      } 
      str = paramBuilder.field_ex;
      if (str == null) {
        this.field_ex = "";
      } else {
        this.field_ex = str;
      } 
    } else {
      this.anchor_level = ((Builder)str).anchor_level;
      this.in_black_list = ((Builder)str).in_black_list;
      this.field_ex = ((Builder)str).field_ex;
    } 
  }
  
  public TwZhiBoUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TwZhiBoUser> {
    public Integer anchor_level;
    
    public String field_ex;
    
    public Integer in_black_list;
    
    public Builder() {}
    
    public Builder(TwZhiBoUser param1TwZhiBoUser) {
      super(param1TwZhiBoUser);
      if (param1TwZhiBoUser == null)
        return; 
      this.anchor_level = param1TwZhiBoUser.anchor_level;
      this.in_black_list = param1TwZhiBoUser.in_black_list;
      this.field_ex = param1TwZhiBoUser.field_ex;
    }
    
    public TwZhiBoUser build(boolean param1Boolean) {
      return new TwZhiBoUser(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
