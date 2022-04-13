package GetForumBroadcastList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final List<Long> DEFAULT_BCAST_IDS;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_NEED_CNT;
  
  public static final Integer DEFAULT_QUERY_TYPE;
  
  public static final Integer DEFAULT_STAFF_ID;
  
  public static final Long DEFAULT_STAFF_ID64;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.INT64)
  public final List<Long> bcast_ids;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer need_cnt;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer query_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer staff_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long staff_id64;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2068175372, "Ltbclient/GetForumBroadcastList/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2068175372, "Ltbclient/GetForumBroadcastList/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_QUERY_TYPE = integer;
    DEFAULT_STAFF_ID = integer;
    DEFAULT_NEED_CNT = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_BCAST_IDS = Collections.emptyList();
    DEFAULT_STAFF_ID64 = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer = paramBuilder.query_type;
      if (integer == null) {
        this.query_type = DEFAULT_QUERY_TYPE;
      } else {
        this.query_type = integer;
      } 
      integer = paramBuilder.staff_id;
      if (integer == null) {
        this.staff_id = DEFAULT_STAFF_ID;
      } else {
        this.staff_id = integer;
      } 
      integer = paramBuilder.need_cnt;
      if (integer == null) {
        this.need_cnt = DEFAULT_NEED_CNT;
      } else {
        this.need_cnt = integer;
      } 
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      List list = paramBuilder.bcast_ids;
      if (list == null) {
        this.bcast_ids = DEFAULT_BCAST_IDS;
      } else {
        this.bcast_ids = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.staff_id64;
      if (long_ == null) {
        this.staff_id64 = DEFAULT_STAFF_ID64;
      } else {
        this.staff_id64 = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.query_type = ((Builder)long_).query_type;
      this.staff_id = ((Builder)long_).staff_id;
      this.need_cnt = ((Builder)long_).need_cnt;
      this.forum_id = ((Builder)long_).forum_id;
      this.bcast_ids = Message.immutableCopyOf(((Builder)long_).bcast_ids);
      this.staff_id64 = ((Builder)long_).staff_id64;
    } 
  }
}
