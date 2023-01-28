package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PhotoInfo extends Message {
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_PIC = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic;
  
  public PhotoInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
    } else {
      this.pic = ((Builder)integer).pic;
      this.num = ((Builder)integer).num;
    } 
  }
  
  public PhotoInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PhotoInfo> {
    public Integer num;
    
    public String pic;
    
    public Builder() {}
    
    public Builder(PhotoInfo param1PhotoInfo) {
      super(param1PhotoInfo);
      if (param1PhotoInfo == null)
        return; 
      this.pic = param1PhotoInfo.pic;
      this.num = param1PhotoInfo.num;
    }
    
    public PhotoInfo build(boolean param1Boolean) {
      return new PhotoInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
