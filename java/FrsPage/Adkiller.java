package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsPage.AdkillerAd;

public final class Adkiller extends Message {
  public static final Integer DEFAULT_AD_LEFT_NUM;
  
  public static final List<AdkillerAd> DEFAULT_AD_LIST;
  
  public static final String DEFAULT_HINT_URL = "";
  
  public static final Integer DEFAULT_SHOW_AD;
  
  public static final Integer DEFAULT_SHOW_HINT;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer ad_left_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<AdkillerAd> ad_list;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String hint_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer show_ad;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer show_hint;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1102659254, "Ltbclient/FrsPage/Adkiller;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1102659254, "Ltbclient/FrsPage/Adkiller;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHOW_HINT = integer;
    DEFAULT_SHOW_AD = integer;
    DEFAULT_AD_LEFT_NUM = integer;
    DEFAULT_AD_LIST = Collections.emptyList();
  }
  
  public Adkiller(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.show_hint;
      if (integer2 == null) {
        this.show_hint = DEFAULT_SHOW_HINT;
      } else {
        this.show_hint = integer2;
      } 
      integer2 = paramBuilder.show_ad;
      if (integer2 == null) {
        this.show_ad = DEFAULT_SHOW_AD;
      } else {
        this.show_ad = integer2;
      } 
      String str = paramBuilder.hint_url;
      if (str == null) {
        this.hint_url = "";
      } else {
        this.hint_url = str;
      } 
      Integer integer1 = paramBuilder.ad_left_num;
      if (integer1 == null) {
        this.ad_left_num = DEFAULT_AD_LEFT_NUM;
      } else {
        this.ad_left_num = integer1;
      } 
      list = paramBuilder.ad_list;
      if (list == null) {
        this.ad_list = DEFAULT_AD_LIST;
      } else {
        this.ad_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.show_hint = ((Builder)list).show_hint;
      this.show_ad = ((Builder)list).show_ad;
      this.hint_url = ((Builder)list).hint_url;
      this.ad_left_num = ((Builder)list).ad_left_num;
      this.ad_list = Message.immutableCopyOf(((Builder)list).ad_list);
    } 
  }
}
