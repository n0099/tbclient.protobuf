import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VideoTemplateContent;

public final class VideoTemplateContent extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final Long DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_PIC_HEIGHT;
  
  public static final Integer DEFAULT_PIC_WIDTH;
  
  public static final Double DEFAULT_POSITION_TYPE;
  
  public static final Double DEFAULT_POSITION_X;
  
  public static final Double DEFAULT_POSITION_Y;
  
  public static final Long DEFAULT_START_TIME;
  
  public static final String DEFAULT_TEXT_COLOR = "";
  
  public static final Double DEFAULT_TEXT_SIZE;
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pic_height;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer pic_width;
  
  @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
  public final Double position_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
  public final Double position_x;
  
  @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
  public final Double position_y;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long start_time;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String text_color;
  
  @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
  public final Double text_size;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-126094995, "Ltbclient/VideoTemplateContent;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-126094995, "Ltbclient/VideoTemplateContent;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_PIC_WIDTH = integer;
    DEFAULT_PIC_HEIGHT = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_POSITION_X = double_;
    DEFAULT_POSITION_Y = double_;
    DEFAULT_POSITION_TYPE = double_;
    DEFAULT_TEXT_SIZE = double_;
  }
  
  public VideoTemplateContent(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      integer = paramBuilder.pic_width;
      if (integer == null) {
        this.pic_width = DEFAULT_PIC_WIDTH;
      } else {
        this.pic_width = integer;
      } 
      integer = paramBuilder.pic_height;
      if (integer == null) {
        this.pic_height = DEFAULT_PIC_HEIGHT;
      } else {
        this.pic_height = integer;
      } 
      Long long_ = paramBuilder.start_time;
      if (long_ == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_;
      } 
      long_ = paramBuilder.end_time;
      if (long_ == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_;
      } 
      Double double_ = paramBuilder.position_x;
      if (double_ == null) {
        this.position_x = DEFAULT_POSITION_X;
      } else {
        this.position_x = double_;
      } 
      double_ = paramBuilder.position_y;
      if (double_ == null) {
        this.position_y = DEFAULT_POSITION_Y;
      } else {
        this.position_y = double_;
      } 
      double_ = paramBuilder.position_type;
      if (double_ == null) {
        this.position_type = DEFAULT_POSITION_TYPE;
      } else {
        this.position_type = double_;
      } 
      double_ = paramBuilder.text_size;
      if (double_ == null) {
        this.text_size = DEFAULT_TEXT_SIZE;
      } else {
        this.text_size = double_;
      } 
      str = paramBuilder.text_color;
      if (str == null) {
        this.text_color = "";
      } else {
        this.text_color = str;
      } 
    } else {
      this.content = ((Builder)str).content;
      this.type = ((Builder)str).type;
      this.pic_width = ((Builder)str).pic_width;
      this.pic_height = ((Builder)str).pic_height;
      this.start_time = ((Builder)str).start_time;
      this.end_time = ((Builder)str).end_time;
      this.position_x = ((Builder)str).position_x;
      this.position_y = ((Builder)str).position_y;
      this.position_type = ((Builder)str).position_type;
      this.text_size = ((Builder)str).text_size;
      this.text_color = ((Builder)str).text_color;
    } 
  }
}
