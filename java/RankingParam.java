import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.RankingParam;

public final class RankingParam extends Message {
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_RANK_CODE;
  
  public static final Integer DEFAULT_RANK_TYPE;
  
  public static final Integer DEFAULT_RN;
  
  public static final String DEFAULT_SORT_TYPE = "";
  
  public static final Integer DEFAULT_TAB_ID;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rank_code;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer rank_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer rn;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sort_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1657169018, "Ltbclient/RankingParam;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1657169018, "Ltbclient/RankingParam;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_RANK_TYPE = integer;
    DEFAULT_RANK_CODE = integer;
    DEFAULT_TAB_ID = integer;
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
  }
  
  public RankingParam(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.rank_type;
      if (integer2 == null) {
        this.rank_type = DEFAULT_RANK_TYPE;
      } else {
        this.rank_type = integer2;
      } 
      integer2 = paramBuilder.rank_code;
      if (integer2 == null) {
        this.rank_code = DEFAULT_RANK_CODE;
      } else {
        this.rank_code = integer2;
      } 
      String str = paramBuilder.sort_type;
      if (str == null) {
        this.sort_type = "";
      } else {
        this.sort_type = str;
      } 
      Integer integer1 = paramBuilder.tab_id;
      if (integer1 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer1;
      } 
      integer1 = paramBuilder.pn;
      if (integer1 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer1;
      } 
      integer = paramBuilder.rn;
      if (integer == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer;
      } 
    } else {
      this.rank_type = ((Builder)integer).rank_type;
      this.rank_code = ((Builder)integer).rank_code;
      this.sort_type = ((Builder)integer).sort_type;
      this.tab_id = ((Builder)integer).tab_id;
      this.pn = ((Builder)integer).pn;
      this.rn = ((Builder)integer).rn;
    } 
  }
}
