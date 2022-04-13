package GetGameDetailNew;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GiftPkgInfo extends Message {
  public static final Long DEFAULT_ACQUIRE_NUM = Long.valueOf(0L);
  
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_CORNER_MARK = "";
  
  public static final String DEFAULT_GIFTPKG_NAME = "";
  
  public static final String DEFAULT_GIFTPKG_URL = "";
  
  public static final String DEFAULT_THUMBNAILS = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long acquire_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String corner_mark;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String giftpkg_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String giftpkg_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String thumbnails;
  
  public GiftPkgInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.giftpkg_name;
      if (str2 == null) {
        this.giftpkg_name = "";
      } else {
        this.giftpkg_name = str2;
      } 
      str2 = paramBuilder.thumbnails;
      if (str2 == null) {
        this.thumbnails = "";
      } else {
        this.thumbnails = str2;
      } 
      Long long_ = paramBuilder.acquire_num;
      if (long_ == null) {
        this.acquire_num = DEFAULT_ACQUIRE_NUM;
      } else {
        this.acquire_num = long_;
      } 
      String str1 = paramBuilder.corner_mark;
      if (str1 == null) {
        this.corner_mark = "";
      } else {
        this.corner_mark = str1;
      } 
      str1 = paramBuilder.button_text;
      if (str1 == null) {
        this.button_text = "";
      } else {
        this.button_text = str1;
      } 
      str = paramBuilder.giftpkg_url;
      if (str == null) {
        this.giftpkg_url = "";
      } else {
        this.giftpkg_url = str;
      } 
    } else {
      this.giftpkg_name = ((Builder)str).giftpkg_name;
      this.thumbnails = ((Builder)str).thumbnails;
      this.acquire_num = ((Builder)str).acquire_num;
      this.corner_mark = ((Builder)str).corner_mark;
      this.button_text = ((Builder)str).button_text;
      this.giftpkg_url = ((Builder)str).giftpkg_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1231745199, "Ltbclient/GetGameDetailNew/GiftPkgInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1231745199, "Ltbclient/GetGameDetailNew/GiftPkgInfo;");
          return;
        } 
      } 
    } 
  }
}
