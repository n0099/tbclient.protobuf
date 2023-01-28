package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LevelInfo extends Message {
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_SCORE;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer score;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_SCORE = integer;
  }
  
  public LevelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.id;
      if (integer1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer1;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      integer = paramBuilder.score;
      if (integer == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = integer;
      } 
    } else {
      this.id = ((Builder)integer).id;
      this.name = ((Builder)integer).name;
      this.score = ((Builder)integer).score;
    } 
  }
  
  public LevelInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LevelInfo> {
    public Integer id;
    
    public String name;
    
    public Integer score;
    
    public Builder() {}
    
    public Builder(LevelInfo param1LevelInfo) {
      super(param1LevelInfo);
      if (param1LevelInfo == null)
        return; 
      this.id = param1LevelInfo.id;
      this.name = param1LevelInfo.name;
      this.score = param1LevelInfo.score;
    }
    
    public LevelInfo build(boolean param1Boolean) {
      return new LevelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
