package tbclient.PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PostBanner extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BANNER_NAME = "";
  
  public static final String DEFAULT_BANNER_PIC = "";
  
  public static final Integer DEFAULT_BANNER_POSITION;
  
  public static final String DEFAULT_BANNER_URL = "";
  
  public static final Integer DEFAULT_CLIENT_TYPE;
  
  public static final Integer DEFAULT_LINK_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String banner_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String banner_pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer banner_position;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String banner_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer client_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer link_type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-388162901, "Ltbclient/PbPage/PostBanner;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-388162901, "Ltbclient/PbPage/PostBanner;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_BANNER_POSITION = integer;
    DEFAULT_LINK_TYPE = integer;
    DEFAULT_CLIENT_TYPE = integer;
  }
  
  public PostBanner(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.banner_pic;
      if (str2 == null) {
        this.banner_pic = "";
      } else {
        this.banner_pic = str2;
      } 
      str2 = paramBuilder.banner_name;
      if (str2 == null) {
        this.banner_name = "";
      } else {
        this.banner_name = str2;
      } 
      Integer integer1 = paramBuilder.banner_position;
      if (integer1 == null) {
        this.banner_position = DEFAULT_BANNER_POSITION;
      } else {
        this.banner_position = integer1;
      } 
      integer1 = paramBuilder.link_type;
      if (integer1 == null) {
        this.link_type = DEFAULT_LINK_TYPE;
      } else {
        this.link_type = integer1;
      } 
      String str1 = paramBuilder.banner_url;
      if (str1 == null) {
        this.banner_url = "";
      } else {
        this.banner_url = str1;
      } 
      integer = paramBuilder.client_type;
      if (integer == null) {
        this.client_type = DEFAULT_CLIENT_TYPE;
      } else {
        this.client_type = integer;
      } 
    } else {
      this.banner_pic = ((Builder)integer).banner_pic;
      this.banner_name = ((Builder)integer).banner_name;
      this.banner_position = ((Builder)integer).banner_position;
      this.link_type = ((Builder)integer).link_type;
      this.banner_url = ((Builder)integer).banner_url;
      this.client_type = ((Builder)integer).client_type;
    } 
  }
  
  public PostBanner(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PostBanner> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String banner_name;
    
    public String banner_pic;
    
    public Integer banner_position;
    
    public String banner_url;
    
    public Integer client_type;
    
    public Integer link_type;
    
    public Builder() {}
    
    public Builder(PostBanner param1PostBanner) {
      super(param1PostBanner);
      if (param1PostBanner == null)
        return; 
      this.banner_pic = param1PostBanner.banner_pic;
      this.banner_name = param1PostBanner.banner_name;
      this.banner_position = param1PostBanner.banner_position;
      this.link_type = param1PostBanner.link_type;
      this.banner_url = param1PostBanner.banner_url;
      this.client_type = param1PostBanner.client_type;
    }
    
    public PostBanner build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PostBanner)interceptResult.objValue; 
      } 
      return new PostBanner(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
