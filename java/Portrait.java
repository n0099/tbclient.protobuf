package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Portrait extends Message {
  public static final Integer DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer end_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_END_TIME = integer;
  }
  
  public Portrait(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.props_id;
      if (integer == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer;
      } 
      integer = paramBuilder.end_time;
      if (integer == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.end_time = ((Builder)str).end_time;
      this.url = ((Builder)str).url;
    } 
  }
  
  public Portrait(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Portrait> {
    public Integer end_time;
    
    public Integer props_id;
    
    public String url;
    
    public Builder() {}
    
    public Builder(Portrait param1Portrait) {
      super(param1Portrait);
      if (param1Portrait == null)
        return; 
      this.props_id = param1Portrait.props_id;
      this.end_time = param1Portrait.end_time;
      this.url = param1Portrait.url;
    }
    
    public Portrait build(boolean param1Boolean) {
      return new Portrait(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
