package GameForumGuideTab;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_NEED_TAB_STUCT;
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_PS;
  
  public static final Integer DEFAULT_SUB_LABEL_ID;
  
  public static final Integer DEFAULT_SUB_TAB_ID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer need_tab_stuct;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer ps;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer sub_label_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer sub_tab_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-496368520, "Ltbclient/GameForumGuideTab/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-496368520, "Ltbclient/GameForumGuideTab/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_PS = integer;
    DEFAULT_FORUM_ID = Long.valueOf(0L);
    DEFAULT_SUB_TAB_ID = integer;
    DEFAULT_SUB_LABEL_ID = integer;
    DEFAULT_NEED_TAB_STUCT = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer2 = paramBuilder.pn;
      if (integer2 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer2;
      } 
      integer2 = paramBuilder.ps;
      if (integer2 == null) {
        this.ps = DEFAULT_PS;
      } else {
        this.ps = integer2;
      } 
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      Integer integer1 = paramBuilder.sub_tab_id;
      if (integer1 == null) {
        this.sub_tab_id = DEFAULT_SUB_TAB_ID;
      } else {
        this.sub_tab_id = integer1;
      } 
      integer1 = paramBuilder.sub_label_id;
      if (integer1 == null) {
        this.sub_label_id = DEFAULT_SUB_LABEL_ID;
      } else {
        this.sub_label_id = integer1;
      } 
      integer = paramBuilder.need_tab_stuct;
      if (integer == null) {
        this.need_tab_stuct = DEFAULT_NEED_TAB_STUCT;
      } else {
        this.need_tab_stuct = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.pn = ((Builder)integer).pn;
      this.ps = ((Builder)integer).ps;
      this.forum_id = ((Builder)integer).forum_id;
      this.sub_tab_id = ((Builder)integer).sub_tab_id;
      this.sub_label_id = ((Builder)integer).sub_label_id;
      this.need_tab_stuct = ((Builder)integer).need_tab_stuct;
    } 
  }
}
