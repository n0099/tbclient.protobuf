package PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PostBanner extends Message {
  public static final String DEFAULT_BANNER_NAME = "";
  
  public static final String DEFAULT_BANNER_PIC = "";
  
  public static final Integer DEFAULT_BANNER_POSITION;
  
  public static final String DEFAULT_BANNER_URL = "";
  
  public static final Integer DEFAULT_CLIENT_TYPE;
  
  public static final Integer DEFAULT_LINK_TYPE;
  
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
    super((Message.Builder)paramBuilder);
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
}
