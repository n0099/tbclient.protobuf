package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SugLiveInfo extends Message {
  public static final String DEFAULT_WORD = "";
  
  @ProtoField(tag = 2)
  public final AlaLiveInfo ala_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String word;
  
  public SugLiveInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.word;
      if (str == null) {
        this.word = "";
      } else {
        this.word = str;
      } 
      this.ala_info = paramBuilder.ala_info;
    } else {
      this.word = paramBuilder.word;
      this.ala_info = paramBuilder.ala_info;
    } 
  }
  
  public SugLiveInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SugLiveInfo> {
    public AlaLiveInfo ala_info;
    
    public String word;
    
    public Builder() {}
    
    public Builder(SugLiveInfo param1SugLiveInfo) {
      super(param1SugLiveInfo);
      if (param1SugLiveInfo == null)
        return; 
      this.word = param1SugLiveInfo.word;
      this.ala_info = param1SugLiveInfo.ala_info;
    }
    
    public SugLiveInfo build(boolean param1Boolean) {
      return new SugLiveInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
