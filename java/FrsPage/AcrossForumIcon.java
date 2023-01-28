package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AcrossForumIcon extends Message {
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_PIC_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer pic_type;
  
  public AcrossForumIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
      integer = paramBuilder.pic_type;
      if (integer == null) {
        this.pic_type = DEFAULT_PIC_TYPE;
      } else {
        this.pic_type = integer;
      } 
    } else {
      this.icon_url = ((Builder)integer).icon_url;
      this.pic_type = ((Builder)integer).pic_type;
    } 
  }
  
  public AcrossForumIcon(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AcrossForumIcon> {
    public String icon_url;
    
    public Integer pic_type;
    
    public Builder() {}
    
    public Builder(AcrossForumIcon param1AcrossForumIcon) {
      super(param1AcrossForumIcon);
      if (param1AcrossForumIcon == null)
        return; 
      this.icon_url = param1AcrossForumIcon.icon_url;
      this.pic_type = param1AcrossForumIcon.pic_type;
    }
    
    public AcrossForumIcon build(boolean param1Boolean) {
      return new AcrossForumIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
