package GetTodayRecommend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FineThreadList extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final Long DEFAULT_FROMFID;
  
  public static final String DEFAULT_FROMFNAME = "";
  
  public static final Long DEFAULT_FTID;
  
  public static final List<String> DEFAULT_PICS;
  
  public static final Integer DEFAULT_PUBLISH_TIME;
  
  public static final Long DEFAULT_REPLY_NUM;
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final Long DEFAULT_TID;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Long DEFAULT_ZAN_NUM;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long fromfid;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String fromfname;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long ftid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12, type = Message.Datatype.STRING)
  public final List<String> pics;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer publish_time;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long reply_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer thread_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long zan_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-222303503, "Ltbclient/GetTodayRecommend/FineThreadList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-222303503, "Ltbclient/GetTodayRecommend/FineThreadList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FTID = long_;
    DEFAULT_TID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_PUBLISH_TIME = integer;
    DEFAULT_ZAN_NUM = long_;
    DEFAULT_REPLY_NUM = long_;
    DEFAULT_FROMFID = long_;
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_PICS = Collections.emptyList();
  }
  
  public FineThreadList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.ftid;
      if (long_3 == null) {
        this.ftid = DEFAULT_FTID;
      } else {
        this.ftid = long_3;
      } 
      long_3 = paramBuilder.tid;
      if (long_3 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_3;
      } 
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      Integer integer3 = paramBuilder.type;
      if (integer3 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer3;
      } 
      String str2 = paramBuilder._abstract;
      if (str2 == null) {
        this._abstract = "";
      } else {
        this._abstract = str2;
      } 
      Integer integer2 = paramBuilder.publish_time;
      if (integer2 == null) {
        this.publish_time = DEFAULT_PUBLISH_TIME;
      } else {
        this.publish_time = integer2;
      } 
      Long long_2 = paramBuilder.zan_num;
      if (long_2 == null) {
        this.zan_num = DEFAULT_ZAN_NUM;
      } else {
        this.zan_num = long_2;
      } 
      long_2 = paramBuilder.reply_num;
      if (long_2 == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = long_2;
      } 
      String str1 = paramBuilder.fromfname;
      if (str1 == null) {
        this.fromfname = "";
      } else {
        this.fromfname = str1;
      } 
      Long long_1 = paramBuilder.fromfid;
      if (long_1 == null) {
        this.fromfid = DEFAULT_FROMFID;
      } else {
        this.fromfid = long_1;
      } 
      Integer integer1 = paramBuilder.thread_type;
      if (integer1 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer1;
      } 
      list = paramBuilder.pics;
      if (list == null) {
        this.pics = DEFAULT_PICS;
      } else {
        this.pics = Message.immutableCopyOf(list);
      } 
    } else {
      this.ftid = ((Builder)list).ftid;
      this.tid = ((Builder)list).tid;
      this.title = ((Builder)list).title;
      this.type = ((Builder)list).type;
      this._abstract = ((Builder)list)._abstract;
      this.publish_time = ((Builder)list).publish_time;
      this.zan_num = ((Builder)list).zan_num;
      this.reply_num = ((Builder)list).reply_num;
      this.fromfname = ((Builder)list).fromfname;
      this.fromfid = ((Builder)list).fromfid;
      this.thread_type = ((Builder)list).thread_type;
      this.pics = Message.immutableCopyOf(((Builder)list).pics);
    } 
  }
}
