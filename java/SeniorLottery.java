import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AwardInfo;
import tbclient.AwardUser;
import tbclient.LotteryRegular;
import tbclient.LotteryTheme;
import tbclient.SeniorLottery;

public final class SeniorLottery extends Message {
  public static final String DEFAULT_ACT_DESC = "";
  
  public static final List<LotteryRegular> DEFAULT_ACT_REGULAR;
  
  public static final List<AwardInfo> DEFAULT_AWARD_INFO = Collections.emptyList();
  
  public static final List<AwardUser> DEFAULT_LUCK_USERS = Collections.emptyList();
  
  public static final String DEFAULT_MYAWARD = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String act_desc;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<LotteryRegular> act_regular;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<AwardInfo> award_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<AwardUser> luck_users;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String myaward;
  
  @ProtoField(tag = 1)
  public final LotteryTheme theme;
  
  static {
    DEFAULT_ACT_REGULAR = Collections.emptyList();
  }
  
  public SeniorLottery(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.theme = paramBuilder.theme;
      List list2 = paramBuilder.award_info;
      if (list2 == null) {
        this.award_info = DEFAULT_AWARD_INFO;
      } else {
        this.award_info = Message.immutableCopyOf(list2);
      } 
      String str2 = paramBuilder.myaward;
      if (str2 == null) {
        this.myaward = "";
      } else {
        this.myaward = str2;
      } 
      List list1 = paramBuilder.luck_users;
      if (list1 == null) {
        this.luck_users = DEFAULT_LUCK_USERS;
      } else {
        this.luck_users = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.act_desc;
      if (str1 == null) {
        this.act_desc = "";
      } else {
        this.act_desc = str1;
      } 
      list = paramBuilder.act_regular;
      if (list == null) {
        this.act_regular = DEFAULT_ACT_REGULAR;
      } else {
        this.act_regular = Message.immutableCopyOf(list);
      } 
    } else {
      this.theme = ((Builder)list).theme;
      this.award_info = Message.immutableCopyOf(((Builder)list).award_info);
      this.myaward = ((Builder)list).myaward;
      this.luck_users = Message.immutableCopyOf(((Builder)list).luck_users);
      this.act_desc = ((Builder)list).act_desc;
      this.act_regular = Message.immutableCopyOf(((Builder)list).act_regular);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(110930892, "Ltbclient/SeniorLottery;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(110930892, "Ltbclient/SeniorLottery;");
          return;
        } 
      } 
    } 
  }
}
