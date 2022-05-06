import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Abstract;
import tbclient.SimpleThreadInfo;
import tbclient.Zan;

public final class SimpleThreadInfo extends Message {
  public static final List<Abstract> DEFAULT_ABSTRACT;
  
  public static final Integer DEFAULT_LAST_TIME_INT;
  
  public static final Integer DEFAULT_REPLY_NUM;
  
  public static final Long DEFAULT_THREAD_TYPE;
  
  public static final Long DEFAULT_TID;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<Abstract> _abstract;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer last_time_int;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer reply_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long thread_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 6)
  public final Zan zan;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1749734567, "Ltbclient/SimpleThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1749734567, "Ltbclient/SimpleThreadInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_REPLY_NUM = integer;
    DEFAULT_LAST_TIME_INT = integer;
    DEFAULT_ABSTRACT = Collections.emptyList();
    DEFAULT_THREAD_TYPE = long_;
  }
  
  public SimpleThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.tid;
      if (long_1 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_1;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      Integer integer = paramBuilder.reply_num;
      if (integer == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = integer;
      } 
      integer = paramBuilder.last_time_int;
      if (integer == null) {
        this.last_time_int = DEFAULT_LAST_TIME_INT;
      } else {
        this.last_time_int = integer;
      } 
      List list = paramBuilder._abstract;
      if (list == null) {
        this._abstract = DEFAULT_ABSTRACT;
      } else {
        this._abstract = Message.immutableCopyOf(list);
      } 
      this.zan = paramBuilder.zan;
      long_ = paramBuilder.thread_type;
      if (long_ == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = long_;
      } 
    } else {
      this.tid = ((Builder)long_).tid;
      this.title = ((Builder)long_).title;
      this.reply_num = ((Builder)long_).reply_num;
      this.last_time_int = ((Builder)long_).last_time_int;
      this._abstract = Message.immutableCopyOf(((Builder)long_)._abstract);
      this.zan = ((Builder)long_).zan;
      this.thread_type = ((Builder)long_).thread_type;
    } 
  }
}
