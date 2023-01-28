package tbclient.VideoTemplate;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VideoTemplateReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public VideoTemplateReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public VideoTemplateReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VideoTemplateReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(VideoTemplateReqIdl param1VideoTemplateReqIdl) {
      super(param1VideoTemplateReqIdl);
      if (param1VideoTemplateReqIdl == null)
        return; 
      this.data = param1VideoTemplateReqIdl.data;
    }
    
    public VideoTemplateReqIdl build(boolean param1Boolean) {
      return new VideoTemplateReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
