package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BannerImage extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AHEAD_URL = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ahead_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  public BannerImage(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str1 = paramBuilder.ahead_url;
      if (str1 == null) {
        this.ahead_url = "";
      } else {
        this.ahead_url = str1;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.img_url = ((Builder)str).img_url;
      this.ahead_url = ((Builder)str).ahead_url;
      this.title = ((Builder)str).title;
    } 
  }
  
  public BannerImage(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BannerImage> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String ahead_url;
    
    public String img_url;
    
    public String title;
    
    public Builder() {}
    
    public Builder(BannerImage param1BannerImage) {
      super(param1BannerImage);
      if (param1BannerImage == null)
        return; 
      this.img_url = param1BannerImage.img_url;
      this.ahead_url = param1BannerImage.ahead_url;
      this.title = param1BannerImage.title;
    }
    
    public BannerImage build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BannerImage)interceptResult.objValue; 
      } 
      return new BannerImage(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
