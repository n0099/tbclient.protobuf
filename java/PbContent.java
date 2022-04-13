import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GraffitiInfo;
import tbclient.Item;
import tbclient.MemeInfo;
import tbclient.NativeApp;
import tbclient.PbContent;
import tbclient.TiebaPlusInfo;
import tbclient.TogetherHi;

public final class PbContent extends Message {
  public static final String DEFAULT_BIG_CDN_SRC = "";
  
  public static final String DEFAULT_BIG_SIZE = "";
  
  public static final String DEFAULT_BIG_SRC = "";
  
  public static final String DEFAULT_BSIZE = "";
  
  public static final Integer DEFAULT_BTN_TYPE;
  
  public static final String DEFAULT_C = "";
  
  public static final String DEFAULT_CDN_SRC = "";
  
  public static final String DEFAULT_CDN_SRC_ACTIVE = "";
  
  public static final Integer DEFAULT_COUNT;
  
  public static final Integer DEFAULT_DURING_TIME;
  
  public static final String DEFAULT_DYNAMIC = "";
  
  public static final Integer DEFAULT_E_TYPE;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final String DEFAULT_IMGTYPE = "";
  
  public static final Integer DEFAULT_IS_LONG_PIC;
  
  public static final Integer DEFAULT_IS_NATIVE_APP;
  
  public static final Integer DEFAULT_IS_SUB;
  
  public static final String DEFAULT_ITEM_FORUM_NAME = "";
  
  public static final Long DEFAULT_ITEM_ID;
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_MEDIA_SUBTITLE = "";
  
  public static final Integer DEFAULT_ORIGIN_SIZE;
  
  public static final String DEFAULT_ORIGIN_SRC = "";
  
  public static final String DEFAULT_PACKET_NAME = "";
  
  public static final String DEFAULT_PHONETYPE = "";
  
  public static final Integer DEFAULT_SHOW_ORIGINAL_BTN;
  
  public static final String DEFAULT_SRC = "";
  
  public static final String DEFAULT_STATIC = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TOPIC_SPECIAL_ICON = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Long DEFAULT_UID;
  
  public static final Integer DEFAULT_URL_TYPE;
  
  public static final String DEFAULT_VOICE_MD5 = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String _static;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String big_cdn_src;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String big_size;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String big_src;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String bsize;
  
  @ProtoField(tag = 26, type = Message.Datatype.UINT32)
  public final Integer btn_type;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String c;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String cdn_src;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String cdn_src_active;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer count;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer during_time;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String dynamic;
  
  @ProtoField(tag = 24, type = Message.Datatype.UINT32)
  public final Integer e_type;
  
  @ProtoField(tag = 29)
  public final GraffitiInfo graffiti_info;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer height;
  
  @ProtoField(tag = 30)
  public final TogetherHi high_together;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String imgtype;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT32)
  public final Integer is_long_pic;
  
  @ProtoField(tag = 22, type = Message.Datatype.UINT32)
  public final Integer is_native_app;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer is_sub;
  
  @ProtoField(tag = 41)
  public final Item item;
  
  @ProtoField(tag = 39, type = Message.Datatype.STRING)
  public final String item_forum_name;
  
  @ProtoField(tag = 38, type = Message.Datatype.UINT64)
  public final Long item_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String media_subtitle;
  
  @ProtoField(tag = 33)
  public final MemeInfo meme_info;
  
  @ProtoField(tag = 23)
  public final NativeApp native_app;
  
  @ProtoField(tag = 27, type = Message.Datatype.UINT32)
  public final Integer origin_size;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String origin_src;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String packet_name;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String phonetype;
  
  @ProtoField(tag = 35, type = Message.Datatype.UINT32)
  public final Integer show_original_btn;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String src;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 40)
  public final TiebaPlusInfo tiebaplus_info;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String topic_special_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 32, type = Message.Datatype.INT32)
  public final Integer url_type;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String voice_md5;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT32)
  public final Integer width;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-775276706, "Ltbclient/PbContent;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-775276706, "Ltbclient/PbContent;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_DURING_TIME = integer;
    DEFAULT_IS_SUB = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_UID = long_;
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
    DEFAULT_IS_NATIVE_APP = integer;
    DEFAULT_E_TYPE = integer;
    DEFAULT_BTN_TYPE = integer;
    DEFAULT_ORIGIN_SIZE = integer;
    DEFAULT_COUNT = integer;
    DEFAULT_URL_TYPE = integer;
    DEFAULT_IS_LONG_PIC = integer;
    DEFAULT_SHOW_ORIGINAL_BTN = integer;
    DEFAULT_ITEM_ID = long_;
  }
  
  public PbContent(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer6 = paramBuilder.type;
      if (integer6 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer6;
      } 
      String str7 = paramBuilder.text;
      if (str7 == null) {
        this.text = "";
      } else {
        this.text = str7;
      } 
      str7 = paramBuilder.link;
      if (str7 == null) {
        this.link = "";
      } else {
        this.link = str7;
      } 
      str7 = paramBuilder.src;
      if (str7 == null) {
        this.src = "";
      } else {
        this.src = str7;
      } 
      str7 = paramBuilder.bsize;
      if (str7 == null) {
        this.bsize = "";
      } else {
        this.bsize = str7;
      } 
      str7 = paramBuilder.big_src;
      if (str7 == null) {
        this.big_src = "";
      } else {
        this.big_src = str7;
      } 
      str7 = paramBuilder.big_size;
      if (str7 == null) {
        this.big_size = "";
      } else {
        this.big_size = str7;
      } 
      str7 = paramBuilder.cdn_src;
      if (str7 == null) {
        this.cdn_src = "";
      } else {
        this.cdn_src = str7;
      } 
      str7 = paramBuilder.big_cdn_src;
      if (str7 == null) {
        this.big_cdn_src = "";
      } else {
        this.big_cdn_src = str7;
      } 
      str7 = paramBuilder.imgtype;
      if (str7 == null) {
        this.imgtype = "";
      } else {
        this.imgtype = str7;
      } 
      str7 = paramBuilder.c;
      if (str7 == null) {
        this.c = "";
      } else {
        this.c = str7;
      } 
      str7 = paramBuilder.voice_md5;
      if (str7 == null) {
        this.voice_md5 = "";
      } else {
        this.voice_md5 = str7;
      } 
      Integer integer5 = paramBuilder.during_time;
      if (integer5 == null) {
        this.during_time = DEFAULT_DURING_TIME;
      } else {
        this.during_time = integer5;
      } 
      integer5 = paramBuilder.is_sub;
      if (integer5 == null) {
        this.is_sub = DEFAULT_IS_SUB;
      } else {
        this.is_sub = integer5;
      } 
      Long long_2 = paramBuilder.uid;
      if (long_2 == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_2;
      } 
      String str6 = paramBuilder.dynamic;
      if (str6 == null) {
        this.dynamic = "";
      } else {
        this.dynamic = str6;
      } 
      str6 = paramBuilder._static;
      if (str6 == null) {
        this._static = "";
      } else {
        this._static = str6;
      } 
      Integer integer4 = paramBuilder.width;
      if (integer4 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer4;
      } 
      integer4 = paramBuilder.height;
      if (integer4 == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer4;
      } 
      String str5 = paramBuilder.packet_name;
      if (str5 == null) {
        this.packet_name = "";
      } else {
        this.packet_name = str5;
      } 
      str5 = paramBuilder.phonetype;
      if (str5 == null) {
        this.phonetype = "";
      } else {
        this.phonetype = str5;
      } 
      Integer integer3 = paramBuilder.is_native_app;
      if (integer3 == null) {
        this.is_native_app = DEFAULT_IS_NATIVE_APP;
      } else {
        this.is_native_app = integer3;
      } 
      this.native_app = paramBuilder.native_app;
      integer3 = paramBuilder.e_type;
      if (integer3 == null) {
        this.e_type = DEFAULT_E_TYPE;
      } else {
        this.e_type = integer3;
      } 
      String str4 = paramBuilder.origin_src;
      if (str4 == null) {
        this.origin_src = "";
      } else {
        this.origin_src = str4;
      } 
      Integer integer2 = paramBuilder.btn_type;
      if (integer2 == null) {
        this.btn_type = DEFAULT_BTN_TYPE;
      } else {
        this.btn_type = integer2;
      } 
      integer2 = paramBuilder.origin_size;
      if (integer2 == null) {
        this.origin_size = DEFAULT_ORIGIN_SIZE;
      } else {
        this.origin_size = integer2;
      } 
      integer2 = paramBuilder.count;
      if (integer2 == null) {
        this.count = DEFAULT_COUNT;
      } else {
        this.count = integer2;
      } 
      this.graffiti_info = paramBuilder.graffiti_info;
      this.high_together = paramBuilder.high_together;
      String str3 = paramBuilder.media_subtitle;
      if (str3 == null) {
        this.media_subtitle = "";
      } else {
        this.media_subtitle = str3;
      } 
      Integer integer1 = paramBuilder.url_type;
      if (integer1 == null) {
        this.url_type = DEFAULT_URL_TYPE;
      } else {
        this.url_type = integer1;
      } 
      this.meme_info = paramBuilder.meme_info;
      integer1 = paramBuilder.is_long_pic;
      if (integer1 == null) {
        this.is_long_pic = DEFAULT_IS_LONG_PIC;
      } else {
        this.is_long_pic = integer1;
      } 
      integer1 = paramBuilder.show_original_btn;
      if (integer1 == null) {
        this.show_original_btn = DEFAULT_SHOW_ORIGINAL_BTN;
      } else {
        this.show_original_btn = integer1;
      } 
      String str2 = paramBuilder.cdn_src_active;
      if (str2 == null) {
        this.cdn_src_active = "";
      } else {
        this.cdn_src_active = str2;
      } 
      str2 = paramBuilder.topic_special_icon;
      if (str2 == null) {
        this.topic_special_icon = "";
      } else {
        this.topic_special_icon = str2;
      } 
      Long long_1 = paramBuilder.item_id;
      if (long_1 == null) {
        this.item_id = DEFAULT_ITEM_ID;
      } else {
        this.item_id = long_1;
      } 
      String str1 = paramBuilder.item_forum_name;
      if (str1 == null) {
        this.item_forum_name = "";
      } else {
        this.item_forum_name = str1;
      } 
      this.tiebaplus_info = paramBuilder.tiebaplus_info;
      this.item = paramBuilder.item;
    } else {
      this.type = paramBuilder.type;
      this.text = paramBuilder.text;
      this.link = paramBuilder.link;
      this.src = paramBuilder.src;
      this.bsize = paramBuilder.bsize;
      this.big_src = paramBuilder.big_src;
      this.big_size = paramBuilder.big_size;
      this.cdn_src = paramBuilder.cdn_src;
      this.big_cdn_src = paramBuilder.big_cdn_src;
      this.imgtype = paramBuilder.imgtype;
      this.c = paramBuilder.c;
      this.voice_md5 = paramBuilder.voice_md5;
      this.during_time = paramBuilder.during_time;
      this.is_sub = paramBuilder.is_sub;
      this.uid = paramBuilder.uid;
      this.dynamic = paramBuilder.dynamic;
      this._static = paramBuilder._static;
      this.width = paramBuilder.width;
      this.height = paramBuilder.height;
      this.packet_name = paramBuilder.packet_name;
      this.phonetype = paramBuilder.phonetype;
      this.is_native_app = paramBuilder.is_native_app;
      this.native_app = paramBuilder.native_app;
      this.e_type = paramBuilder.e_type;
      this.origin_src = paramBuilder.origin_src;
      this.btn_type = paramBuilder.btn_type;
      this.origin_size = paramBuilder.origin_size;
      this.count = paramBuilder.count;
      this.graffiti_info = paramBuilder.graffiti_info;
      this.high_together = paramBuilder.high_together;
      this.media_subtitle = paramBuilder.media_subtitle;
      this.url_type = paramBuilder.url_type;
      this.meme_info = paramBuilder.meme_info;
      this.is_long_pic = paramBuilder.is_long_pic;
      this.show_original_btn = paramBuilder.show_original_btn;
      this.cdn_src_active = paramBuilder.cdn_src_active;
      this.topic_special_icon = paramBuilder.topic_special_icon;
      this.item_id = paramBuilder.item_id;
      this.item_forum_name = paramBuilder.item_forum_name;
      this.tiebaplus_info = paramBuilder.tiebaplus_info;
      this.item = paramBuilder.item;
    } 
  }
}
