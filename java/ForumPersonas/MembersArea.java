package tbclient.ForumPersonas;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MembersArea extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final Double DEFAULT_RATE;
  
  public static final Integer DEFAULT_SEQ = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.DOUBLE)
  public final Double rate;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer seq;
  
  static {
    DEFAULT_RATE = Double.valueOf(0.0D);
  }
  
  public MembersArea(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.seq;
      if (integer == null) {
        this.seq = DEFAULT_SEQ;
      } else {
        this.seq = integer;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      double_ = paramBuilder.rate;
      if (double_ == null) {
        this.rate = DEFAULT_RATE;
      } else {
        this.rate = double_;
      } 
    } else {
      this.seq = ((Builder)double_).seq;
      this.name = ((Builder)double_).name;
      this.rate = ((Builder)double_).rate;
    } 
  }
  
  public MembersArea(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MembersArea> {
    public String name;
    
    public Double rate;
    
    public Integer seq;
    
    public Builder() {}
    
    public Builder(MembersArea param1MembersArea) {
      super(param1MembersArea);
      if (param1MembersArea == null)
        return; 
      this.seq = param1MembersArea.seq;
      this.name = param1MembersArea.name;
      this.rate = param1MembersArea.rate;
    }
    
    public MembersArea build(boolean param1Boolean) {
      return new MembersArea(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
