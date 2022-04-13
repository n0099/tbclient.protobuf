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

public final class Custom extends Message {
  public static final String DEFAULT_CREATE_TIME = "";
  
  public static final List<Discount> DEFAULT_DISCOUNT;
  
  public static final Integer DEFAULT_DUBI;
  
  public static final Integer DEFAULT_DUBI_IOS;
  
  public static final Integer DEFAULT_DURATION;
  
  public static final Integer DEFAULT_HIDE;
  
  public static final String DEFAULT_ICON_ID = "";
  
  public static final String DEFAULT_ICON_NAME = "";
  
  public static final String DEFAULT_ICON_PIC = "";
  
  public static final Integer DEFAULT_IOS_DISPLAY;
  
  public static final String DEFAULT_IOS_ICON_ID = "";
  
  public static final Integer DEFAULT_IS_CUSTOM_PRICE;
  
  public static final Integer DEFAULT_IS_DEFAULT;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NON_MEMBER_I;
  
  public static final Integer DEFAULT_NON_MEMBER_T;
  
  public static final String DEFAULT_PACKAGE_PIC = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_PRODUCT_ID = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public static final String DEFAULT_UPDATE_TIME = "";
  
  public static final Integer DEFAULT_VALIDITY;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String create_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<Discount> discount;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer dubi;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer dubi_ios;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer duration;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer hide;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String icon_id;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String icon_name;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String icon_pic;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer ios_display;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String ios_icon_id;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer is_custom_price;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer is_default;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer non_member_i;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer non_member_t;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String package_pic;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String product_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String tag_name;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String update_time;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer validity;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(479907774, "Ltbclient/GetIconList/Custom;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(479907774, "Ltbclient/GetIconList/Custom;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_NON_MEMBER_T = integer;
    DEFAULT_NON_MEMBER_I = integer;
    DEFAULT_DUBI = integer;
    DEFAULT_DUBI_IOS = integer;
    DEFAULT_IOS_DISPLAY = integer;
    DEFAULT_DURATION = integer;
    DEFAULT_HIDE = integer;
    DEFAULT_DISCOUNT = Collections.emptyList();
    DEFAULT_PROPS_ID = integer;
    DEFAULT_VALIDITY = integer;
    DEFAULT_IS_CUSTOM_PRICE = integer;
    DEFAULT_IS_DEFAULT = integer;
  }
  
  public Custom(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str4 = paramBuilder.name;
      if (str4 == null) {
        this.name = "";
      } else {
        this.name = str4;
      } 
      Integer integer4 = paramBuilder.non_member_t;
      if (integer4 == null) {
        this.non_member_t = DEFAULT_NON_MEMBER_T;
      } else {
        this.non_member_t = integer4;
      } 
      integer4 = paramBuilder.non_member_i;
      if (integer4 == null) {
        this.non_member_i = DEFAULT_NON_MEMBER_I;
      } else {
        this.non_member_i = integer4;
      } 
      integer4 = paramBuilder.dubi;
      if (integer4 == null) {
        this.dubi = DEFAULT_DUBI;
      } else {
        this.dubi = integer4;
      } 
      integer4 = paramBuilder.dubi_ios;
      if (integer4 == null) {
        this.dubi_ios = DEFAULT_DUBI_IOS;
      } else {
        this.dubi_ios = integer4;
      } 
      integer4 = paramBuilder.ios_display;
      if (integer4 == null) {
        this.ios_display = DEFAULT_IOS_DISPLAY;
      } else {
        this.ios_display = integer4;
      } 
      integer4 = paramBuilder.duration;
      if (integer4 == null) {
        this.duration = DEFAULT_DURATION;
      } else {
        this.duration = integer4;
      } 
      integer4 = paramBuilder.hide;
      if (integer4 == null) {
        this.hide = DEFAULT_HIDE;
      } else {
        this.hide = integer4;
      } 
      List list = paramBuilder.discount;
      if (list == null) {
        this.discount = DEFAULT_DISCOUNT;
      } else {
        this.discount = Message.immutableCopyOf(list);
      } 
      Integer integer3 = paramBuilder.props_id;
      if (integer3 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer3;
      } 
      String str3 = paramBuilder.ios_icon_id;
      if (str3 == null) {
        this.ios_icon_id = "";
      } else {
        this.ios_icon_id = str3;
      } 
      Integer integer2 = paramBuilder.validity;
      if (integer2 == null) {
        this.validity = DEFAULT_VALIDITY;
      } else {
        this.validity = integer2;
      } 
      String str2 = paramBuilder.update_time;
      if (str2 == null) {
        this.update_time = "";
      } else {
        this.update_time = str2;
      } 
      str2 = paramBuilder.create_time;
      if (str2 == null) {
        this.create_time = "";
      } else {
        this.create_time = str2;
      } 
      str2 = paramBuilder.package_pic;
      if (str2 == null) {
        this.package_pic = "";
      } else {
        this.package_pic = str2;
      } 
      Integer integer1 = paramBuilder.is_custom_price;
      if (integer1 == null) {
        this.is_custom_price = DEFAULT_IS_CUSTOM_PRICE;
      } else {
        this.is_custom_price = integer1;
      } 
      String str1 = paramBuilder.tag_name;
      if (str1 == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str1;
      } 
      str1 = paramBuilder.product_id;
      if (str1 == null) {
        this.product_id = "";
      } else {
        this.product_id = str1;
      } 
      str1 = paramBuilder.icon_id;
      if (str1 == null) {
        this.icon_id = "";
      } else {
        this.icon_id = str1;
      } 
      str1 = paramBuilder.pic_url;
      if (str1 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str1;
      } 
      str1 = paramBuilder.icon_name;
      if (str1 == null) {
        this.icon_name = "";
      } else {
        this.icon_name = str1;
      } 
      str1 = paramBuilder.icon_pic;
      if (str1 == null) {
        this.icon_pic = "";
      } else {
        this.icon_pic = str1;
      } 
      integer = paramBuilder.is_default;
      if (integer == null) {
        this.is_default = DEFAULT_IS_DEFAULT;
      } else {
        this.is_default = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.non_member_t = ((Builder)integer).non_member_t;
      this.non_member_i = ((Builder)integer).non_member_i;
      this.dubi = ((Builder)integer).dubi;
      this.dubi_ios = ((Builder)integer).dubi_ios;
      this.ios_display = ((Builder)integer).ios_display;
      this.duration = ((Builder)integer).duration;
      this.hide = ((Builder)integer).hide;
      this.discount = Message.immutableCopyOf(((Builder)integer).discount);
      this.props_id = ((Builder)integer).props_id;
      this.ios_icon_id = ((Builder)integer).ios_icon_id;
      this.validity = ((Builder)integer).validity;
      this.update_time = ((Builder)integer).update_time;
      this.create_time = ((Builder)integer).create_time;
      this.package_pic = ((Builder)integer).package_pic;
      this.is_custom_price = ((Builder)integer).is_custom_price;
      this.tag_name = ((Builder)integer).tag_name;
      this.product_id = ((Builder)integer).product_id;
      this.icon_id = ((Builder)integer).icon_id;
      this.pic_url = ((Builder)integer).pic_url;
      this.icon_name = ((Builder)integer).icon_name;
      this.icon_pic = ((Builder)integer).icon_pic;
      this.is_default = ((Builder)integer).is_default;
    } 
  }
}
