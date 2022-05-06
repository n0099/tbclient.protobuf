import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.MoneyInfo;

public final class MoneyInfo extends Message {
  public static final Integer DEFAULT_DEFAULT = Integer.valueOf(0);
  
  public static final String DEFAULT_DISCOUNT = "";
  
  public static final String DEFAULT_GID = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_MONEY = "";
  
  public static final String DEFAULT_ORIGINAL_COST = "";
  
  public static final String DEFAULT_PACKET_TEXT = "";
  
  public static final String DEFAULT_PAYMENT_POS_KEY = "";
  
  public static final String DEFAULT_PID = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer _default;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String discount;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String gid;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String money;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String original_cost;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String packet_text;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String payment_pos_key;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pid;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  public MoneyInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.icon;
      if (str2 == null) {
        this.icon = "";
      } else {
        this.icon = str2;
      } 
      str2 = paramBuilder.gid;
      if (str2 == null) {
        this.gid = "";
      } else {
        this.gid = str2;
      } 
      str2 = paramBuilder.pid;
      if (str2 == null) {
        this.pid = "";
      } else {
        this.pid = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.money;
      if (str2 == null) {
        this.money = "";
      } else {
        this.money = str2;
      } 
      str2 = paramBuilder.discount;
      if (str2 == null) {
        this.discount = "";
      } else {
        this.discount = str2;
      } 
      Integer integer = paramBuilder._default;
      if (integer == null) {
        this._default = DEFAULT_DEFAULT;
      } else {
        this._default = integer;
      } 
      String str1 = paramBuilder.payment_pos_key;
      if (str1 == null) {
        this.payment_pos_key = "";
      } else {
        this.payment_pos_key = str1;
      } 
      str1 = paramBuilder.packet_text;
      if (str1 == null) {
        this.packet_text = "";
      } else {
        this.packet_text = str1;
      } 
      str = paramBuilder.original_cost;
      if (str == null) {
        this.original_cost = "";
      } else {
        this.original_cost = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.gid = ((Builder)str).gid;
      this.pid = ((Builder)str).pid;
      this.title = ((Builder)str).title;
      this.money = ((Builder)str).money;
      this.discount = ((Builder)str).discount;
      this._default = ((Builder)str)._default;
      this.payment_pos_key = ((Builder)str).payment_pos_key;
      this.packet_text = ((Builder)str).packet_text;
      this.original_cost = ((Builder)str).original_cost;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-291040041, "Ltbclient/MoneyInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-291040041, "Ltbclient/MoneyInfo;");
          return;
        } 
      } 
    } 
  }
}
