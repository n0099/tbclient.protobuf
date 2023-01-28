package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Media extends Message {
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  public Media(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.pic_url = ((Builder)str).pic_url;
    } 
  }
  
  public Media(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Media> {
    public String pic_url;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(Media param1Media) {
      super(param1Media);
      if (param1Media == null)
        return; 
      this.type = param1Media.type;
      this.pic_url = param1Media.pic_url;
    }
    
    public Media build(boolean param1Boolean) {
      return new Media(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
