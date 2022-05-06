import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Props;

public final class Props extends Message {
  public static final String DEFAULT_END_TIME = "";
  
  public static final String DEFAULT_EXPIRED_NOTIFY = "";
  
  public static final String DEFAULT_EXPIRING_NOTIFY = "";
  
  public static final Integer DEFAULT_LEFT_NUM;
  
  public static final String DEFAULT_NOTICE = "";
  
  public static final Integer DEFAULT_NUM;
  
  public static final String DEFAULT_OPEN_STATUS = "";
  
  public static final List<String> DEFAULT_PATTERN;
  
  public static final String DEFAULT_PROPS_CATEGORY = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final String DEFAULT_PROPS_TYPE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  public static final String DEFAULT_USED_STATUS = "";
  
  public static final List<String> DEFAULT__WORD;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14, type = Message.Datatype.STRING)
  public final List<String> _word;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String end_time;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String expired_notify;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String expiring_notify;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer left_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String notice;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer num;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String open_status;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15, type = Message.Datatype.STRING)
  public final List<String> pattern;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String props_category;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String props_type;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer update_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String used_status;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(548972085, "Ltbclient/Props;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(548972085, "Ltbclient/Props;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_LEFT_NUM = integer;
    DEFAULT_NUM = integer;
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT__WORD = Collections.emptyList();
    DEFAULT_PATTERN = Collections.emptyList();
  }
  
  public Props(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer4 = paramBuilder.props_id;
      if (integer4 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer4;
      } 
      String str4 = paramBuilder.props_type;
      if (str4 == null) {
        this.props_type = "";
      } else {
        this.props_type = str4;
      } 
      str4 = paramBuilder.props_category;
      if (str4 == null) {
        this.props_category = "";
      } else {
        this.props_category = str4;
      } 
      Integer integer3 = paramBuilder.left_num;
      if (integer3 == null) {
        this.left_num = DEFAULT_LEFT_NUM;
      } else {
        this.left_num = integer3;
      } 
      String str3 = paramBuilder.used_status;
      if (str3 == null) {
        this.used_status = "";
      } else {
        this.used_status = str3;
      } 
      Integer integer2 = paramBuilder.num;
      if (integer2 == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer2;
      } 
      String str2 = paramBuilder.end_time;
      if (str2 == null) {
        this.end_time = "";
      } else {
        this.end_time = str2;
      } 
      str2 = paramBuilder.notice;
      if (str2 == null) {
        this.notice = "";
      } else {
        this.notice = str2;
      } 
      Integer integer1 = paramBuilder.update_time;
      if (integer1 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer1;
      } 
      String str1 = paramBuilder.open_status;
      if (str1 == null) {
        this.open_status = "";
      } else {
        this.open_status = str1;
      } 
      str1 = paramBuilder.expiring_notify;
      if (str1 == null) {
        this.expiring_notify = "";
      } else {
        this.expiring_notify = str1;
      } 
      str1 = paramBuilder.expired_notify;
      if (str1 == null) {
        this.expired_notify = "";
      } else {
        this.expired_notify = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      List list1 = paramBuilder._word;
      if (list1 == null) {
        this._word = DEFAULT__WORD;
      } else {
        this._word = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.pattern;
      if (list == null) {
        this.pattern = DEFAULT_PATTERN;
      } else {
        this.pattern = Message.immutableCopyOf(list);
      } 
    } else {
      this.props_id = ((Builder)list).props_id;
      this.props_type = ((Builder)list).props_type;
      this.props_category = ((Builder)list).props_category;
      this.left_num = ((Builder)list).left_num;
      this.used_status = ((Builder)list).used_status;
      this.num = ((Builder)list).num;
      this.end_time = ((Builder)list).end_time;
      this.notice = ((Builder)list).notice;
      this.update_time = ((Builder)list).update_time;
      this.open_status = ((Builder)list).open_status;
      this.expiring_notify = ((Builder)list).expiring_notify;
      this.expired_notify = ((Builder)list).expired_notify;
      this.title = ((Builder)list).title;
      this._word = Message.immutableCopyOf(((Builder)list)._word);
      this.pattern = Message.immutableCopyOf(((Builder)list).pattern);
    } 
  }
}
