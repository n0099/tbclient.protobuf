import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ManagerElection;

public final class ManagerElection extends Message {
  public static final Integer DEFAULT_BEGIN_VOTE_TIME;
  
  public static final Integer DEFAULT_CAN_VOTE;
  
  public static final Integer DEFAULT_IS_SHOW_DISTRIBUTE;
  
  public static final Integer DEFAULT_REMAINDER_TIME;
  
  public static final Integer DEFAULT_STATUS;
  
  public static final String DEFAULT_TAIL_TEXT = "";
  
  public static final List<String> DEFAULT_VOTE_CONDITION;
  
  public static final List<String> DEFAULT_VOTE_CONDITION_PIC;
  
  public static final List<String> DEFAULT_VOTE_CONDITION_TITLE;
  
  public static final Integer DEFAULT_VOTE_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer begin_vote_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer can_vote;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer is_show_distribute;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer remainder_time;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer status;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String tail_text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> vote_condition;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11, type = Message.Datatype.STRING)
  public final List<String> vote_condition_pic;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10, type = Message.Datatype.STRING)
  public final List<String> vote_condition_title;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer vote_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1943492351, "Ltbclient/ManagerElection;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1943492351, "Ltbclient/ManagerElection;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_CAN_VOTE = integer;
    DEFAULT_VOTE_NUM = integer;
    DEFAULT_BEGIN_VOTE_TIME = integer;
    DEFAULT_VOTE_CONDITION = Collections.emptyList();
    DEFAULT_IS_SHOW_DISTRIBUTE = integer;
    DEFAULT_REMAINDER_TIME = integer;
    DEFAULT_STATUS = integer;
    DEFAULT_VOTE_CONDITION_TITLE = Collections.emptyList();
    DEFAULT_VOTE_CONDITION_PIC = Collections.emptyList();
  }
  
  public ManagerElection(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.can_vote;
      if (integer2 == null) {
        this.can_vote = DEFAULT_CAN_VOTE;
      } else {
        this.can_vote = integer2;
      } 
      integer2 = paramBuilder.vote_num;
      if (integer2 == null) {
        this.vote_num = DEFAULT_VOTE_NUM;
      } else {
        this.vote_num = integer2;
      } 
      integer2 = paramBuilder.begin_vote_time;
      if (integer2 == null) {
        this.begin_vote_time = DEFAULT_BEGIN_VOTE_TIME;
      } else {
        this.begin_vote_time = integer2;
      } 
      List list2 = paramBuilder.vote_condition;
      if (list2 == null) {
        this.vote_condition = DEFAULT_VOTE_CONDITION;
      } else {
        this.vote_condition = Message.immutableCopyOf(list2);
      } 
      String str = paramBuilder.tail_text;
      if (str == null) {
        this.tail_text = "";
      } else {
        this.tail_text = str;
      } 
      Integer integer1 = paramBuilder.is_show_distribute;
      if (integer1 == null) {
        this.is_show_distribute = DEFAULT_IS_SHOW_DISTRIBUTE;
      } else {
        this.is_show_distribute = integer1;
      } 
      integer1 = paramBuilder.remainder_time;
      if (integer1 == null) {
        this.remainder_time = DEFAULT_REMAINDER_TIME;
      } else {
        this.remainder_time = integer1;
      } 
      integer1 = paramBuilder.status;
      if (integer1 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer1;
      } 
      List list1 = paramBuilder.vote_condition_title;
      if (list1 == null) {
        this.vote_condition_title = DEFAULT_VOTE_CONDITION_TITLE;
      } else {
        this.vote_condition_title = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.vote_condition_pic;
      if (list == null) {
        this.vote_condition_pic = DEFAULT_VOTE_CONDITION_PIC;
      } else {
        this.vote_condition_pic = Message.immutableCopyOf(list);
      } 
    } else {
      this.can_vote = ((Builder)list).can_vote;
      this.vote_num = ((Builder)list).vote_num;
      this.begin_vote_time = ((Builder)list).begin_vote_time;
      this.vote_condition = Message.immutableCopyOf(((Builder)list).vote_condition);
      this.tail_text = ((Builder)list).tail_text;
      this.is_show_distribute = ((Builder)list).is_show_distribute;
      this.remainder_time = ((Builder)list).remainder_time;
      this.status = ((Builder)list).status;
      this.vote_condition_title = Message.immutableCopyOf(((Builder)list).vote_condition_title);
      this.vote_condition_pic = Message.immutableCopyOf(((Builder)list).vote_condition_pic);
    } 
  }
}
