package tbclient.VideoTemplate;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class VideoTemplateResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public VideoTemplateResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public VideoTemplateResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VideoTemplateResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(VideoTemplateResIdl param1VideoTemplateResIdl) {
      super(param1VideoTemplateResIdl);
      if (param1VideoTemplateResIdl == null)
        return; 
      this.error = param1VideoTemplateResIdl.error;
      this.data = param1VideoTemplateResIdl.data;
    }
    
    public VideoTemplateResIdl build(boolean param1Boolean) {
      return new VideoTemplateResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
