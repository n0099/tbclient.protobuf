package tbclient.Lottery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActRegular extends Message {
  public static final String DEFAULT_BTN_NAME = "";
  
  public static final Integer DEFAULT_CHANCE;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String btn_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer chance;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_CHANCE = integer;
  }
  
  public ActRegular(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      integer = paramBuilder.chance;
      if (integer == null) {
        this.chance = DEFAULT_CHANCE;
      } else {
        this.chance = integer;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.btn_name;
      if (str == null) {
        this.btn_name = "";
      } else {
        this.btn_name = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.chance = ((Builder)str).chance;
      this.url = ((Builder)str).url;
      this.btn_name = ((Builder)str).btn_name;
    } 
  }
  
  public ActRegular(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActRegular> {
    public String btn_name;
    
    public Integer chance;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ActRegular param1ActRegular) {
      super(param1ActRegular);
      if (param1ActRegular == null)
        return; 
      this.type = param1ActRegular.type;
      this.chance = param1ActRegular.chance;
      this.url = param1ActRegular.url;
      this.btn_name = param1ActRegular.btn_name;
    }
    
    public ActRegular build(boolean param1Boolean) {
      return new ActRegular(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
