import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Media;

public final class Media extends Message {
  public static final String DEFAULT_BIG_PIC = "";
  
  public static final String DEFAULT_BSIZE = "";
  
  public static final Integer DEFAULT_DURING_TIME;
  
  public static final String DEFAULT_DYNAMIC_PIC = "";
  
  public static final Integer DEFAULT_E_TYPE;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Double DEFAULT_HTH_MID_LOC;
  
  public static final Integer DEFAULT_IS_BLOCKED_PIC;
  
  public static final Integer DEFAULT_IS_LONG_PIC;
  
  public static final String DEFAULT_ORIGIN_PIC = "";
  
  public static final Integer DEFAULT_ORIGIN_SIZE;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Integer DEFAULT_SHOW_ORIGINAL_BTN;
  
  public static final String DEFAULT_SMALL_PIC = "";
  
  public static final String DEFAULT_SRC_PIC = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_VHSRC = "";
  
  public static final String DEFAULT_VPIC = "";
  
  public static final String DEFAULT_VSRC = "";
  
  public static final String DEFAULT_WATER_PIC = "";
  
  public static final Integer DEFAULT_WIDTH;
  
  public static final Double DEFAULT_WTH_MID_LOC;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String big_pic;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String bsize;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer during_time;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String dynamic_pic;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer e_type;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer height;
  
  @ProtoField(tag = 23, type = Message.Datatype.DOUBLE)
  public final Double hth_mid_loc;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer is_blocked_pic;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer is_long_pic;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String origin_pic;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer origin_size;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT64)
  public final Long post_id;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT32)
  public final Integer show_original_btn;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String small_pic;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String src_pic;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String vhsrc;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String vpic;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String vsrc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String water_pic;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer width;
  
  @ProtoField(tag = 22, type = Message.Datatype.DOUBLE)
  public final Double wth_mid_loc;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(450743873, "Ltbclient/Media;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(450743873, "Ltbclient/Media;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
    DEFAULT_DURING_TIME = integer;
    DEFAULT_E_TYPE = integer;
    DEFAULT_ORIGIN_SIZE = integer;
    DEFAULT_POST_ID = Long.valueOf(0L);
    DEFAULT_IS_LONG_PIC = integer;
    DEFAULT_SHOW_ORIGINAL_BTN = integer;
    DEFAULT_IS_BLOCKED_PIC = integer;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_WTH_MID_LOC = double_;
    DEFAULT_HTH_MID_LOC = double_;
  }
  
  public Media(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      Integer integer5 = paramBuilder.type;
      if (integer5 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer5;
      } 
      String str4 = paramBuilder.small_pic;
      if (str4 == null) {
        this.small_pic = "";
      } else {
        this.small_pic = str4;
      } 
      str4 = paramBuilder.big_pic;
      if (str4 == null) {
        this.big_pic = "";
      } else {
        this.big_pic = str4;
      } 
      str4 = paramBuilder.water_pic;
      if (str4 == null) {
        this.water_pic = "";
      } else {
        this.water_pic = str4;
      } 
      str4 = paramBuilder.vpic;
      if (str4 == null) {
        this.vpic = "";
      } else {
        this.vpic = str4;
      } 
      str4 = paramBuilder.vsrc;
      if (str4 == null) {
        this.vsrc = "";
      } else {
        this.vsrc = str4;
      } 
      str4 = paramBuilder.vhsrc;
      if (str4 == null) {
        this.vhsrc = "";
      } else {
        this.vhsrc = str4;
      } 
      str4 = paramBuilder.src_pic;
      if (str4 == null) {
        this.src_pic = "";
      } else {
        this.src_pic = str4;
      } 
      str4 = paramBuilder.text;
      if (str4 == null) {
        this.text = "";
      } else {
        this.text = str4;
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
      String str3 = paramBuilder.bsize;
      if (str3 == null) {
        this.bsize = "";
      } else {
        this.bsize = str3;
      } 
      Integer integer3 = paramBuilder.during_time;
      if (integer3 == null) {
        this.during_time = DEFAULT_DURING_TIME;
      } else {
        this.during_time = integer3;
      } 
      integer3 = paramBuilder.e_type;
      if (integer3 == null) {
        this.e_type = DEFAULT_E_TYPE;
      } else {
        this.e_type = integer3;
      } 
      String str2 = paramBuilder.origin_pic;
      if (str2 == null) {
        this.origin_pic = "";
      } else {
        this.origin_pic = str2;
      } 
      Integer integer2 = paramBuilder.origin_size;
      if (integer2 == null) {
        this.origin_size = DEFAULT_ORIGIN_SIZE;
      } else {
        this.origin_size = integer2;
      } 
      Long long_ = paramBuilder.post_id;
      if (long_ == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_;
      } 
      String str1 = paramBuilder.dynamic_pic;
      if (str1 == null) {
        this.dynamic_pic = "";
      } else {
        this.dynamic_pic = str1;
      } 
      Integer integer1 = paramBuilder.is_long_pic;
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
      integer1 = paramBuilder.is_blocked_pic;
      if (integer1 == null) {
        this.is_blocked_pic = DEFAULT_IS_BLOCKED_PIC;
      } else {
        this.is_blocked_pic = integer1;
      } 
      Double double_1 = paramBuilder.wth_mid_loc;
      if (double_1 == null) {
        this.wth_mid_loc = DEFAULT_WTH_MID_LOC;
      } else {
        this.wth_mid_loc = double_1;
      } 
      double_ = paramBuilder.hth_mid_loc;
      if (double_ == null) {
        this.hth_mid_loc = DEFAULT_HTH_MID_LOC;
      } else {
        this.hth_mid_loc = double_;
      } 
    } else {
      this.type = ((Builder)double_).type;
      this.small_pic = ((Builder)double_).small_pic;
      this.big_pic = ((Builder)double_).big_pic;
      this.water_pic = ((Builder)double_).water_pic;
      this.vpic = ((Builder)double_).vpic;
      this.vsrc = ((Builder)double_).vsrc;
      this.vhsrc = ((Builder)double_).vhsrc;
      this.src_pic = ((Builder)double_).src_pic;
      this.text = ((Builder)double_).text;
      this.width = ((Builder)double_).width;
      this.height = ((Builder)double_).height;
      this.bsize = ((Builder)double_).bsize;
      this.during_time = ((Builder)double_).during_time;
      this.e_type = ((Builder)double_).e_type;
      this.origin_pic = ((Builder)double_).origin_pic;
      this.origin_size = ((Builder)double_).origin_size;
      this.post_id = ((Builder)double_).post_id;
      this.dynamic_pic = ((Builder)double_).dynamic_pic;
      this.is_long_pic = ((Builder)double_).is_long_pic;
      this.show_original_btn = ((Builder)double_).show_original_btn;
      this.is_blocked_pic = ((Builder)double_).is_blocked_pic;
      this.wth_mid_loc = ((Builder)double_).wth_mid_loc;
      this.hth_mid_loc = ((Builder)double_).hth_mid_loc;
    } 
  }
}
