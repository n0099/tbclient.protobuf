package tbclient.VideoRedIcon;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class VideoRedIconResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public VideoRedIconResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public VideoRedIconResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VideoRedIconResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(VideoRedIconResIdl param1VideoRedIconResIdl) {
      super(param1VideoRedIconResIdl);
      if (param1VideoRedIconResIdl == null)
        return; 
      this.error = param1VideoRedIconResIdl.error;
      this.data = param1VideoRedIconResIdl.data;
    }
    
    public VideoRedIconResIdl build(boolean param1Boolean) {
      return new VideoRedIconResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
