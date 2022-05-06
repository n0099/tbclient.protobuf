package ActivityPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SpecialColumn extends Message {
  public static final Integer DEFAULT_AGREE_NUM;
  
  public static final Integer DEFAULT_FREQ_NUM;
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final Long DEFAULT_LIVE_ID;
  
  public static final String DEFAULT_TEXT = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer agree_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer freq_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long live_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1155194477, "Ltbclient/ActivityPage/SpecialColumn;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1155194477, "Ltbclient/ActivityPage/SpecialColumn;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_LIVE_ID = long_;
    DEFAULT_FREQ_NUM = integer;
    DEFAULT_AGREE_NUM = integer;
  }
  
  public SpecialColumn(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      Long long_ = paramBuilder.thread_id;
      if (long_ == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_;
      } 
      long_ = paramBuilder.live_id;
      if (long_ == null) {
        this.live_id = DEFAULT_LIVE_ID;
      } else {
        this.live_id = long_;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.image;
      if (str == null) {
        this.image = "";
      } else {
        this.image = str;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      Integer integer1 = paramBuilder.freq_num;
      if (integer1 == null) {
        this.freq_num = DEFAULT_FREQ_NUM;
      } else {
        this.freq_num = integer1;
      } 
      integer = paramBuilder.agree_num;
      if (integer == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = integer;
      } 
    } else {
      this.type = ((Builder)integer).type;
      this.thread_id = ((Builder)integer).thread_id;
      this.live_id = ((Builder)integer).live_id;
      this.title = ((Builder)integer).title;
      this.image = ((Builder)integer).image;
      this.text = ((Builder)integer).text;
      this.freq_num = ((Builder)integer).freq_num;
      this.agree_num = ((Builder)integer).agree_num;
    } 
  }
}
