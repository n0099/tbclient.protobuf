import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActBtn;
import tbclient.DetailInfo;
import tbclient.TPointPost;
import tbclient.Timgs;
import tbclient.VideoInfo;

public final class TPointPost extends Message {
  public static final List<ActBtn> DEFAULT_ACT_BTN;
  
  public static final Integer DEFAULT_HIDDEN_DAY;
  
  public static final Integer DEFAULT_IS_TUIGUANG;
  
  public static final String DEFAULT_MONITOR_ID = "";
  
  public static final String DEFAULT_POSITION = "";
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public static final String DEFAULT_TAG_NAME_URL = "";
  
  public static final String DEFAULT_TAG_NAME_WH = "";
  
  public static final Long DEFAULT_TEMPLATE_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_TEMPLATE_TYPE;
  
  public static final List<Timgs> DEFAULT_T_IMGS;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<ActBtn> act_btn;
  
  @ProtoField(tag = 7)
  public final DetailInfo detail_info;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer hidden_day;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_tuiguang;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String monitor_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<Timgs> t_imgs;
  
  @ProtoField(tag = 10)
  public final VideoInfo t_video;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String tag_name;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String tag_name_url;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String tag_name_wh;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long template_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer template_type;
  
  static {
    DEFAULT_TEMPLATE_TYPE = integer;
    DEFAULT_ACT_BTN = Collections.emptyList();
    DEFAULT_T_IMGS = Collections.emptyList();
    DEFAULT_HIDDEN_DAY = integer;
  }
  
  public TPointPost(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.is_tuiguang;
      if (integer3 == null) {
        this.is_tuiguang = DEFAULT_IS_TUIGUANG;
      } else {
        this.is_tuiguang = integer3;
      } 
      String str3 = paramBuilder.position;
      if (str3 == null) {
        this.position = "";
      } else {
        this.position = str3;
      } 
      Long long_ = paramBuilder.template_id;
      if (long_ == null) {
        this.template_id = DEFAULT_TEMPLATE_ID;
      } else {
        this.template_id = long_;
      } 
      Integer integer2 = paramBuilder.template_type;
      if (integer2 == null) {
        this.template_type = DEFAULT_TEMPLATE_TYPE;
      } else {
        this.template_type = integer2;
      } 
      List list = paramBuilder.act_btn;
      if (list == null) {
        this.act_btn = DEFAULT_ACT_BTN;
      } else {
        this.act_btn = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.t_imgs;
      if (list == null) {
        this.t_imgs = DEFAULT_T_IMGS;
      } else {
        this.t_imgs = Message.immutableCopyOf(list);
      } 
      this.detail_info = paramBuilder.detail_info;
      String str2 = paramBuilder.monitor_id;
      if (str2 == null) {
        this.monitor_id = "";
      } else {
        this.monitor_id = str2;
      } 
      Integer integer1 = paramBuilder.hidden_day;
      if (integer1 == null) {
        this.hidden_day = DEFAULT_HIDDEN_DAY;
      } else {
        this.hidden_day = integer1;
      } 
      this.t_video = paramBuilder.t_video;
      String str1 = paramBuilder.tag_name;
      if (str1 == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str1;
      } 
      str1 = paramBuilder.tag_name_url;
      if (str1 == null) {
        this.tag_name_url = "";
      } else {
        this.tag_name_url = str1;
      } 
      str = paramBuilder.tag_name_wh;
      if (str == null) {
        this.tag_name_wh = "";
      } else {
        this.tag_name_wh = str;
      } 
    } else {
      this.is_tuiguang = ((Builder)str).is_tuiguang;
      this.position = ((Builder)str).position;
      this.template_id = ((Builder)str).template_id;
      this.template_type = ((Builder)str).template_type;
      this.act_btn = Message.immutableCopyOf(((Builder)str).act_btn);
      this.t_imgs = Message.immutableCopyOf(((Builder)str).t_imgs);
      this.detail_info = ((Builder)str).detail_info;
      this.monitor_id = ((Builder)str).monitor_id;
      this.hidden_day = ((Builder)str).hidden_day;
      this.t_video = ((Builder)str).t_video;
      this.tag_name = ((Builder)str).tag_name;
      this.tag_name_url = ((Builder)str).tag_name_url;
      this.tag_name_wh = ((Builder)str).tag_name_wh;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1724244907, "Ltbclient/TPointPost;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1724244907, "Ltbclient/TPointPost;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_TUIGUANG = integer;
  }
}
