package GetIconList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetIconList.Discount;

public final class IconInfo extends Message {
  public static final List<Discount> DEFAULT_DISCOUNT;
  
  public static final Integer DEFAULT_DUBI;
  
  public static final Integer DEFAULT_DURATION;
  
  public static final Integer DEFAULT_HIDE;
  
  public static final String DEFAULT_ICONID = "";
  
  public static final Integer DEFAULT_IS_DEFAULT;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NON_MEMBER_T;
  
  public static final String DEFAULT_PICURL = "";
  
  public static final String DEFAULT_SIGN = "";
  
  public static final String DEFAULT_TAG_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<Discount> discount;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer dubi;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer duration;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer hide;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String iconId;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_default;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer non_member_t;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String picUrl;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String sign;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String tag_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1392578520, "Ltbclient/GetIconList/IconInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1392578520, "Ltbclient/GetIconList/IconInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_NON_MEMBER_T = integer;
    DEFAULT_DUBI = integer;
    DEFAULT_DURATION = integer;
    DEFAULT_HIDE = integer;
    DEFAULT_DISCOUNT = Collections.emptyList();
    DEFAULT_IS_DEFAULT = integer;
  }
  
  public IconInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.iconId;
      if (str2 == null) {
        this.iconId = "";
      } else {
        this.iconId = str2;
      } 
      str2 = paramBuilder.picUrl;
      if (str2 == null) {
        this.picUrl = "";
      } else {
        this.picUrl = str2;
      } 
      Integer integer1 = paramBuilder.non_member_t;
      if (integer1 == null) {
        this.non_member_t = DEFAULT_NON_MEMBER_T;
      } else {
        this.non_member_t = integer1;
      } 
      integer1 = paramBuilder.dubi;
      if (integer1 == null) {
        this.dubi = DEFAULT_DUBI;
      } else {
        this.dubi = integer1;
      } 
      integer1 = paramBuilder.duration;
      if (integer1 == null) {
        this.duration = DEFAULT_DURATION;
      } else {
        this.duration = integer1;
      } 
      integer1 = paramBuilder.hide;
      if (integer1 == null) {
        this.hide = DEFAULT_HIDE;
      } else {
        this.hide = integer1;
      } 
      List list = paramBuilder.discount;
      if (list == null) {
        this.discount = DEFAULT_DISCOUNT;
      } else {
        this.discount = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.sign;
      if (str1 == null) {
        this.sign = "";
      } else {
        this.sign = str1;
      } 
      str1 = paramBuilder.tag_name;
      if (str1 == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str1;
      } 
      integer = paramBuilder.is_default;
      if (integer == null) {
        this.is_default = DEFAULT_IS_DEFAULT;
      } else {
        this.is_default = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.iconId = ((Builder)integer).iconId;
      this.picUrl = ((Builder)integer).picUrl;
      this.non_member_t = ((Builder)integer).non_member_t;
      this.dubi = ((Builder)integer).dubi;
      this.duration = ((Builder)integer).duration;
      this.hide = ((Builder)integer).hide;
      this.discount = Message.immutableCopyOf(((Builder)integer).discount);
      this.sign = ((Builder)integer).sign;
      this.tag_name = ((Builder)integer).tag_name;
      this.is_default = ((Builder)integer).is_default;
    } 
  }
}
