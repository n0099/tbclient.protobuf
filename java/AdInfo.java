import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdInfo;
import tbclient.Media;

public final class AdInfo extends Message {
  public static final String DEFAULT_AD_DESC = "";
  
  public static final String DEFAULT_AD_NAME = "";
  
  public static final String DEFAULT_AD_PIC = "";
  
  public static final Integer DEFAULT_AD_TYPE;
  
  public static final String DEFAULT_AD_URL = "";
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_SHOW_RULE;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ad_desc;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String ad_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ad_pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer ad_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ad_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<Media> media;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer show_rule;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1025360192, "Ltbclient/AdInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1025360192, "Ltbclient/AdInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHOW_RULE = integer;
    DEFAULT_AD_TYPE = integer;
    DEFAULT_MEDIA = Collections.emptyList();
  }
  
  public AdInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.show_rule;
      if (integer == null) {
        this.show_rule = DEFAULT_SHOW_RULE;
      } else {
        this.show_rule = integer;
      } 
      integer = paramBuilder.ad_type;
      if (integer == null) {
        this.ad_type = DEFAULT_AD_TYPE;
      } else {
        this.ad_type = integer;
      } 
      String str = paramBuilder.ad_desc;
      if (str == null) {
        this.ad_desc = "";
      } else {
        this.ad_desc = str;
      } 
      str = paramBuilder.ad_pic;
      if (str == null) {
        this.ad_pic = "";
      } else {
        this.ad_pic = str;
      } 
      str = paramBuilder.ad_url;
      if (str == null) {
        this.ad_url = "";
      } else {
        this.ad_url = str;
      } 
      str = paramBuilder.ad_name;
      if (str == null) {
        this.ad_name = "";
      } else {
        this.ad_name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      list = paramBuilder.media;
      if (list == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list);
      } 
    } else {
      this.show_rule = ((Builder)list).show_rule;
      this.ad_type = ((Builder)list).ad_type;
      this.ad_desc = ((Builder)list).ad_desc;
      this.ad_pic = ((Builder)list).ad_pic;
      this.ad_url = ((Builder)list).ad_url;
      this.ad_name = ((Builder)list).ad_name;
      this.portrait = ((Builder)list).portrait;
      this.media = Message.immutableCopyOf(((Builder)list).media);
    } 
  }
}
