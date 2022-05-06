import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PollInfo;
import tbclient.PollOption;

public final class PollInfo extends Message {
  public static final Integer DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_IS_MULTI;
  
  public static final Integer DEFAULT_IS_POLLED;
  
  public static final Integer DEFAULT_LAST_TIME;
  
  public static final List<PollOption> DEFAULT_OPTIONS;
  
  public static final Integer DEFAULT_OPTIONS_COUNT;
  
  public static final String DEFAULT_POLLED_VALUE = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final String DEFAULT_TIPS = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_TOTAL_NUM;
  
  public static final Long DEFAULT_TOTAL_POLL;
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer end_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_multi;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_polled;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer last_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<PollOption> options;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer options_count;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String polled_value;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String tips;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long total_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT64)
  public final Long total_poll;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-260770012, "Ltbclient/PollInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-260770012, "Ltbclient/PollInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_IS_MULTI = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOTAL_NUM = long_;
    DEFAULT_OPTIONS_COUNT = integer;
    DEFAULT_IS_POLLED = integer;
    DEFAULT_END_TIME = integer;
    DEFAULT_OPTIONS = Collections.emptyList();
    DEFAULT_STATUS = integer;
    DEFAULT_TOTAL_POLL = long_;
    DEFAULT_LAST_TIME = integer;
  }
  
  public PollInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer4 = paramBuilder.type;
      if (integer4 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer4;
      } 
      integer4 = paramBuilder.is_multi;
      if (integer4 == null) {
        this.is_multi = DEFAULT_IS_MULTI;
      } else {
        this.is_multi = integer4;
      } 
      Long long_2 = paramBuilder.total_num;
      if (long_2 == null) {
        this.total_num = DEFAULT_TOTAL_NUM;
      } else {
        this.total_num = long_2;
      } 
      Integer integer3 = paramBuilder.options_count;
      if (integer3 == null) {
        this.options_count = DEFAULT_OPTIONS_COUNT;
      } else {
        this.options_count = integer3;
      } 
      integer3 = paramBuilder.is_polled;
      if (integer3 == null) {
        this.is_polled = DEFAULT_IS_POLLED;
      } else {
        this.is_polled = integer3;
      } 
      String str2 = paramBuilder.polled_value;
      if (str2 == null) {
        this.polled_value = "";
      } else {
        this.polled_value = str2;
      } 
      str2 = paramBuilder.tips;
      if (str2 == null) {
        this.tips = "";
      } else {
        this.tips = str2;
      } 
      Integer integer2 = paramBuilder.end_time;
      if (integer2 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer2;
      } 
      List list = paramBuilder.options;
      if (list == null) {
        this.options = DEFAULT_OPTIONS;
      } else {
        this.options = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.status;
      if (integer1 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer1;
      } 
      Long long_1 = paramBuilder.total_poll;
      if (long_1 == null) {
        this.total_poll = DEFAULT_TOTAL_POLL;
      } else {
        this.total_poll = long_1;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      integer = paramBuilder.last_time;
      if (integer == null) {
        this.last_time = DEFAULT_LAST_TIME;
      } else {
        this.last_time = integer;
      } 
    } else {
      this.type = ((Builder)integer).type;
      this.is_multi = ((Builder)integer).is_multi;
      this.total_num = ((Builder)integer).total_num;
      this.options_count = ((Builder)integer).options_count;
      this.is_polled = ((Builder)integer).is_polled;
      this.polled_value = ((Builder)integer).polled_value;
      this.tips = ((Builder)integer).tips;
      this.end_time = ((Builder)integer).end_time;
      this.options = Message.immutableCopyOf(((Builder)integer).options);
      this.status = ((Builder)integer).status;
      this.total_poll = ((Builder)integer).total_poll;
      this.title = ((Builder)integer).title;
      this.last_time = ((Builder)integer).last_time;
    } 
  }
}
