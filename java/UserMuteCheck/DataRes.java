package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final String DEFAULT_IS_MUTE = "";
  
  public static final String DEFAULT_MUTE_CONFIRM = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String is_mute;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String mute_confirm;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.is_mute;
      if (str1 == null) {
        this.is_mute = "";
      } else {
        this.is_mute = str1;
      } 
      str = paramBuilder.mute_confirm;
      if (str == null) {
        this.mute_confirm = "";
      } else {
        this.mute_confirm = str;
      } 
    } else {
      this.is_mute = ((Builder)str).is_mute;
      this.mute_confirm = ((Builder)str).mute_confirm;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public String is_mute;
    
    public String mute_confirm;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.is_mute = param1DataRes.is_mute;
      this.mute_confirm = param1DataRes.mute_confirm;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
