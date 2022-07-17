package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadEasterEgg extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ACTIVITY_ID = "";
  
  public static final String DEFAULT_POP_IMAGEURL = "";
  
  public static final String DEFAULT_POP_TEXT = "";
  
  public static final String DEFAULT_VIDEO_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String activity_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pop_imageurl;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pop_text;
  
  @ProtoField(tag = 5)
  public final ShareInfo share_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String video_url;
  
  public ThreadEasterEgg(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.activity_id;
      if (str == null) {
        this.activity_id = "";
      } else {
        this.activity_id = str;
      } 
      str = paramBuilder.video_url;
      if (str == null) {
        this.video_url = "";
      } else {
        this.video_url = str;
      } 
      str = paramBuilder.pop_text;
      if (str == null) {
        this.pop_text = "";
      } else {
        this.pop_text = str;
      } 
      str = paramBuilder.pop_imageurl;
      if (str == null) {
        this.pop_imageurl = "";
      } else {
        this.pop_imageurl = str;
      } 
      this.share_info = paramBuilder.share_info;
    } else {
      this.activity_id = paramBuilder.activity_id;
      this.video_url = paramBuilder.video_url;
      this.pop_text = paramBuilder.pop_text;
      this.pop_imageurl = paramBuilder.pop_imageurl;
      this.share_info = paramBuilder.share_info;
    } 
  }
  
  public ThreadEasterEgg(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadEasterEgg> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String activity_id;
    
    public String pop_imageurl;
    
    public String pop_text;
    
    public ShareInfo share_info;
    
    public String video_url;
    
    public Builder() {}
    
    public Builder(ThreadEasterEgg param1ThreadEasterEgg) {
      super(param1ThreadEasterEgg);
      if (param1ThreadEasterEgg == null)
        return; 
      this.activity_id = param1ThreadEasterEgg.activity_id;
      this.video_url = param1ThreadEasterEgg.video_url;
      this.pop_text = param1ThreadEasterEgg.pop_text;
      this.pop_imageurl = param1ThreadEasterEgg.pop_imageurl;
      this.share_info = param1ThreadEasterEgg.share_info;
    }
    
    public ThreadEasterEgg build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThreadEasterEgg)interceptResult.objValue; 
      } 
      return new ThreadEasterEgg(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
