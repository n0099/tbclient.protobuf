import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdCloseInfo;
import tbclient.GoodsInfo;
import tbclient.ThreadPicList;
import tbclient.VideoInfo;

public final class GoodsInfo extends Message {
  public static final String DEFAULT_AD_SOURCE = "";
  
  public static final String DEFAULT_BRAND_ICON = "";
  
  public static final String DEFAULT_BRAND_ICON_WH = "";
  
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_BUTTON_URL = "";
  
  public static final String DEFAULT_CARD_DESC = "";
  
  public static final String DEFAULT_CARD_TAG = "";
  
  public static final Integer DEFAULT_GOODS_STYLE;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Integer DEFAULT_ID;
  
  public static final Integer DEFAULT_LABEL_MEASURE;
  
  public static final String DEFAULT_LABEL_TEXT = "";
  
  public static final Integer DEFAULT_LABEL_VISIBLE;
  
  public static final String DEFAULT_LEGO_CARD = "";
  
  public static final String DEFAULT_POP_WINDOW_TEXT = "";
  
  public static final Integer DEFAULT_RANK_LEVEL;
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public static final String DEFAULT_TAG_NAME_URL = "";
  
  public static final String DEFAULT_TAG_NAME_WH = "";
  
  public static final String DEFAULT_THREAD_CONTENT = "";
  
  public static final String DEFAULT_THREAD_PIC = "";
  
  public static final List<ThreadPicList> DEFAULT_THREAD_PIC_LIST;
  
  public static final String DEFAULT_THREAD_TITLE = "";
  
  public static final String DEFAULT_THREAD_TYPE = "";
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final String DEFAULT_USER_PORTRAIT = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String ad_source;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String brand_icon;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String brand_icon_wh;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String button_url;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String card_desc;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String card_tag;
  
  @ProtoField(tag = 29)
  public final AdCloseInfo close_info;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer goods_style;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer height;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer label_measure;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String label_text;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer label_visible;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String lego_card;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String pop_window_text;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer rank_level;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String tag_name;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String tag_name_url;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String tag_name_wh;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String thread_content;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String thread_pic;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<ThreadPicList> thread_pic_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String thread_title;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String thread_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_portrait;
  
  @ProtoField(tag = 21)
  public final VideoInfo video_info;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer width;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1571572737, "Ltbclient/GoodsInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1571572737, "Ltbclient/GoodsInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_GOODS_STYLE = integer;
    DEFAULT_THREAD_PIC_LIST = Collections.emptyList();
    DEFAULT_LABEL_VISIBLE = integer;
    DEFAULT_RANK_LEVEL = integer;
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
    DEFAULT_LABEL_MEASURE = integer;
  }
  
  public GoodsInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer5 = paramBuilder.id;
      if (integer5 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer5;
      } 
      String str4 = paramBuilder.user_name;
      if (str4 == null) {
        this.user_name = "";
      } else {
        this.user_name = str4;
      } 
      str4 = paramBuilder.user_portrait;
      if (str4 == null) {
        this.user_portrait = "";
      } else {
        this.user_portrait = str4;
      } 
      str4 = paramBuilder.thread_title;
      if (str4 == null) {
        this.thread_title = "";
      } else {
        this.thread_title = str4;
      } 
      str4 = paramBuilder.thread_pic;
      if (str4 == null) {
        this.thread_pic = "";
      } else {
        this.thread_pic = str4;
      } 
      str4 = paramBuilder.pop_window_text;
      if (str4 == null) {
        this.pop_window_text = "";
      } else {
        this.pop_window_text = str4;
      } 
      Integer integer4 = paramBuilder.goods_style;
      if (integer4 == null) {
        this.goods_style = DEFAULT_GOODS_STYLE;
      } else {
        this.goods_style = integer4;
      } 
      List list = paramBuilder.thread_pic_list;
      if (list == null) {
        this.thread_pic_list = DEFAULT_THREAD_PIC_LIST;
      } else {
        this.thread_pic_list = Message.immutableCopyOf(list);
      } 
      Integer integer3 = paramBuilder.label_visible;
      if (integer3 == null) {
        this.label_visible = DEFAULT_LABEL_VISIBLE;
      } else {
        this.label_visible = integer3;
      } 
      String str3 = paramBuilder.label_text;
      if (str3 == null) {
        this.label_text = "";
      } else {
        this.label_text = str3;
      } 
      Integer integer2 = paramBuilder.rank_level;
      if (integer2 == null) {
        this.rank_level = DEFAULT_RANK_LEVEL;
      } else {
        this.rank_level = integer2;
      } 
      String str2 = paramBuilder.thread_type;
      if (str2 == null) {
        this.thread_type = "";
      } else {
        this.thread_type = str2;
      } 
      str2 = paramBuilder.button_text;
      if (str2 == null) {
        this.button_text = "";
      } else {
        this.button_text = str2;
      } 
      str2 = paramBuilder.card_desc;
      if (str2 == null) {
        this.card_desc = "";
      } else {
        this.card_desc = str2;
      } 
      str2 = paramBuilder.card_tag;
      if (str2 == null) {
        this.card_tag = "";
      } else {
        this.card_tag = str2;
      } 
      Integer integer1 = paramBuilder.width;
      if (integer1 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer1;
      } 
      integer1 = paramBuilder.height;
      if (integer1 == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer1;
      } 
      integer1 = paramBuilder.label_measure;
      if (integer1 == null) {
        this.label_measure = DEFAULT_LABEL_MEASURE;
      } else {
        this.label_measure = integer1;
      } 
      String str1 = paramBuilder.thread_content;
      if (str1 == null) {
        this.thread_content = "";
      } else {
        this.thread_content = str1;
      } 
      str1 = paramBuilder.lego_card;
      if (str1 == null) {
        this.lego_card = "";
      } else {
        this.lego_card = str1;
      } 
      this.video_info = paramBuilder.video_info;
      str1 = paramBuilder.tag_name;
      if (str1 == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str1;
      } 
      str1 = paramBuilder.button_url;
      if (str1 == null) {
        this.button_url = "";
      } else {
        this.button_url = str1;
      } 
      str1 = paramBuilder.ad_source;
      if (str1 == null) {
        this.ad_source = "";
      } else {
        this.ad_source = str1;
      } 
      str1 = paramBuilder.tag_name_url;
      if (str1 == null) {
        this.tag_name_url = "";
      } else {
        this.tag_name_url = str1;
      } 
      str1 = paramBuilder.tag_name_wh;
      if (str1 == null) {
        this.tag_name_wh = "";
      } else {
        this.tag_name_wh = str1;
      } 
      str1 = paramBuilder.brand_icon;
      if (str1 == null) {
        this.brand_icon = "";
      } else {
        this.brand_icon = str1;
      } 
      str1 = paramBuilder.brand_icon_wh;
      if (str1 == null) {
        this.brand_icon_wh = "";
      } else {
        this.brand_icon_wh = str1;
      } 
      this.close_info = paramBuilder.close_info;
    } else {
      this.id = paramBuilder.id;
      this.user_name = paramBuilder.user_name;
      this.user_portrait = paramBuilder.user_portrait;
      this.thread_title = paramBuilder.thread_title;
      this.thread_pic = paramBuilder.thread_pic;
      this.pop_window_text = paramBuilder.pop_window_text;
      this.goods_style = paramBuilder.goods_style;
      this.thread_pic_list = Message.immutableCopyOf(paramBuilder.thread_pic_list);
      this.label_visible = paramBuilder.label_visible;
      this.label_text = paramBuilder.label_text;
      this.rank_level = paramBuilder.rank_level;
      this.thread_type = paramBuilder.thread_type;
      this.button_text = paramBuilder.button_text;
      this.card_desc = paramBuilder.card_desc;
      this.card_tag = paramBuilder.card_tag;
      this.width = paramBuilder.width;
      this.height = paramBuilder.height;
      this.label_measure = paramBuilder.label_measure;
      this.thread_content = paramBuilder.thread_content;
      this.lego_card = paramBuilder.lego_card;
      this.video_info = paramBuilder.video_info;
      this.tag_name = paramBuilder.tag_name;
      this.button_url = paramBuilder.button_url;
      this.ad_source = paramBuilder.ad_source;
      this.tag_name_url = paramBuilder.tag_name_url;
      this.tag_name_wh = paramBuilder.tag_name_wh;
      this.brand_icon = paramBuilder.brand_icon;
      this.brand_icon_wh = paramBuilder.brand_icon_wh;
      this.close_info = paramBuilder.close_info;
    } 
  }
}
