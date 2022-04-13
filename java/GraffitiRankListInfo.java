import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GraffitiRankItem;
import tbclient.GraffitiRankListInfo;
import tbclient.User;

public final class GraffitiRankListInfo extends Message {
  public static final List<User> DEFAULT_CONSENT_LIST;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_HAS_STATE;
  
  public static final List<GraffitiRankItem> DEFAULT_LIST;
  
  public static final Integer DEFAULT_QUICK_LIST_COUNT;
  
  public static final Integer DEFAULT_SHOW_LIST_COUNT;
  
  public static final Long DEFAULT_TID;
  
  public static final Integer DEFAULT_TOTAL;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<User> consent_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer has_state;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<GraffitiRankItem> list;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer quick_list_count;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer show_list_count;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer total;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1603247631, "Ltbclient/GraffitiRankListInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1603247631, "Ltbclient/GraffitiRankListInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_MORE = integer;
    DEFAULT_TOTAL = integer;
    DEFAULT_LIST = Collections.emptyList();
    DEFAULT_SHOW_LIST_COUNT = integer;
    DEFAULT_QUICK_LIST_COUNT = integer;
    DEFAULT_HAS_STATE = integer;
    DEFAULT_TID = Long.valueOf(0L);
    DEFAULT_CONSENT_LIST = Collections.emptyList();
  }
  
  public GraffitiRankListInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.has_more;
      if (integer2 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer2;
      } 
      integer2 = paramBuilder.total;
      if (integer2 == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = integer2;
      } 
      List list1 = paramBuilder.list;
      if (list1 == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list1);
      } 
      Integer integer1 = paramBuilder.show_list_count;
      if (integer1 == null) {
        this.show_list_count = DEFAULT_SHOW_LIST_COUNT;
      } else {
        this.show_list_count = integer1;
      } 
      integer1 = paramBuilder.quick_list_count;
      if (integer1 == null) {
        this.quick_list_count = DEFAULT_QUICK_LIST_COUNT;
      } else {
        this.quick_list_count = integer1;
      } 
      integer1 = paramBuilder.has_state;
      if (integer1 == null) {
        this.has_state = DEFAULT_HAS_STATE;
      } else {
        this.has_state = integer1;
      } 
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      list = paramBuilder.consent_list;
      if (list == null) {
        this.consent_list = DEFAULT_CONSENT_LIST;
      } else {
        this.consent_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.has_more = ((Builder)list).has_more;
      this.total = ((Builder)list).total;
      this.list = Message.immutableCopyOf(((Builder)list).list);
      this.show_list_count = ((Builder)list).show_list_count;
      this.quick_list_count = ((Builder)list).quick_list_count;
      this.has_state = ((Builder)list).has_state;
      this.tid = ((Builder)list).tid;
      this.consent_list = Message.immutableCopyOf(((Builder)list).consent_list);
    } 
  }
}
