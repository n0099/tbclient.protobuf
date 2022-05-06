import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Wares;

public final class Wares extends Message {
  public static final Integer DEFAULT_MONEY;
  
  public static final String DEFAULT_NEW_PROPS_ID = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final Integer DEFAULT_PROPS_MON;
  
  public static final String DEFAULT_WARS_ITEM = "";
  
  public static final String DEFAULT_WARS_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer money;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String new_props_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer props_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer props_mon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String wars_item;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String wars_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(733755087, "Ltbclient/Wares;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(733755087, "Ltbclient/Wares;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_MONEY = integer;
    DEFAULT_PROPS_MON = integer;
  }
  
  public Wares(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.props_id;
      if (integer == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer;
      } 
      integer = paramBuilder.money;
      if (integer == null) {
        this.money = DEFAULT_MONEY;
      } else {
        this.money = integer;
      } 
      integer = paramBuilder.props_mon;
      if (integer == null) {
        this.props_mon = DEFAULT_PROPS_MON;
      } else {
        this.props_mon = integer;
      } 
      String str1 = paramBuilder.wars_name;
      if (str1 == null) {
        this.wars_name = "";
      } else {
        this.wars_name = str1;
      } 
      str1 = paramBuilder.wars_item;
      if (str1 == null) {
        this.wars_item = "";
      } else {
        this.wars_item = str1;
      } 
      str = paramBuilder.new_props_id;
      if (str == null) {
        this.new_props_id = "";
      } else {
        this.new_props_id = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.money = ((Builder)str).money;
      this.props_mon = ((Builder)str).props_mon;
      this.wars_name = ((Builder)str).wars_name;
      this.wars_item = ((Builder)str).wars_item;
      this.new_props_id = ((Builder)str).new_props_id;
    } 
  }
}
