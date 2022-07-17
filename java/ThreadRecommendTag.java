package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadRecommendTag extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TEXT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3)
  public final ThemeColorInfo background_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 2)
  public final ThemeColorInfo text_color;
  
  public ThreadRecommendTag(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      this.text_color = paramBuilder.text_color;
      this.background_color = paramBuilder.background_color;
    } else {
      this.text = paramBuilder.text;
      this.text_color = paramBuilder.text_color;
      this.background_color = paramBuilder.background_color;
    } 
  }
  
  public ThreadRecommendTag(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadRecommendTag> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ThemeColorInfo background_color;
    
    public String text;
    
    public ThemeColorInfo text_color;
    
    public Builder() {}
    
    public Builder(ThreadRecommendTag param1ThreadRecommendTag) {
      super(param1ThreadRecommendTag);
      if (param1ThreadRecommendTag == null)
        return; 
      this.text = param1ThreadRecommendTag.text;
      this.text_color = param1ThreadRecommendTag.text_color;
      this.background_color = param1ThreadRecommendTag.background_color;
    }
    
    public ThreadRecommendTag build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThreadRecommendTag)interceptResult.objValue; 
      } 
      return new ThreadRecommendTag(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
