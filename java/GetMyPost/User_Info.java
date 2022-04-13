package GetMyPost;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BaijiahaoInfo;
import tbclient.BusinessAccountInfo;
import tbclient.GetMyPost.Balv;
import tbclient.GodInfo;
import tbclient.NewGodInfo;

public final class User_Info extends Message {
  public static final String DEFAULT_BAWU_TYPE = "";
  
  public static final String DEFAULT_FANS_NICKNAME = "";
  
  public static final Integer DEFAULT_FANS_NUM;
  
  public static final Integer DEFAULT_GENDER;
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_BAWU;
  
  public static final Integer DEFAULT_IS_LOGIN;
  
  public static final Integer DEFAULT_IS_MANAGER;
  
  public static final Integer DEFAULT_IS_MEM;
  
  public static final Integer DEFAULT_IS_SELECT_TAIL;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Integer DEFAULT_USERHIDE;
  
  @ProtoField(tag = 18)
  public final BaijiahaoInfo baijiahao_info;
  
  @ProtoField(tag = 12)
  public final Balv balv;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String bawu_type;
  
  @ProtoField(tag = 20)
  public final BusinessAccountInfo business_account_info;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String fans_nickname;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer fans_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer gender;
  
  @ProtoField(tag = 13)
  public final GodInfo god_data;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer is_bawu;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_login;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_manager;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_mem;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_select_tail;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 19)
  public final NewGodInfo new_god_data;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer userhide;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(269672592, "Ltbclient/GetMyPost/User_Info;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(269672592, "Ltbclient/GetMyPost/User_Info;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LOGIN = integer;
    DEFAULT_ID = Long.valueOf(0L);
    DEFAULT_GENDER = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_IS_MANAGER = integer;
    DEFAULT_IS_MEM = integer;
    DEFAULT_IS_SELECT_TAIL = integer;
    DEFAULT_USERHIDE = integer;
    DEFAULT_FANS_NUM = integer;
    DEFAULT_IS_BAWU = integer;
  }
  
  public User_Info(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.is_login;
      if (integer3 == null) {
        this.is_login = DEFAULT_IS_LOGIN;
      } else {
        this.is_login = integer3;
      } 
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str3 = paramBuilder.name;
      if (str3 == null) {
        this.name = "";
      } else {
        this.name = str3;
      } 
      str3 = paramBuilder.name_show;
      if (str3 == null) {
        this.name_show = "";
      } else {
        this.name_show = str3;
      } 
      str3 = paramBuilder.portrait;
      if (str3 == null) {
        this.portrait = "";
      } else {
        this.portrait = str3;
      } 
      Integer integer2 = paramBuilder.gender;
      if (integer2 == null) {
        this.gender = DEFAULT_GENDER;
      } else {
        this.gender = integer2;
      } 
      integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      integer2 = paramBuilder.is_manager;
      if (integer2 == null) {
        this.is_manager = DEFAULT_IS_MANAGER;
      } else {
        this.is_manager = integer2;
      } 
      integer2 = paramBuilder.is_mem;
      if (integer2 == null) {
        this.is_mem = DEFAULT_IS_MEM;
      } else {
        this.is_mem = integer2;
      } 
      integer2 = paramBuilder.is_select_tail;
      if (integer2 == null) {
        this.is_select_tail = DEFAULT_IS_SELECT_TAIL;
      } else {
        this.is_select_tail = integer2;
      } 
      integer2 = paramBuilder.userhide;
      if (integer2 == null) {
        this.userhide = DEFAULT_USERHIDE;
      } else {
        this.userhide = integer2;
      } 
      this.balv = paramBuilder.balv;
      this.god_data = paramBuilder.god_data;
      integer2 = paramBuilder.fans_num;
      if (integer2 == null) {
        this.fans_num = DEFAULT_FANS_NUM;
      } else {
        this.fans_num = integer2;
      } 
      String str2 = paramBuilder.fans_nickname;
      if (str2 == null) {
        this.fans_nickname = "";
      } else {
        this.fans_nickname = str2;
      } 
      Integer integer1 = paramBuilder.is_bawu;
      if (integer1 == null) {
        this.is_bawu = DEFAULT_IS_BAWU;
      } else {
        this.is_bawu = integer1;
      } 
      String str1 = paramBuilder.bawu_type;
      if (str1 == null) {
        this.bawu_type = "";
      } else {
        this.bawu_type = str1;
      } 
      this.baijiahao_info = paramBuilder.baijiahao_info;
      this.new_god_data = paramBuilder.new_god_data;
      this.business_account_info = paramBuilder.business_account_info;
    } else {
      this.is_login = paramBuilder.is_login;
      this.id = paramBuilder.id;
      this.name = paramBuilder.name;
      this.name_show = paramBuilder.name_show;
      this.portrait = paramBuilder.portrait;
      this.gender = paramBuilder.gender;
      this.type = paramBuilder.type;
      this.is_manager = paramBuilder.is_manager;
      this.is_mem = paramBuilder.is_mem;
      this.is_select_tail = paramBuilder.is_select_tail;
      this.userhide = paramBuilder.userhide;
      this.balv = paramBuilder.balv;
      this.god_data = paramBuilder.god_data;
      this.fans_num = paramBuilder.fans_num;
      this.fans_nickname = paramBuilder.fans_nickname;
      this.is_bawu = paramBuilder.is_bawu;
      this.bawu_type = paramBuilder.bawu_type;
      this.baijiahao_info = paramBuilder.baijiahao_info;
      this.new_god_data = paramBuilder.new_god_data;
      this.business_account_info = paramBuilder.business_account_info;
    } 
  }
}
