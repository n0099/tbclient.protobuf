package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LiveAnswer extends Message {
  public static final Integer DEFAULT_BANNER_HIGH;
  
  public static final String DEFAULT_BANNER_URL = "";
  
  public static final Integer DEFAULT_BANNER_WIDTH;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer banner_high;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String banner_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer banner_width;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_BANNER_WIDTH = integer;
    DEFAULT_BANNER_HIGH = integer;
  }
  
  public LiveAnswer(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.banner_url;
      if (str1 == null) {
        this.banner_url = "";
      } else {
        this.banner_url = str1;
      } 
      Integer integer = paramBuilder.banner_width;
      if (integer == null) {
        this.banner_width = DEFAULT_BANNER_WIDTH;
      } else {
        this.banner_width = integer;
      } 
      integer = paramBuilder.banner_high;
      if (integer == null) {
        this.banner_high = DEFAULT_BANNER_HIGH;
      } else {
        this.banner_high = integer;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.banner_url = ((Builder)str).banner_url;
      this.banner_width = ((Builder)str).banner_width;
      this.banner_high = ((Builder)str).banner_high;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public LiveAnswer(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LiveAnswer> {
    public Integer banner_high;
    
    public String banner_url;
    
    public Integer banner_width;
    
    public String jump_url;
    
    public Builder() {}
    
    public Builder(LiveAnswer param1LiveAnswer) {
      super(param1LiveAnswer);
      if (param1LiveAnswer == null)
        return; 
      this.banner_url = param1LiveAnswer.banner_url;
      this.banner_width = param1LiveAnswer.banner_width;
      this.banner_high = param1LiveAnswer.banner_high;
      this.jump_url = param1LiveAnswer.jump_url;
    }
    
    public LiveAnswer build(boolean param1Boolean) {
      return new LiveAnswer(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
