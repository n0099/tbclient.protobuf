package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AnimationThread extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_VIDEO_PIC = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String video_pic;
  
  public AnimationThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.video_pic;
      if (str1 == null) {
        this.video_pic = "";
      } else {
        this.video_pic = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.video_pic = ((Builder)str).video_pic;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public AnimationThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AnimationThread> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String jump_url;
    
    public String video_pic;
    
    public Builder() {}
    
    public Builder(AnimationThread param1AnimationThread) {
      super(param1AnimationThread);
      if (param1AnimationThread == null)
        return; 
      this.video_pic = param1AnimationThread.video_pic;
      this.jump_url = param1AnimationThread.jump_url;
    }
    
    public AnimationThread build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AnimationThread)interceptResult.objValue; 
      } 
      return new AnimationThread(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
