import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ApkDetail;
import tbclient.Item;

public final class Item extends Message {
  public static final String DEFAULT_APK_NAME = "";
  
  public static final String DEFAULT_BUTTON_LINK = "";
  
  public static final Integer DEFAULT_BUTTON_LINK_TYPE;
  
  public static final String DEFAULT_BUTTON_NAME = "";
  
  public static final Integer DEFAULT_CATEGORY_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Double DEFAULT_ICON_SIZE;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_ITEM_APPID = "";
  
  public static final Long DEFAULT_ITEM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_ITEM_NAME = "";
  
  public static final Double DEFAULT_SCORE;
  
  public static final Integer DEFAULT_STAR;
  
  public static final List<String> DEFAULT_TAGS;
  
  @ProtoField(tag = 15)
  public final ApkDetail apk_detail;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String apk_name;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String button_link;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer button_link_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String button_name;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer category_id;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.DOUBLE)
  public final Double icon_size;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String item_appid;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long item_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String item_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
  public final Double score;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer star;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> tags;
  
  static {
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_ICON_SIZE = double_;
    DEFAULT_TAGS = Collections.emptyList();
    DEFAULT_SCORE = double_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_STAR = integer;
    DEFAULT_CATEGORY_ID = integer;
    DEFAULT_BUTTON_LINK_TYPE = integer;
  }
  
  public Item(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.item_id;
      if (long_ == null) {
        this.item_id = DEFAULT_ITEM_ID;
      } else {
        this.item_id = long_;
      } 
      String str4 = paramBuilder.item_name;
      if (str4 == null) {
        this.item_name = "";
      } else {
        this.item_name = str4;
      } 
      Double double_2 = paramBuilder.icon_size;
      if (double_2 == null) {
        this.icon_size = DEFAULT_ICON_SIZE;
      } else {
        this.icon_size = double_2;
      } 
      String str3 = paramBuilder.icon_url;
      if (str3 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str3;
      } 
      List list = paramBuilder.tags;
      if (list == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list);
      } 
      Double double_1 = paramBuilder.score;
      if (double_1 == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = double_1;
      } 
      Integer integer2 = paramBuilder.star;
      if (integer2 == null) {
        this.star = DEFAULT_STAR;
      } else {
        this.star = integer2;
      } 
      String str2 = paramBuilder.button_name;
      if (str2 == null) {
        this.button_name = "";
      } else {
        this.button_name = str2;
      } 
      str2 = paramBuilder.button_link;
      if (str2 == null) {
        this.button_link = "";
      } else {
        this.button_link = str2;
      } 
      str2 = paramBuilder.item_appid;
      if (str2 == null) {
        this.item_appid = "";
      } else {
        this.item_appid = str2;
      } 
      Integer integer1 = paramBuilder.category_id;
      if (integer1 == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer1;
      } 
      integer1 = paramBuilder.button_link_type;
      if (integer1 == null) {
        this.button_link_type = DEFAULT_BUTTON_LINK_TYPE;
      } else {
        this.button_link_type = integer1;
      } 
      String str1 = paramBuilder.apk_name;
      if (str1 == null) {
        this.apk_name = "";
      } else {
        this.apk_name = str1;
      } 
      str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      this.apk_detail = paramBuilder.apk_detail;
    } else {
      this.item_id = paramBuilder.item_id;
      this.item_name = paramBuilder.item_name;
      this.icon_size = paramBuilder.icon_size;
      this.icon_url = paramBuilder.icon_url;
      this.tags = Message.immutableCopyOf(paramBuilder.tags);
      this.score = paramBuilder.score;
      this.star = paramBuilder.star;
      this.button_name = paramBuilder.button_name;
      this.button_link = paramBuilder.button_link;
      this.item_appid = paramBuilder.item_appid;
      this.category_id = paramBuilder.category_id;
      this.button_link_type = paramBuilder.button_link_type;
      this.apk_name = paramBuilder.apk_name;
      this.forum_name = paramBuilder.forum_name;
      this.apk_detail = paramBuilder.apk_detail;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1097084706, "Ltbclient/Item;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1097084706, "Ltbclient/Item;");
          return;
        } 
      } 
    } 
  }
}
