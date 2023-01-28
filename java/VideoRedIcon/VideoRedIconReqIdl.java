package tbclient.VideoRedIcon;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VideoRedIconReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public VideoRedIconReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public VideoRedIconReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VideoRedIconReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(VideoRedIconReqIdl param1VideoRedIconReqIdl) {
      super(param1VideoRedIconReqIdl);
      if (param1VideoRedIconReqIdl == null)
        return; 
      this.data = param1VideoRedIconReqIdl.data;
    }
    
    public VideoRedIconReqIdl build(boolean param1Boolean) {
      return new VideoRedIconReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
