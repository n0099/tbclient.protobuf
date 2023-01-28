package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Pendant extends Message {
  public static final String DEFAULT_DYNAMIC_URL = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Long DEFAULT_PROPS_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String dynamic_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long props_id;
  
  public Pendant(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.props_id;
      if (long_ == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = long_;
      } 
      String str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str1 = paramBuilder.dynamic_url;
      if (str1 == null) {
        this.dynamic_url = "";
      } else {
        this.dynamic_url = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.img_url = ((Builder)str).img_url;
      this.dynamic_url = ((Builder)str).dynamic_url;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public Pendant(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Pendant> {
    public String dynamic_url;
    
    public String img_url;
    
    public String jump_url;
    
    public Long props_id;
    
    public Builder() {}
    
    public Builder(Pendant param1Pendant) {
      super(param1Pendant);
      if (param1Pendant == null)
        return; 
      this.props_id = param1Pendant.props_id;
      this.img_url = param1Pendant.img_url;
      this.dynamic_url = param1Pendant.dynamic_url;
      this.jump_url = param1Pendant.jump_url;
    }
    
    public Pendant build(boolean param1Boolean) {
      return new Pendant(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
