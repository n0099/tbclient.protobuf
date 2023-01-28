package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FrsVideo extends Message {
  @ProtoField(tag = 1)
  public final ActBtn video_act;
  
  public FrsVideo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.video_act = paramBuilder.video_act;
    } else {
      this.video_act = paramBuilder.video_act;
    } 
  }
  
  public FrsVideo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FrsVideo> {
    public ActBtn video_act;
    
    public Builder() {}
    
    public Builder(FrsVideo param1FrsVideo) {
      super(param1FrsVideo);
      if (param1FrsVideo == null)
        return; 
      this.video_act = param1FrsVideo.video_act;
    }
    
    public FrsVideo build(boolean param1Boolean) {
      return new FrsVideo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
