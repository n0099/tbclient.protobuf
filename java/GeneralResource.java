package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GeneralResource extends Message {
  public static final Integer DEFAULT_RES_FLOOR = Integer.valueOf(0);
  
  public static final String DEFAULT_RES_IMAGE = "";
  
  public static final String DEFAULT_RES_LINK = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer res_floor;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String res_image;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String res_link;
  
  public GeneralResource(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.res_image;
      if (str == null) {
        this.res_image = "";
      } else {
        this.res_image = str;
      } 
      str = paramBuilder.res_link;
      if (str == null) {
        this.res_link = "";
      } else {
        this.res_link = str;
      } 
      integer = paramBuilder.res_floor;
      if (integer == null) {
        this.res_floor = DEFAULT_RES_FLOOR;
      } else {
        this.res_floor = integer;
      } 
    } else {
      this.res_image = ((Builder)integer).res_image;
      this.res_link = ((Builder)integer).res_link;
      this.res_floor = ((Builder)integer).res_floor;
    } 
  }
  
  public GeneralResource(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GeneralResource> {
    public Integer res_floor;
    
    public String res_image;
    
    public String res_link;
    
    public Builder() {}
    
    public Builder(GeneralResource param1GeneralResource) {
      super(param1GeneralResource);
      if (param1GeneralResource == null)
        return; 
      this.res_image = param1GeneralResource.res_image;
      this.res_link = param1GeneralResource.res_link;
      this.res_floor = param1GeneralResource.res_floor;
    }
    
    public GeneralResource build(boolean param1Boolean) {
      return new GeneralResource(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
